package lesson8.task4;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2, 10);
        System.out.println("Rectangle area is: " + rectangle.calculateArea());
        System.out.println("Rectangle Perimeter is: " +rectangle.calculatePerimeter());

        Square square = new Square(4);
        System.out.println("Square area is: " + square.calculateArea());
        System.out.println("Square Perimeter is: " + square.calculatePerimeter());

        Square[] squares = new Square[10];
        squares[0] = new Square(1);
        squares[1] = new Square(15);
        squares[2] = new Square(3);
        squares[3]= new Square(8);
        squares[4]= new Square(6);
        squares[5]= new Square(7);
        squares[6]= new Square(9);
        squares[7]= new Square(2);
        squares[8]= new Square(5);
        squares[9]= new Square(4);

        for (Square square1 : squares
             ) {
            System.out.println( square1.calculateArea());
        }




    }
}
