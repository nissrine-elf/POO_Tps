package tp2;

public class Commande {
	private String reference;
	private Client client;
	private String dateCommande;
	private String etatCpmmande;
	
	public Commande (String reference,Client client ,String e,String d ) {
		this.reference=reference;
		this.client=client;
		this.etatCpmmande=e;
		this.dateCommande=d;
		
		
	}
	
	public String getRef() {return this.reference;}
	public String getDate() {return this.dateCommande;}
	public void setRef(String ref) {this.reference=ref;}
	public void setDate(String d) {this.dateCommande=d;}
	
	public void setEtat(String s) {this.etatCpmmande=s;}
	public String getEtat() {return this.etatCpmmande;}
	
	public String toString() {
	    return "Commande : référence= " + this.getRef() + ", client=" + client.getNom() + " " + client.getPrenom() +", dateCommande= " 
	+ this.getDate() + ", état='" + this.getEtat();
	}
	
	

}