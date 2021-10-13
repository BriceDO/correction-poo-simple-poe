
public class Student {
	
	String nom;
	int note1, note2;
	
	public Student() {}
	
	public Student(String nom, int note1, int note2) {
		this.nom = nom;
		this.note1 = note1;
		this.note2 = note2;
	}
	
	public int calculerMoyenne(int note1, int note2) {
		int moyenne = (note1 + note2) / 2;
		return moyenne;
		
	}
	
	public void show(String nom, int moyenne) {
		System.out.println("L'eleve "+ nom + " a une moyenne de : "+ moyenne+".");
	}
}