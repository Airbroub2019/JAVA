
public class Camion extends Vehicule {

	private int volumeStockage;
	
	public Camion (String modele, int anneeAchat, float prixAchat, String numeroImmat, char permis, int volumeStockage)
	{
		super(modele,anneeAchat,prixAchat,numeroImmat,permis);
		this.volumeStockage=volumeStockage;
	}
	public boolean peutTransporterVolume(int volume)
	{
		return(volumeStockage>=volume);
	}
	public void afficherCamion()
	{
		super.afficherVehicule();
		System.out.println(volumeStockage);
		
	}
}
