package controller;

import service.data.RegexMenu;
import service.intef.GuestService;

import static controller.StaffController.staffManagement;
import static controller.GuestController.GuestManagement;
import static controller.DesignController.FacilityManagement;
import static controller.BookingController.BookingManagement;

public class ResortController {
    public static void main(String[] args) {
        displayMainMenu();
    }
    static int choice = -1;
    static void displayMainMenu(){
        System.out.println("1. Staff Management");
        System.out.println("2. Guest Management");
        System.out.println("3. Facility Management ");
        System.out.println("4. Booking Management");
        System.out.println("5. Promotion Management");
        System.out.println("6. Exit");
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
                PromotionManagement();
                break;
            case 6:
                System.exit(6);
            default:
                System.out.println("No choice!!");
                displayMainMenu();
        }
    }
    static void PromotionManagement() {
        System.out.println("1.\tDisplay list customers use service");
        System.out.println("2.\tDisplay list customers get voucher");
        System.out.println("3.\tReturn main menu");
        choice = RegexMenu.inputChoiceMenu();;
        switch (choice) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                displayMainMenu();
                break;
            default:
                System.out.println("No choice!");
                PromotionManagement();
        }
    }
}
