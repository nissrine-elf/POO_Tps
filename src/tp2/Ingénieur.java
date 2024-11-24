package tp2;

public class Ingénieur extends Employe {
	private String specialite;
	public Ingénieur(String nom,String prenom,String email,String tele,double salaire,String s) 
	 { super(nom,prenom,email,tele,salaire);
	 this.specialite=s;
	 }
	// Retourne le salaire avec l'augmentation
	public  double calculerSalire()
	{return this.salaire+=this.salaire*0.15;}	
	public String getSep()
	{return this.specialite;}	

}