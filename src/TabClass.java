import hospital.person.Assitant;
import hospital.person.Doctor;
import hospital.person.Receptionist;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class TabClass extends JFrame {

	private DataClass dc;
	private JPanel panel;
	private JTable table_1, table_2, table_3;
	private DefaultTableModel model1, model2, model3;

	private ArrayList<Doctor> doclist;
	private ArrayList<Receptionist> receplist;
	private ArrayList<Assitant> Assistantlist;
	private JLabel label4, label2, label3;
	private JTextField textField4, textField2, textField3;

	/**
	 * Create the frame.
	 */
	public TabClass(int i) {

		setTitle("Details");
		JTabbedPane jtp = new JTabbedPane();

		getContentPane().add(jtp);

		// This will create the first tab
		JPanel jp1 = new JPanel();
		JPanel jp2 = new JPanel();
		JPanel jp3 = new JPanel();

		jtp.addTab("Doctor", jp1);
		jtp.addTab("Receptionist", jp2);
		jtp.addTab("Assistant", jp3);

		if (i == 1) {
			dc = new DataClass(2);

			/*
			 * Doctor table
			 */
			model1 = new DefaultTableModel();

			model1.addColumn("ID");
			model1.addColumn("Name");
			model1.addColumn("City");
			model1.addColumn("Email");
			model1.addColumn("status");

			doclist = dc.getdocList();
			Iterator<Doctor> docnames = doclist.iterator();

			while (docnames.hasNext()) {

				Doctor docvalues = docnames.next();
				model1.addRow(new Object[] { docvalues.getId(),
						docvalues.getName(), docvalues.getAddress(),
						docvalues.getType() });
			}

			table_1 = new JTable(model1);
			// Adds the checkbox
			checkboxrender checkBoxRenderer = new checkboxrender();
			EachRowRenderer rowRenderer = new EachRowRenderer();
			int rowcount = table_1.getRowCount();
			for (int k = 0; k <= rowcount; k++) {
				rowRenderer.add(k, checkBoxRenderer);
			}
			table_1.getColumn("status").setCellRenderer(rowRenderer);

			// Table width adjustment
			TableColumn col = table_1.getColumnModel().getColumn(3);
			int width = 200;
			col.setPreferredWidth(width);
			/*
			 * Receptionist table
			 */

			model2 = new DefaultTableModel();
			model2.addColumn("ID");
			model2.addColumn("Name");
			model2.addColumn("City");
			model2.addColumn("Email");
			model2.addColumn("status");

			receplist = dc.getrecpList();
			Iterator<Receptionist> recepnames = receplist.iterator();
			while (recepnames.hasNext()) {
				Receptionist recepvalues = recepnames.next();
				model2.addRow(new Object[] { recepvalues.getId(),
						recepvalues.getName(), recepvalues.getAddress(),
						recepvalues.getType() });

			}

			table_2 = new JTable(model2);
			// Adds the checkbox
			int rowcount2 = table_2.getRowCount();
			for (int k = 0; k <= rowcount2; k++) {
				rowRenderer.add(k, checkBoxRenderer);
			}
			table_2.getColumn("status").setCellRenderer(rowRenderer);
			// Table width adjustment
			TableColumn col1 = table_2.getColumnModel().getColumn(3);
			int width1 = 200;
			col1.setPreferredWidth(width1);

			/*
			 * Assitant table
			 */

			model3 = new DefaultTableModel();
			model3.addColumn("ID");
			model3.addColumn("Name");
			model3.addColumn("City");
			model3.addColumn("Email");
			model3.addColumn("status");

			Assistantlist = dc.getassitantList();
			Iterator<Assitant> Assistantname = Assistantlist.iterator();
			while (Assistantname.hasNext()) {
				Assitant Assistantvalues = Assistantname.next();
				model3.addRow(new Object[] { Assistantvalues.getId(),
						Assistantvalues.getName(),
						Assistantvalues.getAddress(), Assistantvalues.getType() });
			}

			table_3 = new JTable(model3);
			// Adds the checkbox
			int rowcount3 = table_3.getRowCount();
			for (int k = 0; k <= rowcount3; k++) {
				rowRenderer.add(k, checkBoxRenderer);
			}
			table_3.getColumn("status").setCellRenderer(rowRenderer);
			// Table width adjustment
			TableColumn col2 = table_3.getColumnModel().getColumn(3);
			int width2 = 200;
			col2.setPreferredWidth(width2);

			jp1.add(table_1);
			jp2.add(table_2);
			jp3.add(table_3);

		}

		/*
		 * Buttons to be included in the tabs
		 */
		JButton Adddoc = new JButton("Add");
		JButton deletedoc = new JButton("Delete");
		JButton Addrecep = new JButton("Add");
		JButton deleterecep = new JButton("Delete");
		JButton Addass = new JButton("Add");
		JButton deleteass = new JButton("Delete");
		JButton Back1 = new JButton("Back");
		JButton Back2 = new JButton("Back");
		JButton Back3 = new JButton("Back");

		Back1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BackMethod();
			}
		});
		Back2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BackMethod();
			}
		});
		Back3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BackMethod();
			}
		});

		/*
		 * Dialog content
		 */
		panel = new JPanel();
		label2 = new JLabel("Name");
		label3 = new JLabel("city");
		label4 = new JLabel("email");
		textField4 = new JTextField(10);
		textField2 = new JTextField(10);
		textField3 = new JTextField(10);

		panel.add(label2);
		panel.add(textField2);
		panel.add(label3);
		panel.add(textField3);
		panel.add(label4);
		panel.add(textField4);

		//Add Doctor button action
		Adddoc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Object[] options1 = { "Add	" };
				int result1 = JOptionPane.showOptionDialog(null, panel,
						"Enter  Details", JOptionPane.YES_NO_CANCEL_OPTION,
						JOptionPane.PLAIN_MESSAGE, null, options1, null);
				if (result1 == JOptionPane.YES_OPTION) {
					int id, i, j, isLastElem = 0, counter = 0;
					String emailvalue = null;
					int row = table_1.getRowCount();
					int col = table_1.getColumnCount();
					// ID counter;
					for (i = 0; i < row; i++) {
						isLastElem = (int) table_1.getValueAt(i, 0);
						isLastElem = i == (row - 1) ? isLastElem : 0;
					}
					id = isLastElem + 1;
					String name = textField2.getText().toString();
					String city = textField3.getText().toString();
					String type = textField4.getText().toString().toLowerCase();
					type = type.toLowerCase();
					// Filter unique values
					for (j = 0; j < row; j++) {
						emailvalue = (String) table_1.getValueAt(j, col - 2);
						if (type.equals(emailvalue)) {
							Component frame = null;
							JOptionPane.showMessageDialog(frame,
									"Reccords already exists", "Error",
									JOptionPane.ERROR_MESSAGE);
							counter++;
						}
					}
					if (counter == 0) {
						model1.addRow(new Object[] { id, name, city, type });
					}
				}
			}

		});

		//Add Reception button action
		Addrecep.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Object[] options2 = { "Add	" };
				int result2 = JOptionPane.showOptionDialog(null, panel,
						"Enter  Details", JOptionPane.YES_NO_CANCEL_OPTION,
						JOptionPane.PLAIN_MESSAGE, null, options2, null);
				if (result2 == JOptionPane.YES_OPTION) {
					int id, i, j, isLastElem = 0, counter = 0;
					String emailvalue = null;
					int row = table_2.getRowCount();
					int col = table_2.getColumnCount();
					for (i = 0; i < row; i++) {
						isLastElem = (int) table_2.getValueAt(i, 0);
						isLastElem = i == (row - 1) ? isLastElem : 0;
					}
					id = isLastElem + 1;
					String name = textField2.getText().toString();
					String city = textField3.getText().toString();
					String type = textField4.getText().toString().toLowerCase();
					for (j = 0; j < row; j++) {
						emailvalue = (String) table_2.getValueAt(j, col - 2);
						if (type.equals(emailvalue)) {
							Component frame = null;
							JOptionPane.showMessageDialog(frame,
									"Reccords already exists", "Error",
									JOptionPane.ERROR_MESSAGE);
							counter++;
						}
					}
					if (counter == 0) {
						model2.addRow(new Object[] { id, name, city, type });
					}
				}
			}

		});
		//Add Assistant button action
		Addass.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Object[] options3 = { "Add	" };
				int result3 = JOptionPane.showOptionDialog(null, panel,
						"Enter  Details", JOptionPane.YES_NO_CANCEL_OPTION,
						JOptionPane.PLAIN_MESSAGE, null, options3, null);
				if (result3 == JOptionPane.YES_OPTION) {
					int id, i, j, isLastElem = 0, counter = 0;
					int row = table_3.getRowCount();
					for (i = 0; i < row; i++) {
						isLastElem = (int) table_3.getValueAt(i, 0);
						isLastElem = i == (row - 1) ? isLastElem : 0;
					}
					id = isLastElem + 1;
					String name = textField2.getText().toString();
					String city = textField3.getText().toString();
					String type = textField4.getText().toString().toLowerCase();
					int col = table_3.getColumnCount();
					String emailvalue = null;
					for (j = 0; j < row; j++) {
						emailvalue = (String) table_3.getValueAt(j, col - 2);
						if (type.equals(emailvalue)) {
							Component frame = null;
							JOptionPane.showMessageDialog(frame,
									"Reccords already exists", "Error",
									JOptionPane.ERROR_MESSAGE);
							counter++;
						}
					}
					if (counter == 0) {
						model3.addRow(new Object[] { id, name, city, type });
					}
				}
			}

		});
		//delete Doctor action
		deletedoc.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int selRow = table_1.getSelectedRow();
				if (selRow != -1) {
					model1.removeRow(selRow);
				} else {
					Component frame = null;
					JOptionPane.showMessageDialog(frame,
							"Select the Details before Deleting");
				}
			}
		});
		//delete Reception action
		deleterecep.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int selRow = table_2.getSelectedRow();
				if (selRow != -1) {
					model2.removeRow(selRow);
				} else {
					Component frame = null;
					JOptionPane.showMessageDialog(frame,
							"Select the Details before Deleting");
				}
			}
		});
		//delete Assistant action
		deleteass.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int selRow = table_3.getSelectedRow();
				if (selRow != -1) {
					model3.removeRow(selRow);
				} else {
					Component frame = null;
					JOptionPane.showMessageDialog(frame,
							"Select the Details before Deleting");
				}
			}
		});

		jp1.add(Adddoc);
		jp1.add(deletedoc);
		jp1.add(Back1);
		jp2.add(Addrecep);
		jp2.add(deleterecep);
		jp2.add(Back2);
		jp3.add(Addass);
		jp3.add(deleteass);
		jp3.add(Back3);

		setSize(500, 500);
		setVisible(true);
	}

	protected void BackMethod() {
		// TODO Auto-generated method stub
		setVisible(false);
		new MainScreen();
	}

}
