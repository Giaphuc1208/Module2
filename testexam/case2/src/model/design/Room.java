package model.design;

public class Room extends Facility {


    public Room(String serviceName, double usableArea, double rentalCost, int maxCapacity, String rentalType, String serviceCode) {
        super(serviceName, usableArea, rentalCost, maxCapacity, rentalType, serviceCode);
    }




    @Override
    public String toString() {
        return "Room{" +
                "serviceName='" + getServiceName() + '\'' +
                "usableArea='" + getUsableArea() + '\'' +
                "rentalCost='" + getRentalCost() + '\'' +
                "maxCapacity='" + getMaxCapacity() + '\'' +
                "rentalType='" + getRentalType() + '\'' +
                ", ServiceCode='" + getServiceCode() + '\'' +
                '}';
    }
    public String getInfoRoomToCSV() {
        return getServiceName() + "," + getUsableArea() + "," + getRentalCost() + "," + getMaxCapacity() + "," +
                getRentalType() + "," + getServiceCode();
    }
}
