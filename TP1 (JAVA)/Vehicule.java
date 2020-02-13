
public class Vehicule {
	private String modele;
	private int anneeAchat;
	private float prixAchat;
	private String numeroImmat;
	private char permis;
	
	protected Vehicule (String modele, int anneeAchat, float prixAchat, String numeroImmat, char permis)
	{
		this.modele=modele;
		this.anneeAchat=anneeAchat;
		this.prixAchat=prixAchat;
		this.numeroImmat=numeroImmat;
		this.permis=permis;
	}

	public int age()
	{
		return (2019-anneeAchat);
	}

	public void afficherVehicule()
	{
		System.out.println(modele);
		System.out.println(anneeAchat);
		System.out.println(prixAchat);
		System.out.println(numeroImmat);
		System.out.println(permis);
	}
	
	public float coutLocation()
	{
		if (this.age()<1) 
			return prixAchat/200;
		return prixAchat/250;
	}
	
	
	
}
