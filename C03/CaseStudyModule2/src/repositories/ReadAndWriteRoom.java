package repositories;

import models.Room;

import java.io.*;
import java.util.List;

public class ReadAndWriteRoom {
    private static final String PATH_ROOM = "src/repositories/data/room.csv";
    public List<Room> rooms;
    File file = new File(PATH_ROOM);
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

    public void writeFileToRoomCSV(List<Room> rooms, boolean append){
        try {
            FileWriter fileWriter = new FileWriter(file, append);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Room room : rooms){
                bufferedWriter.write(room.toCsv());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
