package StudentManager;

import java.util.Scanner;

import static StudentManager.StudentManager.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner inputa = new Scanner(System.in);
         StudentManager student = new StudentManager();
         int choice;
         do {
             System.out.println("1. Display Students");
             System.out.println("2. Add Student");
             System.out.println("3. Remove Student");
             System.out.println("4. Display Students with GPA greater than a certain value");
             System.out.println("5. Exit");
             System.out.print("Enter your choice: ");
             choice = input.nextInt();
             switch (choice){
                 case 1:
                     student.showStudents();
                     break;
                 case 2:
                     System.out.println("Enter student name: ");
                     String name = inputa.nextLine();
                     System.out.println("Enter student email: ");
                     String email = inputa.nextLine();
                     System.out.println("Enter student GPA: ");
                     float gpa = input.nextFloat();
                     student.addStudent(new Student( name, email,gpa));
                     System.out.println("Student added successfully.");
                     break;
                 case 3:
                     System.out.print("Enter ID of student to remove: ");
                     int idc = input.nextInt();
                     StudentManager.removeStudent(idc);
                     break;
                 case 4:
                     System.out.print("Enter GPA threshold: ");
                     double max = input.nextDouble();
                     StudentManager.displayGPAmax(max);
                     break;
                 case 5:
                     System.out.println("Exiting program.");
                     break;
                 default:
                     System.out.println("Invalid choice. Please enter a number between 1 and 5.");
             }
         } while(choice != 5);
    }
}
