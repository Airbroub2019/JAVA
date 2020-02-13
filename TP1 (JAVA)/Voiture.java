
public class Voiture extends Vehicule {

	private boolean autoradio;
	
	public Voiture (String modele, int anneeAchat, float prixAchat, String numeroImmat, char permis, boolean autoradio )
	{
		super(modele,anneeAchat,prixAchat,numeroImmat,permis);
		this.autoradio=autoradio;
		
	}
	public void ajouterAutoradio()
	{
		autoradio=true;
	}

	public void enleverAutoradio()
	{
		autoradio=false;
	}
	public void afficherVoiture()
	{
		super.afficherVehicule();
		if (autoradio==true) System.out.println("Autoradio");
		else System.out.println("Non Autoradio");
		
	}
}
