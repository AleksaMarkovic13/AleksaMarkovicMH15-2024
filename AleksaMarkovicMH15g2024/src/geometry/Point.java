package geometry;

public class Point {
	private int x;
	private int y;
	private boolean selected;
	
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
	
	public int getX(){return x;}
	public int getY() {return y;}
	public boolean isSelected() {return selected;}
	
	public void setX(int x) {this.x=x;}
	public void setY(int y) {this.y=y;}
	public void setSelected(boolean selected) {this.selected=selected;}
	
	
	
}
