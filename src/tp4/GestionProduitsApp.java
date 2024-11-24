package tp4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class GestionProduitsApp {
	public static void main(String[] args) {
		List <Produit>produit =new ArrayList<>();
		Scanner s=new Scanner(System.in);
		produit.add(new Produit(1,"produit 1",1000));
		produit.add(new Produit(2,"produit 2",2000));
		produit.add(new Produit(3,"produit 3",3000));
		 // Affichage de la liste initiale des produits
			for(Produit p:produit) {
				System.out.println(" id : "+p.getId()+" le nom : "+p.getNom()+" le prix : "+p.getPrix());}
		// Suppression du produit à l'indice 1 
	    produit.remove(1);
	    System.out.println("Après suppression du produit à l'indice 1 :"); 
	    for(Produit p:produit) {
			System.out.println("  id : "+p.getId()+" le nom : "+p.getNom()+" le prix : "+p.getPrix());}
	    System.out.println("entrer indice du produit à modifier");  
	long idmod=s.nextLong();
	System.out.println("entrer le nom :");
	s.nextLine();
	String nom=s.nextLine();
	System.out.println("entrer le prix :");
	double prix=s.nextDouble();
	for(Produit p:produit) {
		if(p.getId()==idmod) {
			p.setNom(nom);
	p.setPrix(prix);}}	
	System.out.println("aprés modification :");
	for(Produit p:produit) {
		System.out.println("le id : "+p.getId()+" le nom : "+p.getNom()+" le prix : "+p.getPrix());}
	System.out.println("entrer le nom  du produit à rechercher :");
	s.nextLine();
	String nomcher=s.nextLine();
	int k=0;
	boolean pExiste = false;
	for (Produit p : produit) {
	    if (p.getNom().equalsIgnoreCase(nomcher)) {
	        System.out.println("Produit trouvé : ID : " + p.getId() + ", Nom : " + p.getNom() + ", Prix : " + p.getPrix());
	        pExiste = true;
	        break;}}
	// Si le produit n'est pas trouvé
	if (!pExiste) {
	    System.out.println("Aucun produit trouvé avec ce nom.");
	}}
}
