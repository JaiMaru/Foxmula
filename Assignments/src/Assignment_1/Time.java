package Assignment_1;

import java.util.*;

public class Time
{
    private int hour, min, sec;
    Time(int h, int m, int s)
    {
        hour=h;
        min=m;
        sec=s;
    }
    Time()
    {
        hour=0;
        min=0;
        sec=0;
    }
    public Time add(Time T)
    {
        
    	T.hour = hour + T.hour ;
	 	T.min = min + T.min ;
	 	T.sec = sec + T.sec ;
	 	
		 if (T.sec>=60)
	 	
		 	T.min =T.min + (T.min/60);
			T.sec = T.sec % 60;
		 
		 	if (T.min>=60)
		 	
			 	T.hour =T.hour + (T.min/60);
				T.min = T.min % 60;
			
		
        return T;
    }

    void display()
    {
        System.out.println("Time is "+hour+"hrs : "+min+"mins :"+ sec +"secs");
    }
}

