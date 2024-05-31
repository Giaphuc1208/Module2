package controller;

import model.MedicalRecord;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MedicalRecordManager {
    public List<MedicalRecord> medicalRecordList;
    private static final String PATH = "D:\\Dowload\\Module2\\baitap\\endingmodule\\endingmodule\\src\\view\\medical_record.csv";
    File file = new File(PATH);

    public MedicalRecordManager() {
        medicalRecordList = new ArrayList<>();
        readFile();
    }

    public void add(MedicalRecord medicalRecord) {
        medicalRecordList.add(medicalRecord);
        writeFile();
    }

    public void delete(MedicalRecord medicalRecord){
        medicalRecordList.remove(medicalRecord);
        writeFile();
    }

    public void showMenu(){
        if (medicalRecordList.isEmpty()){
            System.out.println("Without a medical record!!");
        } else {
            for(MedicalRecord medicalRecord : medicalRecordList){
                System.out.println(medicalRecord);
            }
        }
    }

    public MedicalRecord findMRByCode(String medicalRecordCode){
        for (MedicalRecord medicalRecord : medicalRecordList){
            if (medicalRecord.getMedicalRecordCode().equals(medicalRecordCode)){
                return medicalRecord;
            }
        }
        return null;
    }

    public void readFile() {
        try {
            FileReader fileReader = new FileReader(PATH);
            BufferedReader br = new BufferedReader(fileReader);
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                MedicalRecord medicalRecord = new MedicalRecord(data[0], data[1], data[2], data[3], data[4], data[5]);
                medicalRecordList.add(medicalRecord);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void writeFile(){
        try{
            FileWriter fileWriter = new FileWriter(PATH);
            BufferedWriter brw = new BufferedWriter(fileWriter);
            for (MedicalRecord medicalRecord : medicalRecordList){
                String line = medicalRecord.getMedicalRecordCode() + "," + medicalRecord.getPatientCode() + "," + medicalRecord.getPatientName()
                        + "," + medicalRecord.getDateInput() + "," + medicalRecord.getDateOutput() + "," + medicalRecord.getReason();
                brw.newLine();
                brw.write(line);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
