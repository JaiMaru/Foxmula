package Assignment_1;

public class QuadMain {

	public static void main(String[] args) {
		
		Quadrilateral q[] = new Quadrilateral[4];
		q[0] = new Rectangle(10,30,10,20,10,20,0,20);
		q[1] = new Square(10,30,20,0,10,10,20,20);
		q[2] = new Parallelogram(10,30,20,0,10,10,20,20,6);
		q[3] = new Trapezoid(10,10,30,10,20,20,0,20,7);
		

		for(int i=0;i<q.length;i++){
			System.out.println(q[i].area());
		}

	}

}
