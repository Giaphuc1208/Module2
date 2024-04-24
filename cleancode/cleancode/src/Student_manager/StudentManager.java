package Student_manager;

import Student_display.Student;

public class StudentManager implements ManagerInterface<Student> {
    private double[] score;
    private Student[] list = new Student[50];
    private int size = 0;

    public StudentManager() {
    }

    @Override
    public void add(Student e) {
        this.list[this.size] = e;
                ++this.size;
    }
    public int findById(int id){
        for (int i = 0; i < this.size; i++) {
            if (id == this.list[i].getId()){
                return i;
            }
        }
        return -1;
    }

    @Override
    public void delete(int id) {
        int index = this.findById(id);
        if(index != 1 && size > 0){
            for (int i = index; i < this.size - 1; i++) {
            list[i] = list[i+1];
        }
            list[size - 1] = null;
            size--;
        } else
            System.out.println("ID not found.");
    }

    @Override
    public void edit(int id, Student student) {
        int index = findById(id);
        if (index != 1) {
            list[index] = student;
        }
    }

    @Override
    public Student[] findAll() {
        return this.list;
    }
    public int getSize() {
        return this.size;
    }
    public double calculateAverageById(int id) {
        int student = findById(id);
        if (student == id) {
            System.out.println("Student with ID " + id + " not found.");
            return -1;
        }
        double average = student;
        System.out.println("Average score of student with ID " + id + ": " + average);
        return average;
    }



}
