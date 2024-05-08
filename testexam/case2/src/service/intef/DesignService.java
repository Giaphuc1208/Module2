package service.intef;

import model.design.House;
import model.design.Room;
import model.design.Villa;

import java.io.IOException;

public interface DesignService extends Service{
    void addNewFacility() throws IOException;

    void displayList() throws IOException;

    void addNewVilla() throws IOException;

    Villa validateInfoVilla();

    void addNewRoom() throws IOException;

    Room validateInfoRoom();

    void addNewHouse() throws IOException;

    House validateInfoHouse();

    void displayListUsed();
}
