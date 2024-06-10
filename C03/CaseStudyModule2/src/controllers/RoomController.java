package controllers;

import models.room.Room;
import ultils.Input;
import ultils.Validate;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class RoomController {
    public List<Room> rooms;
    Validate validate = new Validate();
    private static final String PATH_ROOM = "src/models/room/room.csv";
    File file = new File(PATH_ROOM);
    public void menuRoom(){
        int choice;
        while (true){
            System.out.println("========MENU ROOM========\n" +
                    "1. Display room list\n" +
                    "2. Add new room\n" +
                    "3. Update room\n" +
                    "4. Delete room\n " +
                    "5. Return main menu\n" +
                    "Choose activity: ");
            choice = Input.getInt();
            switch (choice){
                case 1:
                    showMenuRoom();
                    break;
                case 2:
                    addRoom();
                    break;
                case 3:
                    updateRoom();
                    break;
                case 4:
                    deleteRoom();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("This choice is not available!!");
                    break;
            }
        }
    }

    public RoomController(){
        rooms = new ArrayList<>();
        readFileInRoomCSV();
    }

    public void showMenuRoom(){
        if (rooms.isEmpty()){
            System.out.println("None of the rooms!");
            return;
        }
        for (Room room : rooms){
            System.out.println(room);
        }
    }

    public void addRoom(){
        String roomNumber = "R-" + (int) (Math.random()*1000);
        String typeRoom = validate.inputNewTypeRoom();
        double price = validate.inputValidPrice();
        Room room = new Room(roomNumber, typeRoom, price);
        rooms.add(room);
        System.out.println("===+> Add Success!!");
        writeFileToRoomCSV();
    }

    public Room findRoomByRoomNumber(String roomNumber){
        for (Room room : rooms){
            if (Objects.equals(room.getRoomNumber(),roomNumber)){
                return room;
            }
        }
        return null;
    }

    public void deleteRoom(){
        if (rooms.isEmpty()){
            System.err.println("There are no rooms to delete, please add more rooms!!");
            return;
        }
        Room room = null;
        String roomNumber;
        while (room == null){
            System.out.println("Enter room you want to delete: ");
            roomNumber = Input.getString();
            if (roomNumber.isEmpty()){
                return;
            }
            room = findRoomByRoomNumber(roomNumber);
        }
        System.out.println("Enter 'Y' to delete");
        String enterY = Input.getString();
        if (enterY.equalsIgnoreCase("Y")){
            rooms.remove(room);
            System.out.println("===+> Delete Successfully");
            writeFileToRoomCSV();
        } else {
            menuRoom();
        }
    }

    public void updateTypeRoom(Room room){
        String newTypeRoom = Input.getString();
        room.setTypeRoom(newTypeRoom);
        System.out.println("===+> Update Successfully");
    }

    public void updatePrice(Room room){
        double newPrice = Input.getDou();
        room.setPrice(newPrice);
        System.out.println("===+> Update Successfully");
    }

    public void showUpdateRoom(){
        System.out.println("1. Edit Name\n" +
                "2. Edit Price\n" +
                "3. Turn around\n" +
                "Select activity");
    }

    public void updateRoom(){
        if (rooms.isEmpty()){
            System.out.println("There is no room to fix, please add a new room.");
            return;
        }
        Room room = null;
        System.out.println("Enter room to update: ");
        while (room == null){
            String roomNumber = Input.getString();
            if (roomNumber.isEmpty()){
                return;
            }
            room = findRoomByRoomNumber(roomNumber);
        }
        showUpdateRoom();
        System.out.println(room);
        int choice = Input.getInt();
        switch (choice){
            case 1:
                updateTypeRoom(room);
                break;
            case 2:
                updatePrice(room);
                break;
            case 3:
                menuRoom();
                break;
            default:
                System.out.println("This choice is not available!!");
                break;
        }
    }

    public void readFileInRoomCSV(){
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            bufferedReader.readLine();
            String line;
            while ((line = bufferedReader.readLine()) != null){
                String[] data = line.split(",");
                Room room = new Room(data[0],data[1],Double.parseDouble(data[2]));
                rooms.add(room);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void writeFileToRoomCSV(){
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("Room, Type, Price");
            for (Room room : rooms){
                String line = room.getRoomNumber() + "," + room.getTypeRoom() + "," + room.getPrice();
                bufferedWriter.newLine();
                bufferedWriter.write(line);
            }
            bufferedWriter.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }


}
