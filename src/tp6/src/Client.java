import java.io.Serializable;
public class Client implements Serializable {
    private String nom;
    private  String prenom;
    private String adresse;
    private String email;
    private String ville;
    private String tel;
    public Client(String nom, String prenom, String adresse, String email, String ville, String tel) {
        this.nom = nom;this.prenom = prenom;this.adresse = adresse;this.email = email;this.ville = ville;this.tel = tel;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public String getAdresse() {
        return adresse;
    }
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getVille() {
        return ville;
    }
    public void setVille(String ville) {
        this.ville = ville;
    }
    public String getTel() {
        return tel;
    }
    public void setTel(String tel) {
        this.tel = tel;
    }
    public String toString() {
        return "nom='" + nom + '\'' + ", prenom='" + prenom + '\'' + ", adresse='" + adresse + '\'' + ", email='" + email + '\'' +
                ", ville='" + ville + '\'' + ", tel='" + tel + '\'' +
                '.';}}
