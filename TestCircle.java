/*
 * Created by:- Nish Patel
 * ID:- 21ce102
 * Aim:- Design a class named Circle containing following attributes and behavior.
 * •Onedouble data field named radius. The default valueis1.
 * •A no-argumentconstructor that creates a default circle.
 * •A Single argument constructor that creates a Circle with the specified radius.
 * •A method named getArea() that returns area of the Circle.
 * •A method named getPerimeter() that returns perimeterof it.
 */

public class TestCircle {
    public static void main(String[] args) {
        CircleClass c= new CircleClass();
        double area = c.getArea();
        System.out.println("The area of the Circle with default radius is " + area);
        CircleClass c2 = new CircleClass(123);
        double perimeter = c2.getPerimeter();
        System.out.println("The perimeter of the Circle with 123 radius is " + perimeter);
    }
}
