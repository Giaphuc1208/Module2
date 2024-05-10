package model.guest;

import java.time.LocalDate;

public class Staff extends Person {
    private String staffID;
    private String position;
    private double salary;
    private String level;

    public Staff(String fullName, LocalDate birthday, boolean gender, String idCard, String phoneNumber, String email, String staffID, String position, double salary, String level) {
        super(fullName, birthday, gender, idCard, phoneNumber, email);
        this.staffID = staffID;
        this.position = position;
        this.salary = salary;
        this.level = level;
    }

    public String getStaffID() {
        return staffID;
    }

    public void setStaffID(String personnelID) {
        this.staffID = personnelID;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    @Override
    public String toString() {
        if (isGender()) return
                "Staff{" +
                        "fullName='" + getFullName() + '\'' +
                        ", dateOfBirth=" + getBirthday() +
                        ", gender=" + "male" +
                        ", identityCard='" + getIDcard() + '\'' +
                        ", phoneNumber='" + getPhoneNumber() + '\'' +
                        ", email='" + getEmail() + '\'' +
                        ", employeeID='" + staffID + '\'' +
                        ", level='" + level + '\'' +
                        ", position='" + position + '\'' +
                        ", salary=" + salary +
                        '}';
        else {
            return
                    "Staff{" +
                            "fullName='" + getFullName() + '\'' +
                            ", dateOfBirth=" + getBirthday() +
                            ", gender=" + "female" +
                            ", identityCard='" + getIDcard() + '\'' +
                            ", phoneNumber='" + getPhoneNumber() + '\'' +
                            ", email='" + getEmail() + '\'' +
                            ", Staff ID='" + staffID + '\'' +
                            ", level='" + level + '\'' +
                            ", position='" + position + '\'' +
                            ", salary=" + salary +
                            '}';
        }
        }
        @Override
        public String getInfo() {
        return getFullName() + "," + getBirthday() + "," + isGender() + "," + getIDcard() + "," +
                getPhoneNumber() + "," + getEmail() + "," + getStaffID() + "," + getPosition() + "," + getSalary() + "," + getLevel();
    }
    }



