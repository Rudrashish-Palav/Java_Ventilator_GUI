import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import fis.RoundedBorder;


public class Test3 extends JFrame implements ActionListener {

    JPanel panel;
    JLabel user_label, password_label, message;
    JTextField userName_text;
    JPasswordField password_text;
    JButton submit, cancel;
    PopUpKeyboard keyboard;
    Test3() {
        
    	this.setTitle("Oxy Drive");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setSize(500,250);
		this.setLayout(null);
		this.setUndecorated(true);
		//this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		
		 JPanel panel = new JPanel(){
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
			        g2d.fillRect(0, 0, 500, 220);
			    }
		};
	     panel.setLayout(null);
	     panel.setBounds(0,0,500,250);
		
        // User Label
       /* user_label = new JLabel("Username :");
        user_label.setBounds(40, 50, 150, 30);
    	user_label.setFont(new Font("SANS_SERIF", Font.BOLD, 25));
    	user_label.setForeground(Color.WHITE);
        userName_text = new JTextField();
        userName_text.setBounds(200,50,150,30);*/
        //image
	     ImageIcon icon = new ImageIcon("login1.png");
	      Image img = icon.getImage() ;  
	      Image newimg = img.getScaledInstance( 150, 100,  java.awt.Image.SCALE_SMOOTH ) ;  
	      icon = new ImageIcon( newimg );
	     JLabel image = new JLabel();
	     image.setIcon(icon);
	     image.setBounds(175,10,250,120);
	     
        // Password

        password_label = new JLabel("Password :");
        password_label.setBounds(40, 150, 150, 30);
        password_label.setFont(new Font("SANS_SERIF", Font.BOLD, 25));
        password_label.setForeground(Color.WHITE);
        password_text = new JPasswordField();
        keyboard = new PopUpKeyboard(password_text);
        password_text.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                Point p = password_text.getLocationOnScreen();
                p.y -= 140;
                keyboard.setLocation(p);
                keyboard.setVisible(true);
            }
        });
        password_text.setBounds(200,150,250,30);

        // Submit

        submit = new JButton("SUBMIT");
        submit.setBounds(250, 220,250,30);
        submit.setFont(submit.getFont().deriveFont(20.0f));
        submit.setBorder(new RoundedBorder(30));
	    submit.setFocusable(false);
        cancel =new JButton("CANCEL");
        cancel.setFont(cancel.getFont().deriveFont(20.0f));
        cancel.setBounds(00, 220,250,30);
        cancel.setBorder(new RoundedBorder(30));
	    cancel.setFocusable(false);
        //cancel.addActionListener(e -> new FrameTable());
        cancel.addActionListener(new ActionListener() {
	    	  public void actionPerformed(ActionEvent e) {
	           // Insert code here
	    		  //new FrameTable();
	    		  new DDFrame();
	    		  dispose();
	    	  }
	      });
    	
        
       //panel.add(user_label);
       //panel.add(userName_text);
        panel.add(image);
        panel.add(password_label);
        panel.add(password_text);

        message = new JLabel();
        message.setBounds(150, 190, 200, 30);
        message.setFont(new Font("SANS_SERIF", Font.BOLD, 25));
        message.setForeground(Color.RED);
        panel.add(message);
        panel.add(submit);
        panel.add(cancel);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Adding the listeners to components..
        submit.addActionListener(this);
        add(panel);
        setTitle("Oxy Drive");
        setSize(500, 250);
        setVisible(true);

    }


      


    @Override
    public void actionPerformed(ActionEvent ae) {
       // String userName = userName_text.getText();
        String password = password_text.getText();
        if (password.trim().equals("12345")) {
            message.setText(" Hello ");
            new Test1();
            dispose();
            
        } else {
            message.setText(" Invalid user.. ");
        }

    }
  
 // public static void main(String args[]) {
	  //new Test3();
   
  //}
}