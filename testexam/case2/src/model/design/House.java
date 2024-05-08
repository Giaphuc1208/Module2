package model.design;

import model.contract.Contract;

public class House extends Facility {
    private String roomStandard;
    private int floors;


    public House() {
    }

    public House(String serviceName, String usableArea, double rentalCost, int maxCapacity, String rentalType, String serviceCode, String roomStandard) {
        super(serviceName, usableArea, rentalCost, maxCapacity, rentalType, serviceCode);
        this.roomStandard = roomStandard;
    }

    public House(String s, double v, double v1, int i, String s1, String s2, String s3, int i1) {
    }


    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    @Override
    public String toString() {
        return "House{" +
                "serviceName='" + getServiceName() + '\'' +
                "usableArea='" + getUsableArea() + '\'' +
                "rentalCost='" + getRentalCost() + '\'' +
                "maxCapacity='" + getMaxCapacity() + '\'' +
                "rentalType='" + getRentalType() + '\'' +
                "roomStandard='" + roomStandard + '\'' +
                ", floors=" + floors +
                ", serviceCode=" + getServiceCode() +
                '}';
    }
    public String getInfoHouseToCSV() {
        return getServiceName() + "," + getUsableArea() + "," + getRentalCost() + "," + getMaxCapacity() + "," +
                getRentalType() + "," + getServiceCode() + "," + getRoomStandard() + "," + getFloors();

    }
}
