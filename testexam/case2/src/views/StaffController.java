package views;

import service.validate.RegexMenu;
import controller.StaffServiceImpl;

import static views.DukeCasaApartmentController.displayMainMenu;


public class StaffController {
    static int choice = -1;

    public static void staffManagement() {
        StaffServiceImpl staffService = new StaffServiceImpl();
        System.out.println("1.\tDisplay list staffs");
        System.out.println("2.\tAdd new staff");
        System.out.println("3.\tEdit staff");
        System.out.println("4.\tDelete staff");
        System.out.println("5.\tSearch staff");
        System.out.println("6.\tSort ID staff");
        System.out.println("7.\tReturn main menu");
        System.out.println();
        choice = RegexMenu.inputChoiceMenu();
        switch (choice) {
            case 1:
                staffService.displayALl();
                staffManagement();
                break;
            case 2:
                staffService.addNewStaff();
                staffManagement();
                break;
            case 3:
                staffService.updateStaff();
                staffManagement();
                break;
            case 4:
                staffService.deleteStaff();
                staffManagement();
                break;
            case 5:
                staffService.searchStaff();
                staffManagement();
            case 6:
                staffService.sortIDStaff();
                staffManagement();
            case 7:
                displayMainMenu();
                break;
            default:
                System.out.println("No choice!!");
                staffManagement();
        }
    }
}
