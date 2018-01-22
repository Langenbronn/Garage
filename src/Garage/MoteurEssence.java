package Garage;

public class MoteurEssence extends Moteur{

	public String toString(){
		return "Moteur ";
	}
	public MoteurEssence(String cylindre, Double  prix){
		super(cylindre,  prix);
		this.type = TypeMoteur.ESSENCE;
	}
	public Double getPrix(){
		return this.prix;
	}	
}
