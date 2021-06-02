package Assignment_2;

import java.util.*;		
				
public class checkSet {

	public static void main(String[] args) {
		
		Set<Integer> set = new HashSet<>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of elements");
		int n = sc.nextInt();
		System.out.println("Enter elements");
		for(int i=0;i<n;i++)
			set.add(sc.nextInt());
		
		System.out.println("Enter the element to be searched");
		
		System.out.println(set.contains(sc.nextInt()) ? "Element is present." : "Element is absent.");		
	}

}
