package service.method;

import model.design.Facility;
import model.design.House;
import model.design.Room;
import model.design.Villa;
import service.data.RegexDesign;
import service.intef.DesignService;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

import static service.data.ReadAndWriteToCSVFacility.*;

public class FacilityServiceImpl implements DesignService {
    private static Scanner scanner = new Scanner(System.in);
    public static final String PATH_HOUSE = "D:\\Dowload\\Module2\\baitap\\testexam\\case2\\src\\file\\house.csv";
    public static final String PATH_ROOM = "D:\\Dowload\\Module2\\baitap\\testexam\\case2\\src\\file\\room.csv";
    public static final String PATH_VILLA = "D:\\Dowload\\Module2\\baitap\\testexam\\case2\\src\\file\\villa.csv";

    @Override
    public void addNewFacility()  {
        System.out.println("1. Add New Villa");
        System.out.println("2. Add New House");
        System.out.println("3. Add New Room");
        System.out.println("4. Back to menu");
        System.out.println("Enter choice");
        int input;
        input = Integer.parseInt(scanner.nextLine());
        switch (input) {
            case 1:
                addNewVilla();
                addNewFacility();
                break;
            case 2:
                addNewHouse();
                addNewFacility();
                break;
            case 3:
                addNewRoom();
                addNewFacility();
                break;
            case 4:
                break;
            default:
                System.out.println("No choice ! ");
                addNewFacility();
                break;
        }
    }

    @Override
    public void displayList()  {
        Map<Facility, Integer> facilityHouse = readHouseToCSV(PATH_HOUSE);
        Map<Facility, Integer> facilityVilla = readVillaToCSV(PATH_VILLA);
        Map<Facility, Integer> facilityRoom = readRoomToCSV(PATH_ROOM);
        System.out.println("The facility list as below:");
        if (facilityHouse != null) {
            System.out.println("Data House");
            for (Facility item : facilityHouse.keySet()) {
                System.out.println("key: " + item.toString() + "\t value: " + facilityHouse.get(item));
            }
        }
        if (facilityVilla != null) {
            System.out.println("Data Villa");
            for (Facility item : facilityVilla.keySet()) {
                System.out.println("key: " + item.toString() + "\t value: " + facilityVilla.get(item));
            }
        }
        if (facilityRoom != null) {
            System.out.println("Data Room");
            for (Facility item : facilityRoom.keySet()) {
                System.out.println("key: " + item.toString() + "\t value: " + facilityRoom.get(item));
            }
        }
    }

    @Override
    public void addNewVilla()  {
        LinkedHashMap<Facility, Integer> facilityVilla = readVillaToCSV(PATH_VILLA);
        System.out.println("Add a new Villa ");
        Villa villa = validateInfoVilla();
        facilityVilla.put(villa, 0);
        writeMapVillaTOCSV(facilityVilla,PATH_VILLA,false);
        displayList();
    }

    @Override
    public Villa validateInfoVilla() {
        String serviceName = RegexDesign.inputServiceName();
        double usableArea = RegexDesign.inputUsableArea();
        double rentalCost = RegexDesign.inputRentalCost();
        int maxCapacity = RegexDesign.inputMaxCapacity();
        String rentalType = RegexDesign.inputRentalType();
        String serviceCode = RegexDesign.inputMDVVilla();
        String roomStandard = RegexDesign.inputStandard();
        double poolArea = RegexDesign.inputPoolArea();
        int floors = RegexDesign.inputFloor();
        return new Villa(serviceName, usableArea, rentalCost, maxCapacity,
                rentalType, serviceCode, roomStandard, poolArea, floors);
    }

    @Override
    public void addNewRoom() {
        LinkedHashMap<Facility, Integer> facilityRoom = readRoomToCSV(PATH_ROOM);
        System.out.println("Add a new Room");
        Room room = validateInfoRoom();
        facilityRoom.put(room, 0);
        writeMapRoomTOCSV(facilityRoom,PATH_ROOM,false);
        displayList();
    }

    @Override
    public Room validateInfoRoom() {
        String serviceName = RegexDesign.inputServiceName();
        double usableArea = RegexDesign.inputUsableArea();
        double rentalCost = RegexDesign.inputRentalCost();
        int maxCapacity = RegexDesign.inputMaxCapacity();
        String rentalType = RegexDesign.inputRentalType();
        String mDVRoom = RegexDesign.inputMDVRoom();
        String freeServiceIncluded = RegexDesign.inputFreeService();
        return new Room(serviceName, usableArea, rentalCost, maxCapacity, rentalType, mDVRoom, freeServiceIncluded);
    }

    @Override
    public void addNewHouse()  {
        LinkedHashMap<Facility, Integer> facilityRoom = readHouseToCSV(PATH_HOUSE);
        System.out.println("Add a new House");
        House house = validateInfoHouse();
        facilityRoom.put(house, 0);
        writeMapHouseTOCSV(facilityRoom, PATH_HOUSE, false);
        displayList();
    }

    @Override
    public House validateInfoHouse() {
        String serviceName = RegexDesign.inputServiceName();
        double usableArea = RegexDesign.inputUsableArea();
        double rentalCost = RegexDesign.inputRentalCost();
        int maxCapacity = RegexDesign.inputMaxCapacity();
        String rentalType = RegexDesign.inputRentalType();
        String serviceCode = RegexDesign.inputMDVHouse();
        String roomStandard = RegexDesign.inputStandard();
        int floors = RegexDesign.inputFloor();

        return new House(serviceName, usableArea, rentalCost, maxCapacity, rentalType, serviceCode, roomStandard, floors);
    }

    @Override
    public void displayListUsed() {
        Map<Facility, Integer> facilityHouse = readHouseToCSV(PATH_HOUSE);
        Map<Facility, Integer> facilityVilla = readVillaToCSV(PATH_VILLA);
        Map<Facility, Integer> facilityRoom = readRoomToCSV(PATH_ROOM);
        System.out.println("Display list facility maintenance (used to >=5) : ");
        for (Map.Entry<Facility, Integer> item : facilityHouse.entrySet()) {
            if (item.getValue() >= 5) {
                System.out.println(item.getKey() + "  " + item.getValue());
            }
        }
        for (Map.Entry<Facility, Integer> item : facilityVilla.entrySet()) {
            if (item.getValue() >= 5) {
                System.out.println(item.getKey() + "  " + item.getValue());
            }
        }
        for (Map.Entry<Facility, Integer> item : facilityRoom.entrySet()) {
            if (item.getValue() >= 5) {
                System.out.println(item.getKey() + "  " + item.getValue());
            }
        }
    }

    @Override
    public void displayALl() {
    }
}

