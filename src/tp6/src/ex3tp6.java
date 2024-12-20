import java.util.Scanner;
public class ex3tp6 {
    public static void main(String[] args) {
       MetierProduitImpl mp=new MetierProduitImpl();
        Scanner s = new Scanner(System.in);
        int choix;
        do {   System.out.println("Menu  :");
            System.out.println("1. Afficher la liste des produits.");
            System.out.println("2.  Rechercher un produit par son nom ");
            System.out.println("3.  Ajouter un nouveau produit dans la liste");
            System.out.println("4. Supprimer un produit par nom");
            System.out.println("5. Sauvegarder les produits ");
            System.out.println("6.  Quitter ce programme. ");
            System.out.print("Veuillez choisir une option : ");
            choix=s.nextInt();
            s.nextLine();
            switch(choix) {
                case 1 :  System.out.print("la liste des produits : ");
                    mp.getAll().forEach(System.out::println);
                    break;
                case 2 :
                    System.out.print("Entrez le nom du produit  à rechercher : ");
                    String nomp = s.nextLine();
                    Produit produitTrouve = mp.findByNom(nomp);
                    if (produitTrouve != null) {
                        System.out.println(produitTrouve.toString());
                    } else {
                        System.out.println("Produit non trouvé.");
                    }break;
                case 3 :
                    System.out.print("Entrez le nom du produit : ");
                    String nom=s.nextLine();
                    System.out.print("Entrez la marque du produit : ");
                    String marque=s.nextLine();
                    System.out.print("Entrez description du produit : ");
                    String des=s.nextLine();
                    System.out.print("Entrez prix du produit : ");
                    double prix=s.nextDouble();
                    System.out.print("Entrez nombre en stock du produit : ");
                    int nbrStock=s.nextInt();
                    s.nextLine();
                    mp.add(new Produit(nom,marque,des,prix,nbrStock));
                    System.out.println("produit ajouté avec succès !");
                    break;
                case 4 :
                    System.out.print("Entrez le nom du produit à supprimer : ");
                    String nomSup = s.nextLine();
                   mp.delete(nomSup);
                    System.out.println("produit supprimé avec succès !");
                    break;
                case 5:  mp.saveAll();  System.out.println("produits sauvgardés."); break;
                case 6 :
                    System.out.println("vous quittez ");break;
                default :
                    System.out.println("Choix invalide. Veuillez réessayer.");break;
            }
            if (choix != 6) {
                System.out.println("Frappez une touche pour revenir au menu:");
                s.nextLine();
            }
        }while(choix!=6);
    }
}
