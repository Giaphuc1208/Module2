package setting.validate;

import java.util.Scanner;

public class RegexMenu {
    public static Integer inputChoiceMenu(){
        Scanner scanner = new Scanner(System.in);
        while (true){
            try {
                System.out.println("Nhap so");
                return Integer.parseInt(scanner.nextLine());
            }catch (NumberFormatException e){
                System.err.println("Hay nhap so !!!");
            }
        }
    }
}
