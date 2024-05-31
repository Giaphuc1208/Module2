package exercise2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Manager {
    private final List<Country> countries;

    public Manager() {
        this.countries = new ArrayList<Country>();
    }

    public void input(){
        File myFile = new File("D:\\Dowload\\Module2\\baitap\\file\\file\\src\\exercise2\\Country.txt");
        try {
            FileReader fileReader = new FileReader(myFile);
            BufferedReader br = new BufferedReader(fileReader);
            String line;
            while ((line = br.readLine()) != null){
                String[] txt = line.split(",");
                Country country = new Country(Integer.parseInt(txt[0]), txt[1], txt[2]);
                countries.add(country);
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public void showAll(){
        for (Country country : countries){
            System.out.println(country);
        }
    }
}
