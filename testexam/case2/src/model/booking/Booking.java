package model.booking;

import java.time.LocalDate;

public class Booking {
    private String bookingID;
    private LocalDate checkIn;
    private LocalDate checkOut;
    private String guestID;
    private String serviceName;
    private String typeOfService;

    public Booking(String bookingID, LocalDate checkIn, LocalDate checkOut, String guestID, String serviceName, String typeOfService) {
        this.bookingID = bookingID;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.guestID = guestID;
        this.serviceName = serviceName;
        this.typeOfService = typeOfService;
    }

    public String getBookingID() {
        return bookingID;
    }

    public void setBookingID(String bookingID) {
        this.bookingID = bookingID;
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

    public String getGuestID() {
        return guestID;
    }

    public void setGuestID(String guestID) {
        this.guestID = guestID;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getTypeOfService() {
        return typeOfService;
    }

    public void setTypeOfService(String typeOfService) {
        this.typeOfService = typeOfService;
    }

    @Override
    public String toString() {
        return "Booking: bookingID='%s', checkIn=%s, checkOut=%s, guestID='%s', serviceName='%s', typeOfService='%s'}".formatted(bookingID, checkIn, checkOut, guestID, serviceName, typeOfService);
    }
}
