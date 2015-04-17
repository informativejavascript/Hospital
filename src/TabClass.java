import hospital.person.Assitant;
import hospital.person.Doctor;
import hospital.person.Receptionist;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class TabClass extends JFrame {

	private DataClass dc;
	private JPanel panel;
	private JScrollPane scrollPane;
	private JTable table_1, table_2, table_3;
	private DefaultTableModel model1,model2,model3;

	private ArrayList<Doctor> doclist;
	private ArrayList<Receptionist> receplist;
	private ArrayList<Assitant> assitantlist;
	private JLabel label1,label2,label3;
	private JTextField textField1,textField2,textField3;

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
			 * 
			 */
			model1 = new DefaultTableModel();
			model1.addColumn("ID");
			model1.addColumn("Name");
			model1.addColumn("City");

			doclist = dc.getdocList();
			Iterator<Doctor> docnames = doclist.iterator();

			while (docnames.hasNext()) {
				Doctor docvalues = docnames.next();
				model1.addRow(new Object[] { docvalues.getId(),
						docvalues.getName(), docvalues.getAddress() });
			}
			
			
			table_1 = new JTable(model1);
			/* 
			 * Receptionist table
			 * 
			 */

			model2 = new DefaultTableModel();
			model2.addColumn("ID");
			model2.addColumn("Name");
			model2.addColumn("City");

			ArrayList<Receptionist> receplist = dc.getrecpList();
			Iterator<Receptionist> recepnames = receplist.iterator();
			while (recepnames.hasNext()) {
				Receptionist recepvalues = recepnames.next();
				model2.addRow(new Object[] { recepvalues.getId(),
						recepvalues.getName(), recepvalues.getAddress() });
			}
			
			table_2 = new JTable(model2);
			
			/* 
			 * Assitant table
			 * 
			 */

			model3 = new DefaultTableModel();
			model3.addColumn("ID");
			model3.addColumn("Name");
			model3.addColumn("City");

			ArrayList<Assitant> Assistantlist = dc.getassitantList();
			Iterator<Assitant> Assistantname = Assistantlist.iterator();
			while (Assistantname.hasNext()) {
				Assitant Assistantvalues = Assistantname.next();
				model3.addRow(new Object[] { Assistantvalues.getId(),
						Assistantvalues.getName(), Assistantvalues.getAddress() });
			}

			table_3 = new JTable(model3);
			
			jp1.add(table_1);
			jp2.add(table_2);
			jp3.add(table_3);

		}

		/*
		 * Buttons to be included in the tabs
		 * 
		 */
		JButton Adddoc = new JButton("Add");
		JButton Addrecep = new JButton("Add");
		JButton Addass = new JButton("Add");
		
		/*
		 * Dialog content
		 */
		panel = new JPanel();
		label1 = new JLabel("id");
		label2 = new JLabel("Name");
		label3 = new JLabel("city");
		textField2 = new JTextField(10);
		textField1 = new JTextField(10);
		textField3 = new JTextField(10);

		panel.add(label1);
		panel.add(textField1);
		panel.add(label2);
		panel.add(textField2);
		panel.add(label3);
		panel.add(textField3);
		
		Adddoc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Object[] options1 = { "Add	" };
				int result1 = JOptionPane.showOptionDialog(null, panel,
						"Enter  Details", JOptionPane.YES_NO_CANCEL_OPTION,
						JOptionPane.PLAIN_MESSAGE, null, options1, null);
				if (result1 == JOptionPane.YES_OPTION) {
					int id = Integer.parseInt(textField1.getText().toString());
					String name = textField2.getText().toString();
					String city = textField3.getText().toString();
					String type = textField3.getText().toString();
					//doclist.add(new Doctor(id, name, city, type));
					model1.addRow(new Object[] { id, name, city });
				}
			}

		});
		
		Addrecep.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Object[] options2 = { "Add	" };
				int result2 = JOptionPane.showOptionDialog(null, panel,
						"Enter  Details", JOptionPane.YES_NO_CANCEL_OPTION,
						JOptionPane.PLAIN_MESSAGE, null, options2, null);
				if (result2 == JOptionPane.YES_OPTION) {
					int id = Integer.parseInt(textField1.getText().toString());
					String name = textField2.getText().toString();
					String city = textField3.getText().toString();
					String type = textField3.getText().toString();
					//doclist.add(new Doctor(id, name, city, type));
					model2.addRow(new Object[] { id, name, city });
				}
			}

		});
		
		Addass.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Object[] options3 = { "Add	" };
				int result3 = JOptionPane.showOptionDialog(null, panel,
						"Enter  Details", JOptionPane.YES_NO_CANCEL_OPTION,
						JOptionPane.PLAIN_MESSAGE, null, options3, null);
				if (result3 == JOptionPane.YES_OPTION) {
					int id = Integer.parseInt(textField1.getText().toString());
					String name = textField2.getText().toString();
					String city = textField3.getText().toString();
					String type = textField3.getText().toString();
					//assitantlist.add(new Assitant(id, name, city, type));
					model3.addRow(new Object[] { id, name, city });
				}
			}

		});
		
		jp1.add(Adddoc);
		jp2.add(Addrecep);
		jp3.add(Addass);
		
		setSize(300,400);
		setVisible(true);
	}

}
