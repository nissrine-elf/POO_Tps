package tp2;



public class LigneCommande {
	private int quantite;
	private Commande commande;
	private Ordinateur ordinateurCom;
	
public LigneCommande(int q, Commande c,Ordinateur o)	{
	this.quantite=q;
	this.commande=c;
	this.ordinateurCom=o;
}
public int getQuantite() {return this.quantite;}

public void setuantite(int q) {this.quantite=q;}
public String toString() {
    return "LigneCommande : quantité=" + this.getQuantite() + ", ordinateur=" + ordinateurCom.getNom()+ "dans catégorie : "
+ordinateurCom.getCat().getDes()+ " prix total par quantite : "+ordinateurCom.prixPourQuantité(quantite)+", commandeRéférence='" + commande.getRef() ;
           
}

}
