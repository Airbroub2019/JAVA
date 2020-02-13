
public class Game {
	int [][] grille = new int[3][3];
	int tour = 1;

	public void jouer (int x , int y)
	{
			grille[x][y] = tour;
			boolean partienulle=true;
			boolean gagne=false;
			 for (int i = 0;i < grille.length; i++) {
        	if (grille[i][0] == tour && grille[i][1]==tour && grille[i][2]==tour ) {
        		System.out.println("le joueur " + tour + " à gagner");
        		gagne=true;
        	}
			 }
        	 for (int j = 0;j < grille.length; j++) {
             	if (grille[0][j] == tour && grille[1][j]==tour && grille[2][j]==tour ) {
            		System.out.println("le joueur " + tour + " à gagner");
            		gagne=true;
             	}
			
			 }
        	 if (grille[0][0] == tour && grille[1][1] == tour && grille[2][2] == tour)
        	 {
        		 System.out.println("le joueur " + tour + " à gagner");
        		 gagne=true;
        	 }
        	 if (grille[0][2] == tour && grille[1][1] == tour && grille[2][0] == tour)
        	 {
        		 System.out.println("le joueur " + tour + " à gagner");
        		 gagne=true;
        	 }
        	 else {
        		 for (int i = 0;i < grille.length; i++) {
        	         for (int j = 0;j < grille[i].length;j++) {
        	        	 	if (grille[i][j]==0) partienulle=false;
        	         }
        		 }
        		 if (partienulle==true && gagne==false) System.out.println("partie nulle!!");
        	 }
        	 if (tour == 1) tour = 2;
 			else tour = 1;
		
	}
	
	public void test ()
	{
		 for (int i = 0;i < grille.length; i++) {
	         for (int j = 0;j < grille[i].length;j++) {
	        	 	System.out.print(grille[i][j]);
	         }
	         	System.out.println();
		 }
	}
	public void initialise ()
	{
		 for (int i = 0;i < grille.length; i++) {
	         for (int j = 0;j < grille[i].length;j++) {
	        	 	grille[i][j]=0;
	         }
		 }
	}

}
