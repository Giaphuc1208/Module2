package service.data;

import java.util.Scanner;

public class RegexDesign {
    private static final String REGEX_MDV_HOUSE = "^SVRO-\\d{4}$";
    private static final String REGEX_MDV_ROOM = "^SVRO-\\d{4}$";
    private static final String REGEX_MDV_VILLA = "^SVRO-\\d{4}$";
    private static final String REGEX_NAME_SERVICE = "([A-Z])\\w+";
    private static final String REGEX_RENTAL_TYPE = "([a-z])\\w+";
    private static final String REGEX_STANDARD_ROOM = "(Standard|Superior|Deluxe|Suite|Connecting room)";
    private static final String REGEX_FREE_SERVICE = "([a-z])\\w+";
    static Scanner scanner = new Scanner(System.in);

    public static String inputMDVHouse(){
        System.out.println("Enter your MDV: ");
        String mdvHouse = scanner.nextLine();
        while (!mdvHouse.matches(REGEX_MDV_HOUSE)){
            try{
                System.out.println("Invalid, please re-enter!!(VD : SVHO-****)");
                mdvHouse = scanner.nextLine();
            } catch (NumberFormatException e){
                System.err.println("Invalid, please re-enter!!");
            }
        }
        return mdvHouse;
    }

    public static String inputMDVRoom(){
        System.out.println("Enter your MDV: ");
        String mdvRoom = scanner.nextLine();
        while (!mdvRoom.matches(REGEX_MDV_VILLA)){
            System.err.println("Invalid, please re-enter!!");
            mdvRoom = scanner.nextLine();
        }
        return mdvRoom;
    }

    public static String inputMDVVilla(){
        System.out.println("Enter your MDV: ");
        String mdvVilla = scanner.nextLine();
        while (!mdvVilla.matches(REGEX_MDV_ROOM)){
            System.err.println("Invalid, please re-enter!!");
            mdvVilla = scanner.nextLine();
        }
        return mdvVilla;
    }

    public static String inputServiceName(){
        System.out.println("Enter the service you choose: ");
        String serviceName = scanner.nextLine();
        while (!serviceName.matches(REGEX_NAME_SERVICE)){
            System.err.println("It's not us service,we very sorry, please choose again!");
            serviceName = scanner.nextLine();
        }
        return serviceName;
    }

    public static String inputRentalType(){
        System.out.println("Enter the rental type you want to rent: ");
        String rentalType = scanner.nextLine();
        while (!rentalType.matches(REGEX_RENTAL_TYPE)){
            System.err.println("Invalid, please re-enter!!");
        }
        return rentalType;
    }

    public static String inputStandard(){
        System.out.println("Enter standard room you want to rent: ");
        String standard = scanner.nextLine();
        while (!standard.matches(REGEX_STANDARD_ROOM)){
            System.err.println("Invalid, please re-enter!!");
            System.out.println("choose Standard|Superior|Deluxe|Suite|Connecting room");
            standard = scanner.nextLine();
        }
        return standard;
    }

    public static String inputFreeService(){
        System.out.println("Enter free service you want to choose: ");
        String freeService = scanner.nextLine();
        while (!freeService.matches(REGEX_FREE_SERVICE)){
            System.err.println("Invalid, please re-enter!!");
        }
        return freeService;
    }

    public static Integer inputFloor(){
        int floors;
        do{
            try{
                System.out.println("Enter floors: ");
                floors = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e){
                System.out.println("Please enter floors: ");
                floors = -1;
            }
        }while (floors <= 0);
            return floors;
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
                System.out.println("Pleas enter a number more than 0 !");
                rentalCost = -1.0;
            }
        } while (rentalCost <= 0.0);
        return rentalCost;
    }

    public static Double inputPoolArea() {
        double poolArea;
        do {
            try {
                System.out.println("Enter pool Area :");
                poolArea = Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Pleas enter pool Area ! ");
                poolArea = -1;
            }
        } while (poolArea <= 30);
        return poolArea;
    }

    public static Double inputUsableArea() {
        double usableArea;
        do {
            try {
                System.out.println("Enter usable Area :");
                usableArea = Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Pleas enter a number more than 30 ! ");
                usableArea = -1;
            }
        } while (usableArea < 30);
        return usableArea;
    }

}
