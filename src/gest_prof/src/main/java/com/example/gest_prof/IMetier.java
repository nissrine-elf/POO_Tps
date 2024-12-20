package com.example.gest_prof;

import java.sql.SQLException;
import java.util.List;

public interface IMetier {
    //les méthodes de gestion des professeurs
    public List<Professeur> afficheListProf() ;
    public List<Professeur> findProf(String cle);
    public void ajouterProf(Professeur professeur);
    public void supprimerProf(int id);
    public void updateProf(Professeur p);
    public void affectProf(int id,int id_dep);
    //les méthodes de gestion des département
    public void ajouterDep(Departement departement);
    public List<Departement> afficheListDep();
    public void supprimerDep(int id);
    public void updateDep(Departement d);
    public List<Professeur> afficheListProfByDep(int id_dep);

}
