import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JTextField;


     class PopUpKeyboard extends JDialog implements ActionListener
    {
        private JTextField txt;
     
        public PopUpKeyboard(JTextField txt)
        {	
        	//this.addFocusListener();
        	this.setUndecorated(true);
            this.txt = txt;
            setLayout(new GridLayout(4, 3));
            for(int i = 1; i <= 9; i++) createButton(Integer.toString(i));
            //JButton btn2=new JButton("Back");
            
            
            createButton("Save");
            createButton(Integer.toString(0));
            createButton("Back");
            //add(btn2);
            pack();
        }
        

        private void createButton(String label)
        {
            JButton btn = new JButton(label);
            btn.addActionListener(this);
            btn.setFocusPainted(false);
            btn.setPreferredSize(new Dimension(80, 35));
            Font font = btn.getFont();
            float size = font.getSize() + 5.0f;
            btn.setFont(font.deriveFont(size));
            
            add(btn);
            
        }

        @Override
        public void actionPerformed(ActionEvent e)
        {
        	if (e.getActionCommand()=="Back") 
        		{
        		if (txt.getText().equals("")){
        			dispose();
        			}
        		else {
        			txt.setText(txt.getText().substring(0, txt.getText().length()-1));
        			}
        		 }
        	else
        		if(e.getActionCommand()=="Save") {
        			dispose();
        		}
        		else {
        			String actionCommand = e.getActionCommand();
        			txt.setText(txt.getText() + actionCommand);
        		}
        }
    }
