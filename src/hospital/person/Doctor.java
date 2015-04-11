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
	
	//try to find the doctor by giving only the id.
	
//	private Doctor findDoctor(ArrayList<Doctor> list,int id) {
//		
//		arraylist.add(new Doctor(1000, "Jim", "Amsterdam", "Doc"));
//		arraylist.add(new Doctor(1002, "John", "Rotterdam", "Doc"));
//		
//		for(Doctor doc : list)
//            if(doc.getId() == id)
//            return doc;
//		return null;
//}
//	
	  public void addDoctors() {
		  arraylist = new ArrayList<Doctor>();
	       arraylist.add(new Doctor(1000, "Jim", "Amsterdam", "Doc"));
	       arraylist.add(new Doctor(1002, "John", "Rotterdam", "Doc"));
	   }

	   public ArrayList<Doctor> getdocList() {
	       return arraylist;
	   }
}