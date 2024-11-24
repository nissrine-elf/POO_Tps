package tp4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex2Maps {

	public static void main(String[] args) {
		Map<String,Double>qde=new HashMap<>();
		Scanner s=new Scanner(System.in);
		qde.put("ali", 12.88);
		qde.put("salma", 19.88);
		qde.put("simo", 20.00);
		//affichage
		qde.keySet().forEach(k->System.out.println(k+":"+qde.get(k)));
		
		 System.out.println("entrer le  nom d'etudiant pour  augmenter la note"); 
		 String key=s.nextLine().toLowerCase();
		 System.out.println("entrer la nouvelle note :");
		 double note=s.nextDouble();
		 for (String k : qde.keySet()) {
		 if (k.toLowerCase().equals(key)) {
	            qde.put(k, note);
	        }}
		 System.out.println("Liste des étudiants et leurs notes après modification :");
			qde.keySet().forEach(k->System.out.println(k+":"+qde.get(k)));
			//Supprimer un étudiant
		qde.remove("salma");
	      // Affichage après suppression
		 System.out.println("Liste après suppression de 'salma' :");
		qde.keySet().forEach(k->System.out.println(k+":"+qde.get(k)));
		
		System.out.println("taille du map : "+qde.size());
		//max,min
		 double max = 0;
	        double min = 20;

	        for (double no : qde.values()) {
	          
	            if (no > max) max = no;
	            if (no < min) min = no;
	        }
	        System.out.println("max :"+max+" min : "+min);
		//note moyenne
		//som
		double som=0;
		 for(String k:qde.keySet()) {
			 som=som+qde.get(k);
		 }
		double moy=som /qde.size();
		System.out.println("moyenne des notes : "+moy);
		//si note=20
		for(String k:qde.keySet()) {
			 if(qde.get(k)==20) {
				 System.out.println("Il y a un étudiant avec une note de 20");
				 break;
			 }
			 else {System.out.println("Il n'y a pas d'étudiant avec une note de 20"); break;}
		 }	

	}

}
