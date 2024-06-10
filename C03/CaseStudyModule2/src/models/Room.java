package models;

public class Room {
    private String roomNumber;
    private String typeRoom;
    private double price;

    public Room(String roomNumber, String typeRoom, double price) {
        this.roomNumber = roomNumber;
        this.typeRoom = typeRoom;
        this.price = price;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getTypeRoom() {
        return typeRoom;
    }

    public void setTypeRoom(String typeRoom) {
        this.typeRoom = typeRoom;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Room: " + roomNumber + '\'' +
                ", Type room: '" + typeRoom + '\'' +
                ", Price: " + price;
    }

    public String toCsv() {
        return roomNumber + "," + typeRoom + "," +price;
    }
}
