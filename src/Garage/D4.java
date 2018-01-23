package Garage;

public class D4 extends Vehicule{

	public D4() {
		super();
		this.nom = "D4";
		this.prix = 0;
		this.nomMarque = this.getMarque().toString();
	}
	public Marque getMarque(){
		return Marque.TOREN;
	}
}