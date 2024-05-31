package model;

import java.time.LocalDate;

public class MedicalRecord {
    private int id;
    private String medicalRecordCode;
    private String patientCode;
    private String patientName;
    private String dateInput;
    private String dateOutput;
    private String reason;
    private static int lastedID = 0;




    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMedicalRecordCode() {
        return medicalRecordCode;
    }

    public void setMedicalRecordCode(String medicalRecordCode) {
        this.medicalRecordCode = medicalRecordCode;
    }

    public String getPatientCode() {
        return patientCode;
    }

    public void setPatientCode(String patientCode) {
        this.patientCode = patientCode;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getDateInput() {
        return dateInput;
    }

    public void setDateInput(String dateInput) {
        this.dateInput = dateInput;
    }

    public String getDateOutput() {
        return dateOutput;
    }

    public void setDateOutput(String dateOutput) {
        this.dateOutput = dateOutput;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public MedicalRecord() {
    }

    public MedicalRecord( String medicalRecordCode, String patientCode, String patientName, String dateInput, String dateOutput, String reason) {
        this.id = ++lastedID;
        this.medicalRecordCode = medicalRecordCode;
        this.patientCode = patientCode;
        this.patientName = patientName;
        this.dateInput = dateInput;
        this.dateOutput = dateOutput;
        this.reason = reason;
    }

    @Override
    public String toString() {
        return "MedicalRecord: " +
                "id: " + id +
                ", medicalRecordCode: '" + medicalRecordCode + '\'' +
                ", patientCode: '" + patientCode + '\'' +
                ", patientName: '" + patientName + '\'' +
                ", dateInput: " + dateInput +
                ", dateOutput: " + dateOutput +
                ", reason: '" + reason;
    }


}
