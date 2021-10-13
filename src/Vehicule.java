
public class Vehicule {
	public String couleur;
	public String marque;
	public double prix;
	
	public Vehicule() {
		System.out.println("Passage par le constructeur vide");
		this.marque = "Tesla";
		this.couleur = "Rouge";
		this.prix = 10.99;
	}
	
	public Vehicule(String marque, double prix) {
		this.marque = marque;
		this.prix = prix;
	}
		
	public Vehicule(String marque, String couleur, double prix) {
		this(marque, prix);
		System.out.println("Passage par le constructeur plein");
		this.couleur = couleur;
	}
	
	@Override
	public String toString() {
		return "Vehicule [couleur=" + couleur + ", marque=" + marque + ", prix=" + prix + "]";
	}
	
	public void repeindre(String nouvelleCouleur) {
		this.couleur = nouvelleCouleur;
	}
}