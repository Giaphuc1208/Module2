package Student_display;

import Student_manager.StudentManager;

import java.util.Scanner;

public class Display {
    private final StudentManager studentManager = new StudentManager();
    private final Scanner inputInt;
    private final Scanner inputString;

    public Display() {
        this.inputInt = new Scanner(System.in);
        this.inputString = new Scanner(System.in);
    }

    public void showDisplay() {
        int choose;
        do {
            System.out.println("Student management \n1. Add student\n2.Delete\n3.Edit\n4.Find by ID\n5.Display all\n0. Exit");
            System.out.println("Enter your choice : ");
            choose = Integer.parseInt(this.inputInt.nextLine());
            switch (choose) {
                case 1:
                    this.showAdd();
                    break;
                case 2:
                    this.showDelete();
                    break;
                case 3:
                    this.showEdit();
                    break;
                case 4:
                    this.showAll();
                    break;
            }
        } while (choose != 0);
    }

    public void showAll() {
        Student[] students = this.studentManager.findAll();
        int size = this.studentManager.getSize();
        System.out.println("List's Student : ");

        for (int i = 0; i < size; i++) {
            System.out.println(students[i]);
        }
    }

    public void showAdd() {
        System.out.println("Add ");
        System.out.println("Enter the id to add: ");
        int id = Integer.parseInt(this.inputInt.nextLine());
        System.out.println("Enter the name: ");
        String name = this.inputString.nextLine();
        System.out.println("Enter the gender: ");
        String gender = this.inputString.nextLine();
        System.out.println("Enter Math: ");
        double math = Double.parseDouble(this.inputInt.nextLine());
        System.out.println("Enter Physical: ");
        double physical = Double.parseDouble(this.inputInt.nextLine());
        System.out.println("Enter Chemistry: ");
        double chemistry = Double.parseDouble(this.inputInt.nextLine());
        Student student = new Student(id, name, gender, math, physical, chemistry);
        this.studentManager.add(student);
        System.out.println("Complete!!");
    }

    public void showEdit() {
        System.out.println("Edit");
        System.out.println("Enter the ID to edit:  ");
        int id = Integer.parseInt(this.inputInt.nextLine());
        System.out.println("Enter the name: ");
        String name = this.inputString.nextLine();
        System.out.println("Enter the gender: ");
        String gender = this.inputString.nextLine();
        System.out.println("Enter Math: ");
        double math = Double.parseDouble(this.inputInt.nextLine());
        System.out.println("Enter Physical: ");
        double physical = Double.parseDouble(this.inputInt.nextLine());
        System.out.println("Enter Chemistry: ");
        double chemistry = Double.parseDouble(this.inputInt.nextLine());
        Student newStudent = new Student(id, name, gender, math, physical, chemistry);
        this.studentManager.edit(id, newStudent);
        System.out.println("Complete!!");
    }

    public void showDelete() {
        System.out.println("Delete");
        System.out.println("Enter ID: ");
        int idDelete = inputInt.nextInt();
        studentManager.delete(idDelete);
        System.out.println("Complete!!");
    }
}
