import java.io.Serializable;
public class Produit implements Serializable {
    private String nom;
    private String marque;
    private String description;
    private double prix;
    private int nmbStock;
    public Produit(String nom, String marque, String description, double prix, int nmbStock) {
        this.nom = nom;
        this.marque = marque;
        this.description = description;
        this.prix = prix;
        this.nmbStock = nmbStock;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getMarque() {
        return marque;
    }
    public void setMarque(String marque) {
        this.marque = marque;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public double getPrix() {
        return prix;
    }
    public void setPrix(double prix) {
        this.prix = prix;
    }
    public int getNmbStock() {
        return nmbStock;
    }
    public void setNmbStock(int nmbStock) {
        this.nmbStock = nmbStock;
    }
    @Override
    public String toString() {
        return  "nom='" + nom + '\'' + ", marque='" + marque + '\'' + ", description='" + description + '\'' + ", prix=" + prix +
                ", nmbStock=" + nmbStock +
                '.';}}


