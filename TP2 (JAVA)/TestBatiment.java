
public class TestBatiment {

	public int surfaceHabitableTotale(Maison[] tabMaison)
	{
		int surfaceHabitableTotale=0;
		for (int i=0; i<tabMaison.length; i++)
		{
			surfaceHabitableTotale+= tabMaison[i].getSurfaceHabitable();
		}
		return surfaceHabitableTotale;
		
	}
	public int surfaceJardinTotale(Maison[] tabMaison)
	{
		int surfaceJardinTotale=0;
		for (int i=0; i<tabMaison.length; i++)
		{
			surfaceJardinTotale+= tabMaison[i].getSurfaceJardin();
		}
		return surfaceJardinTotale;
		
	}
		
	public static void main(String [] args)
	{
		Batiment B1 = new Batiment("Angers",45);
		Maison M1 = new Maison("Paris",90,30,2);
		Immeuble I1 = new Immeuble("Lyon",600,5);
		/*System.out.println(B1.toString());
		System.out.println(M1.toString());
		System.out.println(I1.toString());*/
		
		Batiment [] TableauBatiments = new Batiment[3];
		TableauBatiments[0] = B1;
		TableauBatiments[1] = M1;
		TableauBatiments[2] = I1;
		
		/*for (int i=0; i<TableauBatiments.length; i++)
		{
			System.out.println(TableauBatiments[i].toString());
		}*/
		
		Quartier Q1 = new Quartier(10);
		Q1.ajoutBatiment(B1);
		Q1.ajoutBatiment(I1);
		for (int i=0; i<Q1.getNbBatiments(); i++)
		{
		//	System.out.println(Q1.getTableauBatiment()[i].toString());
		}
		
		/*System.out.println(B1.categorie());
		Batiment Test = B1.compareTo(M1);
		System.out.println(Test.toString());*/
		System.out.println(Q1.plusGrandBatiments());
		Q1.afficherBatiments(3);


	}
}
