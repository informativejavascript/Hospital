import java.awt.Component;

import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;


class checkboxrender extends JCheckBox implements TableCellRenderer {

	checkboxrender() {
	    setHorizontalAlignment(JLabel.CENTER);
	  }

	@Override
	public Component getTableCellRendererComponent(JTable table, Object value,
		      boolean isSelected, boolean hasFocus, int row, int column) {
		    if (isSelected) {
		    	setSelected(Boolean.TRUE);
		    } else {
		    	setSelected(Boolean.FALSE);
		    }
		    return this;
		  }
}