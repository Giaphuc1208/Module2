package StudentManager;

import java.util.ArrayList;
import java.util.Iterator;

public class StudentManager {
    private static ArrayList<Student> studentList;

    public StudentManager(){
        studentList = new ArrayList<Student>();
    }
    public StudentManager(ArrayList<Student> studentList){
        StudentManager.studentList = studentList;
    }

    public void addStudent(Student student){
        studentList.add(student);
    }

    public void showStudents(){
        System.out.println("List of Students: ");
        for (Student student : studentList){
            System.out.println(student);
        }
    }
    public static void removeStudent(int id) {
        Iterator<Student> iterator = studentList.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getId() == id) {
                iterator.remove();
                System.out.println("Student with ID " + id + " removed successfully.");
                return;
            }
        }
        System.out.println("Student with ID " + id + " not found.");
    }
    public static void displayGPAmax(double max) {
        System.out.println("Students with GPA greater than " + max + ":");
        for (Student student : studentList) {
            if (student.getGPA() > max) {
                System.out.println(student);
            }
        }
    }
}
