
public class Point {

	public double x;
	public double y;
	
	public Point (double x, double y){
		this.x=x;
		this.y=y;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}
	
	public void translationPoint(double vx, double vy)
	{
		this.x+=vx;
		this.y+=vy;
		
	}
	
}