
public class Immeuble extends Batiment { //Immeuble en Vente
	private int nbAppart;
	public Immeuble (String adresse, int surfaceH, int nbAppart) 
	{
		super(adresse,surfaceH);
		this.nbAppart=nbAppart;
	}
	public String toString()
	{
		return ( super.toString() + " Nombre d'Appartement : " + this.nbAppart ); 
		
	}
}
