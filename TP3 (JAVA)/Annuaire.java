import java.util.ArrayList;


public class Annuaire {

	ArrayList<Client> ListeClients;
	public Annuaire ()
	{
		ListeClients = new ArrayList<>(); 
	}
	public void AjoutClient (Client C)
	{
		ListeClients.add(C);
	}
	
	public void Affiche ()
	{
		for (int i=0; i<ListeClients.size(); i++){
			System.out.println(ListeClients.get(i).toString());
		}
	}
	
	public void RerchercheClient (int id)
	{
		for (int i=0; i<ListeClients.size(); i++){
			if(ListeClients.get(i).getNumeroClient()==id) 
				 System.out.println(ListeClients.get(i).toString());
		}
	}
	public void SupprimerClient(int id)
	{
		for (int i=0; i<ListeClients.size(); i++){
			if(ListeClients.get(i).getNumeroClient()==id) 
				 ListeClients.remove(ListeClients.get(i));
		}
	}

	public void CrediterSoldeClient(double somme, int id)
	{
	for (int i=0; i<ListeClients.size(); i++){
		if(ListeClients.get(i).getNumeroClient()==id) 
			 ListeClients.get(i).setSolde(somme + ListeClients.get(i).getSolde());
	}
	}
	public double TotalSolde()
	{
		double total=0;
		for (int i=0; i<ListeClients.size(); i++) {
			total+=ListeClients.get(i).getSolde();
		}
		return total;
	}
	
	public boolean contient(Client C)
	{
		for (int i=0; i<ListeClients.size(); i++) {
			if(ListeClients.get(i).equals(C)) return true;
		}
		return false;
	}
}
