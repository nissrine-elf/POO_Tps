package tp2;

public class TestEx1 {

	public static void main(String[] args) {
		Adherent a1= new Adherent(22,"ali","ali.el@gmail.com","0655443377","el ali",1234 ) ;
		Auteur auteur=new Auteur (30,"Simo","simo.el@gmail.com","0655332211","el simo",1235 ) ;
		// Création d'un livre écrit par l'auteur
		Livre l1=new Livre(13,"Hello",auteur);
		 // Affichage des informations de l'adhérent et du livre
		a1.afficher();
		l1.afficher();	

	}

}
