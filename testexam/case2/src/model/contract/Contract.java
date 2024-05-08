package model.contract;

public class Contract {
    private String contractID;
    private String bookingID;
    private double depositAmount;
    private double paymentAmount;
    private String guestID;

    public Contract() {
    }

    public Contract(String contractID, String bookingID, double depositAmount, double paymentAmount, String guestID) {
        this.contractID = contractID;
        this.bookingID = bookingID;
        this.depositAmount = depositAmount;
        this.paymentAmount = paymentAmount;
        this.guestID = guestID;
    }

    public String getContractID() {
        return contractID;
    }

    public void setContractID(String contractID) {
        this.contractID = contractID;
    }

    public String getBookingID() {
        return bookingID;
    }

    public void setBookingID(String bookingID) {
        this.bookingID = bookingID;
    }

    public double getDepositAmount() {
        return depositAmount;
    }

    public void setDepositAmount(double depositAmount) {
        this.depositAmount = depositAmount;
    }

    public double getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(double paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public String getGuestID() {
        return guestID;
    }

    public void setGuestID(String guestID) {
        this.guestID = guestID;
    }

    @Override
    public String toString() {
        return "Facility: contractID='%s', bookingID='%s', depositAmount=%s, paymentAmount=%s, customerID='%s'".formatted(contractID, bookingID, depositAmount, paymentAmount, guestID);
    }
}
