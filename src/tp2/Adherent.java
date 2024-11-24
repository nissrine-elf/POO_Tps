package tp2;

public class Adherent extends Personne{
	private int numAdherent ;
	public Adherent (int age,String nom,String email,String tel,String prenom,int NUM)
	{super(nom,prenom,age,email,tel);
		this.numAdherent=NUM;
		
	}

    // Redéfinition de la méthode afficher
	public void afficher() {
		// Affichage des informations de la personne
		super.afficher();
	System.out.println(" Num Adherent :"+this.numAdherent);}
	
}