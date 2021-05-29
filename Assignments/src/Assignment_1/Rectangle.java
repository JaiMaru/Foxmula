package Assignment_1;

public class  Rectangle extends Quadrilateral
{
    Rectangle(int x1, int x2, int x3, int x4, int y1, int y2, int y3, int y4)
    {
        setCoordinates(x1,x2,x3,x4,y1,y2,y3,y4);
    }

    float area()
    {
        float a1 = (float)Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
        float a2 = (float)Math.sqrt((x1-x4)*(x1-x4)+(y1-y4)*(y1-y4));
        return a1*a2;
    }
}