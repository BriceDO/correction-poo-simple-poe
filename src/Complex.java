
public class Complex {
	
	int premierNombreReel;
	int premierNombreImaginaire;
	int deuxiemeNombreReel;
	int deuxiemeNombreImaginaire;
	
	public Complex() {}
	
	public Complex(int premierNombreReel, int premierNombreImaginaire, int deuxiemeNombreReel, int deuxiemeNombreImaginaire) {
		this.premierNombreReel = premierNombreReel;
		this.premierNombreImaginaire = premierNombreImaginaire;
		this.deuxiemeNombreReel = deuxiemeNombreReel;
		this.deuxiemeNombreImaginaire = deuxiemeNombreImaginaire;
	}
	
	public int calculNombresReel() {
		int sommeNombresReel = this.premierNombreReel + this.deuxiemeNombreReel;
		return sommeNombresReel;
	}
	
	public int calculNombresImaginaire() {
		int sommeNombresImaginaire = this.premierNombreImaginaire + this.deuxiemeNombreImaginaire;
		return sommeNombresImaginaire;
	}
	
	public void affichageFinal(int sommeNombresReel, int sommeNombresImaginaire) {
		System.out.println("La somme est "+sommeNombresReel+" + "+sommeNombresImaginaire+"i");
	}
	
}
