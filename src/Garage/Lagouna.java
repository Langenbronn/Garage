package Garage;

public class Lagouna extends Vehicule{

	public Lagouna() {
		super();
		this.nom = "Lagouna";
		this.prix = 0;
		this.nomMarque = this.getMarque().toString();
	}
	public Marque getMarque(){
		return Marque.RENO;
	}
}