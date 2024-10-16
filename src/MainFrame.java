import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;

public class MainFrame {
	
	
  public static void main(String args[]) throws Exception{
	  
	  /* First Frame**
	  //Launch label code
	  JLabel launchlabel =new JLabel();
	  ImageIcon image = new ImageIcon("Oxy.jpeg");
	  launchlabel.setIcon(image);
	  launchlabel.setBounds(0,0,500,250);
	  //Start FRame
	  LaunchFrame myframe=new LaunchFrame();
	  myframe.setBounds(0, 0, 500, 250);
	  myframe.setUndecorated(true);
	  myframe.setVisible(true);
	  myframe.add(launchlabel);
	  //myframe.setExtendedState(JFrame.MAXIMIZED_BOTH);*/
	  LaunchFrame launchobj=new LaunchFrame();
	  
	  
	  //Flash Timer
	  ActionListener taskPerformer = new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
    	  System.out.println("Reading SMTP Info.");
    	  
		}
      };
      Timer timer = new Timer(1000 ,taskPerformer);
      timer.setRepeats(false);
      timer.start();
      Thread.sleep(4000);
      
      
      
      /* Second Frame***/
      new DDFrame();
       //disposing previous frame
      //FrameTable f=new FrameTable();
      
      launchobj.dispose();
      
      
     
      
  }
}

           
       





 
