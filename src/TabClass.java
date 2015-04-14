import hospital.person.Doctor;
import hospital.person.Receptionist;

import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JScrollPane;


public class TabClass extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private  DataClass dc=new DataClass();
	private JPanel panel2;
	private JTable table_1;
	private JTable table_2;

	/**
	 * Create the frame.
	 */
	public TabClass() {
		
		
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 23, 403, 228);
		contentPane.add(tabbedPane);
		
		/*
		 * DoctorDetails
		 */
		
		JPanel panel1 = new JPanel();
		tabbedPane.addTab("Doctor", null, panel1, null);
		
		DefaultTableModel model1 = new DefaultTableModel();
	    model1.addColumn("ID");
	    model1.addColumn("Name");
	    model1.addColumn("City");
		
	    ArrayList<Doctor> doclist = dc.getdocList();	
	    Iterator<Doctor> docnames = doclist.iterator();
	          
	    while(docnames.hasNext()){
	    	Doctor docvalues=docnames.next();
	    	model1.addRow(new Object[]{docvalues.getId(),docvalues.getName(),docvalues.getAddress()});
	    }
		panel1.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(26, 76, 303, 113);
		panel1.add(scrollPane);
		
		table_1 = new JTable(model1);
		scrollPane.setViewportView(table_1);
		
		/*
		 * ReceptionistDetails
		 */

		panel2 = new JPanel();
		tabbedPane.addTab("Receptionist", null, panel2, null);
		panel2.setLayout(null);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(26, 76, 303, 113);
		panel2.add(scrollPane_1);
		
		DefaultTableModel model2 = new DefaultTableModel();
		model2.addColumn("ID");
	    model2.addColumn("Name");
	    model2.addColumn("City");
			
		ArrayList<Receptionist> receplist = dc.getrecpList();	
	    Iterator<Receptionist> recepnames = receplist.iterator();
	    while(recepnames.hasNext()){
	    	Receptionist recepvalues=recepnames.next();
	    	model2.addRow(new Object[]{recepvalues.getId(),recepvalues.getName(),recepvalues.getAddress()});
	    }
	    
	    table_2 = new JTable(model2);
		scrollPane_1.setViewportView(table_2);
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setVisible(true);	
	}
}
