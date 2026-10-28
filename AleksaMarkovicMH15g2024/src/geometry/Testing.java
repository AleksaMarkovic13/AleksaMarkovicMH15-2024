package geometry;

public class Testing {

	public static void main(String[] args) {
		
		Point p1 = new Point();
		p1.setX(50);
		Point p2=new Point();
		p2.setY(30);
		System.out.println(p1.distance(p2));
		
		Line l1=new Line();
		System.out.println(l1.getStartPoint());
		System.out.println(l1.getEndPoint());
		System.out.println(l1.getStartPoint().getX());
	}

}
