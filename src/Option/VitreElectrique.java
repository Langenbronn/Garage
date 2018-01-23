package Option;

public class VitreElectrique implements Option {
	private final String name = "Vitre electrique";
	private final double prix = 212.35;
	public String getName(){
		return name;
	}
	public Double getPrix(){
		return prix;
	}
}