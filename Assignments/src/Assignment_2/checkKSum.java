package Assignment_2;

import java.util.*;

public class checkKSum {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of elements");
		int n = sc.nextInt();
		System.out.println("Enter elements");
		for(int i=0;i<n;i++)
			list.add(sc.nextInt());
		
		System.out.println("Enter target sum for pairs");
		int k = sc.nextInt();
		
		HashSet<Integer> h = new HashSet<>();
		
		boolean isFound = false;
		
		Iterator<Integer> itr = list.iterator();
		
		while(itr.hasNext()) {
			int item = itr.next();
			if(h.contains(k-item))
			{
				System.out.println("Element 1: "+(k-item)+ " Element 2: "+ item);
				isFound = true;
			}
			h.add(item);
		}	
		
		if(!isFound)
			System.out.println("No pair of elements has required sum");		
	}

}
