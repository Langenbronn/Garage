package Garage;

public class A300B extends Vehicule{

	public A300B() {
		super();
		this.nom = "A300B";
		this.prix = 0;
		this.nomMarque = this.getMarque().toString();
	}
	public Marque getMarque(){
		return Marque.PIGEOT;
	}
}