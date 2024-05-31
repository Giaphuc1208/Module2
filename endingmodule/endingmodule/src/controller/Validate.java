package controller;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate {
    private static final Scanner scanner = new Scanner(System.in);
    private static final String REGEX_MEDICAL_RECORD_CODE = "^BA-\\d{3}$";
    private static final String REGEX_PATIENT_CODE = "^BN-\\d{3}$";
    private static final String REGEX_DATE = "^\\d{0,2}\\/\\d{0,2}\\/\\d{4}";

    public static String inputValidMedicalRecordCode(){
        Pattern pattern = Pattern.compile(REGEX_MEDICAL_RECORD_CODE);
        String medicalRecordCode;
        System.out.println("Enter new medical record code");
        while (true){
            medicalRecordCode = Validate.getText();
            Matcher matcher = pattern.matcher(medicalRecordCode);
            if (!matcher.matches()){
                System.out.println("Medical record code is not valid!!");
                System.out.println("Please re-enter!!");
            }
            return medicalRecordCode;
        }
    }

    public static String inputValidPatientCode(){
        Pattern pattern = Pattern.compile(REGEX_PATIENT_CODE);
        String patientCode;
        System.out.println("Enter new patient code: ");
        while (true){
            patientCode = Validate.getText();
            Matcher matcher = pattern.matcher(patientCode);
            if (!matcher.matches()){
                System.out.println("Patient code is not valid!!");
                System.out.println("Please re-enter!!");
            }
            return patientCode;
        }
    }

    public static String inputValidPatientName(){
        String patientName = "";
        while (patientName.isEmpty()){
            System.out.println("Enter new patient name: ");
            patientName = Validate.getText();
        }
        return patientName;
    }

    public static String inputValidDateInput(){
        String dateInput;
        Pattern pattern = Pattern.compile(REGEX_DATE);
        System.out.println("Enter date input: ");
        while (true){
            dateInput = Validate.getText();
            Matcher matcher = pattern.matcher(dateInput);
            if(!matcher.matches()){
                System.out.println("Date format is not valid, please re-enter!");
            }
            return dateInput;
        }
    }

    public static String inputValidDateOutput(){
        String dateOutput = "";
        while (dateOutput.isEmpty()){
            System.out.println("Enter date output: ");
            dateOutput = Validate.getText();
        }
        return dateOutput;
    }

    public static String inputValidReason(){
        String reason = "";
        while (reason.isEmpty()){
            System.out.println("Reason: ");
            reason = Validate.getText();
        }
        return reason;
    }

    public static int getInt(){
        try{
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException nfe){
            System.err.println("Please enter number!!");
        }
        return getInt();
    }

    public static double getDouble(){
        try{
            return Double.parseDouble(scanner.nextLine());
        } catch (NumberFormatException nfe){
            System.err.println("Please enter number!!");
        }
        return getDouble();
    }

    public static String getText(){
        return scanner.nextLine();
    }
}
