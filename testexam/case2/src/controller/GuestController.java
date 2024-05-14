package controller;

import service.data.RegexMenu;
import service.method.GuestServiceImpl;

import java.util.Scanner;

import static controller.DukeCasaApartmentController.displayMainMenu;

public class GuestController {
    static int choice = -1;
    static void GuestManagement()  {
        GuestServiceImpl guestServiceImpl = new GuestServiceImpl();
        System.out.println("1.\tDisplay list guests");
        System.out.println("2.\tAdd new guest");
        System.out.println("3.\tEdit guest");
        System.out.println("4.\tReturn main menu");
        choice = RegexMenu.inputChoiceMenu();;
        switch (choice) {
            case 1:
                guestServiceImpl.displayALl();
                GuestManagement();
                break;
            case 2:
                guestServiceImpl.addGuest();
                GuestManagement();
                break;
            case 3:
                guestServiceImpl.displayALl();
                System.out.println("Enter id Customer : ");
                Scanner scanner =new Scanner(System.in);
                String customerID = scanner.nextLine();
                guestServiceImpl.updateGuest(customerID);
                guestServiceImpl.displayALl();
                GuestManagement();
                break;
            case 4:
                displayMainMenu();
                GuestManagement();
                break;
            default:
                System.out.println("No choice!");
                GuestManagement();
        }
    }
}
