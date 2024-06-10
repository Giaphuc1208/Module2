package views;

import models.Booking;
import models.Room;
import ultils.Input;
import ultils.Validate;

import java.util.List;

public class ViewBooking {
    Validate validate = new Validate();

    public String viewGetRoomNumber() {
        System.out.println("Enter room number you want to booking: ");
        return Input.getString();
    }
    public Booking add(Room room){
        do {
            String bookingCode = "BK-" + (int) (Math.random() * 1000);

            System.out.println("Enter guest name: ");
            String guestName = Input.getString();
            System.out.println("Enter day check in(dd-MM-yyyy): ");
            String checkIn = Input.getString();
            System.out.println("Enter day check out(dd-MM-yyyy): ");
            String checkOut = Input.getString();
            System.out.println("Enter payment status(paid/unpaid): ");
            String status = Input.getString().toLowerCase();
            if (!status.equals("paid") && !status.equals("unpaid")) {
                continue;
            }
            return new Booking(room, bookingCode, guestName,checkIn,checkOut,status);
        } while (true);
    }
}
