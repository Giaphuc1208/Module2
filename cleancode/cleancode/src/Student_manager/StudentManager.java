package Student_manager;

import Student_display.Student;

public class StudentManager implements ManagerInterface<Student> {
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
        for (int i = 0; i < this.size; i++) {
            this.list[i] = this.list[i+1];
        }
        --this.size;
    }

    @Override
    public void edit(int id, Student student) {
    int index = this.findById(id);
    this.list[index] = student;
    }

    @Override
    public Student[] findAll() {
        return this.list;
    }
    public int getSize() {
        return this.size;
    }
}
