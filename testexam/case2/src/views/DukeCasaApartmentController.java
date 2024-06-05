package views;

import service.validate.RegexMenu;

import static views.StaffController.staffManagement;
import static views.GuestController.GuestManagement;
import static views.FacilityController.FacilityManagement;
import static views.BookingController.BookingManagement;

public class DukeCasaApartmentController {
    public static void main(String[] args) {

        displayMainMenu();
    }
    static int choice = -1;
    static void displayMainMenu(){
        System.out.println("1. Staff Management");
        System.out.println("2. Guest Management");
        System.out.println("3. Facility Management ");
        System.out.println("4. Booking Management");
        System.out.println("5. Exit");
        System.out.println("Enter your choice: ");
        choice = RegexMenu.inputChoiceMenu();
        switch (choice) {
            case 1:
                staffManagement();
                break;
            case 2:
                GuestManagement();
                break;
            case 3:
                FacilityManagement();
                break;
            case 4:
                BookingManagement();
                break;
            case 5:
                System.exit(6);
            default:
                System.out.println("No choice!!");
                displayMainMenu();
        }
    }
}
