import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class CaseMorpion implements ActionListener{
	final JButton boutton;
	Game jeu;
	int x;
	int y;

	public CaseMorpion (int x , int y , Game jeu)
	{
		this.x=x;
		this.y=y;
		this.jeu=jeu;
		this.boutton = new JButton(); 
		  this.boutton.addActionListener(this);
		  
	}

	public void actionPerformed(ActionEvent arg0) {
		jeu.jouer(x,y);
		if (jeu.tour==1) boutton.setText("O");
		else boutton.setText("1");
		boutton.setEnabled(false);
	}
}
