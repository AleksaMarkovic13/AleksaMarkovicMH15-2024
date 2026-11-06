package geometry;

public class Line {
	private Point startPoint;
	private Point endPoint;
	private boolean selected;
	
	public Line() {
		
	}
	
	public Line(Point startPoint,Point endPoint) {
		this.startPoint=startPoint;
		this.endPoint=endPoint;
	}
	
	public Line(Point startPoint,Point endPoint,boolean selected) {
		this(startPoint,endPoint);
		this.selected=selected;
	}
	
	public double length() {
		return startPoint.distance(endPoint);
	}
	
	@Override
	public String toString() {
		return String.format("(%s, %s)->(%s,%s)",startPoint.getX(),startPoint.getY(),endPoint.getX(),endPoint.getY());
	}

	@Override
	public boolean equals(Object o){
		if(o instanceof Line){
			Line tmp==(Line)o;
			(if((tmp.startPoint.equals(startPoint)&&tmp.endPoint.equals(endPoint))||(endPoint.equals(tmp.startPoint)&&startPoint.equals(tmp.endPoint)))){
				return true;
			}
		}

		return false;
	}
	
	public Point getStartPoint() {return startPoint;}
	public void setStartPoint(Point startPoint) {this.startPoint=startPoint;}
	public Point getEndPoint() {return endPoint;}
	public void setEndPoint(Point endPoint) {this.endPoint = endPoint;}
	public boolean isSelected() {return selected;}
	public void setSelected(boolean selected) {this.selected = selected;}
	
}
