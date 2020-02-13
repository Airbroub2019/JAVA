
public class Quartier { 

	private int nbBatiments;
	
	public int getNbBatiments() {
		return nbBatiments;
	}

	private Batiment [] TableauBatiment;
	
	public Batiment[] getTableauBatiment() {
		return TableauBatiment;
	}

	public Quartier(int taille) { 
		this.nbBatiments=0;
		TableauBatiment = new Batiment [taille];
	}
	
	public void ajoutBatiment(Batiment B) 
	{
		if (nbBatiments<this.TableauBatiment.length) 
		TableauBatiment[nbBatiments++]=B;
	}
	
	public void afficherBatiments(int cat)
	{
		
		for (int i=0;i<this.nbBatiments;i++)
		{
			if (TableauBatiment[i].categorie()>=cat) 
				System.out.println(TableauBatiment[i].toString());
		}
	}
	public Batiment plusGrandBatiments()
	{
		Batiment plusGrandBatiments=TableauBatiment[0];
		for (int i=1;i<nbBatiments;i++)
		{
			if (plusGrandBatiments.getSurfaceHabitable()<TableauBatiment[i].getSurfaceHabitable()) plusGrandBatiments = TableauBatiment[i];

		}
		return plusGrandBatiments;
	}
}
