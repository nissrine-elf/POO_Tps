package tp2;

public class Livre {
	private int ISBN ;
	private Auteur auteur;
	private String titre;
	public Livre(int ISBN,String titre,Auteur auteur) {
		this.titre=titre;
		this.ISBN=ISBN;
		this.auteur=auteur;
	}
	//Méthode pour afficher les informations du livre
	public void afficher() {
		System.out.print("le titre : "+this.titre+" ISBN : "+this.ISBN+" ");
		auteur.afficher();	// Affiche les informations de l'auteur
	}
}
