
public class Telephone {
	
	String marque;
	String modele;
	String couleur;
	double prix;

	public Telephone() {
		
	}
	
	public Telephone(String marque, String modele, String couleur, double prix) {
		// this.marque fait reference au champ (ligne 4)
		// marque fait reference au paramètre String marque (ligne 13)
		this.marque = marque;
		this.modele = modele;
		this.couleur = couleur;
		this.prix = prix;
	}
	
	// methode
	public void envoyerMessage(String message) {
		System.out.println(message);
	}
	
	public void appeler(String destinataire) {
		System.out.println("Je suis en train d'appeler : "+ destinataire);
	}

	// Pour affichage 
	@Override
	public String toString() {
		return "Telephone [marque=" + marque + ", modele=" + modele + ", couleur=" + couleur + ", prix=" + prix + "]";
	}
	
}
