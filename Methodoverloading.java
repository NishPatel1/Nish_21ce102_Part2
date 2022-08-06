public class Methodoverloading {

    Methodoverloading() {}

    public void add(int a, int b)
    {
        int c = a+b;
        System.out.println("The addition of " + a + " and " + b + " is " + c);
    }
    public void add(double d, double e)
    {
        double c = d+e;
        System.out.println("The addition of " + d + "and " + e + " is " + c);
    }

    // Compiler error:- Duplicate method add(int, int) 
    // public int add(int a, int b)
    // {
    //     return a+b;
    // }
    // we cannot overload a same method name with different returntype
    // not allowed in java

    public int add(int a, int b, int c)
    {
        return a+b+c;
    }

    public double add(double d, double e, double f) {
        return d+e+f;
    }
}
