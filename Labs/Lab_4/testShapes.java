import java.text.DecimalFormat;
import java.util.ArrayList;


interface Shape {
    public double area();
    public double perimeter();
}


class Circle implements Shape{
    double radius;

    Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double area() {
        return 3.14 * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2* 3.14* radius;
    }

}


class Rectangle implements Shape{
    double length;
    double width;

    Rectangle(double length,double width){
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length*width;
    }

    @Override
    public double perimeter() {
        return 2*(length+width);
    }

}


class Square implements Shape{
    double side;

    Square(double side){
        this.side = side;
    }

    @Override
    public double area() {
        return side* side;
    }

    @Override
    public double perimeter() {
        return 4* side;
    }
}


class Triangle implements Shape{
    double a;
    double b;
    double c;

    Triangle(double a,double b,double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double area() {
        double S= perimeter()/2;


        double result = (S*(S-a)*(S-b)*(S-c));
        if(result<0) result = result * -1;

        return Math.sqrt(result);
    }

    @Override
    public double perimeter() {
        return a+b+c;
    }
}

public class testShapes {
    public static void main(String[] args) {
        Shape circle = new Circle(10);
        Shape rectangle = new Rectangle(20, 50);
        Shape square = new Square(40);
        Shape triangle = new Triangle(6,17,55);

        ArrayList<Shape> shapes = new ArrayList<Shape>();
        shapes.add(circle);
        shapes.add(rectangle);
        shapes.add(square);
        shapes.add(triangle);

        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);
        for(Shape shape:shapes){
            System.out.println(shape.getClass().getSimpleName() + " area: "+df.format(shape.area()));
            System.out.println(shape.getClass().getSimpleName() + " perimeter: "+df.format(shape.perimeter()));
            System.out.println();

        }



    }
}