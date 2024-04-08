public class Rectangle {
    double length;
    double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public double area(){

        return this.length * this.width;
    }
    public double perimetter(){

        return (this.length + this.width) * 2;
    }
    public String display(){

        return "Rectangle{" + "length = " + length + ", width = " + width +"}";
    }
    /* using getter
    public double getLength() {
        return length;
    }
    public double getWidth() {
        return width;
    }
      using setter
    public void setLength(double length) {
        this.length = length;
    }
    public void setWidth(double width) {
        this.width = width;
    }*/
}
