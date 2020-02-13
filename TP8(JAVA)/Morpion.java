import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;


public class Morpion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Game g1 = new Game();
	    final JFrame jf = new JFrame();
	    jf.setSize(400,100);
	    jf.setLayout(new GridLayout(3, 3));
		    jf.add(jf, new CaseMorpion(0, 1, g1));
		    jf.setVisible(true);


	}
	
}
