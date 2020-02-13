
public class Client {
private int numeroClient;
private String nom;
private double solde;
private static int cptClient=0;
public Client(String nom)
	{
		this.nom=nom;
		this.solde=0;
		this.numeroClient=cptClient++;
	}
public int getNumeroClient() {
	return numeroClient;
}
public void setNumeroClient(int numeroClient) {
	this.numeroClient = numeroClient;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public double getSolde() {
	return solde;
}
public void setSolde(double solde) {
	this.solde = solde;
}
public static int getCptClient() {
	return cptClient;
}
public static void setCptClient(int cptClient) {
	Client.cptClient = cptClient;
}
@Override
public String toString() {
	return "Client [numeroClient=" + numeroClient + ", nom=" + nom + ", solde="
			+ solde + "]";
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Client other = (Client) obj;
	if (nom == null) {
		if (other.nom != null)
			return false;
	} else if (!nom.equals(other.nom))
		return false;
	return true;
}






}
