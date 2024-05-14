package model.blueprint;

public class StudioDeluxe extends Facility {
    private String floors;

    public StudioDeluxe(String serviceName, double usableArea, double rentalCost, int maxCapacity, String rentalType, String serviceCode, String floors) {
        super(serviceName, usableArea, rentalCost, maxCapacity, rentalType, serviceCode);
        this.floors = floors;
    }

    public String getFloors() {
        return floors;
    }

    public void setFloors(String roomStandard) {
        this.floors = roomStandard;
    }

    @Override
    public String toString() {
        return "Deluxe Studio: " +
                "serviceName='" + getServiceName() + '\'' +
                "usableArea='" + getUsableArea() + '\'' +
                "rentalCost='" + getRentalCost() + '\'' +
                "maxCapacity='" + getMaxCapacity() + '\'' +
                "rentalType='" + getRentalType() + '\'' +
                "floor='" + floors + '\'' +
                ", ServiceCode='" + getServiceCode() + '\'' +
                '}';
    }
    public String getInfoDeluxeToCSV() {
        return getServiceName() + "," + getUsableArea() + "," + getRentalCost() + "," + getMaxCapacity() + "," +
                getRentalType() + "," + getServiceCode() + "," + getFloors();
    }
}
