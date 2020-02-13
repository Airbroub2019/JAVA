import java.io.File;
import java.nio.file.Files;


public class Exo1Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		File f = new File("src") ;
		// Scanner sc = new Scanner(f); }
		if (!f.exists()) System.out.println("Le fichier entré en parametre n'existe pas");
		else {
		if (f.isDirectory()) {  
		String[] list = f.list();
	      for (int i = 0; i < list.length; i++) {
	        File  r = new File(f.getPath() + "/"+ list[i]);
	        System.out.println(":" + list[i] + ": " + r.length());
	      }      
	}
		else {
	    	  System.out.println("taille du fichier : " + f.length() + " Et son chemin absolu"
	    			  	+ f.getAbsolutePath());
	        }
		}

}

}