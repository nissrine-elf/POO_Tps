package tp2;

import java.util.ArrayList;
import java.util.List;


public class Client {
	private String nom;
	private  String prenom;
	private String adresse;
	private String email;
	private String ville;
	private String tel;
	private List<Commande> lstCommande;
	public Client(String nom, String p,String a,String e,String v,String t) {
        this.nom = nom;
        this.prenom = p;
        this.adresse=a;
        this.email=e;
        this.ville=v;
        this.tel=t;
        this.lstCommande = new ArrayList<>();
    }
	 // Méthode pour ajouter une commande à la liste
		public void ajouterOrdinateur(Commande com) {
			if (!lstCommande.contains(com)) {
				lstCommande.add(com);
	        } }
		// Méthode pour supprimer une commande  de la liste
		
		public void supprimerOrdinateur(Commande com) {
			if (!lstCommande.contains(com)) {
				lstCommande.remove(com);
			}	
		}
		public String getNom() {return this.nom;}
		public String getPrenom() {return this.prenom;}
		public void setNom(String nom) {this.nom=nom;}
		public void setPrenom(String pre) {this.prenom=pre;}
		public String getAds() {return this.adresse;}
		public String getEmail() {return this.email;}
		public void setAds(String ad) {this.adresse=ad;}
		public void setEmail(String e) {this.email=e;}
		public String getVille() {return this.ville;}
		public String getTel() {return this.tel;}
		public void setVille(String v) {this.ville=v;}
		public void setTel(String t) {this.tel=t;}
		public String toString() {
		    return "Client : "  + this.getNom() + ", prénom='" + this.getPrenom() +  ", adresse='" + this.getAds() +", email='" + this.getEmail()
		    +", ville='" + this.getVille() +", téléphone='" + this.getTel();
		}	
	
}