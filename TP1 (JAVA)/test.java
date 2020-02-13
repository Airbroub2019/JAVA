
public class test {

	public static void main(String[] args) {
		Voiture V1 = new Voiture("Twingo", 2009, 10000, "AB-123-CD", 'B', true);
		V1.afficherVoiture();
		
		Camion C1 = new Camion("J9", 2008, 20000, "1234-AB-56", 'B', 25);
		C1.afficherCamion();
		
		if (C1.peutTransporterVolume(7)) System.out.println("Le Camion peut transporter ce volume");
		else  System.out.println("Le Camion ne peut PAS transporter ce volume");
		
		System.out.println(V1.coutLocation());
		
		Autocar AU1 = new Autocar("FRI", 2005, 90000, "123-AB-45", 'D', 53, 3);
		AU1.afficherAutocar();
		if (AU1.peutTransporterPassagers(40,0.1f)) System.out.println("L'Autocar PEUT transporter ces passagers");
		else System.out.println("L'Autocar ne PEUT PAS transporter ces passagers");
		
		
		
	}

}
