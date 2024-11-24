package tp2;

import java.util.List;
import java.util.Scanner;

public class TestEx4 {

	public static void main(String[] args) {
		MetierProduitImpl m1=new MetierProduitImpl();
		boolean run=true;
		Scanner s=new Scanner(System.in);
		while(run) {
			System.out.println("Menu  :");
			System.out.println("1. Afficher la liste des produits");
	        System.out.println("2. Rechercher des produits par mot clé");
	        System.out.println("3. Ajouter un nouveau produit");
	        System.out.println("4. Récupérer et afficher un produit par ID");
	        System.out.println("5. Supprimer un produit par ID");
	        System.out.println("6. Quitter");
	        System.out.print("Choisissez une option : ");
			int c=s.nextInt();	
			 s.nextLine();
			switch(c) {
			
			case 1 : 
				List<Produit> listP1=m1.getAll();
				
				if (listP1.isEmpty()) {
			        System.out.println("Aucun produit disponible. Vous pouvez ajouter un produit (option 3) .");
			    } else {
			        for(Produit pi : listP1) {
			        	System.out.println("id = "+pi.getId()+", Nom :"+pi.getNom());
			  
			        }
			    }
			    break;
			
			case 2 :
			System.out.println("entrez un mot clé :");
			
			String motCle=s.nextLine();
			List<Produit> listP2=m1.findByNom(motCle);
			  if (listP2.isEmpty()) {
	              System.out.println("Aucun produit trouvé avec le mot clé '" + motCle + "'.");
	          }else {
			for(Produit pii : listP2) {
	        	System.out.println(" id = "+pii.getId()+"le nom :"+pii.getNom());
	  
	        }}
	        break;
	          
			case 3:
				System.out.println("donnez les informations de produit pour ajouter a liste : ");
	             System.out.println("id :");
				long idd=s.nextLong();
				s.nextLine();
				System.out.println("nom : ");
				
				String nom=s.nextLine();
				
				System.out.println("marque :");
				String mar=s.nextLine();
				System.out.println("description :");
				String des=s.nextLine();
				System.out.println("prix :");
				double prix=s.nextDouble();
				System.out.println("nombreEnStock :");
				int nb=s.nextInt();
				Produit pp=new Produit(idd,nom,mar,prix,des,nb);
				m1.add(pp);
				System.out.println("Produit ajouté avec succès.");
				break;
			case 4:
				 System.out.print("Entrez l'ID du produit : ");
	             long pId = s.nextLong();
	             Produit pTrouve = m1.findById(pId);
	             if (pTrouve != null) {
	                 System.out.println(pTrouve.getNom() +"est trouvé ");
	             } else {
	                 System.out.println("Produit non trouvé.");
	             }
	             break;
			case 5 :
				System.out.print("Entrez l'ID du produit : ");
	            long p2Id = s.nextLong();
	           m1.delete(p2Id);
	           System.out.println("Produit supprimé .");
				break;
			case 6:
				run=false;
				System.out.println("Programme terminé.");
				break;
				default:
			System.out.println("Choix invalide. Essayez encore.");	
				
			}	
		}

	}

}
