
public class Point
	{
			//david: add fields: int x, int y
			//david: add default constructor and p. constructor
		

			//alex: add function: public int add(PointOther);
	public Point add(Point Other) {
	
		Point newPoint = new Point();
		
		newPoint.x=this.x+Other.x;
		newPoint.y=this.y+Other.y;
				
		return newPoint;
	}
			

		
			//guy:add function: public String toString();
			public String toString()
			{
				return "x: " +x + "\t y: " +y;
			}
	}
