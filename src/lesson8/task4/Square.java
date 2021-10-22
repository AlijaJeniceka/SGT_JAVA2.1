package lesson8.task4;

public class Square extends Rectangle{
    private int s;
    public Square(){

    }

    public Square(int s) {
        super(s, s);
        this.s = s;
    }

    @Override
    public int calculateArea() {
        return super.calculateArea();
    }

    @Override
    public int calculatePerimeter() {
        return super.calculatePerimeter();
    }
}
