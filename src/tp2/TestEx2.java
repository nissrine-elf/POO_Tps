package tp2;

import java.util.Scanner;

public class TestEx2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Donner les information de l'ingenieur : non ,prenom ,email ,tele ,salaire et spécialité");
		// Saisie des informations de l'ingénieur
		String nom=s.nextLine();
		String prenom=s.nextLine();
		String email=s.nextLine();
		String tele=s.nextLine();
		double sal=s.nextDouble();
		s.nextLine();
		String sep=s.nextLine();
		
		// Création de l'ingénieur
		Ingénieur I1=new Ingénieur(nom,prenom,email,tele,sal,sep);	
		 // Création d'un manager
		Manager M1=new Manager("ali","lef","ali@gmail.com","0355447722",9000,"service x");	
		// Affichage des informations de l'ingénieur
		System.out.println("Ingénieur : nom :"+I1.nom+" prenom :"+I1.prenom+" email :"+I1.email+" tel :"+I1.tele+" salaire :"+I1.salaire +" spécialité :"
		+I1.getSep());
		I1.calculerSalire(); // Calcul et affichage du nouveau salaire de l'ingénieur
		System.out.println("le salaire de Ingénieur : "+I1.nom+" aprés changement est : "+I1.salaire );
        // Affichage des informations du manager
		System.out.println("Manager :"+M1.nom+" prenom :"+M1.prenom+" email :"+M1.email+" tel :"+M1.tele+" salaire :"+M1.salaire +" service :"+M1.getSep());
		M1.calculerSalire(); // Calcul et affichage du nouveau salaire du manager
		System.out.println("le salaire de Manager : "+M1.nom+" aprés changement est "+M1.salaire );


	}

}
