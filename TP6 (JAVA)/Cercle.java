
public class Cercle extends Forme {

	public int rayon;

	public String toString() {
		return "Cercle [rayon=" + rayon + ", x=" + x + 
				", y=" +y + "]";
	}
	
	public Cercle (int x, int y, int rayon)
	{
		this.x=x;
		this.y=y;
		this.rayon=rayon;
	}

}
