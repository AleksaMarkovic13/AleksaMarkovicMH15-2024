package geometry;

public class Pravougaonik extends Shape{
	private Point upperLeft;
	private int width;
	private int height;
	
	
	public Pravougaonik() {
		
	}
	
	public Pravougaonik(Point upperLeft,int width,int height) {
		this.upperLeft=upperLeft;
		this.width=width;
		this.height=height;
	}
	
	public Pravougaonik(Point upperLeft,int width,int height,boolean selected) {
		this(upperLeft,width,height);
		this.selected=selected;
	}
	
	@Override
	public boolean contains(int x,int y) {
		return (x>=upperLeft.getX() && x<= upperLeft.getX() + width)
		&&
		(y>=upperLeft.getY()&&y<=upperLeft.getY() + height);
	}
	
	@Override
	public void moveTo(int x,int y) {
		upperLeft.moveTo(x, y);
		
	}
	
	@Override
	public void moveBy(int byX,int byY) {
		upperLeft.moveBy(byX, byY);
		
	}
	
	public boolean contains(Point click) {
		
		return contains(click.getX(),click.getY());
	}
	
	@Override
	public String toString() {
		return String.format("Upper left point:(%s,%s),width=<%s>, height:<%s>",upperLeft.getX(),upperLeft.getY(),width,height);
	}

	public int compareTo(Shape o) {
		if(o instanceof Pravougaonik) {
			Pravougaonik temp=(Pravougaonik)o;
			return (int) (area()-temp.area());
		}
		
		return 0;
	}
	
	@Override
	public boolean equals(Object o){
		if(o instanceof Pravougaonik) {
			Pravougaonik tmp =(Pravougaonik)o;
			if(upperLeft.equals(tmp.upperLeft)&&width==tmp.width&&height== tmp.getHeight())
				return true;
		}

		return false;
	}

	public Point getUpperLeft() {
		return upperLeft;
	}
	public void setUpperLeft(Point upperLeft) {
		this.upperLeft = upperLeft;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	
	public double area(){
		System.out.println("Povrsina je:");
		return width*height;
		
	}
	public double circumference() {
		System.out.println("Obim je:");
		return 2*width+2*height;
	}
	
}
