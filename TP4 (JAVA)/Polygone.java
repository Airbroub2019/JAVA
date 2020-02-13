import java.util.ArrayList;


public class Polygone extends FormeGeometrique{

	public ArrayList<Point> Points = new ArrayList<>();
	
	public double distance(Point A, Point B)
	{
		return Math.sqrt(Math.pow(B.getX() - A.getX(),2) +  Math.pow(B.getY() - A.getY(),2));
	}
	public double perimetre()
	{
		double perimetre=0;
		for (int i=1; i<Points.size(); i++)
		{
			perimetre+=distance(Points.get(i),Points.get(i-1));
		}
		
		 perimetre+=distance(Points.get(0),Points.get(Points.size()-1));
		 return perimetre;
	}
	
}
