package Garage;

import java.util.LinkedList;
import java.util.List;

import Moteur.Moteur;
import Option.Option;

public abstract class Vehicule {
	public double prix;
	public String nom;
	public List<Option> option;
	public Moteur moteur;
	public String nomMarque;
	
	public Vehicule() {
		this.option = new LinkedList<Option>();
	}
	public String toString(){
		String Affichagevoit;
		this.prix = this.moteur.getPrix();
		Affichagevoit = "+ Voiture " + this.nomMarque + " : " +this.nom + " " + moteur.toString() + " (" + this.moteur.getPrix() + ")  [ ";
		for (int i = 0;i < option.size();i++){
			if (i > 0) {Affichagevoit = Affichagevoit + " , ";}
			this.prix = this.prix + option.get(i).getPrix();
			Affichagevoit = Affichagevoit + option.get(i).getName() + " ("+option.get(i).getPrix() +")";
		}
		Affichagevoit = Affichagevoit + "] d'une valeur totale de " + this.prix;
		return Affichagevoit;
	}
	public void setMoteur(Moteur moteur) {
		this.moteur = moteur;
	}
	public void addOption(Option opt){
		option.add(opt);
	}
	public abstract Marque getMarque();
	public List<Option> getOptions(){
		return option;
	}
	public Double getPrix(){
		return prix;	
	}
}
