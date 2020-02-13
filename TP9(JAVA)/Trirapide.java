
public class Trirapide extends Thread{

		int Tableau[] = new int [3];
		int premier;
		int dernier;
		
		public Trirapide (int T[])
		{
			this.Tableau = T;
		}

		public int partitionner(int T[], int premier, int dernier)
		{
			int j = premier;

	        for(int i=premier;i<dernier-1;i++)
	            {
	            if (T[i]<=T[dernier])
	                {
	                int tmp = T[i];
	                T[i] = T[j];
	                T[j]=tmp;
	            	j++;
	                
	                }
	            }
            int tmp = T[dernier];
            T[dernier] = T[j];
            T[j]=tmp;
	        return(j);
		}
		
		public void tri_rapide(int tableau[],int premier,int dernier)
        {
        if(premier<dernier)
            {
            int pivot=partitionner(tableau,premier,dernier);
            tri_rapide(tableau,premier,pivot-1);
            tri_rapide(tableau,pivot+1,dernier);
            }
        }
		
		public void run () {
			
			int pivot=this.partitionner(this.Tableau,0,this.Tableau.length);
			int Tab1 = new int [pivot-1];
			Trirapide T1 = new Trirapide(this.Tableau,0,pivot-1);
            tri_rapide(this.Tableau,pivot+1,this.Tableau.length);
		}
		
}
