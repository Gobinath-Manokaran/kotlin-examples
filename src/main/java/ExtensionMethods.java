package main.java;

class Rectangle1 {
    public final int length;
    public final int width;

    Rectangle1(int length, int width){
        this.length = length;
        this.width = width;
    }

    public int area(){
        return length * width;
    }
}

class SuperRectangle1 extends Rectangle1 {

    SuperRectangle1(int length, int width) {
        super(length, width);
    }

    public  int perimeter(){
        return 2 * (length + width);
    }
}

public class ExtensionMethods {
    public static void main(String[] args) {
        Rectangle1 rectangle = new Rectangle1(40, 20);
        System.out.println(rectangle.area());
        SuperRectangle1 superRectangle = new SuperRectangle1(40 ,20);
        System.out.println(superRectangle.perimeter());

    }
}
