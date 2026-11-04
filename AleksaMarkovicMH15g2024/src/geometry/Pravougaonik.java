package geometry;

public class Pravougaonik {
	private Point upperLeft;
	private Line width;
	private Line height;
	private boolean selected;
	
	public Pravougaonik() {
		
	}
	
	public Pravougaonik(Point upperLeft,Line width,Line height) {
		this.upperLeft=upperLeft;
		this.width=width;
		this.height=height;
	}
	
	public Pravougaonik(Point upperLeft,Line width,Line height,boolean selected) {
		this(upperLeft,width,height);
		this.selected=selected;
	}
	
	@Override
	public String toString() {
		return String.format("Upper left point:(%s,%s),width=<%s>, height:<%s>",upperLeft.getX(),upperLeft.getY(),width.length(),height.length());
	}
	
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
