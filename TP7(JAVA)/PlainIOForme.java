import java.io.File;
import java.io.FileWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class PlainIOForme {

	public static void main(String[] args) throws IOException {
		File f = new File("regions.csv") ;
		ArrayList <Region> regions= new ArrayList <Region> ();
        Scanner scnr = new Scanner(f);
        while(scnr.hasNext()){
            String line = scnr.nextLine();
            String[] lignes = line.split(",");
            if (lignes[0].equals("Region"))
            {
            	 Region R = new Region(lignes[1],Integer.parseInt(lignes[2]),Integer.parseInt(lignes[3]),Integer.parseInt(lignes[4]),Integer.parseInt(lignes[5]));
            	 regions.add(R);
            }

            }
        scnr.close();
        Collections.sort(regions,new SortByPIBHbt());
        for (int i=0 ; i<regions.size(); i++)
        {
        	System.out.println(regions.get(i).toString());
        }
        
        FileWriter out = new FileWriter("regionstri.csv");
        for (int i=0 ; i<regions.size(); i++)
        {
         	out.append(regions.get(i).toString());
        }
     	
     	out.flush();
     	out.close();
  }  
        
        
}
        
	

