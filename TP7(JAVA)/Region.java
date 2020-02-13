import java.lang.Comparable;

public class Region implements Comparable<Region>{

	String Nom;
	int POP;
	int PIB;
	int Nbr_Communes;
	int Superficie; 
	
	public Region (String Nom, int POP, int PIB, int Nbr_Communes, int Superficie)
	{
		this.Nom=Nom;
		this.POP=POP;
		this.PIB=PIB;
		this.Nbr_Communes=Nbr_Communes;
		this.Superficie=Superficie;
		
	}

	
	public String toString() {
		return "Region ," + this.Nom + "," + this.POP + "," + this.PIB + "," + this.Nbr_Communes + "," + this.Superficie;
	}

	public int compareTo(Region R2) {
		if(this.Nom.equals(R2.Nom)) return 0 ;
		return this.Nom.compareTo(R2.Nom);
		
	}


	
}
