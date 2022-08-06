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

public class CircleClass {

    private double rad = 1;

    CircleClass() {}

    CircleClass(double rad)
    {
        this.rad = rad;
    }

    public double getArea()
    {
        double ans;
        ans=2*3.14*rad*rad;
        return ans;
    }

    public double getPerimeter()
    {
        double ans;
        ans=2*3.14*rad;
        return ans;
    }
}
