package views;

import models.Room;
import ultils.Input;
import ultils.Validate;

import java.util.List;

public class ViewRoom {
    Validate validate = new Validate();

    public void displayMenu(List<Room> rooms) {
        for (Room room : rooms) {
            System.out.println(room.toString());
        }
    }

    public Room addRoom() {
        String roomNumber = "R-" + (int) (Math.random() * 100);
        String typeRoom = validate.inputNewTypeRoom();
        double price = validate.inputValidPrice();
        Room room = new Room(roomNumber, typeRoom, price);
        System.out.println("===+> Add Success!!");
        return room;
    }

    public int showUpdateRoom() {
        System.out.println("1. Edit Type Room\n" +
                "2. Edit Price\n" +
                "3. Turn around\n" +
                "Select activity");
        int choice = Input.getInt();
        return choice;
    }

    public String findRoom() {
        System.out.println("Enter Room Number: ");
        String roomNumber = Input.getString();
        return roomNumber;
    }

    public boolean confirm() {
        do {
            System.out.println("Enter 'Y' to delete, 'N' to cancel");
            String confirm = Input.getString();
                if (confirm.equalsIgnoreCase("Y")) {
                    return true;
                } else if (confirm.equalsIgnoreCase("N")) {
                    return false;
                } else{
                    System.out.println("Your selection is not valid!");
                }
        } while (true);
    }

    public String viewDelete(){
        System.out.println("Enter Room Number u want to remove:" );
        return Input.getString();
    }
}
