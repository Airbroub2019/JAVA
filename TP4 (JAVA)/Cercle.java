
public class Cercle extends FormeGeometrique {

	private Point centre;
	private double rayon;


	public double perimetre()
	{
		return 2*(this.rayon)*(Math.PI);
	}

	public Cercle(Point centre, double rayon)
	{
		this.centre=centre;
		this.rayon=rayon;
		this.nom="Cercle";
	}
	
	@Override
	public String toString() {
		return "Cercle [centre=(" + centre.getX() + "," + centre.getY() + ")"  +
					", rayon=" + rayon + ", nom=" + this.nom + ", perimetre=" + this.perimetre() +"]";
	}
	
	public void translationCentre(double vx, double vy)
	{
		this.centre.x+=vx;
		this.centre.y+=vy;
		
	}
}
