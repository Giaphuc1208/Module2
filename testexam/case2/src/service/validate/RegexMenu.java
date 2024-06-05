package service.validate;

import java.util.Scanner;

public class RegexMenu {
    public static Integer inputChoiceMenu(){
        Scanner scanner = new Scanner(System.in);
        while (true){
            try {
                System.out.println("Enter Number");
                return Integer.parseInt(scanner.nextLine());
            }catch (NumberFormatException e){
                System.err.println("Enter a number !!!");
            }
        }
    }
}
