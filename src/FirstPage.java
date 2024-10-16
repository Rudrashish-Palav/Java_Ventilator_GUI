import java.awt.Frame;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

class FirstPage{
	public static void main(String[] args) {
		JLabel ll =new JLabel();
		ImageIcon image = new ImageIcon("OXYGEN.png");
		ll.setIcon(image);
		
		Frame myframe=new Frame();
		myframe.add(ll);
	}
}