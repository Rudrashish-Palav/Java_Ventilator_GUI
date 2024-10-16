import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import fis.RoundedBorder;


public class Test1 extends JFrame {
	static int i;
	Test1(){
		i=-50;
		this.setTitle("Oxy Drive");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setSize(500+i,250);
		this.setLayout(null);
		this.setUndecorated(true);
		//this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		
		JPanel forLabel=new JPanel() {
			 @Override
			    protected void paintComponent(Graphics g) {
			        super.paintComponent(g);
			        Graphics2D g2d = (Graphics2D) g;
			        g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
			        int alpha=128;
			        Color color1 =new Color(40,177,224,255);
			        Color color2 = new Color(14,105,194,200);
			        GradientPaint gp = new GradientPaint(0, 0, color1, 500, 0, color2);
			        g2d.setPaint(gp);
			        g2d.fillRect(0, 0, 500+i, 220);
			    }
		};
		forLabel.setLayout(null);
    	forLabel.setBounds(0,0,500+i,220);
    	
    	//forLabel.setBackground(Color.GRAY);
    	
    	//Element 1 for forlabel Panel
    	JLabel label1=new JLabel("Output File");
    	label1.setBounds(10, 50, 150,30);
    	label1.setFont(new Font("SANS_SERIF", Font.BOLD, 25));
    	label1.setForeground(Color.WHITE);
    	JButton buttonx = new JButton("Select");
    	buttonx.setBounds(330,50,100,30);
    	JTextField tf1 = new JTextField();
    	tf1.setBounds(170,50,150,30);
    	buttonx.addActionListener(new ActionListener() {
	    	  public void actionPerformed(ActionEvent e) {
	                // Insert code here
	    		  JFileChooser fileChooser =new JFileChooser();
	    		  int response = fileChooser.showOpenDialog(null);
	    		  if(response == JFileChooser.APPROVE_OPTION) {
	    			  File file =new File(fileChooser.getSelectedFile().getAbsolutePath());
	    		   	  System.out.println(file.getName());
	    		   	  tf1.setText(file.getName());
	    		  }
	            }
	      });
    	
    	forLabel.add(label1);
    	forLabel.add(tf1);
    	forLabel.add(buttonx);
    	
    	
    	
    	
    	//JFileChooser fc=new JFileChooser();
    	//https://www.codejava.net/java-se/swing/file-picker-component-in-swing
    	 
    	//link for adding filechooser actionperformed etc
    	
    	
    	
    	//element 2
    	JLabel label2=new JLabel("Erase Data");
    	label2.setBounds(10, 150, 150, 30);
    	label2.setFont(new Font("SANS_SERIF", Font.BOLD, 25));
    	label2.setForeground(Color.WHITE);
    	JButton buttony = new JButton("Select");
    	buttony.setBounds(330,150,100,30);
    	JTextField tf2 = new JTextField();
    	tf2.setBounds(170,150,150,30);
    	buttony.addActionListener(new ActionListener() {
	    	  public void actionPerformed(ActionEvent e) {
	                // Insert code here
	    		  JFileChooser fileChooser =new JFileChooser();
	    		  int response = fileChooser.showOpenDialog(null);
	    		  if(response == JFileChooser.APPROVE_OPTION) {
	    			  File file =new File(fileChooser.getSelectedFile().getAbsolutePath());
	    		   	  System.out.println(file.getName());
	    		   	  tf2.setText(file.getName());
	    		  }
	            }
	      });
    	forLabel.add(label2);
    	forLabel.add(buttony);
    	forLabel.add(tf2);
    	
    	
    	//Element 3
    	/*JLabel label3=new JLabel("* Password");
    	label3.setBounds(10, 150, 120, 20);
    	label3.setFont(new Font("Calibri", Font.BOLD, 18));
    	label3.setForeground(Color.RED);
    	JButton buttonz = new JButton();
    	buttonz.setBounds(242,150,50,20);
    	JTextField tf3 = new JTextField();
    	tf3.setBounds(140,150,100,20);
    	forLabel.add(label3);
    	forLabel.add(buttonz);
    	forLabel.add(tf3);*/
    	
    	
    	 /*ImageIcon previous = new ImageIcon("Previous.png");
	      Image img1 = previous.getImage() ;  
	      Image newimg1 = img1.getScaledInstance( 100, 25,  java.awt.Image.SCALE_SMOOTH ) ;  
	      previous = new ImageIcon( newimg1 );*/
    	
    	JPanel forButton=new JPanel();
    	forButton.setLayout(null);
    	forButton.setBounds(0,220,500+i,30);
    	JButton button1 = new JButton("Previous");
    	//button1.setIcon(previous);
	    button1.setFont(button1.getFont().deriveFont(20.0f));
	    button1.setBorder(new RoundedBorder(30));
	    button1.setFocusable(false);
    	button1.setBounds(125-25,0,250-25,30);
    	//button1.addActionListener(e -> new FrameTable());
    	 button1.addActionListener(new ActionListener() {
	    	  public void actionPerformed(ActionEvent e) {
	           // Insert code here
	    		 // new FrameTable();
	    		  new DDFrame();
	    		  dispose();
	    	  }
	      });
    	forButton.add(button1);
    	
    	
	
    	
    	this.setVisible(true);
    	this.add(forLabel);
    	this.add(forButton);
	}
	
	
}