
import java.util.ArrayList;

import hospital.person.Assitant;
import hospital.person.Doctor;
import hospital.person.Receptionist;

public class DataClass {
	private Doctor doc;
	private ArrayList<Doctor> doclist;
	private ArrayList<Receptionist> receplist;
	private ArrayList<Assitant> assitantlist;

	public DataClass(int i) {
		
		if(i==2){
		doclist = new ArrayList<Doctor>();
		doclist.add(new Doctor(1000, "Charlie", "Berlin", "Doc"));
		doclist.add(new Doctor(1001, "John", "Munster", "Doc"));
		doclist.add(new Doctor(1002, "Jack", "Amsterdam", "Doc"));
		doclist.add(new Doctor(1003, "Alex", "Rotterdam", "Doc"));
		doclist.add(new Doctor(1004, "Jinse", "Amsterdam", "Doc"));
		doclist.add(new Doctor(1005, "Dumblebore", "Rotterdam", "Doc"));
		
		
		receplist = new ArrayList<Receptionist>();
		receplist.add(new Receptionist(2000, "Nancy", "Amsterdam", "Recp"));
		receplist.add(new Receptionist(2001, "Karin", "Rotterdam", "Recp"));
		receplist.add(new Receptionist(2002, "Esther", "Hengelo", "Recp"));
		receplist.add(new Receptionist(2003, "Jessica", "Enschede", "Recp"));	
		
		assitantlist = new ArrayList<Assitant>();
		assitantlist.add(new Assitant(3000, "Jake", "oslo", "Ass"));
		assitantlist.add(new Assitant(3001, "Rupenzel", "madrid", "Ass"));
		assitantlist.add(new Assitant(3002, "Pacman", "athens", "Ass"));
		assitantlist.add(new Assitant(3003, "Lego", "belgium", "Ass"));	
	}
		
		if(i==1){
		new MainScreen();
		}
	}

	public ArrayList<Doctor> getdocList() {
		return this.doclist;
	}
	
	public ArrayList<Receptionist> getrecpList() {
		return this.receplist;
	}
	public ArrayList<Assitant> getassitantList() {
		return this.assitantlist;
	}

}
