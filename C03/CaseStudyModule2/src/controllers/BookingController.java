package controllers;

import models.LineRoom.LineRoom;
import models.booking.Booking;
import models.room.Room;
import ultils.Input;

import java.awt.datatransfer.StringSelection;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class BookingController {
    private final RoomController roomController;
    public final List<Booking> list;
    private static final String PATH_CODE = "src/models/booking/booking.csv";


    public BookingController(RoomController roomController) {
        this.roomController = roomController;
        list = new ArrayList<>();
    }

    public void menuOrder() {
        while (true) {
            int select;
            System.out.println("======MENU BOOKING======\n" +
                    "1. Search booking\n" +
                    "2. Display all Booking\n" +
                    "3. Creat booking\n" +
                    "4. Edit booking\n " +
                    "5. Return main menu\n" +
                    "Choose activity: ");
            select = Input.getInt();
            switch (select) {
                case 1:
                    searchBooking();
                    break;
                case 2:
                    showAll();
                    break;
                case 3:
                    newBooking();
                    break;
                case 4:
                    showBooking();
                    break;
                case 5:
                default:
                    System.out.println("This select is not available!!");
            }
        }
    }

    public void showAll() {
        readFileFromBookingCSV();
    }

    public void searchBooking() {
        while (true) {
            System.out.println("Enter search keyword (Booking Code)");
            System.out.println("If the search results are only one booking will automatically be modified");
            System.out.println("Minimum 3 characters (Enter Esc to exit):");
            String select = Input.getString();
            if (select.equalsIgnoreCase("Esc")) {
                return;
            }
            if (select.length() < 3) {
                System.err.println("Please enter correct booking code!!");
                continue;
            }
            searchBooking(select);
        }
    }

    public void searchBooking(String key) {
        List<Booking> result = new ArrayList<>();
        for (Booking booking : list) {
            if (booking.getGuestName().contains(key) || booking.getCode().contains(key)) {
                result.add(booking);
            }
        }
        if (result.isEmpty()) {
            System.out.println("Booking not found!!");
            return;
        }
        if (result.size() > 1) {
            System.out.println("Found " + result.size() + " booking!");
            return;
        }
        showBooking(result.get(0));
    }

    public Booking findBookingByNumber(String code) {
        for (Booking booking : list) {
            if (booking.getCode().equals(code)) {
                return booking;
            }
        }
        return null;
    }

    private void showBooking() {
        while (true) {
            System.out.println("Please enter the code of booking you want to view: ");
            String number = Input.getString();
            if (number.isEmpty()) {
                break;
            }
            Booking booking = findBookingByNumber(number);
            if (booking == null) {
                System.err.println("No bookings found with this number!");
                continue;
            }
            showBooking(booking);
            break;
        }
    }

    private void showBooking(Booking booking) {
        while (true) {
            System.out.println(booking);
            System.out.println("Please enter your order (enter 'a' to see suggestions, enter 'Esc' to exit):");
            String select = Input.getString();
            if (select.equalsIgnoreCase("Esc")) {
                return;
            }
            if (select.equalsIgnoreCase("a")) {
                showHelp();
            }
            if (select.equalsIgnoreCase("paid")) {
                booking.setStatus("paid");
                System.out.println("Booking status updated to paid.");
            }
            if (select.equalsIgnoreCase("unpaid")) {
                booking.setStatus("unpaid");
                System.out.println("Booking status updated to unpaid.");
            }

            String[] command = select.split(" ");
            if (command.length == 3) {
                int daysSpentAt;
                try {
                    daysSpentAt = Integer.parseInt(command[2]);
                    if (daysSpentAt <= 0) {
                        System.out.println("Days Spent At must be greater than 0!");
                        continue;
                    }
                } catch (NumberFormatException e) {
                    System.err.println("Days Spent At is not valid");
                    continue;
                }
                Room room = roomController.findRoomByRoomNumber(command[1]);
                if (room == null) {
                    System.err.println("No room found with this number!");
                    continue;
                }
                switch (command[0]) {
                    case "add":
                        addBooking(booking, room, daysSpentAt);
                        break;
                    case "update":
                        updateBooking(booking);
                        break;
                }
            }
            if (command.length == 2) {
                if (command[0].equals("delete")) {
                    Room room = roomController.findRoomByRoomNumber(command[1]);
                    if (room == null) {
                        System.err.println("No room found with this number");
                        continue;
                    }
                    deleteBooking(booking, room);
                }
            }
        }
    }


    public void addBooking(Booking booking, Room room, int daysSpentAt) {
        double total = room.getPrice() * daysSpentAt;
        LineRoom bookingRoom;
        bookingRoom = booking.getBookingRoom(room.getRoomNumber());
        if (bookingRoom == null) {
            bookingRoom = new LineRoom(room.getRoomNumber(), room.getTypeRoom(), daysSpentAt, room.getPrice(), total);
            booking.addBookingRoom(bookingRoom);
        } else {
            bookingRoom.addDate(daysSpentAt);
            bookingRoom.setTotal(room.getPrice() * bookingRoom.getDaysSpentAt());
        }
        booking.updateTotal();
    }

    //    public void updateBooking(Booking booking, Room room, int daysSpentAt) {
//        LineRoom bookingRoom = booking.getBookingRoom(room.getRoomNumber());
//        if (bookingRoom == null) {
//            System.err.println("The booking doesn't have a room with this number!");
//            return;
//        }
//        bookingRoom.setDaysSpentAt(daysSpentAt);
//        bookingRoom.setTotal(room.getPrice() * bookingRoom.getDaysSpentAt());
//        booking.updateTotal();
//    }
    private void updateBooking(Booking booking) {
        System.out.println("Enter new guest name (or press Enter to keep the current): ");
        String newGuestName = Input.getString();
        if (!newGuestName.trim().isEmpty()) {
            booking.setGuestName(newGuestName);
        }

        while (true) {
            System.out.println("Enter 'add' to add a new room, 'update' to update an existing room, 'delete' to delete a room, or 'done' to finish:");
            String action = Input.getString().toLowerCase();
            if (action.equals("done")) {
                break;
            }

            switch (action) {
                case "add":
                    addNewRoomToBooking(booking);
                    break;
                case "update":
                    updateRoomInBooking(booking);
                    break;
                case "delete":
                    deleteRoomFromBooking(booking);
                    break;
                default:
                    System.out.println("Invalid action! Please enter 'add', 'update', 'delete', or 'done'.");
            }
        }
        System.out.println("Enter new payment status (paid/unpaid/canceled) or press Enter to keep the current: ");
        String paymentStatus = Input.getString().toLowerCase();
        if (!paymentStatus.trim().isEmpty()) {
            booking.setStatus(paymentStatus);
        }
        booking.updateTotal();
        writeFileToBookingCSV(list, true);
        System.out.println("Booking updated successfully!");
    }

    private void addNewRoomToBooking(Booking booking) {
        System.out.println("Enter room number: ");
        String roomNumber = Input.getString();
        Room room = roomController.findRoomByRoomNumber(roomNumber);
        if (room == null) {
            System.err.println("No room found with this number!");
            return;
        }

        System.out.println("Enter number of days stayed: ");
        int daysSpentAt = Input.getInt();
        if (daysSpentAt <= 0) {
            System.out.println("Days Spent At must be greater than 0!");
            return;
        }

        double total = room.getPrice() * daysSpentAt;
        LineRoom bookingRoom = booking.getBookingRoom(roomNumber);
        if (bookingRoom == null) {
            bookingRoom = new LineRoom(roomNumber, room.getTypeRoom(), daysSpentAt, room.getPrice(), total);
            booking.addBookingRoom(bookingRoom);
        } else {
            bookingRoom.addDate(daysSpentAt);
            bookingRoom.setTotal(room.getPrice() * bookingRoom.getDaysSpentAt());
        }

        booking.updateTotal();
        System.out.println("Room added to booking successfully!");
    }

    private void updateRoomInBooking(Booking booking) {
        System.out.println("Enter room number to update: ");
        String roomNumber = Input.getString();
        LineRoom bookingRoom = booking.getBookingRoom(roomNumber);
        if (bookingRoom == null) {
            System.err.println("No room found with this number in the booking!");
            return;
        }

        System.out.println("Enter new number of days stayed: ");
        int daysSpentAt = Input.getInt();
        if (daysSpentAt <= 0) {
            System.out.println("Days Spent At must be greater than 0!");
            return;
        }

        Room room = roomController.findRoomByRoomNumber(roomNumber);
        if (room == null) {
            System.err.println("No room found with this number!");
            return;
        }

        bookingRoom.setDaysSpentAt(daysSpentAt);
        bookingRoom.setTotal(room.getPrice() * daysSpentAt);

        booking.updateTotal();
        System.out.println("Room updated in booking successfully!");
    }

    private void deleteRoomFromBooking(Booking booking) {
        System.out.println("Enter room number to delete: ");
        String roomNumber = Input.getString();
        LineRoom bookingRoom = booking.getBookingRoom(roomNumber);
        if (bookingRoom == null) {
            System.err.println("No room found with this number in the booking!");
            return;
        }

        booking.deleteBookingRoom(bookingRoom);
        booking.updateTotal();
        System.out.println("Room deleted from booking successfully!");
    }

    public void newBooking() {
        Booking booking = new Booking();
        System.out.println("Enter guest name: ");
        String guestName = Input.getString();
        booking.setGuestName(guestName);

        while (true) {
            System.out.println("Enter room number: ");
            String roomNumber = Input.getString();
            Room room = roomController.findRoomByRoomNumber(roomNumber);
            if (room == null) {
                System.err.println("No room found with this number!");
                continue;
            }

            System.out.println("Enter type of room: ");
            String typeRoom = Input.getString();
            room.setTypeRoom(typeRoom);

            System.out.println("Enter number of days stayed: ");
            int daysSpentAt = Input.getInt();
            if (daysSpentAt <= 0) {
                System.out.println("Days Spent At must be greater than 0!");
                continue;
            }
            addBooking(booking, room, daysSpentAt);
            break;
        }
        while (true) {
            System.out.println("Enter payment status (paid/unpaid): ");
            String paymentStatus = Input.getString().toLowerCase();
            if (paymentStatus.equals("paid") || paymentStatus.equals("unpaid")) {
                booking.setStatus(paymentStatus);
                break;
            } else {
                System.out.println("Invalid payment status! Please enter 'paid' or 'unpaid'.");
            }
        }

        list.add(booking);
        System.out.println("Booking successful!");
        showBooking(booking);
//        list.add(booking);
        writeFileToBookingCSV(list, true);
    }


    public void deleteBooking(Booking booking, Room room) {
        LineRoom bookingRoom = booking.getBookingRoom(room.getRoomNumber());
        if (bookingRoom == null) {
            System.out.println("The booking is not valid!");
            return;
        }
        booking.deleteBookingRoom(bookingRoom);
        booking.updateTotal();
    }

    public void writeFileToBookingCSV(List<Booking> bookings, boolean append) {
        try {
            FileWriter fileWriter = new FileWriter(PATH_CODE, append);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("Booking Code, Guest Name, Room, Type Room, Days spent at, Price, Date creat booking, Total");
            for (Booking booking : bookings) {
                bufferedWriter.newLine();
                bufferedWriter.write(toString(booking));
            }
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public String toString(Booking booking) {
        return booking.getCode() + "," + booking.getGuestName() + "," + booking.getLineRoom() + "," + booking.getCurrentDate() + "," + booking.updateTotal();
    }

    public void readFileFromBookingCSV() {
        try {
            FileReader fileReader = new FileReader(PATH_CODE);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            bufferedReader.readLine();
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] data = line.split(",");
                StringBuilder bookingRoomsStr = new StringBuilder();
                String s = "\nBOOKING " + data[0] + "\n" +
                        "=====================================\n" +
                        "GUEST: " + data[1] + "\n" +
                        "Date of creation: " + data[data.length - 2] + "\n"
                        + "-------------------------------------\n";
                System.out.println(s);
                for (int i = 2; i < data.length - 2; i++) {
                    bookingRoomsStr.append(data[i]);
                }
                System.out.print(bookingRoomsStr);
                String t = "\n-------------------------------------\n"
                        + "Total: " + data[data.length - 1] + "\n";
                System.out.println(t);
            }
        } catch (IOException e) {
            System.out.println("No booking yet!!");
        }
    }

    private void showHelp() {
        System.out.println("Supported commands: ");
        System.out.println("add room to booking: (add R08 12)");
        System.out.println("delete room from booking: (delete R08)");
        System.out.println("update room in booking: (update R08 10)");
        System.out.println("pay: mark booking as paid");
        System.out.println("unpay: mark booking as unpaid");
        System.out.println("cancel: cancel a booking");
        System.out.println("a: show support command");
        System.out.println("Esc: exit");
        System.out.println("Press Enter to continue...");
        Input.getString();
    }
}
