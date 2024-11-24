package tp4;

public class Produit {
	private long id;
	private String nom;
	private double prix;
	public Produit(long id,String nom,double prix) {
		this.id=id;this.nom=nom;this.prix=prix;	
	}
	
	public long getId() {return this.id;}
	public String getNom() {return this.nom;}
	public double getPrix() {return this.prix;}
	
	public void setId(long i) {this.id=i;}
	public void setNom(String n) {this.nom=n;}
	public void setPrix(double p) { this.prix=p;}
}
