package Garage;

public abstract class Moteur {
	public TypeMoteur type;
	public String cylindre;
	public Double prix;
	
	public String toString(){
		return "Moteur ";
	}
	public Moteur(String cylindre, Double  prix){
		this.cylindre = cylindre;
		this.prix = prix;
	}
	public Double getPrix(){
		return null;
	}	
}
