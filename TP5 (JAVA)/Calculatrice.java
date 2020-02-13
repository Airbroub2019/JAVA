import java.util.Scanner;


public class Calculatrice {

	public double saisieNombre (){
		
		Scanner nombreClavier = new Scanner(System.in);
		double nombre = nombreClavier.nextDouble();
		return nombre;
}
	public double lancementCalcul() throws OperationException {
		
		while (true) {
			try {
				double resultat = this.saisieNombre();
				String resultat2 = this.saisieOperation();
				double resultat3 = this.saisieNombre();
				String [] TableauOperation = {"+","-","*","/"};
				boolean a = false;
				for (int i = 0; i<TableauOperation.length ; i++) 
				if (TableauOperation[i].equals(resultat2)) a=true;
				
				if (a==false)  throw new OperationException(resultat2 + " N'est pas une opération");	
				else {
				if (resultat2.equals("+")) return resultat+resultat3;	
				if (resultat2.equals("-")) return resultat-resultat3;	
				if (resultat2.equals("/")) return resultat/resultat3;	
				if (resultat2.equals("*")) return resultat*resultat3;	
				}
			}
			catch (OperationException oe) {
				System.out.println(oe.getMessage());
			}
			catch (Exception e) { 
				System.out.println("Erreur de saisi");
			} 

		}
	
	}
	public String saisieOperation() {
		Scanner nombreClavier = new Scanner(System.in);
		String operation = nombreClavier.next();
		return operation;
	}
	
}
