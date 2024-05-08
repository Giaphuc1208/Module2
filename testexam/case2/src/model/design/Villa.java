package model.design;

import model.contract.Contract;

public class Villa extends Facility {
    private String roomStandard;
    private double poolArea;
    private int floors;

    public Villa() {
    }

    public Villa(String s, double v, double v1, int i, String s1, String s2, String s3, double v2, int i1) {
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public Villa(String serviceName, String usableArea, double rentalCost, int maxCapacity, String rentalType, String serviceCode, String roomStandard, int floors) {
        super(serviceName, usableArea, rentalCost, maxCapacity, rentalType, serviceCode);
        this.roomStandard = roomStandard;
    }



    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "serviceName='" + getServiceName() + '\'' +
                "usableArea='" + getUsableArea() + '\'' +
                "rentalCost='" + getRentalCost() + '\'' +
                "maxCapacity='" + getMaxCapacity() + '\'' +
                "rentalType='" + getRentalType() + '\'' +
                "roomStandard='" + roomStandard + '\'' +
                ", poolArea=" + poolArea +
                ", floors=" + floors +
                ", ServiceCode='" + getServiceCode() + '\'' +
                '}';
    }
    public String getInfoVillaToCSV() {
        return getServiceName() + "," + getUsableArea() + "," + getRentalCost() + "," + getMaxCapacity() + "," +
                getRentalType() + "," + getServiceCode() + "," + getRoomStandard() + "," + getPoolArea() + "," + getFloors();
    }
}
