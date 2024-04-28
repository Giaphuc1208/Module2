package compositional;

import room.Room;

import java.time.LocalDate;

import static java.time.temporal.ChronoUnit.DAYS;

public class Booking {
    private LocalDate checkIn;
    private LocalDate checkOut;
    private Room room;
    private Guest guest;

    // Tính tiền phòng
    public long getTotalPrice(){
        long result;
        // hàm tính số ngày giữa các ngày Import ChronoUnit
        long numDay = DAYS.between(checkIn,checkOut);
        long price = room.getPrice();
        result = numDay * price;
        return result;
    }

    public Booking(LocalDate checkIn, LocalDate checkOut, Room room, Guest guest) {
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.room = room;
        this.guest = guest;
    }

    public Booking() {
    }

    public LocalDate getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(LocalDate checkIn) {
        this.checkIn = checkIn;
    }

    public LocalDate getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(LocalDate checkOut) {
        this.checkOut = checkOut;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }
}
