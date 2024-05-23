package practice_2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Phuc", 23, "Da Nang");
        Student student2 = new Student("Linh", 22, "Nghe An");

        Map<Integer, Student> hashMap = new HashMap<Integer, Student>();
        hashMap.put(1,student1);
        hashMap.put(2,student2);
        hashMap.put(3,student1);

        for(Map.Entry<Integer, Student> student : hashMap.entrySet()){
            System.out.println(student.toString());
        }
        System.out.println("...........Set");
        Set<Student> students = new HashSet<Student>();
        students.add(student1);
        students.add(student2);
        students.add(student1);

        for(Student student : students){
            System.out.println(student.toString());
        }

    }
}
