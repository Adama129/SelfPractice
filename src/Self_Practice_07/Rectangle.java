package Self_Practice_07;

public class Rectangle {
    public static void main(String[] args) {

    }
    public double width;
    public double length;

    public double calculateArea(double width,double length){
        return width*length;
    }
    public double calculatePerimeter(double width , double length){
        return (width+length)*2;
    }

    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }
}
