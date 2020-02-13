
public class Tonneau extends Thread{
	String nom;
	double volumeInitial;
	double debit;
	final double volumeMaximum = 12;
	Tonneau deverse;
	
	public synchronized double ajoutVolume(double V)
	{
		this.volumeInitial+=V;
		//System.out.println("Nom : " + this.nom);
		//System.out.println("C'est un Ajout!");
		if (this.volumeInitial>=this.volumeMaximum)
			{
			this.volumeInitial=this.volumeMaximum;
		//	System.out.println("Le tonneau est débordé!!!");
			}
		//System.out.println("Volume : " + this.volumeInitial);
		
		return this.volumeInitial;
		
	}

	public synchronized double retireVolume(double V)
		{
			this.volumeInitial-=V;
		//	System.out.println("Nom : " + this.nom);
		//	System.out.println("C'est retire!");
			if (this.volumeInitial<0)
				{
				this.volumeInitial=0;
		//		System.out.println("Le volume du tonneau est infiérieure au volume donné!!");
				}
		//	System.out.println("Volume : " + this.volumeInitial);
			
			return this.volumeInitial;
			
		}
	
	public void run ()
	{
		
		while(this.volumeInitial!=0)
		{
		this.retireVolume(this.debit);
		if (this.deverse!=null) 
			deverse.ajoutVolume(this.debit);
		System.out.print("Nom : " + this.deverse.nom + " ");
		System.out.println("Volume : " + this.deverse.volumeInitial);
		}
		try {
			sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public Tonneau (String nom, double volumeInitial, double debit, Tonneau deverse)
	{
		this.nom = nom;
		this.volumeInitial = volumeInitial;
		this.debit = debit;
		this.deverse = deverse;
	}
	
}
