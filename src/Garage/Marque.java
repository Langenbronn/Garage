package Garage;

public enum Marque {
	RENO ("RENO"),
	PIGEOT("PIGEOT"),
	TOREN ("TOREN");
	private String name = "";
	
	Marque(String name){
		this.name = name;
	}
	public String toString(){
	    return name;
	  }
}
