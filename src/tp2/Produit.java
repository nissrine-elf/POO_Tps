package tp2;

public class Produit {
	private long id;
	private String nom;
	private String marque;
	private String description;
	private double prix;
	private int nmbStock;
	public Produit(long id, String nom, String marque, double prix, String description, int nombreEnStock) {
        this.id = id;
        this.nom = nom;
        this.marque = marque;
        this.prix = prix;
        this.description = description;
        this.nmbStock = nombreEnStock;
    }
	public String getNom() {return this.nom;}
	public long getId() {return this.id;}
}
