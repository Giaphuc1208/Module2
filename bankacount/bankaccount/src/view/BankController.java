package view;
import controller.validate.RegexChoice;

import java.sql.SQLOutput;

public class BankController {
    static int choice = -1;

    static void displayMainMenu(){
        System.out.println("============= GP BANK CONTROLLER =============");
        System.out.println("============= 1. ADD NEW ACCOUNT =============");
        System.out.println("============= 2. DELETE ACCOUNT  =============");
        System.out.println("============= 3. DISPLAY ACCOUNT =============");
        System.out.println("============= 4. FINDING ACCOUNT =============");
        System.out.println("=================  5. EXIT  ==================");
        System.out.println("Enter your choice: ");
        choice = RegexChoice.inputChoiceMenu();
        switch (choice){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            default:
                System.out.println("No choice!!");
                displayMainMenu();
        }
    }

    static void bankMenu(){
        System.out.println("=================  GP BANK   =================");
        System.out.println("============= 1. SAVING ACCOUNT  =============");
        System.out.println("============= 2. CHARGE ACCOUNT  =============");
        System.out.println("=================  3. EXIT  ==================");
        System.out.println("Enter your choice: ");
        choice = RegexChoice.inputChoiceMenu();
        switch (choice){
            case 1:
            case 2:
            case 3:
            default:
                System.out.println("No choice!!");
                displayMainMenu();
        }
    }
}
