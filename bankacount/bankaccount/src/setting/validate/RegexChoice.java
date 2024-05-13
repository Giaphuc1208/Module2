package setting;

import java.util.Scanner;

public class RegexChoice {
    public static Integer inputChoiceMenu(){
        Scanner scanner = new Scanner(System.in);
        while (true){
            try{
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e){
                System.err.println("Enter a number!!");
            }
        }
    }
}
