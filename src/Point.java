
public class Point
	{
	public int x, y;

	public Point() {
		x = 0;
		y = 0;
	}
	public Point(int _x, int _y) {
		x = _x;
		y = _y;
	}
			
			//or: add function: public int multPoints(Point other);




	public Point add(Point Other) {
	
		Point newPoint = new Point();
		
		newPoint.x=this.x+Other.x;
		newPoint.y=this.y+Other.y;
				
		return newPoint;
	}
  
  public String toString(){
    return "x: " +x + "\ty: " y;
  }
	}
