package Garage;

import java.util.List;

public class Lagouna extends Vehicule{

	public Lagouna() {
		super();
		this.prix = 23123;
		this.nom = Marque.RENO.toString();
	}

	public void addOption(){
	}
	public Marque getMarque(){
		return null;
	}
	public List<Option> getOptions(){
		return option;
	}
	public Double getPrix(){
		return prix;	
	}
}