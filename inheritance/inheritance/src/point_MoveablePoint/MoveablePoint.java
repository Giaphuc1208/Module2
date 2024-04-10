package point_MoveablePoint;

import class_2d_3d.Point2D;

public class MoveablePoint extends Point {
    private float xSpeed;
    private float ySpeed;

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint() {
        this(0.0f,0.0f,0.0f, 0.0f);
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed(){
        return new float[]{xSpeed, ySpeed};
    }

    @Override
    public String toString() {
        return "(x= %s, y= %s), (xSpeed= %s, ySpeed= %s )".formatted(getX(), getY(), xSpeed, ySpeed);
    }

    public MoveablePoint move(){
        setX(getX() + this.xSpeed);
        setY(getY() + this.ySpeed);
        return this;
    }

    public static void main(String[] args) {
        MoveablePoint moveablePoint = new MoveablePoint(3.4f , 4.5f, 2.5f, 6.5f);
        System.out.println("After move : "+moveablePoint);
        moveablePoint.move();
        System.out.println("Before move : " + moveablePoint);
    }
}

