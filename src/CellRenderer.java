import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class CellRenderer extends DefaultTableCellRenderer{
	private static final long serialVersionUID = 1L;

	@Override
	public CellRenderer getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row,
	        int column){
	    super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
	    	//this.setValue(table.getValueAt(row, column));
	        this.setFont(new Font("Calibri", Font.BOLD, 20));
	        /*Color color1 =new Color(40,177,224,255);
	        Color color2 = new Color(14,105,194,200);
	        Color xyz = new GradientPaint(0, 0, color1, 500, 0, color2);
	        this.setBackground(xyz);*/
	        //this.setForeground(Color.WHITE);
	       //this.setOpaque(false);
	    
	    return this;
	}
	
	
}
