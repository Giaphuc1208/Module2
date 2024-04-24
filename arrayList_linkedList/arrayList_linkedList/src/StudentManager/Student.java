package StudentManager;

public class Student {
    private int id;
    private String name;
    private String email;
    private float gpa;
    private static int lastedId=0;

    public Student( String name, String email, float gpa) {
        this.id = ++lastedId;
        this.name = name;
        this.email = email;
        this.gpa = gpa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getGPA() {
        return gpa;
    }

    public void setGPA(float GPA) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student: id=%d, name='%s', email='%s', GPA=%s".formatted(id, name, email, gpa);
    }
}
