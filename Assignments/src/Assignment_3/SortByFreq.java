package Assignment_3;

import java.util.*;
import java.util.Map.Entry;

public class SortByFreq {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of elements");
		int n = sc.nextInt();
		
		int A[] = new int[n];
		
		System.out.println("Enter elements");
		for(int i=0;i<n;i++)
			A[i] = sc.nextInt();
		
		HashMap<Integer, Integer> m = new HashMap<>();
		
		for(int i = 0; i<A.length; i++)
        {
            if(m.containsKey(A[i]))
            {
                m.put(A[i], m.get(A[i]) + 1);
            }
            else
            {
                m.put(A[i], 1);
            }
        }
		
		
		List<Map.Entry<Integer, Integer>> llist = new LinkedList<>(m.entrySet()); 

		Collections.sort(llist, new Comparator<HashMap.Entry<Integer, Integer>>()
        {
            public int compare(Map.Entry<Integer, Integer> i1, Map.Entry<Integer, Integer> i2)
            {
                return (i2.getValue()).compareTo(i1.getValue());
            }
        });
				
		
		Iterator<Map.Entry<Integer, Integer>>  it = llist.iterator();
		
		System.out.println("Occurence of each element in sorted order by frequency : ");
		while(it.hasNext()) {
			Map.Entry<Integer,Integer> e1 = (Entry<Integer, Integer>) it.next();
			System.out.println("Element: "+e1.getKey()+ " Frequency: "+ e1.getValue());
		}
		
	}

}
