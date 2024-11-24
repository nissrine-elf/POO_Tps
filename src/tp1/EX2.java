package tp1;

import java.util.Scanner;

public class EX2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.printf("Entrez un verbe du premier groupe : ");
		 // Lecture et suppression des espaces inutiles
		String verbe=s.nextLine().trim();
		// Récupération des deux derniers caractères
		String subverbe=verbe.substring(verbe.length()-2,verbe.length());
		//Extraction du radical du verbe
		String radical=verbe.substring(0,verbe.length()-2 );
		 // Vérification que le verbe se termine par "er"
		if(! subverbe.equals("er")) {
			System.out.printf("Ce n'est pas un verbe du premier groupe (il doit se terminer par 'er'). ");
		
		}
		else {
			System.out.println("je "+radical+"e");
			System.out.println("tu "+radical+"es");
			System.out.println("il "+radical+"e");
			System.out.println("nous "+radical+"ons");
			System.out.println("vous "+radical+"ez");
			System.out.println("ils "+radical+"ent");
			
		}
	}
}
  