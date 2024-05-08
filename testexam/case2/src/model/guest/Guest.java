package model.guest;

import java.time.LocalDate;

public class Guest extends Person {
    private String guestID;
    private String guestType;
    private String address;

    public Guest(String fullName, LocalDate birthday, boolean gender, String idCard, String phoneNumber, String email, String guestID, String guestType, String address) {
        super(fullName, birthday, gender, idCard, phoneNumber, email);
        this.guestID = guestID;
        this.guestType = guestType;
        this.address = address;
    }


    public String getGuestID() {
        return guestID;
    }

    public void setGuestID(String guestID) {
        this.guestID = guestID;
    }

    public String getGuestType() {
        return guestType;
    }

    public void setGuestType(String guestType) {
        this.guestType = guestType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        if (isGender()) {
            return "Guest{" +
                    "fullName='" + getFullName() + '\'' +
                    ", dateOfBirth=" + getBirthday() +
                    ", gender=" + "male" +
                    ", identityCard='" + getIDcard() + '\'' +
                    ", phoneNumber='" + getPhoneNumber() + '\'' +
                    ", email='" + getEmail() + '\'' +
                    ", customerID='" + guestID + '\'' +
                    ", customerType='" + guestType + '\'' +
                    ", address='" + address + '\'' +
                    '}';
        } else {
            return "Guest{" +
                    "fullName='" + getFullName() + '\'' +
                    ", dateOfBirth=" + getBirthday() +
                    ", gender=" + "female" +
                    ", identityCard='" + getIDcard() + '\'' +
                    ", phoneNumber='" + getPhoneNumber() + '\'' +
                    ", email='" + getEmail() + '\'' +
                    ", customerID='" + guestID + '\'' +
                    ", customerType='" + guestType + '\'' +
                    ", address='" + address + '\'' +
                    '}';
        }
    }
    @Override
    public String getInfo() {
        return getFullName() + "," + getBirthday() + "," + isGender() + "," + getIDcard() + "," +
                getPhoneNumber() + "," + getEmail() + "," + getGuestID() + "," + getGuestType() + "," + getAddress();
    }
}
