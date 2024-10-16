//Home
//Java by API
//com.sun.image.codec.jpeg
//java.applet
//java.awt
//java.awt.datatransfer
//java.awt.dnd
//java.awt.event
//java.awt.font
//java.awt.geom
//java.awt.im.spi
//java.awt.image
//java.awt.print
//java.beans
//java.beans.beancontext
//java.io
//java.lang
//java.lang.annotation
//java.lang.instrument
//java.lang.management
//java.lang.ref
//java.lang.reflect
//java.math
//java.net
//java.nio
//java.nio.channels
//java.nio.charset
//java.rmi.dgc
//java.rmi.server
//java.security
//java.security.cert
//java.security.spec
//java.sql
//java.text
//java.text.spi
//java.util
//java.util.concurrent
//java.util.concurrent.atomic
//java.util.concurrent.locks
//java.util.jar
//java.util.logging
//java.util.prefs
//java.util.regex
//java.util.spi
//java.util.zip
//javax.accessibility
//javax.activation
//javax.annotation.security
//javax.comm
//javax.crypto
//javax.crypto.spec
//javax.ejb
//javax.imageio
//javax.imageio.event
//javax.jws
//javax.mail
//javax.mail.internet
//javax.media.jai
//javax.microedition.io
//javax.microedition.lcdui
//javax.microedition.media
//javax.microedition.media.control
//javax.microedition.midlet
//javax.microedition.pim
//javax.microedition.rms
//javax.naming
//javax.naming.directory
//javax.naming.event
//javax.naming.ldap
//javax.naming.spi
//javax.net
//javax.net.ssl
//javax.persistence
//javax.print
//javax.print.attribute
//javax.print.attribute.standard
//javax.print.event
//javax.script
//javax.servlet
//javax.servlet.http
//javax.sound.midi
//javax.sound.sampled
//javax.sql
//javax.sql.rowset
//javax.swing
//javax.swing.border
//javax.swing.colorchooser
//javax.swing.event
//javax.swing.filechooser
//javax.swing.plaf.basic
//javax.swing.plaf.metal
//javax.swing.plaf.synth
//javax.swing.table
//javax.swing.text
//javax.swing.text.html
//javax.swing.text.html.parser
//javax.swing.text.rtf
//javax.swing.tree
//javax.swing.undo
//javax.tools
//javax.transaction
//javax.xml
//javax.xml.bind
//javax.xml.bind.annotation
//javax.xml.crypto.dsig
//javax.xml.crypto.dsig.keyinfo
//javax.xml.namespace
//javax.xml.parsers
//javax.xml.soap
//javax.xml.stream
//javax.xml.stream.events
//javax.xml.transform
//javax.xml.transform.dom
//javax.xml.transform.stream
//javax.xml.validation
//javax.xml.ws
//javax.xml.xpath
//junit.extensions
//junit.framework
//junit.textui
//org.apache.commons.lang
//org.apache.commons.lang.builder
//org.apache.commons.lang.exception
//org.apache.commons.lang.time
//org.apache.commons.logging
//org.apache.commons.math
//org.eclipse.jface.action
//org.eclipse.jface.dialogs
//org.eclipse.jface.operation
//org.eclipse.jface.viewers
//org.eclipse.jface.window
//org.eclipse.jface.wizard
//org.eclipse.swt
//org.eclipse.swt.browser
//org.eclipse.swt.custom
//org.eclipse.swt.dnd
//org.eclipse.swt.events
//org.eclipse.swt.graphics
//org.eclipse.swt.layout
//org.eclipse.swt.ole.win32
//org.eclipse.swt.printing
//org.eclipse.swt.program
//org.eclipse.swt.widgets
//org.junit
//org.w3c.dom
//org.xml.sax
//org.xml.sax.helpers
//sun.audio
//
//JTable with Row Header 1 : Row Header « javax.swing.table « Java by API

 



//
//Java by APIjavax.swing.tableRow Header
//JTable with Row Header 1

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JViewport;
import javax.swing.ScrollPaneConstants;
import javax.swing.Timer;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;
import java.math.*;
import java.util.Random;
public class Tablerow extends JFrame {

