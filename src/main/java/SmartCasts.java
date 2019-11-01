package main.java;

class Shape {

}

class Square extends Shape{
    public Square(int side) {
        this.side = side;
    }

    public int side;
}


class Rectangle extends Shape{
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int length;
    public int width;

}

class PerimeterCalculator {
    public static double perimeter(Shape shape){
        if(shape instanceof Rectangle){
            Rectangle rectangle = (Rectangle) shape;
            return 2 * rectangle.length * rectangle.width;
        }
        else if (shape instanceof Square){
            Square square = (Square) shape;
            return 4 * square.side;
        }
        return 0;
    }
}

public class SmartCasts {

    public static void main(String[] args) {

        Square square = new Square(5);
        Rectangle rectangle = new Rectangle(4 ,2);

        System.out.println(PerimeterCalculator.perimeter(square));
        System.out.println(PerimeterCalculator.perimeter(rectangle));

    }

}
