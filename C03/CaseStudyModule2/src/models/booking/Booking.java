package models.booking;

import models.LineRoom.LineRoom;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Booking {
    private final String code;
    private String guestName;
    private final String date;
    private final List<LineRoom> lineRooms = new ArrayList<>();
    private double total;
    private String status;


    public String getCurrentDate() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return LocalDate.now().format(formatter);
    }

    public Booking() {
        this.code = "Booking" + (int) (Math.random() * 1000);
        this.date = getCurrentDate();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        if (status.equals("paid")) {
            this.status = "Paid";
        } else if (status.equals("unpaid")) {
            this.status = "Unpaid";
        } else {
            this.status = "Canceled";
        }
    }

    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    public LineRoom getBookingRoom(String numberRoom) {
        for (LineRoom lineRoom : lineRooms) {
            if (lineRoom.getRoomNumber().equals(numberRoom)) {
                return lineRoom;
            }
        }
        return null;
    }

    public void addBookingRoom(LineRoom lineRoom) {
        this.lineRooms.add(lineRoom);
    }

    public void deleteBookingRoom(LineRoom lineRoom) {
        this.lineRooms.remove(lineRoom);
    }

    public String updateTotal() {
        this.total = 0;
        for (LineRoom lineRoom : lineRooms) {
            this.total += lineRoom.getTotal();
        }
        return "Total: " + this.total;
    }

    public String getCode() {
        return code;
    }

    public String getLineRoom() {
        StringBuilder str = new StringBuilder(" ' ");
        for (LineRoom room : lineRooms) {
            str.append(room.getRoomNumber()).append(" , Room: ").append(room.getTypeRoom()).append(", Days spent at: ").append(room.getDaysSpentAt()).append(", Price: ").append(room.getPrice()).append("//");
        }
        str.append(" ' ");
        return str.toString();
    }

    public String getGuestName() {
        return guestName;
    }

    @Override
    public String toString() {
        StringBuilder bookingRoomsStr = new StringBuilder();
        if (lineRooms.isEmpty()) {
            bookingRoomsStr.append("There's no room.!\n");
        } else {
            for (LineRoom lineRoom : lineRooms) {
                bookingRoomsStr.append(lineRoom.toString()).append("\n");
            }
        }
        return "\nBOOKING " + code + "\n" +
                "=====================================\n" +
                "GUEST: " + guestName + "\n" +
                "Date of creation: " + date + "\n" +
                "-------------------------------------\n" +
                bookingRoomsStr +
                "-------------------------------------\n" +
                "Total: " + total + "\n" +
                "Status: " + getStatus() + "\n";
    }
}
