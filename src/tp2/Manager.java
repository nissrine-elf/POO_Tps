package tp2;

public class Manager extends Employe {
	private String service;
	public Manager(String nom,String prenom,String email,String tele,double salaire,String s) 
	 { super(nom,prenom,email,tele,salaire);
	 this.service=s;
	 }// Retourne le salaire avec l'augmentation
	public  double calculerSalire()
	{return this.salaire+=this.salaire*0.20;}
	public String getSep()
	{return this.service;}
}
