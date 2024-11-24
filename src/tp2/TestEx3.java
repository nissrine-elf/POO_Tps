package tp2;

import java.util.ArrayList;
import java.util.List;

public class TestEx3 {

	public static void main(String[] args) {
		Catégorie cat;
		List<LigneCommande> lgcom=new ArrayList<>();
		Client cl1=new Client("nissrine","elf","mohammedia","elf@nissrine.com","mohammedia","0622334455");
		 cat=new Catégorie("laptops","ordinateurs portables");
		
		Commande com=new Commande("reference 1",cl1,"02/11/24","en cours");
		Ordinateur o1=new Ordinateur("laptop 1","marque 1","ordinateur de marque 1",25000,40,cat);	
		Ordinateur o2=new Ordinateur("laptop 2","marque 2","ordinateur de marque 2",45000,10,cat);	
		Ordinateur o3=new Ordinateur("laptop 3","marque 3","ordinateur de marque 3",85000,5,cat);	
		cat.ajouterOrdinateur(o1);
		cat.ajouterOrdinateur(o2);
		cat.ajouterOrdinateur(o3);
		 LigneCommande com1=new LigneCommande(2,com,o1);
		 LigneCommande com2=new LigneCommande(1,com,o2);
		 LigneCommande com3=new LigneCommande(1,com,o3);
		lgcom.add(com1);
		lgcom.add(com2);	 
		lgcom.add(com3);
		System.out.println(cl1.toString() +"les information sur commande  : " );
		for(LigneCommande lg : lgcom) {
			System.out.println(lg.toString());} 
		
		
		
	}

}
