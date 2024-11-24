package tp2;

import java.util.ArrayList;
import java.util.List;

public class Catégorie {
	private String nom;
	private String description;	
	private List<Ordinateur> lstOrdinateurs;
	public Catégorie(String nom, String description) {
        this.nom = nom;
        this.description = description;
        this.lstOrdinateurs = new ArrayList<>();
    }
	  // Méthode pour ajouter un ordinateur à la liste
	public void ajouterOrdinateur(Ordinateur ordinateur) {
		if (!lstOrdinateurs.contains(ordinateur)) {
			lstOrdinateurs.add(ordinateur);
        } }
	// Méthode pour supprimer un ordinateur de la liste
	
public void supprimerOrdinateur(Ordinateur ordinateur) {
	if (!lstOrdinateurs.contains(ordinateur)) {
		lstOrdinateurs.remove(ordinateur);
	}	
}
//Méthode pour rechercher des ordinateurs par prix
public List<Ordinateur> rechercherParPrix(double prix ){
	List<Ordinateur> res=new ArrayList<>();
	for(Ordinateur o : lstOrdinateurs)
	{
		if (o.getPrix()==prix) {
		res.add(o);}
	}

	return res;}
public String getNom() {return this.nom;}
public String getDes() {return this.description;}
public void setNom(String nom) {this.nom=nom;}
public void setDes(String des) {this.description=des;}
public String toString(){return " Catzgorie : "+this.getNom()+" description = "+this.getDes() +" ordinateur : "+this.lstOrdinateurs;}
}
