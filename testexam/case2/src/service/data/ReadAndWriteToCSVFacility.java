package service.data;

import model.contract.Contract;
import model.design.Facility;
import model.design.House;
import model.design.Room;
import model.design.Villa;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;

public class ReadAndWriteToCSVFacility {
    public static void writeMapHouseTOCSV(Map<Facility, Integer> linkedHashMapHouse, String pathFile, boolean append) {
        FileWriter fileWriter;
        try {
            fileWriter = new FileWriter(pathFile, append);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Facility facility : linkedHashMapHouse.keySet()) {
                if (facility instanceof House) {
                    House house = (House) facility;
                    bufferedWriter.write(house.getInfoHouseToCSV());
                }
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeMapRoomTOCSV(Map<Facility, Integer> linkedHashMapRoom, String pathFile, boolean append) {
        FileWriter fileWriter;
        try {
            fileWriter = new FileWriter(pathFile, append);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Facility facility : linkedHashMapRoom.keySet()) {
                if (facility instanceof Room    ) {
                    Room room = (Room) facility;
                    bufferedWriter.write(room.getInfoRoomToCSV());
                }
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void writeMapVillaTOCSV(Map<Facility, Integer> linkedHashMapVilla, String pathFile, boolean append) {
        FileWriter fileWriter;
        try {
            fileWriter = new FileWriter(pathFile, append);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Facility facility : linkedHashMapVilla.keySet()) {
                if (facility instanceof Villa) {
                    Villa villa = (Villa) facility;
                    bufferedWriter.write(villa.getInfoVillaToCSV());
                }
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static LinkedHashMap<Facility, Integer> readHouseToCSV(String pathFile) {
        LinkedHashMap<Facility, Integer> linkedHashMap = new LinkedHashMap<>();
        FileReader fileReader;
        try {
            fileReader = new FileReader(pathFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            String[] map;
            House house;
            while ((line = bufferedReader.readLine()) != null) {
                map = line.split(",");
                house = new House(map[0], Double.parseDouble(map[1]), Double.parseDouble(map[2]), Integer.parseInt(map[3]),
                        map[4], map[5], map[6], Integer.parseInt(map[7]));
                linkedHashMap.put(house, 0);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return linkedHashMap;
    }

    public static LinkedHashMap<Facility, Integer> readVillaToCSV(String pathFile) {
        LinkedHashMap<Facility, Integer> linkedHashMap = new LinkedHashMap<>();
        FileReader fileReader;
        try {
            fileReader = new FileReader(pathFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            String[] map;
            Villa villa;
            while ((line = bufferedReader.readLine()) != null) {
                map = line.split(",");
                villa = new Villa(map[0], Double.parseDouble(map[1]), Double.parseDouble(map[2]), Integer.parseInt(map[3]),
                        map[4], map[5], map[6], Double.parseDouble(map[7]), Integer.parseInt(map[8]));
                linkedHashMap.put(villa, 0);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return linkedHashMap;
    }

    public static LinkedHashMap<Facility, Integer> readRoomToCSV(String pathFile) {
        LinkedHashMap<Facility, Integer> linkedHashMap = new LinkedHashMap<>();
        FileReader fileReader;
        try {
            fileReader = new FileReader(pathFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            String[] map;
            Room room;
            while ((line = bufferedReader.readLine()) != null) {
                map = line.split(",");
                room = new Room(map[0], Double.parseDouble(map[1]), Double.parseDouble(map[2]), Integer.parseInt(map[3]), map[4],
                        map[5], map[6]);
                linkedHashMap.put(room, 0);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return linkedHashMap;
    }

}

