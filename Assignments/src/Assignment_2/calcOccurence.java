package Assignment_2;

import java.util.*;

public class calcOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of elements");
		int n = sc.nextInt();
		System.out.println("Enter elements");
		for(int i=0;i<n;i++)
			list.add(sc.nextInt());
		
		HashMap<Integer, Integer> m = new HashMap<>();
		
		Iterator<Integer> itr = list.iterator();
		
		while(itr.hasNext()) {
			int item = itr.next();
			System.out.println(item);
			if(m.containsKey(item)) 
				m.put(item, m.get(item)+1);
			else
				m.put(item, 1);
		}
		
		System.out.println("Occurence of each element");
		
		for(Map.Entry<Integer,Integer> e: m.entrySet())
			System.out.println("Element: "+e.getKey()+ " Value: "+ e.getValue());
		
	}

}
