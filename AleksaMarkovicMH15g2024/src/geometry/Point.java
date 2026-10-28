package geometry;

public class Point {
	private int x;
	private int y;
	private boolean selected;
	
	public double distance(Point p) {
		int dx=x-p.getX();
		int dy=y-p.getY();
		System.out.println("udaljenost tacaka je:");
		return Math.sqrt(dx*dx+dy*dy);
	}
	
	public int getX(){return x;}
	public int getY() {return y;}
	public boolean isSelected() {return selected;}
	
	public void setX(int x) {this.x=x;}
	public void setY(int y) {this.y=y;}
	public void setSelected(boolean selected) {this.selected=selected;}
	
}
