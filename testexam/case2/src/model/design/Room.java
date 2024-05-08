package model.design;

public class Room extends Facility {
    private String freeService;

   public Room(){
   }

    public Room(String serviceName, String usableArea, double rentalCost, int maxCapacity, String rentalType, String serviceCode, String freeService) {
        super(serviceName, usableArea, rentalCost, maxCapacity, rentalType, serviceCode);
        this.freeService = freeService;
    }

    public Room(String serviceName, double v, double rentalCost, int maxCapacity, String rentalType, String serviceCode, String freeService) {
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "Room{" +
                "serviceName='" + getServiceName() + '\'' +
                "usableArea='" + getUsableArea() + '\'' +
                "rentalCost='" + getRentalCost() + '\'' +
                "maxCapacity='" + getMaxCapacity() + '\'' +
                "rentalType='" + getRentalType() + '\'' +
                "freeServiceIncluded='" + freeService + '\'' +
                ", ServiceCode='" + getServiceCode() + '\'' +
                '}';
    }
    public String getInfoRoomToCSV() {
        return getServiceName() + "," + getUsableArea() + "," + getRentalCost() + "," + getMaxCapacity() + "," +
                getRentalType() + "," + getServiceCode() + "," +getFreeService();
    }
}
