import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
  
public class hello{
  
    public static void main(String[] args)
    {	
    	JLabel label =new JLabel();
    	
    	ImageIcon image = new ImageIcon("OXYGEN.png");
    	label.setIcon(image);
//    	label.setVerticalAlignment(JLabel.TOP);
//    	label.setHorizontalAlignment(JLabel.CENTER);
//    	label.setBounds(55, 0, 200, 180);
    	
    	
    	
//    	JButton button= new JButton();
//    	button.setBounds(0, 181, 320, 50);
    	
    	
        JFrame f=new JFrame();
        f.setTitle("Oxy Drive");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setResizable(false);
        f.setSize(320,240);
//        f.setLayout(null);
        f.setVisible(true);
        f.add(label);
//        f.add(button);
//        ImageIcon image = new ImageIcon("/logo.jpg");
//        f.setIconImage(image.getImage());
    }


}