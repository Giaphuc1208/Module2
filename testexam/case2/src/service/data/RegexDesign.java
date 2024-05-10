package service.data;

import java.util.Scanner;

public class RegexDesign {
    private static final String REGEX_CODE_GARDEN = "^G-\\d{5}$";
    private static final String REGEX_CODE_SUITE = "^S-\\d{5}$";
    private static final String REGEX_CODE_DELUXE = "^DL-\\d{5}$";
    private static final String REGEX_NAME_SERVICE = "(^[^\\\\W_*]+((\\\\.?[\\\\W\\\\~-]+)*\\\\.?[^\\\\W_*])*$)";
    private static final String REGEX_RENTAL_TYPE = "(^[^\\\\W_*]+((\\\\.?[\\\\W\\\\~-]+)*\\\\.?[^\\\\W_*])*$)";
    private static final String REGEX_STANDARD_ROOM = "([1-8])";
    static Scanner scanner = new Scanner(System.in);

    public static String inputGardenCode(){
        System.out.println("Enter Garden View Studio code: ");
        String codeGarden = scanner.nextLine();
        while (!codeGarden.matches(REGEX_CODE_GARDEN)){
            try{
                System.out.println("Invalid, please re-enter!!(Example : G-*****)");
                codeGarden = scanner.nextLine();
            } catch (NumberFormatException e){
                System.err.println("Invalid, please re-enter!!");
            }
        }
        return codeGarden;
    }

    public static String inputSuiteCode(){
        System.out.println("Enter Suite Studio code: ");
        String codeSuite = scanner.nextLine();
        while (!codeSuite.matches(REGEX_CODE_SUITE)){
            System.err.println("Invalid, please re-enter!!");
            codeSuite = scanner.nextLine();
        }
        return codeSuite;
    }

    public static String inputDeluxeCode(){
        System.out.println("Enter Deluxe Studio code: ");
        String mdvVilla = scanner.nextLine();
        while (!mdvVilla.matches(REGEX_CODE_DELUXE)){
            System.err.println("Invalid, please re-enter!!");
            mdvVilla = scanner.nextLine();
        }
        return mdvVilla;
    }

    public static String inputServiceName(){
        System.out.println("Enter the service of facility: ");
        String serviceName = scanner.nextLine();
        while (!serviceName.matches(REGEX_NAME_SERVICE)){
            System.err.println("We don't have these service, please enter again!");
            serviceName = scanner.nextLine();
        }
        return serviceName;
    }

    public static String inputRentalType(){
        System.out.println("Enter the rental type of facility: ");
        String rentalType = scanner.nextLine();
        while (!rentalType.matches(REGEX_RENTAL_TYPE)){
            System.err.println("Invalid, please re-enter!!");
        }
        return rentalType;
    }

    public static String inputFloors(){
        System.out.println("Enter floors of facility: ");
        String standard = scanner.nextLine();
        while (!standard.matches(REGEX_STANDARD_ROOM)){
            System.err.println("Invalid, please re-enter!!");
            System.out.println("choose 1|2|3|4|5|6|7|8");
            standard = scanner.nextLine();
        }
        return standard;
    }


    public static Integer inputMaxCapacity(){
        int maxCapacity;
        do {
            try {
                System.out.println("Enter max capacity: ");
                maxCapacity = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e){
                System.out.println("Please enter a number more than 0 !");
                maxCapacity = -1;
            }
        }while (maxCapacity < 1 || maxCapacity > 20);
        return maxCapacity;
    }

    public static Double inputRentalCost() {
        double rentalCost;
        do {
            try {
                System.out.println("Enter rental cost :");
                rentalCost = Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Please enter a number more than 0 !");
                rentalCost = -1.0;
            }
        } while (rentalCost <= 0.0);
        return rentalCost;
    }

    public static Double inputUsableArea() {
        double usableArea;
        do {
            try {
                System.out.println("Enter usable Area of Facility :");
                usableArea = Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Please enter usable area more than 30 ! ");
                usableArea = -1;
            }
        } while (usableArea < 30);
        return usableArea;
    }

}
