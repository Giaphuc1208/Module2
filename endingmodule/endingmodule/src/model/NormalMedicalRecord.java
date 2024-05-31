package model;

import java.time.LocalDate;

public class NormalMedicalRecord extends MedicalRecord{
    int fee;

    public NormalMedicalRecord( String medicalRecordCode, String patientCode, String patientName, String dateInput, String dateOutput, String reason, int fee) {
        super( medicalRecordCode, patientCode, patientName, dateInput, dateOutput, reason);
        this.fee = fee;
    }

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }
}
