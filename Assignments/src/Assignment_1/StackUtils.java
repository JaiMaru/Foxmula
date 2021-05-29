package Assignment_1;

import java.util.Scanner;

class Stack{
	int id, size;
	int A[];
	int top;
	
	Stack(int size, int id){
		this.id = id;
		A = new int[size];
		top = -1;
		this.size = size;
	}
	
	boolean isEmpty() {
		return top == -1;
	}
	
	boolean isFull() {
		return top == size-1;
	}
	
	void push(int item) {
		if(!isFull())
			A[++top] = item;
		else 
			System.out.println("Stack "+ id +" is Full");
	}
	
	int pop() {
		if(!isEmpty())
			return A[top--];
		System.out.println("Stack "+ id +" is Empty");
		return -1;
	}
	
	void display() {
		int temp = top;
		while(temp != -1) 
			System.out.print(A[temp--]+ " ");
		System.out.println();
	}
}

public class StackUtils {

	public static void isSame(Stack s1, Stack s2) 
	{
		int size = s1.top+1;
		if(s1.top == s2.top) {
			System.out.println("! Same Size " + size + " !");
			s1.display();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of stack 1 and stack 2");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		Stack s1 = new Stack(n1, 1);
		Stack s2 = new Stack(n2, 2);
		
		System.out.println("-ve : Stack 1, +ve : Stack 2");
		while(true)
		{				
			System.out.println("-1 Push, -2 Pop, -3 Display, 1 Push, 2 Pop, 3 Display  ");
			int ch = sc.nextInt();
			switch (ch) {
			case -1:
			{
				System.out.println("Enter Element");
				int item = sc.nextInt();
				s1.push(item);
				isSame(s1,s2);
			}
			break;
			case 1:
			{
				System.out.println("Enter Element");
				int item = sc.nextInt();
				s2.push(item);
				isSame(s1,s2);
			}
			break;
			case -2:{
				s1.pop();
				isSame(s1,s2);
			}
			break;
			case 2:{
				s2.pop();
				isSame(s1,s2);
			}
			break;
			case -3:{
				s1.display();
			}
			break;
			case 3:{
				s2.display();
			}
			break;
	
			default:
				System.out.println("Invalid Choice");
				break;
			}
			
		}
	}

}
