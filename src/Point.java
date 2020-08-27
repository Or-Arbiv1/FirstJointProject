
public class Point
	{
			//david: add fields: int x, int y
			//david: add default constructor and p. constructor
		
			//alex: add function: public int add(PointOther);
			
			//or: add function: public int multPoints(Point other);
			
		public Point multPoints(Point other) {
			return new Point(this.x*other.x,this.y*other.y);
		}
		
			//guy:add function: public String toString();
	}
