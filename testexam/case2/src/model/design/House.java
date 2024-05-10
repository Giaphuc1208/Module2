package model.design;

import model.contract.Contract;

public class House extends Facility {
    private String roomStandard;


    public House() {
    }

    public House(String serviceName, double usableArea, double rentalCost, int maxCapacity, String rentalType, String serviceCode, String roomStandard) {
        super(serviceName, usableArea, rentalCost, maxCapacity, rentalType, serviceCode);
        this.roomStandard = roomStandard;
    }


    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
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
                ", serviceCode=" + getServiceCode() +
                '}';
    }
    public String getInfoHouseToCSV() {
        return getServiceName() + "," + getUsableArea() + "," + getRentalCost() + "," + getMaxCapacity() + "," +
                getRentalType() + "," + getServiceCode() + "," + getRoomStandard();

    }
}
