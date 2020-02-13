
public class Maison extends Batiment  { //Maison à louer
	private int nbPieces;
	private int surfaceJardin;
	
	public Maison (String adresse, int surfaceH, int surfaceJ, int nbPieces) 
	{
		super(adresse,surfaceH);
		this.nbPieces=nbPieces;
		this.surfaceJardin=surfaceJ;
	}
	public String toString()
	{
		return ( super.toString() + " Surface-Jardin : " + this.surfaceJardin) + " Nombre de Pieces : " + this.nbPieces; 
		
	}
	
	public int getSurfaceJardin() { return this.surfaceJardin;}

}
