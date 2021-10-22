package lesson8.task4;

public class Rectangle {
    private int length;
    private int breadth;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public Rectangle() {
    }

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int calculatePerimeter() {
        return (length + breadth) * 2;
    }
    public int calculateArea() {
        return (length * breadth);

    }
}
