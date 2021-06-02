package Assignment_2;

import java.util.*;		
				
public class traversalHashSet {

	public static void main(String[] args) {
		
		Set<Integer> set = new HashSet<>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of elements");
		int n = sc.nextInt();
		System.out.println("Enter elements");
		for(int i=0;i<n;i++)
			set.add(sc.nextInt());
		
		System.out.println("Traversing elements");
		Iterator<Integer> itr = set.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
	}

}
