package model.blueprint;

public class SuiteStudio extends Facility {


    public SuiteStudio(String serviceName, double usableArea, double rentalCost, int maxCapacity, String rentalType, String serviceCode) {
        super(serviceName, usableArea, rentalCost, maxCapacity, rentalType, serviceCode);
    }




    @Override
    public String toString() {
        return "Suite Studio: " +
                "serviceName='" + getServiceName() + '\'' +
                "usableArea='" + getUsableArea() + '\'' +
                "rentalCost='" + getRentalCost() + '\'' +
                "maxCapacity='" + getMaxCapacity() + '\'' +
                "rentalType='" + getRentalType() + '\'' +
                ", ServiceCode='" + getServiceCode() + '\'';
    }
    public String getInfoSuiteToCSV() {
        return getServiceName() + "," + getUsableArea() + "," + getRentalCost() + "," + getMaxCapacity() + "," +
                getRentalType() + "," + getServiceCode();
    }
}
