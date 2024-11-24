package tp4;

import java.util.HashSet;

public class Ex3Sets {
	public static void main(String[] args) {
		HashSet<String> groupeA=new HashSet();
		HashSet<String> groupeB=new HashSet();
		groupeA.add("ali");
		groupeA.add("simo");
		groupeA.add("SALMA");
		groupeB.add("salma");
		groupeB.add("ali");
		groupeB.add("zineb");
		//affichage d'intersection
		System.out.println("l’intersection des deux HashSets.");
		for(String nom:groupeA) {
			for(String n:groupeB) {
				if(nom.equalsIgnoreCase(n)) {System.out.println(nom.toLowerCase());}}}
		System.out.println("l’union des deux HashSets.");
		 HashSet<String> union = new HashSet<>();
		 for(String n:groupeA) {
	                union.add(n.toLowerCase()); }// Ajouter tous les éléments de groupeA dans l'union
		for(String n:groupeB) {
			 if (!union.contains(n.toLowerCase())) {
	                union.add(n.toLowerCase());  }}  // Ajouter les éléments de groupeB s'ils ne sont pas déjà dans l'union
		//affichage de l'union
		for (String nom : union) {
            System.out.println(nom);  }}
}
