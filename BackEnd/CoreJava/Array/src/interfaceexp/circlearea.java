package interfaceexp;

interface areaofcircle{
	
	double area(int r);
}

public class circlearea {

	public static void main(String[] args) {
		
		areaofcircle  a = r -> 3.14*r*r;
		double i= a.area(2);
		System.out.println(i);
		

	}

}
