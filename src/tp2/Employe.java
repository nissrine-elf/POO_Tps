package tp2;

public abstract class Employe {
	protected String nom;
	protected String prenom;
	protected String email;
	protected String tele;
	protected double salaire;
	
	public Employe(String nom,String prenom,String email,String tele,double salaire ) 
	{this.nom=nom;this.prenom=prenom;this.email=email;this.tele=tele;this.salaire=salaire;}
	
	public abstract double calculerSalire();

}

