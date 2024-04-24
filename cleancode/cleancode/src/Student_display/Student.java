package Student_display;

import java.util.Arrays;

public class Student {
    private int id;
    private String name;
    private String gender;
    private double[] point;
    private static int idIncrement = 1;

    public Student(String name, String gender, double math, double physical, double chemistry) {
        this.id = idIncrement;
        this.name = name;
        this.gender = gender;
        this.point = new double[]{math, physical, chemistry};
        idIncrement++;
    }

    public Student(int id, String name, String gender, double math, double physical, double chemistry) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.point = new double[]{math, physical, chemistry};
    }

    public double average(double[] point){
        double sum = 0;
        for (int i = 0; i < point.length; i++) {
            sum += point[i];
        }
        return sum / point.length;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double[] getPoint() {
        return this.point;
    }

    public void setPoint(double[] point) {
        this.point = point;
    }
    public double getAverageScore() {
        if (point.length == 0) {
            return 0.0;
        }

        double sumScore = 0;
        for (double point : point) {
            sumScore += point;
        }

        return sumScore / point.length;
    }


    @Override
    public String toString() {
        return "Student{" +
                "id=" + this.id +
                ", name='" + this.name + '\'' +
                ", gender='" + this.gender + '\'' +
                ", point=" + Arrays.toString(point) +
                '}';
    }
}
