package Assignemt1;

class Rectangle extends Quadrilateral
{
    Rectangle( int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4)
    {
        super(x1, y1, x2, y2, x3, y3, x4, y4);
    }
    double area()
    {
        double d1=(double)Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
        double d2=(double)Math.sqrt((x1-x4)*(x1-x4)+(y1-y4)*(y1-y4));
        return d1*d2;
    }
}