package service;

import models.Room;
import repositories.repodata.RoomRepo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class RoomService {
    RoomRepo roomRepo = new RoomRepo();

    public Room findRoomByRoomNumber(String roomNumber){
        List<Room> rooms = roomRepo.getAllRoom();
        for (Room room : rooms){
            if (Objects.equals(room.getRoomNumber(),roomNumber)){
                return room;
            }
        }
        return null;
    }
}
