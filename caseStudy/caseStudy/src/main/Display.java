package main;

import compositional.Guest;
import room.DeluxeRoom;
import room.DoubleRoom;
import room.FamilyRoom;
import room.Room;

import java.util.Scanner;

public class Display {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HotelController hotel = new HotelController();
        while (true) {
            System.out.println("Application Manager Candidate");
            System.out.println("Enter 1: To insert person for rent");
            System.out.println("Enter 2: To remove person by passport");
            System.out.println("Enter 3: To calculator price by passport");
            System.out.println("Enter 4: To show infor");
            System.out.println("Enter 5: To exit:");
            String line = scanner.nextLine();
            switch(line) {
                case "1": {
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter age: ");
                    int age = scanner.nextInt();
                    System.out.print("Enter passport: ");
                    scanner.nextLine();
                    String passport = scanner.nextLine();
                    System.out.println("Choise 1 to rent room type Deluxe");
                    System.out.println("Choise 2 to rent room type Double");
                    System.out.println("Choise 3 to rent room type Family");
                    String choise = scanner.nextLine();
                    Room room;
                    if (choise.equals("Deluxe")) {
                        room = new DeluxeRoom();
                    } else if (choise.equals("Double")) {
                        room = new DoubleRoom();
                    } else if (choise.equals("Family")) {
                        room = new FamilyRoom();
                    } else {
                        continue;
                    }
                    System.out.print("Enter number day for rent: ");
                    int numberRent = scanner.nextInt();
                    Guest guest = new Guest(name, age, passport, room, numberRent);
                    hotel.add(guest);
                    scanner.nextLine();
                    break;
                }
                case "2": {
                    System.out.print("Enter passport: ");
                    String passport = scanner.nextLine();
                    hotel.delete(passport);
                    break;
                }
                case "3": {
                    System.out.print("Enter passport: ");
                    String passport = scanner.nextLine();
                    System.out.println("Price: " + hotel.calculator(passport));
                    break;
                }
                case "4": {
                    hotel.show();
                    break;
                }
                case "5": {
                    return;
                }
                default:
                    System.out.println("Invalid");
                    continue;
            }
        }
    }
}
