package build_studentlist;

public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println("Name " + student.getName() + " Class " + student.getClasses() );
        student.setClasses("C03");
        student.setName("Thần Đằn");
        System.out.println("Name " + student.getName() + " Class " + student.getClasses() );
    }
}
