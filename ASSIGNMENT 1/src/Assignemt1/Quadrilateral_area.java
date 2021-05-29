package Assignemt1;


public class Quadrilateral_area
{
    public static void main(String []args)
    {
        Square sq=new Square(20,12,17,19,22,32,11,21);
        System.out.println("Area Of The Square is " + sq.area());
        Rectangle rec = new Rectangle(21,24,17,10,12,31,23,21);
        System.out.println("Area Of The Rectangle is " + rec.area());
        Parallelogram p = new Parallelogram(12,12,20,15,15,20,0,20,8);
        System.out.println("Area Of The Parallelogram is " + p.area());
        Trapezoid t = new Trapezoid(20,12,20,25,30,20,10,20,28);
        System.out.println("Area Of The Trapezoid is " + t.area());
    }
}