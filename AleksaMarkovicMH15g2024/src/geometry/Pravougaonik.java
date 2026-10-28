package geometry;

public class Pravougaonik {
	private Point upperLeft;
	private Line width;
	private Line height;
	private boolean selected;
	
	public Point getUpperLeft() {
		return upperLeft;
	}
	public void setUpperLeft(Point upperLeft) {
		this.upperLeft = upperLeft;
	}
	public Line getWidth() {
		return width;
	}
	public void setWidth(Line width) {
		this.width = width;
	}
	public Line getHeight() {
		return height;
	}
	public void setHeight(Line height) {
		this.height = height;
	}
	public boolean isSelected() {
		return selected;
	}
	public void setSelected(boolean selected) {
		this.selected = selected;
	}
	
	public double area(){
		System.out.println("Povrsina je:");
		return width.length()*height.length();
		
	}
	public double circumference() {
		System.out.println("Obim je:");
		return 2*width.length()+2*height.length();
	}
	
}
