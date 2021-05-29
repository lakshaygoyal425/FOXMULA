package Assignemt1;

class Square extends Quadrilateral
{
    Square(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4)
    {
        super(x1, y1, x2, y2, x3, y3, x4, y4);
    }
    double area()
    {
        double d = (double)Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
        return d*d;
    }
}