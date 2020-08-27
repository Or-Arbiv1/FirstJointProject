
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
			
			//or: add function: public int multPoints(Point other);
			
		public Point multPoints(Point other) {
			return new Point(this.x*other.x,this.y*other.y);
		}

		
			//guy:add function: public String toString();
			public String toString()
			{
				return "x: " +x + "\t y: " +y;
			}
	}
