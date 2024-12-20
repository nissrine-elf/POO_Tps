package com.example.gest_prof;

import java.util.Date;

public class Professeur {
   private  int id_prof;
   private String nom;
    private String prenom;
    private String cin;
    private String adresse;
    private String telephone;
    private String email;
    private Date date_recrutement;
    private Departement dept;

    public Professeur(int id_prof, String nom, String prenom, String cin, String adresse, String telephone, String email, Date date_recrutement, Departement dept) {
        this.id_prof = id_prof;
        this.nom = nom;
        this.prenom = prenom;
        this.cin = cin;
        this.adresse = adresse;
        this.telephone = telephone;
        this.email = email;
        this.date_recrutement = date_recrutement;
        this.dept = dept;
    }

    public int getId_prof() {
        return id_prof;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getCin() {
        return cin;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getEmail() {
        return email;
    }

    public Date getDate_recrutement() {
        return date_recrutement;
    }

    public Departement getDept() {
        return dept;
    }

    public void setId_prof(int id_prof) {
        this.id_prof = id_prof;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDate_recrutement(Date date_recrutement) {
        this.date_recrutement = date_recrutement;
    }

    public void setDept(Departement dept) {
        this.dept = dept;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Professeur{" +
                "id_prof=" + id_prof +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", cin='" + cin + '\'' +
                ", adresse='" + adresse + '\'' +
                ", telephone='" + telephone + '\'' +
                ", email='" + email + '\'' +
                ", date_recrutement=" + date_recrutement +
                ", dept=" + dept +
                '}';
    }
}
