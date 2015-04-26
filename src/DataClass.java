
import java.util.ArrayList;

import hospital.person.Assitant;
import hospital.person.Doctor;
import hospital.person.Receptionist;

public class DataClass {
	private ArrayList<Doctor> doclist;
	private ArrayList<Receptionist> receplist;
	private ArrayList<Assitant> assitantlist;

	public DataClass(int i) {
		
		if(i==2){
		doclist = new ArrayList<Doctor>();
		doclist.add(new Doctor(1000, "Charlie", "Berlin", "charlie@hospital.com"));
		doclist.add(new Doctor(1001, "John", "Munster", "john@hospital.com"));
		doclist.add(new Doctor(1002, "Jack", "Amsterdam", "jack@hospital.com"));
		doclist.add(new Doctor(1003, "Alex", "Rotterdam", "alex@hospital.com"));
		doclist.add(new Doctor(1004, "Jinse", "Amsterdam", "jinse@hospital.com"));
		doclist.add(new Doctor(1005, "Dumblebore", "Rotterdam", "dimbledore@hospital.com"));
		
		
		receplist = new ArrayList<Receptionist>();
		receplist.add(new Receptionist(2000, "Nancy", "Amsterdam", "nancy@hospital.com"));
		receplist.add(new Receptionist(2001, "Karin", "Rotterdam", "karin@hospital.com"));
		receplist.add(new Receptionist(2002, "Esther", "Hengelo", "esther@hospital.com"));
		receplist.add(new Receptionist(2003, "Jessica", "Enschede", "jessica@hospital.com"));	
		
		assitantlist = new ArrayList<Assitant>();
		assitantlist.add(new Assitant(3000, "Jake", "oslo", "jake@hospital.com"));
		assitantlist.add(new Assitant(3001, "Rupenzel", "madrid", "rupenzel@hospital.com"));
		assitantlist.add(new Assitant(3002, "Pacman", "athens", "pacman@hospital.com"));
		assitantlist.add(new Assitant(3003, "Lego", "belgium", "lego@hospital.com"));	
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
