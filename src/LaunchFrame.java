import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
  
public class LaunchFrame  extends JFrame {
	static int i;
	public LaunchFrame(){
		i=-50;
		this.setTitle("Oxy Drive");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setSize(500+i,250);
		this.setLayout(null);
		//this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		 ImageIcon icon = new ImageIcon("Oxy.jpeg");
	      Image img = icon.getImage() ;  
	      Image newimg = img.getScaledInstance( 450, 250,  java.awt.Image.SCALE_SMOOTH ) ;  
	      icon = new ImageIcon( newimg );
		  /* First Frame***/
		  //Launch label code
		  JLabel launchlabel =new JLabel();
		  //ImageIcon image = new ImageIcon("Oxy.jpeg");
		  launchlabel.setIcon(icon);
		  launchlabel.setBounds(0,0,500+i,250);
		  //Start FRame
		 
		  this.setBounds(0, 0, 500+i, 250);
		  this.setUndecorated(true);
		  this.setVisible(true);
		  this.add(launchlabel);
		  //myframe.setExtendedState(JFrame.MAXIMIZED_BOTH);

	}
}