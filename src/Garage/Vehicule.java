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
		return "+ Voiture " + this.nom + " : Lagouna " + moteur.toString() + " (" + this.prix + ") ";
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
