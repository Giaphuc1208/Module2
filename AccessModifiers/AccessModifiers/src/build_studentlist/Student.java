package build_studentlist;

public class Student {
    private String name ="John";
    private String classes ="C02";

    public Student() {
    }

    public void setName(String name){
        this.name = name;
   }
   public void setClasses(String classes){
        this.classes = classes;
   }

    public String getName() {
        return name;
    }

    public String getClasses() {
        return classes;
    }
}
