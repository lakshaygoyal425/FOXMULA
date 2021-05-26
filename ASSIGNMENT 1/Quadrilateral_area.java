package Assignemt1;

class Quadrilateral
{
    protected double x1,x2,x3,x4,y1,y2,y3,y4;
    protected void setCoordinate(double a,double b,double c,double d,double e,double f,double g,double h)
    {
        x1=a;
        y1=b;
        x2=c;
        y2=d;
        x3=e;
        y3=f;
        x4=g;
        y4=h;
    }
}

class Square extends Quadrilateral
{
    Square(double a,double b,double c,double d,double e,double f,double g,double h)
    {
        setCoordinate(a,b,c,d,e,f,g,h);
    }
    double area()
    {
        double d=(double)Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
        return d*d;
    }
}

class Rectangle extends Quadrilateral
{
    Rectangle(double a,double b,double c,double d,double e,double f,double g,double h)
    {
        setCoordinate(a,b,c,d,e,f,g,h);
    }
    double area()
    {
        double d1=(double)Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
        double d2=(double)Math.sqrt((x1-x4)*(x1-x4)+(y1-y4)*(y1-y4));
        return d1*d2;
    }
}

class Trapezoid extends Quadrilateral
{
    private double height;
    Trapezoid(double a,double b,double c,double d,double e,double f,double g,double h,double height)
    {
        setCoordinate(a,b,c,d,e,f,g,h);
        this.height=height;
    }
    double area()
    {
        double d1=(double)Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
        double d2=(double)Math.sqrt((x3-x4)*(x3-x4)+(y3-y4)*(y3-y4));
        return (double)((d1+d2)*height)/2;
    }
}

class Parallelogram extends Quadrilateral
{
    private double height;
    Parallelogram(double a,double b,double c,double d,double e,double f,double g,double h,double height)
    {
        setCoordinate(a,b,c,d,e,f,g,h);
        this.height=height;
    }
    double area()
    {
        double d1=(double)Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
        return d1*height;
    }
}

public class Quadrilateral_area
{
    public static void main(String []args)
    {
        Square sq=new Square(10.12,12.4,12.7,12.0,20,20,10,20);
        System.out.println("Area Of The Square is " + sq.area());
        Rectangle rec = new Rectangle(10.12,12.4,12.7,12.0,20,20,10,20);
        System.out.println("Area Of The Rectangle is " + rec.area());
        Parallelogram p = new Parallelogram(10,10,30,10,20,20,0,20,8);
        System.out.println("Area Of The Parallelogram is " + p.area());
        Trapezoid t = new Trapezoid(10,10,30,10,40,20,0,20,8);
        System.out.println("Area Of The Trapezoid is " + t.area());
    }
}