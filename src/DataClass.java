
import java.awt.Component;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import hospital.person.Doctor;
import hospital.person.Receptionist;

public class DataClass {
	private Doctor doc;
	private ArrayList<Doctor> doclist;
	private ArrayList<Receptionist> receplist;

	public DataClass() {
		doclist = new ArrayList<Doctor>();
		doclist.add(new Doctor(1000, "Charlie", "Berlin", "Doc"));
		doclist.add(new Doctor(1001, "John", "Munster", "Doc"));
		
		receplist = new ArrayList<Receptionist>();
		receplist.add(new Receptionist(2000, "Nancy", "Amsterdam", "Recp"));
		receplist.add(new Receptionist(2001, "Karin", "Rotterdam", "Recp"));

		new MainScreen();
	}

	public ArrayList<Doctor> getdocList() {
		return doclist;
	}
	
	public ArrayList<Receptionist> getrecpList() {
		return receplist;
	}
}
