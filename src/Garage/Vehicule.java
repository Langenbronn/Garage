package Garage;

import java.util.LinkedList;
import java.util.List;


public abstract class Vehicule {
	public double prix;
	public String nom;
	public List<Option> option;
	public Moteur moteur;
	
	public Vehicule() {
		option  = new LinkedList<Option>();
	}
	public String toString(){
		String Affichagevoit;
		double prixtotal = prix;
		Affichagevoit = "+ Voiture " + this.nom + " : " +this.getClass().getSimpleName() + " " + moteur.toString() + " (" + this.prix + ") ";
		for (int i = 0;i < option.size();i++){
			if (i == 0) {Affichagevoit = Affichagevoit + " [ ";}
			else{Affichagevoit = Affichagevoit + " , ";}
			prixtotal = prixtotal + option.get(i).getPrix();
			Affichagevoit = Affichagevoit + option.get(i).getClass().getSimpleName() + " ("+option.get(i).getPrix() +")";
			if (i == option.size()-1) {Affichagevoit = Affichagevoit + "]";}
		}
		Affichagevoit = Affichagevoit + " d'une valeur totale de " + prixtotal;
		return Affichagevoit;
	}
	public void setMoteur(Moteur moteur) {
		this.moteur = moteur;
	}
	public void addOption(Option opt){
		option.add(opt);
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
