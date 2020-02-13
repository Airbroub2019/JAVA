import java.util.Comparator;


public class SortByDensity implements Comparator<Region>  {

	public int compare(Region R1, Region R2) {
		if((R1.POP/R1.Superficie) == (R2.POP/R2.Superficie)) return 0 ;
		return (R1.POP/R1.Superficie) - (R2.POP/R2.Superficie);
	}

}
