package tp2;

public class Personne {
	private String nom;
	private String prenom ;
	private String email;
	private String tel;
	private int age;
	// Constructeur pour initialiser les attributs
	public Personne (String nom,String prenom,int age,String email,String tel) {
		this.age=age;this.nom=nom;this.prenom=prenom;this.email=email;this.tel=tel;	
	}
	public int getAge() {return this.age;}
	public String getNom() {return this.nom;}
	public String getPrenom() {return this.prenom;}
	public String getEmail() {return this.email;}
	public String getTel() {return this.tel;}

    // Méthode pour afficher les informations de la personne
public void afficher() {
System.out.print("nom :"+getNom()+" prenom :"+getPrenom()+" age :"+getAge()+" email :"+getEmail()+" tel :"+getTel());}
}
