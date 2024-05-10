package model.blueprint;

public class GardenViewStudio extends Facility {
    private String floors;



    public GardenViewStudio(String serviceName, double usableArea, double rentalCost, int maxCapacity, String rentalType, String serviceCode, String roomStandard) {
        super(serviceName, usableArea, rentalCost, maxCapacity, rentalType, serviceCode);
        this.floors = roomStandard;
    }


    public String getFloors() {
        return floors;
    }

    public void setFloors(String roomStandard) {
        this.floors = roomStandard;
    }



    @Override
    public String toString() {
        return "GardenViewStudio:" +
                "serviceName='" + getServiceName() + '\'' +
                "usableArea='" + getUsableArea() + '\'' +
                "rentalCost='" + getRentalCost() + '\'' +
                "maxCapacity='" + getMaxCapacity() + '\'' +
                "rentalType='" + getRentalType() + '\'' +
                "floor='" + floors + '\'' +
                ", serviceCode=" + getServiceCode();
    }
    public String getInfoGardenToCSV() {
        return getServiceName() + "," + getUsableArea() + "," + getRentalCost() + "," + getMaxCapacity() + "," +
                getRentalType() + "," + getServiceCode() + "," + getFloors();

    }
}
