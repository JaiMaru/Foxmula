package Assignment_1;

public class Parallelogram extends Quadrilateral
{
    private int height;
    Parallelogram(int x1, int x2, int x3, int x4, int y1, int y2, int y3, int y4, int height)
    {
        setCoordinates(x1,x2,x3,x4,y1,y2,y3,y4);
        this.height = height;
    }

    float area()
    {
        float A = (float)Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
        return A*height;
    }
}
