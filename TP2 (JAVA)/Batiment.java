
public class Batiment {
	private String adresse;
	private int surfaceHabitable;
	public Batiment(String adresse,int surfaceHabitable)
	{
		this.adresse=adresse;
		this.surfaceHabitable=surfaceHabitable;
	}
	public String toString()
	{
		return ( "Adresse : " + this.adresse + " SurfaceHabitable : " + this.surfaceHabitable );
		
	}
	
	public String getAdresse() {
		return adresse;
	}
	public int getSurfaceHabitable() { return this.surfaceHabitable;}
	
	public int categorie() 
	{
		int i=0;
		if (this.surfaceHabitable<30) i = 1;
		else if (this.surfaceHabitable>30 && this.surfaceHabitable<70) i = 2;
		else if (this.surfaceHabitable>70) i = 3;
		return i;	
	}
	
	public Batiment compareTo(Batiment B)
	{
		if (this.surfaceHabitable<B.surfaceHabitable) return B;
		else return this;
	}
	
}
