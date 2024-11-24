package tp1;

import java.util.Scanner;

public class EX4 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int nb_occurreances[]=new int [26];// Tableau pour stocker le nombre d'occurrences de chaque lettre
		System.out.println("Entrez une ligne de texte (max. 100 caractères) :   ");
		String ch=s.nextLine();
		if(ch.length()>100) { // Limite la chaîne à 100 caractères si nécessaire
			ch = ch.substring(0, 100);
			
		}
		 for(int i=0;i<ch.length();i++) {
			char car=ch.charAt(i);// Récupère le caractère à l'index i
			if(Character.isLetter(car)) {
			car=Character.toLowerCase(car);// Convertit le caractère en minuscule
			// Calcule l'index correspondant dans le tableau (ex :0 pour 'a', 1 pour 'b', etc.)
			int j=car - 'a';
			// Incrémente le compteur pour cette lettre
			nb_occurreances[j]++;	} 
		 } 
		 System.out.println("La chaîne "+ch+" contient : ");
			for(int i=0;i<nb_occurreances.length;i++) {
				// Vérifie si la lettre a au moins une occurrence
			if (nb_occurreances[i] > 0) {
				char l=(char)(i+'a');// Convertit l'index en lettre
				System.out.println(nb_occurreances[i] + " fois la lettre '" + Character.toUpperCase(l)+"'");
				
			}
		}
	}
}