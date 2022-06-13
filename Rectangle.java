package BaiTap7;

public class Rectangle extends Shape implements Resizeable{
    private double width;
    private double height;

    public Rectangle() {
    }

    public Rectangle(String color, Boolean filled, double width, double height) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getPerimeter(){
        return (width+height)*2;
    }

    public double getArea(){
        return width*height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                ", area= " + getArea() +
                ", perimeter= " + getPerimeter() +
                ", which is a subclass of " + super.toString() +
                '}';
    }

    @Override
    public void resize(double percent) {
        width *= percent;
        height *= percent;
    }
}
