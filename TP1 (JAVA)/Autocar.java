
public class Autocar extends Vehicule {
	private int nombrePassagers;
	private float volume;

	public Autocar (String modele, int anneeAchat, float prixAchat, String numeroImmat, char permis, int nombrePassagers, float volume)
	{
		super(modele,anneeAchat,prixAchat,numeroImmat,permis);
		this.nombrePassagers=nombrePassagers;
		this.volume=volume;
	}
	
	public void afficherAutocar()
	{
		super.afficherVehicule();
		System.out.println(nombrePassagers);
		System.out.println(volume);		
	}
	
	public boolean peutTransporterPassagers(int nombrePassagers, float volumeMoyen)
	{
		return (this.nombrePassagers>=nombrePassagers && volume>=nombrePassagers*volumeMoyen);
	}
		
}
