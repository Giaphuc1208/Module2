package service.intef;

import model.blueprint.GardenViewStudio;
import model.blueprint.SuiteStudio;
import model.blueprint.StudioDeluxe;

import java.io.IOException;

public interface DesignService extends Service{
    void addNewFacility() throws IOException;

    void displayList() throws IOException;

    void addNewDeluxe() throws IOException;

    StudioDeluxe validateInfoDeluxe();

    void addNewSuite() throws IOException;

    SuiteStudio validateInfoSuite();

    void addNewGarden() throws IOException;

    GardenViewStudio validateInfoGarden();

    void displayListUsed();
}
