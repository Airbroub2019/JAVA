import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class SortByPIBHbt implements Comparator<Region>  {

	public int compare(Region R1, Region R2) {
		if(R1.PIB == R2.PIB) {
			return R1.POP - R2.POP;
			
		}
		if( R1.PIB - R2.PIB > 0) return 1;
		return -1 ;
	}
	
	public void tri (List<Region> liste)
	{
		Collections.sort(liste);
		
	}

}
