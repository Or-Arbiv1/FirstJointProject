
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

			
			//or: add function: public int multPoints(Point other);
			
		public Point multPoints(Point other) {
			return new Point(this.x*other.x,this.y*other.y);
		}

		
			//guy:add function: public String toString();
			public String toString()
			{
				return "x: " +x + "\t y: " +y;
			}
			
			
			public static void main(String[]args) {
				Point p1=new Point(5,7);
				Point p2=new Point();
				System.out.println(p1.add(p2));
				System.out.println(p1.multPoints(p2));
			}
	}


