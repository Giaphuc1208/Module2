package service.method;

import model.guest.Staff;
import service.data.RegexMenu;
import service.data.RegexPerson;
import service.data.StaffSortID;
import service.intef.StaffService;
import service.validate.AgeException;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import static controller.StaffController.staffManagement;
import static service.data.ReadAndWriteToCSV.readListStaffTOCSV;
import static service.data.ReadAndWriteToCSV.writeListStaffTOCSV;

public class StaffServiceImpl implements StaffService {
    public static final String PATH_STAFF = "D:\\Dowload\\Module2\\baitap\\testexam\\case2\\src\\file\\staff.csv";
    private static Scanner scanner = new Scanner(System.in);

    @Override
    public void displayALl() {
        List<Staff> staffArrayList = readListStaffTOCSV(PATH_STAFF);
        if (staffArrayList != null) {
            for (int i = 0; i < staffArrayList.size(); i++) {
                System.out.println((i + 1) + ">" + staffArrayList.get(i));
            }
        }
    }

    @Override
    public List findAll() {
        return null;
    }

    @Override
    public void addNewStaff() {
        List<Staff> staffArrayList = readListStaffTOCSV(PATH_STAFF);
        System.out.println("You want add new one ? \n" +
                "1.Yes\n" +
                "2.No");
        int check = RegexMenu.inputChoiceMenu();
        if (check == 1){
            staffArrayList.add(inputStaffInfo());
            writeListStaffTOCSV(staffArrayList, PATH_STAFF, false);
            displayALl();
        } else {
            staffManagement();
        }
    }

    @Override
    public void updateStaff() {
        List<Staff> employeeArrayList = readListStaffTOCSV(PATH_STAFF);
        displayALl();

        System.out.println("You want update ? \n" +
                "1.Yes\n" +
                "2.No");
        int check = RegexMenu.inputChoiceMenu();
        switch (check) {
            case 1:
                System.out.println("Enter number Employee to update : ");
                int chooseUpdate = RegexMenu.inputChoiceMenu();
                int chooseIndex = chooseUpdate - 1;
                boolean isExits = false;
                Staff newStaff = inputStaffInfo();
                for (int j = 0; j < employeeArrayList.size(); j++) {
                    if (chooseIndex == j) {
                        employeeArrayList.set(chooseIndex, newStaff);
                        writeListStaffTOCSV(employeeArrayList, PATH_STAFF, false);
                        isExits = true;
                        break;
                    }
                }
                if (!isExits) {
                    System.out.println("Not Found!!!");
                }
                break;
            case 2:
                staffManagement();
                break;
            default:
                System.out.println("No Choice!!!");
                staffManagement();
        }
    }

    @Override
    public void deleteStaff() {
        List<Staff> employeeArrayList = readListStaffTOCSV(PATH_STAFF);
        displayALl();
        System.out.println("You want delete ? \n" +
                "1.Yes\n" +
                "2.No");
        int check = RegexMenu.inputChoiceMenu();
        switch (check) {
            case 1:
                boolean isExits = false;
                System.out.println("Enter id Employee you want to delete?");
                String delId = scanner.nextLine();
                for (int i = 0; i < employeeArrayList.size(); i++) {
                    if (employeeArrayList.get(i).getStaffID().equals(delId)) {
                        employeeArrayList.remove(i);
                        writeListStaffTOCSV(employeeArrayList, PATH_STAFF, false);
                        isExits = true;
                        break;
                    }
                }
                if (!isExits) {
                    System.out.println("Not found!!!");
                    deleteStaff();
                }
                break;
            case 2:
                staffManagement();
                break;
            default:
                System.out.println("No Choice!!!");
                staffManagement();
        }
    }

    @Override
    public void searchStaff() {
        List<Staff> employeeArrayList = readListStaffTOCSV(PATH_STAFF);
        displayALl();
        boolean isExits = false;
        System.out.println("Enter ID Employee Search :");
        String searchID = RegexPerson.inputStaffID();
        for (Staff staff : employeeArrayList) {
            if (staff.getStaffID().equals(searchID)) {
                System.out.println(staff);
                isExits = true;
                break;
            }
        }
        if (!isExits) {
            System.out.println("Not Found!!!");
        }
    }

    @Override
    public Staff inputStaffInfo() {
        String fullName = RegexPerson.inputFullname();
        LocalDate dayOfBirth;
        do {
            try {
                dayOfBirth = RegexPerson.inputBirthday();
                break;
            } catch (AgeException e) {
                System.out.println("AAA");
            }
        } while (true) ;
        boolean newGender = RegexPerson.inputGender();
        String newIDCard = RegexPerson.inputIDCard();
        String newNumberPhone = RegexPerson.inputPhoneNumber();
        String newEmail = RegexPerson.inputEmail();
        String newEmployeeID = RegexPerson.inputStaffID();
        String newPosition = RegexPerson.inputPosition();
        double newSalary = RegexPerson.inputSalary();
        String newLevel = RegexPerson.inputLevel();

        return new Staff(fullName, dayOfBirth, newGender, newIDCard, newNumberPhone,
                newEmail, newEmployeeID, newPosition, newSalary, newLevel);
    }

    @Override
    public void sortIDStaff() {
        displayALl();
        System.out.println("=========================================================================================");
        List<Staff> staffArrayList = readListStaffTOCSV(PATH_STAFF);
        Collections.sort(staffArrayList,new StaffSortID());
        writeListStaffTOCSV(staffArrayList, PATH_STAFF, false);
        displayALl();
    }
}
