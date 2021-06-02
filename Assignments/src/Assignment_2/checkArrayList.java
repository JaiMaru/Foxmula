package Assignment_2;

import java.util.*;		
				
public class checkArrayList {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of elements");
		int n = sc.nextInt();
		System.out.println("Enter elements");
		for(int i=0;i<n;i++)
			list.add(sc.nextInt());
		
		System.out.println("Enter the element to be searched");
		
		System.out.println(list.contains(sc.nextInt()) ? "Element is present." : "Element is absent.");		
	}

}
