

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Tools {
	
	/**
	 * Fonction générique qui va loger un message à l'utilisateur
	 * et récupère la prochaine entrée String de son clavier
	 * @param message
	 * @return String
	 */
	
	public static String inputString(String message) {
		
		// J'affiche un message qui stipule ce que je dois entrer
		System.out.println(message);
		// J'ouvre un scanner qui va prendre les données de l'utilisateur
		Scanner scan = new Scanner(System.in);
		// Je recupère la prochaine entrée de mon scanner
		return scan.next();
		
	}
	
	/**
	 * Fonction générique qui va loger un message à l'utilisateur
	 * et récupère la prochaine entrée int de son clavier
	 * @param String message
	 * @return int
	 */
	
	public static int inputInt(String message) {
		System.out.println(message);
		Scanner scan = new Scanner(System.in);
		return scan.nextInt();
		
	}
	
	/**
	 * Fonction générique qui va loger un message à l'utilisateur
	 * et récupère la prochaine entrée int de son clavier
	 * @param String message
	 * @return int maximum 7
	 */
	
	public static int inputIntWithLimit(String message) {
		System.out.println(message);
		Scanner scan = new Scanner(System.in);
		return scan.nextInt(8);
		
	}
	
	/**
	 * Fonction générique qui va loger un message à l'utilisateur
	 * et récupère la prochaine entrée char de son clavier
	 * @param String message
	 * @return char
	 */
	
	public static char inputChar(String message) {
		System.out.println(message);
		Scanner scan = new Scanner(System.in);
		return scan.next().charAt(0);
		
	}
	
	/**
	 * Fonction qui va prendre les lettres d'un mot affiché
	 * Le mettra dans un tableau et remplaçera toutes les lettres par "_ "
	 * @params char tableau : déjà coupé au préalable
	 */
	public static void decouperMotATrouverAvec_(char[] liste) {
		for (int i = 0; i < liste.length; i++) {
			liste[i] = 'X';
		}
		System.out.println(liste);
	}
	
	/**
	 * Recupère l'index de la lettre dans un tableau qui contient cette lettre
	 * @params int la lettre demandée et la liste type char que je dois comparer
	 * @return l'index type int
	 */ 
	
	/*
	 * TODO indexDeLaLettre doit être un tableau ou une liste
	 * qui contiendra 0 ou plusieurs index en fonction de combien de lettre
	 * sont trouvées
	 * 
	 */
	
	public static int indexDeLaLettre(char lettreDemandee, char[] listeAvecToutesLesLettres) {
		int indexDeLaLettre = -1;
		
		for (int i = 0; i < listeAvecToutesLesLettres.length; i++) {
			if (lettreDemandee == listeAvecToutesLesLettres[i]) {
				indexDeLaLettre = i;
			}
		}
		return indexDeLaLettre;
	}
	
	/**
	 * Va modifier un tableau de X si une lettre a été trouvée 
	 * avec cette lettre et à son endroit grâce à l'index donné
	 * @return tableau modifié
	 * @params int index, char[] tableauAvecMotCachee, char lettreDemande
	 */
	
	public static char[] lettresTrouvees(int index, char[] tableauAvecMotCachee, char lettreDemande) {
		for (int i = 0; i < tableauAvecMotCachee.length; i++) {
			tableauAvecMotCachee[index] = lettreDemande;
		}
		System.out.println("La progression du mot : "+Arrays.toString(tableauAvecMotCachee));
		return tableauAvecMotCachee;
	}
	
	
	/**
	 * Fonction générique qui va loguer une demande de nombre décimal
	 * par l'utilisateur
	 */
	
	public static double inputDouble(String message) {
		System.out.println(message);
		Scanner scan = new Scanner(System.in);
		return scan.nextDouble();
		
	}
	
	/**
	 * Génère un nombre aléatoire
	 * @param int limit
	 * @return nombre
	 */
	
	public static int randomInt(int limit) {
		int nombre = new Random().nextInt(limit);
		return nombre;
		
	}
	
	/*
	 * Pour Exo 5.
	 * Va afficher les avis des notes
	 * avec les appreciations
	 */
	
	public static void afficheAvis(ArrayList<Integer> liste) {
		
		for(int i = 0; i < liste.size(); i++) {
			System.out.println("eleve numero" + i + " a eu : " + liste.get(i) + " ; commentaire : " );
			if (liste.get(i) > 17) {
				System.out.println("excellent, bon travail");
			} else if ((14 < liste.get(i)) && (liste.get(i) < 18)) {
				System.out.println("Bien");
			} else if ((10 < liste.get(i)) && (liste.get(i) < 15)) {
				System.out.println("Peut mieux faire");
			} else if ((4 < liste.get(i)) && (liste.get(i) < 11)) {
				System.out.println("Insuffisant");
			} else {
				System.out.println("Catastrophique, il faut tout revoir");
			}
		}
	}
	
	/**
	 * Fonction qui va générer les balles chargées dans 
	 * un barillet. Maximum 7 balles
	 * @params int nombes de balles à charger
	 * return list int barillet chargé
	 */
	
	public static ArrayList<Integer> generateBarillet(int nbBalle) {
		// Créé une liste de balles présentes dans mon barillet
		ArrayList<Integer> barillet = new ArrayList<>(); 
		
		// Liste de 0 pour les 8 chambres disponibles
		for (int i = 0; i < 8; i++) {
			barillet.add(0);
		}
		
		// Tant qu'il reste encore des balles
		while (nbBalle > 0) {
			// On les rentre chacune dans le barillet, dans l'ordre (doit afficher 1 par balle)
			barillet.set(nbBalle, 1);
			nbBalle--;
			
		}
		System.out.println("Pistolet chargé : "+barillet);
		return barillet;
	}
	
	/**
	 * Va faire tourner le barillet de façon aléatoire
	 * @params liste int barillet chargé
	 * @return liste int barillet mélangé
	 */
	
	public static ArrayList<Integer> shuffleBarillet(List<Integer> barillet) {
		Random rn = new Random();
		int aleatoire = rn.nextInt(10) + 1;
		// La liste récupère la liste des balles mélangées
		Collections.rotate(barillet, aleatoire);
		
		System.out.println("Barillet tourné ! "+ barillet);
		return (ArrayList<Integer>) barillet;
		
	}
	
	/**
	 * Fonction qui va retourner vraie
	 */
	
	/**
	 * permet d'entrer un mot à deviner
	 * @return le mot à deviner
	 */
	
	public static String motSecret() {
		String secret = "";
		while(secret.length() == 0) {
			secret = Tools.inputString("choisissez un mot à deviner");
		}
		return secret.toLowerCase();
	}
	
	/**
	 * initialise l'affichage du mot secret
	 * @param mot : secret à camoufler
	 * @return une liste de "-" pour chaque caractère du mot secret
	 */
	
	public static String Init(String mot) {
		int lg_mot = mot.length();
		String mot_vue = "";
		System.out.println("Le mot fait "+lg_mot+" lettres : ");
		for(int i = 0; i <= lg_mot; i++) {
			mot_vue += "_ ";
		}
		return mot_vue;
	}
	
	/**
	 * permet de choisir une lettre
	 * @return 
	 * @return la lettre choisie en minuscule
	 */
	
	 public static String choixLettre() {
		 String saisie = "";
		 while(saisie.length() != 1) {
			 saisie = Tools.inputString("Entrez une lettre");
		 }
		 return saisie.toLowerCase();
	 }
	 
		/**
		 * verifie si un caractère est présent dans la liste des saisies
		 * @param listSasies: string qui est une concaténation des caractères joués
		 * @param saisi String le caractère à tester
		 * @return true si présent, false si absent
		 */
		
		 public static boolean dejaSaisie(List<String> listSaisies, String saisi) {
			 boolean dejaChoisi = false;
			 for (int i = 0; i < listSaisies.size(); i++) {
				if (listSaisies.get(i).equals(saisi));
			}
			 return dejaChoisi;
		 }
		 
		 /**
		  * Renvoie la position du caractere dans le tableau  
		  * -1 si il n'est pas dans le tableau 
		  * @param c
		  * @param tab
		  * @return
		  */
		 
	    public static int posChar(char c, char[] tab)  {
	        for(int i = 0; i < tab.length; i++)   { 
	            if(tab[i] == c) return i;
	        }   return -1; 
	     }  
	    
	 // Valeur absolue de a  
	    public static int abs(int a)  {
	        if(a >= 0) return a;
	        else return -a;
	    }
	    
	    /**
	     *  Donne la nouvelle position dans l'alphabet en fonction de n  
	     * @param pos
	     * @param n
	     * @return
	     */
	    static int newPos(int pos,int n)  {
	        int pos2 = pos;
	        if(pos <= -1) { // -1 signifie que le caractere n'a pas été trouvé dans l'alphabet (caractere spécial, chiffre, espace, etc.)
	            pos2 = -1;   
	        } else {
	            int i = 0;
	            while(i < abs(n)) {
	                if(n < 0) {
	                    if(pos2 - 1 == -1) pos2 = 25;
	                    else pos2--;
	                } else {
	                    if(pos2 + 1 >= 25) pos2 = 0;
	                    else pos2++;
	                }
	                i++;
	            }
	        }
	        return pos2;
	    }
}
