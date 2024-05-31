package model;

public class VipMedicalRecord extends MedicalRecord{
    String typeVip;
    String vipTime;

    public VipMedicalRecord(String medicalRecordCode, String patientCode, String patientName, String dateInput, String dateOutput, String reason, String typeVip, String vipTime) {
        super(medicalRecordCode, patientCode, patientName, dateInput, dateOutput, reason);
        this.typeVip = typeVip;
        this.vipTime = vipTime;
    }

    public String getTypeVip() {
        return typeVip;
    }

    public void setTypeVip(String typeVip) {
        this.typeVip = typeVip;
    }

    public String getVipTime() {
        return vipTime;
    }

    public void setVipTime(String vipTime) {
        this.vipTime = vipTime;
    }
}
