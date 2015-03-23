package hospital.person;

public class Person {
	private String name, address, type;
	private int Id, insurancedetails;

	public Person(int id, String name, String address,String type) {
		this.Id = id;
		this.name = name;
		this.address = address;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getInsurancedetails() {
		return insurancedetails;
	}

	public void setInsurancedetails(int insurancedetails) {
		this.insurancedetails = insurancedetails;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
