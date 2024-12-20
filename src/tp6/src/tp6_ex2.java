import java.util.Scanner;
public class tp6_ex2 {
    public static void main(String[] args) {
        DossierContact d=new DossierContact();
        Scanner s = new Scanner(System.in);
        int choix;
        do {   System.out.println("Menu  :");
            System.out.println("1. Rechercher un numéro de téléphone");
            System.out.println("2. Ajouter un nouveau contact ");
            System.out.println("3. Supprimer un contact");
            System.out.println("4. Changer le numéro de téléphone d’un contact");
            System.out.println("5. Quitter ce programme");
            System.out.print("Veuillez choisir une option : ");
            choix=s.nextInt();
            s.nextLine();
            switch(choix) {
                case 1 :  System.out.print("Entrez le nom du contact à rechercher : ");
                String nom=s.nextLine();
                String num=d.RechercherCont(nom);
                    if (num != null) {
                        System.out.println("Le numéro de " + nom + " est : " + num);
                    } else {
                        System.out.println("Contact non trouvé !");
                    }
                break;
                case 2 :
                    System.out.print("Entrez le nom du nouveau contact : ");
                    String nomAj = s.nextLine();
                    System.out.print("Entrez le numéro de téléphone : ");
                    String numAj = s.nextLine();
                    d.ajouterCont(nomAj,numAj);
                    System.out.println("Contact ajouté avec succès !");
                    break;
                case 3 :
                    System.out.print("Entrez le nom du contact à supprimer : ");
                    String nomSp = s.nextLine();
                    d.supprimerCont(nomSp);
                    System.out.println("Contact supprimé avec succès !");
                    break;
                case 4 :
                    System.out.print("Entrez le nom du contact à modifier : ");
                    String nomMdf = s.nextLine();
                    System.out.print("Entrez le nouveau numéro de téléphone : ");
                    String nvNum = s.nextLine();
                    d.changerNum(nomMdf, nvNum);
                    System.out.println("Numéro modifié avec succès !");
                    break;
                case 5 :
                    d.enrgisterCont();
                    System.out.println("vous quittez ");break;
                default :
                    System.out.println("Choix invalide. Veuillez réessayer.");break;
            }
            if (choix != 5) {
                System.out.println("Frappez une touche pour revenir au menu:");
                s.nextLine();
            }
        }while(choix!=5);
    }
}
