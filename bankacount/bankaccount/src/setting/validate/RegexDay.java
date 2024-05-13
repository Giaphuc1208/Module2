package setting;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class RegexDay {
    static Scanner scanner = new Scanner(System.in);
    public static LocalDate inputDay(){
        LocalDate date;
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        while (true){
            try {
                System.out.println("Enter date: ");
                date = LocalDate.parse(scanner.nextLine(), dateFormat);
                LocalDate now = LocalDate.now();
                if (now.getYear() - date.getYear() < 18){
                    throw new IOException("Age You must be over 18 years old");
                }
                return date;
            } catch (NumberFormatException | DateTimeParseException e){
                System.err.println("Date is incorrect format (dd/MM/yyyy");
            } catch (IOException e){
                System.err.println("Age You must be over 18 years old");
            }
        }
    }
    public static LocalDate inputDate(String userInput){
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return LocalDate.parse(userInput, dateFormat);
    }
}
