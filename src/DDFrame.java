import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Random;

import javax.print.DocFlavor.URL;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import fis.RoundedBorder;

public class DDFrame extends JFrame{
	static int i;
	DDFrame(){
		
		//Variable Initialization
		i=-50;
		
		
		//Frame Settings..
		this.setTitle("Oxy Drive");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setSize(500+i,250);
		this.setLayout(null);
		this.setUndecorated(true);
		//this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		GridLayout gridlayout = new GridLayout(0,2);
		//Color xyz = new Color(21, 52, 227, 255);
//		Random random= new Random();
		
		
		
		
		//Data Display Panel
		JPanel panel = new JPanel(){
			 @Override
			    protected void paintComponent(Graphics g) {
			        super.paintComponent(g);
			        Graphics2D g2d = (Graphics2D) g;
			        g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
			        int alpha=128;
			        Color color1 =new Color(40,177,224,255);
			        Color color2 = new Color(14,105,194,200);
			        GradientPaint gp = new GradientPaint(0, 0, color1, 250, 0, color2);
			        g2d.setPaint(gp);
			        g2d.fillRect(0, 0, 500+i, 220);
			    }
		};
		float flow= -0.03f;
		panel.setBounds(10,5,480+i, 40);
		JLabel flowrate=new JLabel("Flowrate");
		flowrate.setForeground(Color.WHITE);
		flowrate.setFont(new Font("lollypop", Font.BOLD, 35));
		JLabel flow_Val=new JLabel();
		flow_Val.setText(String.valueOf(flow));
		flow_Val.setHorizontalAlignment(JLabel.RIGHT);
		flow_Val.setForeground(Color.WHITE);
		flow_Val.setFont(new Font("lollypop", Font.BOLD, 35));
		panel.setLayout(gridlayout);
		//panel.setBackground(xyz);
		panel.add(flowrate);
		panel.add(flow_Val);
		
		JPanel panel2 = new JPanel(){
			 @Override
			    protected void paintComponent(Graphics g) {
			        super.paintComponent(g);
			        Graphics2D g2d = (Graphics2D) g;
			        g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
			        int alpha=128;
			        Color color1 =new Color(40,177,224,255);
			        Color color2 = new Color(14,105,194,200);
			        GradientPaint gp = new GradientPaint(0, 0, color1, 250, 0, color2);
			        g2d.setPaint(gp);
			        g2d.fillRect(0, 0, 500+i, 220);
			    }
		};
		float temp= 30.2f;
		panel2.setBounds(10,50,480+i, 40);
		JLabel temprature=new JLabel("Temp °C");
		temprature.setForeground(Color.WHITE);
		temprature.setFont(new Font("lollypop", Font.BOLD, 35));
		JLabel temp_Val=new JLabel();
		temp_Val.setText(String.valueOf(temp));
		temp_Val.setHorizontalAlignment(JLabel.RIGHT);
		temp_Val.setForeground(Color.WHITE);
		temp_Val.setFont(new Font("lollypop", Font.BOLD, 35));
		panel2.setLayout(gridlayout);
		//panel2.setBackground(xyz);
		panel2.add(temprature);
		panel2.add(temp_Val);
		
		JPanel panel3 = new JPanel(){
			 @Override
			    protected void paintComponent(Graphics g) {
			        super.paintComponent(g);
			        Graphics2D g2d = (Graphics2D) g;
			        g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
			        int alpha=128;
			        Color color1 =new Color(40,177,224,255);
			        Color color2 = new Color(14,105,194,200);
			        GradientPaint gp = new GradientPaint(0, 0, color1, 250, 0, color2);
			        g2d.setPaint(gp);
			        g2d.fillRect(0, 0, 500+i, 220);
			    }
		};
		float press= 942.7f;
		panel3.setBounds(10,95,480+i, 40);
		JLabel pressure=new JLabel("Press-hPa");
		pressure.setForeground(Color.WHITE);
		pressure.setFont(new Font("lollypop", Font.BOLD, 35));
		JLabel press_Val=new JLabel();
		press_Val.setText(String.valueOf(press));
		press_Val.setHorizontalAlignment(JLabel.RIGHT);
		press_Val.setForeground(Color.WHITE);
		press_Val.setFont(new Font("lollypop", Font.BOLD, 35));
		panel3.setLayout(gridlayout);
		//panel.setBackground(xyz);
		panel3.add(pressure);
		panel3.add(press_Val);
		
		JPanel panel4 = new JPanel(){
			 @Override
			    protected void paintComponent(Graphics g) {
			        super.paintComponent(g);
			        Graphics2D g2d = (Graphics2D) g;
			        g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
			        int alpha=128;
			        Color color1 =new Color(40,177,224,255);
			        Color color2 = new Color(14,105,194,200);
			        GradientPaint gp = new GradientPaint(0, 0, color1, 250, 0, color2);
			        g2d.setPaint(gp);
			        g2d.fillRect(0, 0, 500+i, 220);
			    }
		};
		float humid= 54.2f;
		panel4.setBounds(10,140,480+i, 40);
		JLabel humidity=new JLabel("Humidity%");
		humidity.setForeground(Color.WHITE);
		humidity.setFont(new Font("lollypop", Font.BOLD, 35));
		JLabel humid_val=new JLabel();
		humid_val.setText(String.valueOf(humid));
		humid_val.setHorizontalAlignment(JLabel.RIGHT);
		humid_val.setForeground(Color.WHITE);
		humid_val.setFont(new Font("lollypop", Font.BOLD, 35));
		panel4.setLayout(gridlayout);
		//panel.setBackground(xyz);
		panel4.add(humidity);
		panel4.add(humid_val);
	
		JPanel panel5 = new JPanel(){
			 @Override
			    protected void paintComponent(Graphics g) {
			        super.paintComponent(g);
			        Graphics2D g2d = (Graphics2D) g;
			        g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
			        int alpha=128;
			        Color color1 =new Color(40,177,224,255);
			        Color color2 = new Color(14,105,194,200);
			        GradientPaint gp = new GradientPaint(0, 0, color1, 250, 0, color2);
			        g2d.setPaint(gp);
			        g2d.fillRect(0, 0, 500+i, 220);
			    }
		};
		float total= 0.6f;
		panel5.setBounds(10,185,480+i, 35);
		JLabel total_Flow=new JLabel("Total Flow");
		total_Flow.setForeground(Color.WHITE);
		total_Flow.setFont(new Font("lollypop", Font.BOLD, 35));
		JLabel total_Val=new JLabel();
		total_Val.setText(String.valueOf(total));
		total_Val.setHorizontalAlignment(JLabel.RIGHT);
		total_Val.setForeground(Color.WHITE);
		total_Val.setFont(new Font("lollypop", Font.BOLD, 35));
		panel5.setLayout(gridlayout);
		//panel.setBackground(xyz);
		panel5.add(total_Flow);
		panel5.add(total_Val);
		
		 
	      JPanel forButton=new JPanel();
	      //forButton.setBackground(Color.BLACK);
	      forButton.setLayout(null);
	      forButton.setBounds(0,222,500+i,30);
	      this.add(forButton);
	      
	    /*  ImageIcon previous = new ImageIcon("Previous.png");
	      Image img1 = previous.getImage() ;  
	      Image newimg1 = img1.getScaledInstance( 100, 25,  java.awt.Image.SCALE_SMOOTH ) ;  
	      previous = new ImageIcon( newimg1 );
	      
	      ImageIcon next = new ImageIcon("Next.png");
	      Image img2 = next.getImage() ;  
	      Image newimg2 = img2.getScaledInstance( 100, 25,  java.awt.Image.SCALE_SMOOTH ) ;  
	      next = new ImageIcon( newimg2 );*/
	      
	      /*JButton Button1 = new JButton("Clear P.Data");
	      //Button1.setIcon();
	      Button1.setFont(Button1.getFont().deriveFont(20.0f));
	      Button1.setBorder(new RoundedBorder(30));
	      Button1.setFocusable(false);
	      Button1.setHorizontalTextPosition(JButton.LEFT);*/
	      
	      JButton Button2 = new JButton("Bed Details");
	      //Button2.setIcon(previous);
	      Button2.setFont(Button2.getFont().deriveFont(20.0f));
	      Button2.setBorder(new RoundedBorder(30));
	      Button2.setFocusable(false);
	      //Button2.setHorizontalTextPosition(JButton.RIGHT);
	      
	      //Button1.setBounds(250-25,0,250-25,30);
	      Button2.setBounds(225,0,250-25,30);
	      //forButton.add(Button1);
	  	  forButton.add(Button2);
	  	  
	  	  /*Button1.addActionListener(new ActionListener() {
	    	  public void actionPerformed(ActionEvent e) {
	           // Insert code here
	    		  new LoginDemo();
	    		  dispose();
	    	  }
	      });*/
	      Button2.addActionListener(new ActionListener() {
	    	  public void actionPerformed(ActionEvent e) {
	           // Insert code here
	    		  new BedDetails();
	    		  dispose();
	    	  }
	      });
		
		
		//this.add(e);
		this.setBackground(Color.WHITE);
		this.add(panel);
		this.add(panel2);
		this.add(panel3);
		this.add(panel4);
		this.add(panel5);
		this.setVisible(true);
	}
	/*public static void main(String args[])
	{
		new ABC();
	}*/
}
