package controllers;

//import controllers.BookingController;
import controllers.RoomController;
import ultils.Input;

public class DukeCasaApartment {
    private final RoomController roomController = new RoomController();
    private final BookingController bookingController = new BookingController(roomController);

    public void run(){
        while (true){
            int choice;
            System.out.println("====== MENU DUKE CASA APARTMENT ======\n" +
                    "1. Room Management\n" +
                    "2. Booking Management\n" +
                    "3. Exit\n" +
                    "Choose option");
            choice = Input.getInt();
            switch (choice){
                case 1:
                    roomController.menuRoom();
                    break;
                case 2:
                    bookingController.menuBooking();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Option is not valid!!");
                    break;
            }
        }

    }

}
