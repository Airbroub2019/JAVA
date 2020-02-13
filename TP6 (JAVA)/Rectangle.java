
public class Rectangle extends Forme  {

	public int longueur;
	public int largeur;
	
	
	public String toString() {
		return "Rectangle [longueur=" + longueur + ", largeur=" + largeur + ", x=" + x + 
										", y=" +y + "]";
	}
	
	public Rectangle (int x, int y, int longueur, int largeur)
	{
		this.x=x;
		this.y=y;
		this.largeur=largeur;
		this.longueur=longueur;

	}

	
}
