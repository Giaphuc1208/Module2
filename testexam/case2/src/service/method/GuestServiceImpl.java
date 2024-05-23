package service.method;

import model.guest.Guest;
import service.data.RegexPerson;
import service.intef.GuestService;
import service.validate.AgeException;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

import static service.data.ReadAndWriteToCSV.readListCustomerTOCSV;
import static service.data.ReadAndWriteToCSV.writeListCustomerToCSV;

public class GuestServiceImpl implements GuestService  {
    public static final String PATH_GUEST ="D:\\Dowload\\Module2\\baitap\\testexam\\case2\\src\\file\\guest.csv";


    public List findAll() {
        List<Guest> guestsLinkedList = new LinkedList<>();
        return guestsLinkedList;
    }

    @Override
    public void addGuest() {
        List<Guest> guestsLinkedList = new LinkedList<>();
        displayALl();
        guestsLinkedList.add(GuestInfo());
        writeListCustomerToCSV(guestsLinkedList,PATH_GUEST,false);
        displayALl();
    }

    @Override
    public void updateGuest(String GuestID) {
        List<Guest> guestsLinkedList = readListCustomerTOCSV(PATH_GUEST);
        displayALl();
        for (int i = 0; i < guestsLinkedList.size(); i++) {
            if (guestsLinkedList.get(i).getGuestID().equals(GuestID)) {
                Guest newGuest = GuestInfo();
                guestsLinkedList.set(i, newGuest);
                writeListCustomerToCSV(guestsLinkedList,PATH_GUEST,false);
                return;
            }
        }
        System.out.println("Not found");
    }

    @Override
    public Guest GuestInfo() {
        String fullName = RegexPerson.inputFullname();
        LocalDate dayofBirth = null;
        try{
            dayofBirth = RegexPerson.inputBirthday();
        }catch (AgeException e){
            System.out.println("");
        }
        boolean gender = RegexPerson.inputGender();
        String identityCard = RegexPerson.inputIDCard();
        String phoneNumber = RegexPerson.inputPhoneNumber();
        String email = RegexPerson.inputEmail();
        String customerID = RegexPerson.inputGuestID();
        String customerType = RegexPerson.inputTypeGuest();
        String address = RegexPerson.inputAddress();
        return new Guest(fullName, dayofBirth, gender, identityCard, phoneNumber, email, customerID, customerType, address);

    }

    @Override
    public void displayALl() {
        List<Guest> guestLinkedList = readListCustomerTOCSV(PATH_GUEST);
        if (guestLinkedList != null) {
            for (Guest guest : guestLinkedList) {
                System.out.println(guest);
            }
        }
    }
}




