
public class Somme {
	int n1;
	int n2;
	
	public Somme() {
		n1 = 0;
		n2 = 0;
	}
	
	public Somme(int n1, int n2) {
		this.n1 = n1;
		this.n2 = n2;
	}
	
	public int calculerSomme() {
		int somme = this.n1 + this.n2;
		System.out.println("La somme des deux nombres est : "+somme);
		return somme;
		
	}
	
}
