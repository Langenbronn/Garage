package Garage;
import java.util.LinkedList;
import java.util.List;

public class Garage {
	public List<Vehicule> voiture;

	public Garage() {
		voiture  = new LinkedList<Vehicule>();
	}

	public String toString(){
		String Affichagegarage;
		Affichagegarage = "***************************" +"\n"+ 
				          "* Garage OpenClassrooms   *" +"\n"+
				          "***************************";
		return Affichagegarage;
	}
	public void add(Vehicule voit){
		voiture.add(voit);
		System.out.println(voit.toString());
	}
}
