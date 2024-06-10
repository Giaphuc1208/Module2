package models;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Booking {


    private final String code;
    private String guestName;
    private Room room;
    private final String dateCreating;
    private double total;
    private String checkIn;
    private String checkOut;
    private String status;


    public Booking(Room room,String code, String guestName, String checkIn,String checkOut, String status) {
        this.code = "Booking" + (int) (Math.random() * 1000);
        this.guestName = guestName;
        this.room = room;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.dateCreating = getDateCreating();
        this.status = status;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }



    public String getDateCreating() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return LocalDate.now().format(formatter);
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


    public double getTotal() {
        return total;
    }

    public void setTotal() {
        this.total = this.room.getPrice() * calculateDaysStayed();;
    }

    public String getCode() {
        return code;
    }

    public String getGuestName() {
        return guestName;
    }

    public long calculateDaysStayed() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate checkInDate = LocalDate.parse(checkIn, formatter);
        LocalDate checkOutDate = LocalDate.parse(checkOut, formatter);
        return ChronoUnit.DAYS.between(checkInDate, checkOutDate);
    }
}
