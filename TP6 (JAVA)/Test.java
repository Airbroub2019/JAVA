import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
 
public class Test {

	public static void main(String[] args) throws IOException {

		File f = new File("src/d.txt") ;
		ArrayList <Forme> formes= new ArrayList <Forme> ();
        Scanner scnr = new Scanner(f);
        int x1=0; int y1 = 0; int largeur = 0; int longueur = 0; int x2= 0; int y2=0; int rayon = 0;
        while(scnr.hasNext()){
            String line = scnr.next();
            if (line.equals("rectangle"))
            {
            	 x1 = scnr.nextInt();
            	 y1 = scnr.nextInt();
            	 largeur = scnr.nextInt();
            	 longueur = scnr.nextInt();
            	 Rectangle R1 = new Rectangle (x1,y1,largeur,longueur);
            	 formes.add(R1);
            }
            else if (line.equals("cercle"))
            {
            	 x2 = scnr.nextInt();
            	 y2 = scnr.nextInt();
            	 rayon = scnr.nextInt();
            	 Cercle C1 = new Cercle (x1,y1,rayon);
            	 formes.add(C1);

            }
           
        }
         for (int i=0 ; i<formes.size(); i++)
            {
            	System.out.println(formes.get(i).toString());
            }
         
         	FileWriter out = new FileWriter("src/d.txt");
         	out.append("test");
         	out.flush();
         	out.close();
         	
	}

}
