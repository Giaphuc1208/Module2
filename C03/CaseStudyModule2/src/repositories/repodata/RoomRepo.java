package repositories.repodata;

import models.Room;
import repositories.ReadAndWriteRoom;
import ultils.Input;
import ultils.Validate;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class RoomRepo {
    public List<Room> rooms;
    private static final String PATH_ROOM = "src/repositories/data/room.csv";
    ReadAndWriteRoom readAndWriteRoom = new ReadAndWriteRoom();
    Validate validate = new Validate();
    public void addRoom(Room room){
        List<Room> roomList = getAllRoom();
        roomList.add(room);
        readAndWriteRoom.writeFileToRoomCSV(roomList, true);
    }

    public List<Room> getAllRoom(){
        List<Room> list = new ArrayList<>();
        File file = new File(PATH_ROOM);
        try(FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader)){
            String line;
            bufferedReader.readLine();
            while ((line = bufferedReader.readLine()) != null){
                String[] data = line.split(",");
                Room room = new Room(data[0],data[1],Double.parseDouble(data[2]));
                list.add(room);
            }
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
        return list;
    }

    public void deleteRoom(String roomNumber){
      List<Room> roomList = getAllRoom();
      for (Room room : roomList){
          if (room.getRoomNumber().equals(roomNumber)){
              roomList.remove(room);
              readAndWriteRoom.writeFileToRoomCSV(roomList, false);
              break;
          }
      }
    }

    public Room updateTypeRoom(Room room){
        System.out.println("Enter new Type Room: ");
        String newTypeRoom = Input.getString();
        room.setTypeRoom(newTypeRoom);
        System.out.println("===+> Update Successfully");
        System.out.println(room);
        return room;
    }

    public Room updatePrice(Room room){
        System.out.println("Enter new Price: ");
        double newPrice = Input.getDou();
        room.setPrice(newPrice);
        System.out.println("===+> Update Successfully");
        System.out.println(room);
        return room;
    }

    public int Index(Room room){
        List<Room> roomList = getAllRoom();
        for (int i = 0; i < roomList.size(); i++) {
            if (roomList.get(i).getRoomNumber().equals(room.getRoomNumber())){
                return i;
            }
        }
        return -1;
    }

    public void editIndex(int index, Room room){
        List<Room> roomList = getAllRoom();
        roomList.set(index, room);
        readAndWriteRoom.writeFileToRoomCSV(roomList, false);
    }


}
