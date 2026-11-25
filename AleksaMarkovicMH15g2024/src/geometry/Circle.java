package geometry;

public class Circle extends Shape {
	protected Point center;
	protected int radius;
	
	
	public Circle() {
		
	}
	
	public Circle(Point center,int radius) {
		this.center=center;
		this.radius=radius;
	}
	
	public Circle(Point center,int radius,boolean selected) {
		this(center,radius);
		this.selected=selected;
	}
	
	public double circumference() {
		System.out.println("Obim je");
		return 2*radius*Math.PI;
		
	}
	
	public double area() {
		System.out.println("Povrsina je:");
		return Math.PI*radius*radius;
	}
	
	@Override
	public void moveTo(int x,int y) {
		center.moveTo(x, y);
	}
	
	@Override
	public void moveBy(int byX,int byY) {
		
		center.moveBy(byX, byY);
	}
	
	@Override
	public boolean contains(int x,int y) {
		
		return center.distance(new Point(x,y))<=radius;
		
	}
	
	public boolean contains(Point click) {
		
		return contains(click.getX(),click.getY());
	}
	
	@Override
	public String toString() {
		return String.format("(%s,%s), radius=<%s>",center.getX(),center.getY(),radius);
	}

	@Override
	public int compareTo(Shape o) {
		if(o instanceof Circle) {
			Circle temp=(Circle)o;
			return (int) (area()-temp.area());
		}
		
		return 0;
	}
	
	@Override
	public boolean equals(Object o){
		if(o instanceof Circle){
			Circle tmp=(Circle)o;
			if(radius==tmp.getRadius()&&center.equals(tmp.center)){
				return true;
			}
		}
		return false;
	}
	
	public Point getCenter() {
		return center;
	}
	public void setCenter(Point center) {
		this.center = center;
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	
	
}
