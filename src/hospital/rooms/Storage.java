package hospital.rooms;


public class Storage extends Room{
	public Storage(int accesslevel) {
		super(accesslevel);
	}

	public String storagestatus(){
		return "Out of stock";
	}
}
