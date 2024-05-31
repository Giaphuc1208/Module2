package view;

import controller.MedicalRecordManager;
import controller.Validate;
import model.MedicalRecord;

import java.util.Scanner;

public class MenuMR {
    MedicalRecordManager manager = new MedicalRecordManager();

    public void menu(){
        int choice = -1;
        while (true){
            System.out.println("======== MEDICAL RECORD ========");
            System.out.println("1. ADD NEW MEDICAL RECORD");
            System.out.println("2. DELETE MEDICAL RECORD");
            System.out.println("3. DISPLAY MEDICAL RECORD");
            System.out.println("4. EXIT");
            System.out.println("Choose function: ");
            choice = Validate.getInt();
            switch (choice){
                case 1:
                    add();
                    break;
                case 2:
                    delete();
                    break;
                case 3:
                    showAll();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Your choice is not valid!!");
            }

        }
    }

    public void add(){
        String medicalRecordCode = Validate.inputValidMedicalRecordCode();
        String patientCode = Validate.inputValidPatientCode();
        String patientName = Validate.inputValidPatientName();
        String dateInput = Validate.inputValidDateInput();
        String dateOutput = Validate.inputValidDateOutput();
        String reason = Validate.inputValidReason();
        MedicalRecord medicalRecord = new MedicalRecord(medicalRecordCode, patientCode, patientName, dateInput, dateOutput, reason);
        manager.add(medicalRecord);
        System.out.println("Complete!!");
    }

    public void delete(){
        if(manager.medicalRecordList.isEmpty()){
            System.out.println("Medical record is not valid. Please add new medical record!");
            return;
        }
        MedicalRecord medicalRecord = null;
        String medicalRecordCode;
        System.out.println("Enter medical record code wanted to delete: ");
        while (medicalRecord == null){
            medicalRecordCode = Validate.getText();
            medicalRecord = manager.findMRByCode(medicalRecordCode);
            if (medicalRecordCode.isEmpty()){
                return;
            }
            if (medicalRecord == null){
                System.out.println("Medical Record is not found");
                System.out.println("Please re-enter");
            }
        }
        System.out.println("Yes or No");
        String enterYes = Validate.getText();
        String enterNo = Validate.getText();
        if(enterYes.equalsIgnoreCase("yes")){
            manager.delete(medicalRecord);
            System.out.println("Complete");
            showAll();
        } else if (enterNo.equalsIgnoreCase("no")) {
            menu();
        }
    }

    public void showAll(){
        System.out.println("Medical record list");
        manager.showMenu();
    }

}