  public Tablerow() {
    super("Oxy Drive");
    setSize(320, 240);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setResizable(false);
    TableModel tm = new AbstractTableModel(){
      String data[] = { "", "" };

      String headers[] = { "Parameters", "Values" };

      public int getColumnCount() {
        return data.length;
      }

      public int getRowCount() {
        return 5;
      }

      public String getColumnName(int col) {
        return headers[col];
      }

      public Object getValueAt(int row, int col) {
    	  int max = 1000;
    	  int min = 1;
    	  // create instance of Random class
    	  Random randomNum = new Random();
    	  int showMe = min + randomNum.nextInt(max);
    	if(row==0 && col==0) {
    		return "Flow Rate";
    	}
    	else if(row==0 && col==1) {
    		return showMe;
    	}
    	else if(row==1 && col==0) {
    		return "Pressure";
    	}
    	else if(row==1 && col==1) {
    		return showMe;
    	}
    	else if(row==2 && col==0) {
    		return "Humidity";
    	}
    	else if(row==2 && col==1) {
    		return showMe;
    	}
    	else if(row==3 && col==0) {
    		return "Temperature";
    	}
    	else if(row==3 && col==1) {
    		return showMe;
    	}
    	else if(row==4 && col==0) {
    		return "Total Consumption";
    	}
    	else if(row==4 && col==1) {
    		return showMe;
    	}
    	else {
    		return data[col] + row;
    	}

        
      }
    };

    TableColumnModel cm = new DefaultTableColumnModel(){
      boolean first = true;

      public void addColumn(TableColumn tc) {
        if (first) {
          first = false;
          return;
        }
        tc.setMinWidth(158);
        
        super.addColumn(tc);
      }
    };

    TableColumnModel rowHeaderModel = new DefaultTableColumnModel() {
      boolean first = true;

      public void addColumn(TableColumn tc) {
        if (first) {
//          tc.setMaxWidth(tc.getPreferredWidth());
          tc.setMaxWidth(158);
          
          super.addColumn(tc);
          first = false;
        }
      }
    };

    JTable jt = new JTable(tm, cm);
//    jt.setRowHeight(jt.getRowHeight() + 20);
    
    
    JTable headerColumn = new JTable(tm, rowHeaderModel);
    jt.createDefaultColumnsFromModel();
    headerColumn.createDefaultColumnsFromModel();
    
    jt.setSelectionModel(headerColumn.getSelectionModel());

    headerColumn.setBackground(Color.lightGray);
    headerColumn.setColumnSelectionAllowed(false);
    headerColumn.setCellSelectionEnabled(false);
    
    JViewport jv = new JViewport();
    jv.setView(headerColumn);
    jv.setPreferredSize(headerColumn.getMaximumSize());
    jt.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
    
    JScrollPane jsp = new JScrollPane(jt);
    jsp.setRowHeader(jv);
    jsp.setCorner(ScrollPaneConstants.UPPER_LEFT_CORNER, headerColumn.getTableHeader());
    getContentPane().add(jsp, BorderLayout.CENTER);
    
   
  }

  public static void main(String args[]) throws Exception{
	 
	  JLabel ll =new JLabel();
	  ImageIcon image = new ImageIcon("OXYGEN.png");
	  ll.setIcon(image);
	  MyFrame myframe=new MyFrame();
	  myframe.add(ll);
	 
	  ActionListener taskPerformer = new ActionListener() {
          
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
//			JLabel ll =new JLabel();
//			ImageIcon image = new ImageIcon("OXYGEN.png");
//			ll.setIcon(image);
//			MyFrame myframe=new MyFrame();
//			myframe.add(ll);
			
			System.out.println("Reading SMTP Info.");
			
		}
      };
      Timer timer = new Timer(1000 ,taskPerformer);
      timer.setRepeats(false);
      timer.start();
      Thread.sleep(4000);
//   new Tablerow().setVisible(true);
     myframe.dispose();
     Tablerow t=new Tablerow();
     t.setUndecorated(true);
     t.setVisible(true);
      
      
  }
}

           
       





 
