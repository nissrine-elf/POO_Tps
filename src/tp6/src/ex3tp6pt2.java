import java.util.Scanner;
public class ex3tp6pt2 { public static void main(String[] args) {
    MetierClientImpl mc=new MetierClientImpl();
    Scanner s = new Scanner(System.in);
    int choix;
    do {   System.out.println("Menu  :");
        System.out.println("1. Afficher la liste des clients.");
        System.out.println("2.  Rechercher un client par son nom ");
        System.out.println("3.  Ajouter un nouveau client dans la liste");
        System.out.println("4. Supprimer un client par nom");
        System.out.println("5. Sauvegarder les clients ");
        System.out.println("6.  Quitter ce programme. ");
        System.out.print("Veuillez choisir une option : ");
        choix=s.nextInt();
        s.nextLine();
        switch(choix) {
            case 1 :   if (mc.getAll().isEmpty()) {
                System.out.println("Aucun client trouvé.");
            } else {
                System.out.println("La liste des clients : ");
                mc.getAll().forEach(System.out::println);
            }break;
            case 2 :
                System.out.print("Entrez le nom du client  à rechercher : ");
                String nomc = s.nextLine();
                Client clientTrouve = mc.findByNom(nomc);
                if (clientTrouve != null) {
                    System.out.println(clientTrouve.toString());
                } else {
                    System.out.println("client non trouvé.");
                }break;
            case 3 :
                System.out.print("Entrez le nom du client : ");
                String nom=s.nextLine();
                System.out.print("Entrez prenom du client : ");
                String prenom=s.nextLine();
                System.out.print("Entrez adresse du client : ");
                String add=s.nextLine();
                System.out.print("Entrez email du client : ");
                String email=s.nextLine();
                System.out.print("Entrez ville du client : ");
                String ville=s.nextLine();
                System.out.print("Entrez tel du client : ");
                String tel =s.nextLine();
                mc.add(new Client(nom,prenom,add,email,ville,tel));
                System.out.println("client ajouté avec succès !");
                break;
            case 4 :
                System.out.print("Entrez le nom du client à supprimer : ");
                String nomSup = s.nextLine();
                mc.delete(nomSup);
                System.out.println("client supprimé avec succès !");
                break;
            case 5:  mc.saveAll();  System.out.println("clients sauvgardés."); break;
            case 6 :
                System.out.println("vous quittez ");break;
            default :
                System.out.println("Choix invalide. Veuillez réessayer.");break;
        }
        if (choix != 6) {
            System.out.println("Frappez une touche pour revenir au menu:");
            s.nextLine();
        }
    }while(choix!=6);}}
