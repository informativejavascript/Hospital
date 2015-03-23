package hospital.person;

import java.awt.Component;

public class Doctor extends Employee {
	private int myacces;

	public Doctor(int id, String name, String address,String type) {
		super(id, name, address,type);
	}
	
	// private method which only the Doctor can access this
	public String listofdoctors() {
		return this.getName();
	}

}