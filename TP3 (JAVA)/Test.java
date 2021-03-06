
public class Test {

	public static void main(String[] args) {
	
		Annuaire annuaire = new Annuaire();	
		
		
		int rep =0; 
		while(rep!=-1){              
			System.out.println("1 ===>  Ajouter un nouveau client"); 
			System.out.println("2 ===>  Afficher la taille de l'annuaire"); 
			System.out.println("3 ===>  Afficher l'annuaire complet"); 
			System.out.println("4 ===>  Rechercher un client par son identifiant"); 
			System.out.println("5 ===>  Supprimer un client par son identifiant"); 
			System.out.println("6 ===>  Crediter le solde d'un client"); 
			System.out.println("7 ===>  Afficher le total des soldes des clients de l'annuaire"); 
			System.out.println("-1 ===>  Quitter"); 
			rep = Saisie.lireEntier("Votre choix ?"); 
			
			if(rep == 1){    
				String nomSaisie="";
				nomSaisie = Saisie.lireString(nomSaisie);
				Client C1 = new Client(nomSaisie);
				annuaire.AjoutClient(C1);
				
			} else if (rep ==2){ 
				
				System.out.println("Taille de L'annuaire : " + annuaire.ListeClients.size());
	
			} else if (rep ==3){ 
				
				annuaire.Affiche();
				
			} else if (rep ==4){ 
				
				int identifiant=0; String saisieid="";
				identifiant = Saisie.lireEntier(saisieid);
				annuaire.RerchercheClient(identifiant);
				
			} else if (rep ==5){ 
				
				int identifiant=0; String saisieid="";
				identifiant = Saisie.lireEntier(saisieid);
				annuaire.SupprimerClient(identifiant);
				
			} else if (rep ==6){ 
				
				 double somme=0; String saisieid=""; int identifiant=0;
				somme = Saisie.lireReel(saisieid);
				identifiant = Saisie.lireEntier(saisieid);
				annuaire.CrediterSoldeClient(somme, identifiant);
				
			} else if (rep ==7){ 
				double total = annuaire.TotalSolde();
				System.out.println(total);
				
			}
		}
		
		
	}
}
