package Moteur;

public class MoteurHybride extends Moteur{
	public MoteurHybride(String cylindre, Double  prix){
		super(cylindre,  prix);
		this.type = TypeMoteur.HYBRIDE;
	}
}