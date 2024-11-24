package tp1;

import java.util.Scanner;

public class EX3 {
	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		Scanner s=new Scanner(System.in);
		int opération;// Variable pour stocker le choix de l'utilisateur
		String chaine="";// Variable pour stocker la chaîne saisie
			 do {   System.out.println("Menu des opérations :");
		            System.out.println("1. Saisir une chaîne");
		            System.out.println("2. Afficher la chaîne");
		            System.out.println("3. Inverser la chaîne");
		            System.out.println("4. Compter le nombre de mots");
		            System.out.println("5. Quitter");
		            System.out.print("Veuillez choisir une option : ");
		opération=s1.nextInt();
		
			switch(opération) {
			case 1 :
			System.out.print("Entrez une chaîne de caractères : ");
            chaine = s.nextLine();
            break;
			case 2 : if (chaine.isEmpty()) {//si user pas saisie une chaine 
                System.out.println("La chaîne est vide. Veuillez saisir d'abord une chaîne (choix 1).");
            } else {
                System.out.println("Chaîne saisie : " + chaine);
            }
			break;
			case 3 : if (chaine.isEmpty()) {
                System.out.println("La chaîne est vide. Veuillez saisir d'abord une chaîne (choix 1).");
            } else {
                String invch = new StringBuilder(chaine).reverse().toString();
                System.out.println("Chaîne inversée : " + invch);
            }break;
			case 4 :
				  if (chaine.isEmpty()) {
                      System.out.println("La chaîne est vide. Veuillez saisir d'abord une chaîne (choix 1).");
                  } else {
                      String mots[] = chaine.trim().split("\\s+");
                      System.out.println("Nombre de mots : " + mots.length);
                  }break;
			case 5 :System.out.println("vous quittez ");break;
			default :
				System.out.println("Choix invalide. Veuillez réessayer.");break;
			}
			if (opération != 5) {// Retour au menu après chaque opération
                System.out.println("Frappez une touche pour revenir au menu:");
                s.nextLine();// Attente de la saisie de l'utilisateur 
            }
		}while(opération!=5);
	}

}


