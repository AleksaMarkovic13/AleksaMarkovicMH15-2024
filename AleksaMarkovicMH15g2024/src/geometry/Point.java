package geometry;

public class Point extends Shape {
	private int x;
	private int y;
	
	
	public Point(int x,int y,boolean selected) {
		this.x=x;
		this.y=y;
		this.selected=selected;
	}
	
	public Point(int x,int y) {
		this.x=x;
		this.y=y;
	}
	
	public Point() {
		
	}
	
	public double distance(Point p) {
		int dx=x-p.getX();
		int dy=y-p.getY();
		System.out.println("udaljenost tacaka je:");
		return Math.sqrt(dx*dx+dy*dy);
	}
	
	@Override
	public void moveTo(int x,int y) {
		this.x=x;
		this.y=y;
	}
	
	@Override
	public void moveBy(int byX,int byY) {
		x+=byX;
		y+=byY;
	}
	
	@Override
	public boolean contains(int x,int y) {
		return distance(new Point(x,y))<=2;
		
		
	}
	
	@Override
	public String toString() {
		return"("+x+","+y+")";
	}
	
	@Override
	public boolean equals(Object o) {
		if(o instanceof Point) {
			Point temp=(Point)o;
			if(this.x==temp.getX()&&this.y==temp.getY())
				return true;
		}
		return false;
	}
	
	@Override
	public int compareTo(Shape o) {
		if(o instanceof Point) {
			Point temp=(Point)o;
			return (int)(distance(new Point(0,0))-temp.distance(new Point(0,0)));
		}
		return 0;
	}
	
	public int getX(){return x;}
	public int getY() {return y;}
	
	
	public void setX(int x) {this.x=x;}
	public void setY(int y) {this.y=y;}
	
	
	
	
}
