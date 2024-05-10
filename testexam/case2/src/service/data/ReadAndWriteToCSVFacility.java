package service.data;

import model.blueprint.Facility;
import model.blueprint.GardenViewStudio;
import model.blueprint.SuiteStudio;
import model.blueprint.StudioDeluxe;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;

public class ReadAndWriteToCSVFacility {
    public static void writeMapTOCSV(Map<Facility, Integer> linkedHashMapHouse, String pathFile, boolean append) {
        FileWriter fileWriter;
        try {
            fileWriter = new FileWriter(pathFile, append);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Facility facility : linkedHashMapHouse.keySet()) {
                if (facility instanceof GardenViewStudio) {
                    GardenViewStudio garden = (GardenViewStudio) facility;
                    bufferedWriter.write(garden.getInfoGardenToCSV());
                }
                if (facility instanceof SuiteStudio) {
                    SuiteStudio suite = (SuiteStudio) facility;
                    bufferedWriter.write(suite.getInfoSuiteToCSV());
                }
                if (facility instanceof StudioDeluxe) {
                    StudioDeluxe deluxe = (StudioDeluxe) facility;
                    bufferedWriter.write(deluxe.getInfoDeluxeToCSV());
                }
                bufferedWriter.newLine();
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
            GardenViewStudio house;
            while ((line = bufferedReader.readLine()) != null) {
                map = line.split(",");
                house = new GardenViewStudio(map[0], Double.parseDouble(map[1]), Double.parseDouble(map[2]), Integer.parseInt(map[3]),
                        map[4], map[5], map[6]);
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
            StudioDeluxe studioDeluxe;
            while ((line = bufferedReader.readLine()) != null) {
                map = line.split(",");
                studioDeluxe = new StudioDeluxe(map[0], Double.parseDouble(map[1]), Double.parseDouble(map[2]), Integer.parseInt(map[3]),
                        map[4], map[5], map[6]);
                linkedHashMap.put(studioDeluxe, 0);
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
            SuiteStudio suiteStudio;
            while ((line = bufferedReader.readLine()) != null) {
                map = line.split(",");
                suiteStudio = new SuiteStudio(map[0], Double.parseDouble(map[1]), Double.parseDouble(map[2]), Integer.parseInt(map[3]), map[4],
                        map[5]);
                linkedHashMap.put(suiteStudio, 0);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return linkedHashMap;
    }

}

