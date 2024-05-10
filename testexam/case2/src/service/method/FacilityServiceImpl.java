package service.method;

import model.blueprint.Facility;
import model.blueprint.GardenViewStudio;
import model.blueprint.SuiteStudio;
import model.blueprint.StudioDeluxe;
import service.data.RegexDesign;
import service.intef.DesignService;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

import static service.data.ReadAndWriteToCSVFacility.*;

public class FacilityServiceImpl implements DesignService {
    private static Scanner scanner = new Scanner(System.in);
    public static final String PATH_GARDEN = "D:\\Dowload\\Module2\\baitap\\testexam\\case2\\src\\file\\garden.csv";
    public static final String PATH_SUITE = "D:\\Dowload\\Module2\\baitap\\testexam\\case2\\src\\file\\suite.csv";
    public static final String PATH_DELUXE = "D:\\Dowload\\Module2\\baitap\\testexam\\case2\\src\\file\\deluxe.csv";

    @Override
    public void addNewFacility()  {
        System.out.println("1. Add New Studio Deluxe");
        System.out.println("2. Add New Garden View Studio");
        System.out.println("3. Add New Suite Studio");
        System.out.println("4. Back to menu");
        System.out.println("Enter choice");
        int input;
        input = Integer.parseInt(scanner.nextLine());
        switch (input) {
            case 1:
                addNewDeluxe();
                addNewFacility();
                break;
            case 2:
                addNewGarden();
                addNewFacility();
                break;
            case 3:
                addNewSuite();
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
        Map<Facility, Integer> facilityGarden = readHouseToCSV(PATH_GARDEN);
        Map<Facility, Integer> facilityDeluxe = readVillaToCSV(PATH_DELUXE);
        Map<Facility, Integer> facilitySuite = readRoomToCSV(PATH_SUITE);
        System.out.println("The facility list as below:");
        if (facilityGarden != null) {
            System.out.println("Data Garden View Studio");
            for (Facility item : facilityGarden.keySet()) {
                System.out.println("Garden View Studio: " + item.toString() + "\t value: " + facilityGarden.get(item));
            }
        }
        if (facilityDeluxe != null) {
            System.out.println("Data Deluxe Studio");
            for (Facility item : facilityDeluxe.keySet()) {
                System.out.println("Deluxe Studio: " + item.toString() + "\t value: " + facilityDeluxe.get(item));
            }
        }
        if (facilitySuite != null) {
            System.out.println("Data Suite Studio");
            for (Facility item : facilitySuite.keySet()) {
                System.out.println("Suite Studio: " + item.toString() + "\t value: " + facilitySuite.get(item));
            }
        }
    }



    @Override
    public void addNewDeluxe()  {
        LinkedHashMap<Facility, Integer> facilityVilla = readVillaToCSV(PATH_DELUXE);
        System.out.println("Add a new Deluxe Studio ");
        StudioDeluxe studioDeluxe = validateInfoDeluxe();
        facilityVilla.put(studioDeluxe, 0);

        writeMapTOCSV(facilityVilla,PATH_DELUXE,false);
        displayList();
    }

    @Override
    public StudioDeluxe validateInfoDeluxe() {
        String serviceName = RegexDesign.inputServiceName();
        double usableArea = RegexDesign.inputUsableArea();
        double rentalCost = RegexDesign.inputRentalCost();
        int maxCapacity = RegexDesign.inputMaxCapacity();
        String rentalType = RegexDesign.inputRentalType();
        String deluxeCode = RegexDesign.inputDeluxeCode();
        String floors = RegexDesign.inputFloors();
        return new StudioDeluxe(serviceName, usableArea, rentalCost, maxCapacity,
                rentalType, deluxeCode, floors);
    }

    @Override
    public void addNewSuite() {
        LinkedHashMap<Facility, Integer> facilityRoom = readRoomToCSV(PATH_SUITE);
        System.out.println("Add a new Suite Studio");
        SuiteStudio suiteStudio = validateInfoSuite();
        facilityRoom.put(suiteStudio, 0);
        writeMapTOCSV(facilityRoom,PATH_SUITE,false);
        displayList();
    }

    @Override
    public SuiteStudio validateInfoSuite() {
        String serviceName = RegexDesign.inputServiceName();
        double usableArea = RegexDesign.inputUsableArea();
        double rentalCost = RegexDesign.inputRentalCost();
        int maxCapacity = RegexDesign.inputMaxCapacity();
        String rentalType = RegexDesign.inputRentalType();
        String codeSuite = RegexDesign.inputSuiteCode();;
        return new SuiteStudio(serviceName, usableArea, rentalCost, maxCapacity, rentalType, codeSuite);
    }

    @Override
    public void addNewGarden()  {
        LinkedHashMap<Facility, Integer> facilityRoom = readHouseToCSV(PATH_GARDEN);
        System.out.println("Add a new Garden View Studio");
        GardenViewStudio house = validateInfoGarden();
        facilityRoom.put(house, 0);
        writeMapTOCSV(facilityRoom, PATH_GARDEN, false);
        displayList();
    }

    @Override
    public GardenViewStudio validateInfoGarden() {
        String serviceName = RegexDesign.inputServiceName();
        double usableArea = RegexDesign.inputUsableArea();
        double rentalCost = RegexDesign.inputRentalCost();
        int maxCapacity = RegexDesign.inputMaxCapacity();
        String rentalType = RegexDesign.inputRentalType();
        String gardenCode = RegexDesign.inputGardenCode();
        String floors = RegexDesign.inputFloors();

        return new GardenViewStudio(serviceName, usableArea, rentalCost, maxCapacity, rentalType, gardenCode, floors);
    }

    @Override
    public void displayListUsed() {
        Map<Facility, Integer> facilityGarden = readHouseToCSV(PATH_GARDEN);
        Map<Facility, Integer> facilityDeluxe = readVillaToCSV(PATH_DELUXE);
        Map<Facility, Integer> facilitySuite = readRoomToCSV(PATH_SUITE);
        System.out.println("Display list facility maintenance (used to >=5) : ");
        for (Map.Entry<Facility, Integer> item : facilityGarden.entrySet()) {
            if (item.getValue() >= 5) {
                System.out.println(item.getKey() + "  " + item.getValue());
            }
        }
        for (Map.Entry<Facility, Integer> item : facilityDeluxe.entrySet()) {
            if (item.getValue() >= 5) {
                System.out.println(item.getKey() + "  " + item.getValue());
            }
        }
        for (Map.Entry<Facility, Integer> item : facilitySuite.entrySet()) {
            if (item.getValue() >= 5) {
                System.out.println(item.getKey() + "  " + item.getValue());
            }
        }
    }

    @Override
    public void displayALl() {
    }
}

