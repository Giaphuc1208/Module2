package service.validate;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Validator {
    public static LocalDate dateInputDOB(String userInput){
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return LocalDate.parse(userInput, dateFormat);
    }
}
