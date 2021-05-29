package Assignment_1;

public class TimeMain
{
	public static void main(String args[])
    {
    	Time t1 = new Time(12,30,46);
    	t1.display();
    	Time t2 = new Time(5,43,23);
    	t2.display();
        Time t3= t1.add(t2);
        t3.display();
    }
}