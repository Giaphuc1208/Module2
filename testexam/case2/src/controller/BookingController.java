package controller;

import service.data.RegexMenu;

import java.util.Scanner;

import static controller.FacilityController.FacilityManagement;
import static controller.DukeCasaApartmentController.displayMainMenu;

public class BookingController {
    static int choice = -1;
    static Scanner input = new Scanner(System.in);
    static void BookingManagement()  {
        System.out.println("1.\tAdd new booking");
        System.out.println("2.\tDisplay list booking");
        System.out.println("3.\tCreate new contracts");
        System.out.println("4.\tDisplay list contracts");
        System.out.println("5.\tEdit contracts");
        System.out.println("6.\tReturn main menu");
        choice = RegexMenu.inputChoiceMenu();
        switch (choice) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            case 4:
                System.out.println("4");
                break;
            case 5:
                System.out.println("5");
                break;
            case 6:
                displayMainMenu();
                break;
            default:
                System.out.println("No choice!");
                FacilityManagement();
        }
    }
}
