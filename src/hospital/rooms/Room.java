package hospital.rooms;

public class Room {
	
	private int accesslevel;
	
	public Room(int accesslevel){
		this.accesslevel=accesslevel;
	}

	public int getAccesslevel() {
		return accesslevel;
	}

	public void setAccesslevel(int accesslevel) {
		this.accesslevel = accesslevel;
	}
	
	public String Display(int accesslevel){
		if(accesslevel>=1 && accesslevel<=2 ){
			return "Access exist";
		}
		else{
			return "no access";
		}

	}

}
