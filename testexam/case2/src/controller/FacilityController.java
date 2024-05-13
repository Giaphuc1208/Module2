package controller;

import service.data.RegexMenu;
import service.method.FacilityServiceImpl;

import java.util.Scanner;

import static controller.DukeCasaApartmentController.displayMainMenu;

public class BlueprintController {
    static int choice = -1;

    static void FacilityManagement() {
        FacilityServiceImpl facilityService = new FacilityServiceImpl();
        System.out.println("1\tDisplay list facility");
        System.out.println("2\tAdd new facility");
        System.out.println("3\tDisplay list facility maintenance");
        System.out.println("4\tReturn main menu");
        choice = RegexMenu.inputChoiceMenu();
        switch (choice) {
            case 1:
                facilityService.displayList();
                FacilityManagement();
                break;
            case 2:
                facilityService.addNewFacility();
                FacilityManagement();
                break;
            case 3:
                facilityService.displayListUsed();
                FacilityManagement();
                break;
            case 4:
                displayMainMenu();
                FacilityManagement();
                break;
            default:
                System.out.println("No choice!");
                FacilityManagement();
        }
    }
}

