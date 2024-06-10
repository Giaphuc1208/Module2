package models.LineRoom;

import ultils.Input;

public class LineRoom {
    private final String roomNumber;
    private final String typeRoom;
    private int daysSpentAt;
    private final double price;
    private double total;

    public LineRoom(String roomNumber, String typeRoom, int daysSpentAt, double price, double total) {
        this.roomNumber = roomNumber;
        this.typeRoom = typeRoom;
        this.daysSpentAt = daysSpentAt;
        this.price = price;
        this.total = total;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public String getTypeRoom() {
        return typeRoom;
    }

    public int getDaysSpentAt() {
        return daysSpentAt;
    }

    public void setDaysSpentAt(int daysSpentAt) {
        this.daysSpentAt = daysSpentAt;
    }

    public double getPrice() {
        return price;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void addDate(int daysSpentAt){
        this.daysSpentAt += daysSpentAt;
    }

    @Override
    public String toString() {
        return String.format("Room:'%s', Type Room: '%s', Days spent at: %d, Price: %s}".formatted(roomNumber, typeRoom, daysSpentAt, price));
    }
}
