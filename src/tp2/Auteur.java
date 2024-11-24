package tp2;

public class Auteur  extends Personne{
	private int numAuteur;
	public Auteur (int age,String nom,String email,String tel,String prenom,int NUM)
	{super(nom,prenom,age,email,tel);// Appel du constructeur de la classe parent
		this.numAuteur=NUM;
	}
	public void afficher() { super.afficher();// Affichage des informations de la personne
	System.out.print(" Num Auteur : "+this.numAuteur);}
}
