
import java.util.ArrayList;
import hospital.person.Doctor;
import hospital.person.Receptionist;

public class DataClass {
	private Doctor doc;
	private ArrayList<Doctor> doclist;
	private ArrayList<Receptionist> receplist;

	public DataClass() {
		new MainScreen();
		
		doclist = new ArrayList<Doctor>();
		doclist.add(new Doctor(1000, "Charlie", "Berlin", "Doc"));
		doclist.add(new Doctor(1001, "John", "Munster", "Doc"));
		doclist.add(new Doctor(1002, "Jack", "Amsterdam", "Doc"));
		doclist.add(new Doctor(1003, "Alex", "Rotterdam", "Doc"));
		
		
		receplist = new ArrayList<Receptionist>();
		receplist.add(new Receptionist(2000, "Nancy", "Amsterdam", "Recp"));
		receplist.add(new Receptionist(2001, "Karin", "Rotterdam", "Recp"));
		receplist.add(new Receptionist(2002, "Esther", "Hengelo", "Recp"));
		receplist.add(new Receptionist(2003, "Jessica", "Enschede", "Recp"));	
	}

	public ArrayList<Doctor> getdocList() {
		return doclist;
	}
	
	public ArrayList<Receptionist> getrecpList() {
		return receplist;
	}
}
