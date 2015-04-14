package hospital.person;


import java.awt.Component;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

public class Doctor extends Employee {
	ArrayList<Doctor> arraylist;
	private int id;
	
	
	public Doctor(int id, String name, String address,String type) {
		super(id, name, address,type);
	}

	   public ArrayList<Doctor> getdocList() {
	       return arraylist;
	   }
}