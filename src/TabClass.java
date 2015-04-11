import hospital.person.Doctor;
import hospital.person.Receptionist;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextArea;


public class TabClass extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private  DataClass dc=new DataClass();
	private JPanel panel2;

	/**
	 * Create the frame.
	 */
	public TabClass() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 23, 403, 228);
		contentPane.add(tabbedPane);
		
		JPanel panel1 = new JPanel();
		tabbedPane.addTab("Doctor", null, panel1, null);
		
		JTextArea textArea1 = new JTextArea();
		textArea1.setColumns(10);
		textArea1.setRows(3);
		
	    ArrayList<Doctor> doclist = dc.getdocList();	
	    Iterator<Doctor> docnames = doclist.iterator();
	    while(docnames.hasNext()){
	    	Doctor docvalues=docnames.next();
	    	textArea1.append(docvalues.getName());
	    }
		panel1.add(textArea1);
		
		panel2 = new JPanel();
		tabbedPane.addTab("Receptionist", null, panel2, null);
		panel2.setLayout(null);
		
		
		JTextArea textArea2 = new JTextArea();
		textArea2.setBounds(132, 28, 172, 22);
		panel2.add(textArea2);
		
		ArrayList<Receptionist> receplist = dc.getrecpList();	
	    Iterator<Receptionist> recepnames = receplist.iterator();
	    while(recepnames.hasNext()){
	    	Receptionist recepvalues=recepnames.next();
	    	textArea2.append(recepvalues.getName());
	    }
	}
}
