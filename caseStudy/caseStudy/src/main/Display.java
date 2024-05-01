package main;

import compositional.Guest;
import room.DeluxeRoom;
import room.DoubleRoom;
import room.FamilyRoom;
import room.Room;

import java.util.Scanner;

import java.util.Scanner;

public class Display {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HotelController hotel = new HotelController();
        while (true) {
            try {
                System.out.println("Application Manager Candidate: ");
                System.out.println("Enter 1: To insert person for rent: ");
                System.out.println("Enter 2: To remove person by passport: ");
                System.out.println("Enter 3: To calculator price by passport: ");
                System.out.println("Enter 4: To show infor: ");
                System.out.println("Enter 5: To exit: ");
                String line = scanner.nextLine();
                switch(line) {
                    case "1": {
                        System.out.print("Enter name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter age: ");
                        int age = Integer.parseInt(scanner.nextLine());
                        System.out.print("Enter passport: ");
                        String passport = scanner.nextLine();
                        System.out.println("Choise 1 to rent room type Deluxe");
                        System.out.println("Choise 2 to rent room type Double");
                        System.out.println("Choise 3 to rent room type Family");
                        String choise = scanner.nextLine();
                        Room room;
                        switch (choise) {
                            case "1":
                                room = new DeluxeRoom();
                                break;
                            case "2":
                                room = new DoubleRoom();
                                break;
                            case "3":
                                room = new FamilyRoom();
                                break;
                            default:
                                throw new IllegalArgumentException("Invalid room choice");
                        }
                        System.out.print("Enter number day for rent: ");
                        int numberRent = Integer.parseInt(scanner.nextLine());
                        Guest guest = new Guest(name, age, passport, room, numberRent);
                        hotel.add(guest);
                        hotel.bubbleSort();
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
                        throw new IllegalArgumentException("Invalid choice");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input format. Please enter a valid number.");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println("An unexpected error occurred.");
                e.printStackTrace();
            }
        }
    }
}

