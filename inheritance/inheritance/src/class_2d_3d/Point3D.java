package class_2d_3d;

import java.util.Arrays;

public class Point3D extends Point2D {
    private float z;

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public Point3D() {
        this(0.0f,0.0f,0.0f);
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z){
        setXY(x, y);
        this.z = z;
    }

    public float[] getXYZ(){
        return new float[]{getX(),getX(),z};
    }

    @Override
    public String toString() {
        return "Point3D = {x= %s, y =%s, z= %s}".formatted(getX(), getY(), z);
    }

    public static void main(String[] args) {
        Point2D point2D = new Point2D(3.4f,12.2f);
        System.out.println(point2D);
        System.out.println(Arrays.toString(point2D.getXY()));
        Point3D point3D = new Point3D(2.3f,5.2f , 7.4f);
        System.out.println(point3D);
        System.out.println(Arrays.toString(point3D.getXYZ()));
    }
}
