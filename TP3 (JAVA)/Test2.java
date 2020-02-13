
public class Test2 {


	public static void main(String[] args) {
		Client C1 = new Client("Abdellah");
		Client C2 = new Client("Abdellah");
		Annuaire A = new Annuaire();
		
		A.AjoutClient(C1);
		if (A.contient(C2)) System.out.println("contient");
		else System.out.println("Ne contient pas");

	}

}
