package model.design;

public class Facility {
    private String serviceName;
    private double usableArea;
    private double rentalCost;
    private int maxCapacity;
    private String rentalType;
    private String ServiceCode;

    public Facility() {
    }

    public Facility(String serviceName, double usableArea, double rentalCost, int maxCapacity, String rentalType, String serviceCode) {
        this.serviceName = serviceName;
        this.usableArea = usableArea;
        this.rentalCost = rentalCost;
        this.maxCapacity = maxCapacity;
        this.rentalType = rentalType;
        ServiceCode = serviceCode;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public double getUsableArea() {
        return usableArea;
    }

    public void setUsableArea(double usableArea) {
        this.usableArea = usableArea;
    }

    public double getRentalCost() {
        return rentalCost;
    }

    public void setRentalCost(double rentalCost) {
        this.rentalCost = rentalCost;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    public String getServiceCode() {
        return ServiceCode;
    }

    public void setServiceCode(String serviceCode) {
        ServiceCode = serviceCode;
    }

    @Override
    public String toString() {
        return "Facility:" +
                "Service Name='" + serviceName + '\'' +
                "| Usable Area='" + usableArea + '\'' +
                "| Rental price=" + rentalCost +
                "| Quantity of guests=" + maxCapacity +
                "| Rental type='" + rentalType + '\'' +
                "| Facility code='" + ServiceCode;
    }
}
