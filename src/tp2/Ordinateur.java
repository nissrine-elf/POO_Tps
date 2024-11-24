package tp2;



public class Ordinateur {
	private String nom;
	private String marque;
	private String description;
	private double prix;
	private int nmbStock;
	private Catégorie catégorie;
public Ordinateur(String nom,String marque,String description,double prix,int nmbStock,Catégorie catégorie){
	this.nom=nom;this.marque=marque;this.description=description;this.nmbStock=nmbStock;this.prix=prix;	
	this.catégorie = catégorie;
}
//Méthode pour calculer le prix pour une quantité donnée
public double prixPourQuantité(int qun) {return this.prix*qun;}
//les methodes get et set 
public 	double getPrix() {return this.prix;}
public String getNom() {return this.nom;}
public String getDes() {return this.description;}
public Catégorie getCat() {return this.catégorie;}
public void setNom(String nom) {this.nom=nom;}
public void setDes(String des) {this.description=des;}
public void setPrix(double p) {this.prix=p;}
public String getmarq() {return this.marque;}
public void setMarq(String mar) {this.marque=mar;}
public int getNmbs() {return this.nmbStock;}
public void setNmbs(int nmb) {this.nmbStock=nmb;}
//methose toString
public String toString() {
    return "Ordinateur : " + this.getNom() +  ", marque='" + this.getmarq() +  ", prix=" 
+ this.getPrix() + ", description='" + this.getDes() + ", nombreEnStock=" + this.getNmbs() 
+ ", catégorie=" + (catégorie != null ? catégorie.getNom() : "Aucune") +" .";
}

}
