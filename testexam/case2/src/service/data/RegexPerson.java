package service.data;

import service.validate.AgeException;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class RegexPerson {
    static Scanner scanner = new Scanner(System.in);

    private static final String REGEX_NAME = "(^[\\w'\\-,.][^0-9_!¡?÷?¿/\\\\+=@#$%ˆ&*(){}|~<>;:]{2,}$)";
    private static final String REGEX_ID_CARD = "[0-9]{9}";
    private static final String REGEX_PHONE_NUMBER = "[84][0-9]{10}";
    private static final String REGEX_EMAIL = ("\\b[a-z0-9._%-]+@[a-z0-9.-]+\\.[a-z]{2,4}\\b");
    private static final String REGEX_ID_STAFF = "[0-9]{3}";
    private static final String REGEX_POSITION = "([a-z])\\w+";
    private static final String REGEX_LEVEL = "([a-z])\\w+";
    private static final String REGEX_GUEST_ID = "[0-9]";
    private static final String REGEX_TYPE_GUEST = "([a-z])\\w+";
    private static final String REGEX_ADDRESS = "[0-9]+ ([A-Z][a-z ]*)+";

    public static LocalDate inputBirthday() throws AgeException {
        LocalDate birthday;
        DateTimeFormatter dateTimeFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        while (true){
            try{
                System.out.println("Enter day of birth: ");
                birthday = LocalDate.parse(scanner.nextLine(),dateTimeFormat);
                LocalDate now = LocalDate.now();
                if(now.getYear() - birthday.getYear() < 18 || now.getYear() - birthday.getYear() > 100){
                    throw new IOException("Age you must be over 18 years old or less than 100 years old");
                }
                return birthday;
            } catch (NumberFormatException | DateTimeParseException e){
                System.out.println("Date of Birth Incorrect Format (yyyy-MM-dd)");
            } catch (IOException e){
                throw new AgeException();
            }
        }
    }

    public static String inputFullname(){
        System.out.println("Enter your first and last name: ");
        String fullName = scanner.nextLine();
        while (!fullName.matches(REGEX_NAME)){
            System.err.println("You entered incorrectly, requesting re-entering!!");
            fullName = scanner.nextLine();
        }
        return fullName;
    }

    public static boolean inputGender(){
        System.out.println("Enter Male or Female or others: ");
        boolean newGender = Boolean.parseBoolean(scanner.nextLine());
        return newGender;
    }

    public static String inputIDCard(){
        System.out.println("Enter ID card: ");
        String newIDCard = scanner.nextLine();
        while (!newIDCard.matches(REGEX_ID_CARD)){
            System.err.println("You entered incorrectly, requesting re-entering!!");
            newIDCard = scanner.nextLine();
        }
        return newIDCard;
    }

    public static String inputPhoneNumber(){
        System.out.println("Enter your phone number: ");
        String newPhoneNumber = scanner.nextLine();
        while (!newPhoneNumber.matches(REGEX_PHONE_NUMBER)){
            System.err.println("You entered incorrectly, requesting re-entering!!");
            newPhoneNumber = scanner.nextLine();
        }
        return newPhoneNumber;
    }

    public static String inputEmail(){
        System.out.println("Enter your email: ");
        String newEmail = scanner.nextLine();
        while (!newEmail.matches(REGEX_EMAIL)){
            System.err.println("You entered incorrectly, requesting re-entering!!");
            newEmail = scanner.nextLine();
        }
        return newEmail;
    }

    public static String inputStaffID(){
        System.out.println("Enter your staff ID: ");
        String newStaffID = scanner.nextLine();
        while (!newStaffID.matches(REGEX_ID_STAFF)){
            System.err.println("You entered incorrectly, requesting re-entering!!");
            newStaffID = scanner.nextLine();
        }
        return newStaffID;
    }

    public static String inputPosition(){
        System.out.println("Enter your position at resort: ");
        String newPosition = scanner.nextLine();
        while (!newPosition.matches(REGEX_POSITION)){
            System.err.println("You entered incorrectly, requesting re-entering!!");
            newPosition = scanner.nextLine();
        }
        return newPosition;
    }

    public static String inputLevel(){
        System.out.println("Enter your level at resort: ");
        String newLevel = scanner.nextLine();
        while (!newLevel.matches(REGEX_LEVEL)){
            System.err.println("You entered incorrectly, requesting re-entering!!");
            newLevel = scanner.nextLine();
        }
        return newLevel;
    }

    public static String inputGuestID(){
        System.out.println("Enter your ID(for guest): ");
        String newGuestID = scanner.nextLine();
        while (!newGuestID.matches(REGEX_GUEST_ID)){
            System.err.println("You entered incorrectly, requesting re-entering!!");
            newGuestID = scanner.nextLine();
        }
        return newGuestID;
    }

    public static String inputTypeGuest(){
        System.out.println("Enter the guest category: ");
        String typeGuest = scanner.nextLine();
        while (!typeGuest.matches(REGEX_TYPE_GUEST)){
            System.err.println("You entered incorrectly, requesting re-entering!!");
            typeGuest = scanner.nextLine();
        }
        return typeGuest;
    }

    public static String inputAddress(){
        System.out.println("Enter your address: ");
        String newAddress = scanner.nextLine();
        while (!newAddress.matches(REGEX_ADDRESS)){
            System.err.println("You entered incorrectly, requesting re-entering!!");
            newAddress = scanner.nextLine();
        }
        return newAddress;
    }

    public static Double inputSalary() {
        while (true) {
            try {
                System.out.println("Enter salary  ");
                return Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("Enter a number and !!!");
            }
        }
    }
}




