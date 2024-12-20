package com.example.gest_prof;

public class Departement {
    private int id_deprat;
    private String nom;
    public Departement(int idDepart, String nom) {
        this.id_deprat = idDepart;
        this.nom = nom;

    }
    public int getIdDepart() {
        return id_deprat;
    }
    public void setIdDepart(int idDepart) {
        this.id_deprat = idDepart;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    @Override
    public String toString() {
        return "Departement{" + "idDepart=" + id_deprat + ", nom='" + nom + '\'' +
                '}';}}
