package com.example.gest_prof;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
public class MetierImpl implements IMetier {
    public List<Professeur> afficheListProf()  {
        Connection con=SignletonConnexionDB.getCon();
        List<Professeur> p=new ArrayList<>();
        try {
            Statement stm=con.createStatement();
            ResultSet rs=stm.executeQuery("select * from professeur");
            while(rs.next()){
                PreparedStatement pstm=con.prepareStatement("select * from departement where id_deprat=?");
               pstm.setInt(1,rs.getInt("id_deprat"));
               ResultSet rs1=pstm.executeQuery();
                Departement d=null;
if(rs1.next()){d=new Departement(rs1.getInt("id_deprat"),rs1.getString("nom")) ;}
Professeur ps=new Professeur(rs.getInt("id_prof"),rs.getString("nom"),rs.getString("prenom"),rs.getString("cin")
        ,rs.getString("adresse"),rs.getString("telephone"),rs.getString("email"),rs.getDate("date_recrutement"),d);
             p.add(ps);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
           return p;
    }
    public List<Professeur> findProf(String cle){
        Connection con=SignletonConnexionDB.getCon();
        List<Professeur> p=new ArrayList<>();
        try{
            PreparedStatement pstm=con.prepareStatement("select * from professeur where nom like ?");
            pstm.setString(1,cle);
            ResultSet rs=pstm.executeQuery();
            while(rs.next()){
                PreparedStatement pstm1=con.prepareStatement("select * from departement where id_deprat=?");
                pstm1.setInt(1,rs.getInt("id_deprat"));
                ResultSet rs1=pstm1.executeQuery();
                Departement d=null;
                if(rs1.next()){d=new Departement(rs1.getInt("id_deprat"),rs1.getString("nom")) ;}
                Professeur ps=new Professeur(rs.getInt("id_prof"),rs.getString("nom"),rs.getString("prenom")
                        ,rs.getString("cin"),rs.getString("adresse"),rs.getString("telephone")
                        ,rs.getString("email"),rs.getDate("date_recrutement"),d);
                p.add(ps);
            }

        }catch (SQLException e){e.printStackTrace();}
return p;
    }
    public void ajouterProf(Professeur professeur){
        Connection con=SignletonConnexionDB.getCon();
        try{
            PreparedStatement pstm=con.prepareStatement("INSERT INTO professeur (nom, prenom, cin, adresse, telephone, email, date_recrutement, id_deprat) " +
                    "VALUES (?, ?, ?, ?, ?, ?, ?, ?)",Statement.RETURN_GENERATED_KEYS);
            pstm.setString(1, professeur.getNom());
            pstm.setString(2, professeur.getPrenom());
            pstm.setString(3, professeur.getCin());
            pstm.setString(4, professeur.getAdresse());
            pstm.setString(5, professeur.getTelephone());
            pstm.setString(6, professeur.getEmail());
            pstm.setDate(7,new java.sql.Date(professeur.getDate_recrutement().getTime()) );
            pstm.setInt(8, professeur.getDept().getIdDepart());
            pstm.executeUpdate();
            ResultSet rs = pstm.getGeneratedKeys();
            if (rs.next()) {
                int generatedId = rs.getInt(1);
                professeur.setId_prof(generatedId);
            }
        }catch (SQLException e){e.printStackTrace();}
    }

    public void supprimerProf(int id){
        Connection con=SignletonConnexionDB.getCon();
        try{
            PreparedStatement pstm=con.prepareStatement(" delete from professeur WHERE id_prof = ?");

            pstm.setInt(1, id);
            pstm.executeUpdate();
        }catch (SQLException e){e.printStackTrace();}
    }
    public void updateProf(Professeur professeur){
        Connection con=SignletonConnexionDB.getCon();
        try{
            PreparedStatement pstm=con.prepareStatement("update professeur set  nom = ?, prenom = ?, cin = ?, adresse = ?, telephone = ?" +
                    ", email = ?, date_recrutement = ?, id_deprat = ? WHERE id_prof = ?");
            pstm.setString(1, professeur.getNom());
            pstm.setString(2, professeur.getPrenom());
            pstm.setString(3, professeur.getCin());
            pstm.setString(4, professeur.getAdresse());
            pstm.setString(5, professeur.getTelephone());
            pstm.setString(6, professeur.getEmail());
            pstm.setDate(7,new java.sql.Date(professeur.getDate_recrutement().getTime()) );
            pstm.setInt(8, professeur.getDept().getIdDepart());
            pstm.setInt(9, professeur.getId_prof());
            pstm.executeUpdate();
        }catch (SQLException e){e.printStackTrace();}
    }
    public void affectProf(int id,int id_dep){
        Connection con=SignletonConnexionDB.getCon();
        try {
            PreparedStatement stmt = con.prepareStatement("UPDATE professeur SET id_deprat = ? WHERE id_prof = ?");
            stmt.setInt(1, id_dep);
            stmt.setInt(2, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void ajouterDep(Departement departement){
        Connection con=SignletonConnexionDB.getCon();
        try{
            PreparedStatement pstm=con.prepareStatement("INSERT INTO departement (nom) VALUES (?)");
            pstm.setString(1, departement.getNom());

            pstm.executeUpdate();
        }catch (SQLException e){e.printStackTrace();}
    }
    public List<Departement> afficheListDep(){
        Connection con=SignletonConnexionDB.getCon();
        List<Departement> dp=new ArrayList<>();
        try {
            Statement stm=con.createStatement();
            ResultSet rs=stm.executeQuery("select * from departement");
            while(rs.next()){
                Departement ds=new Departement(rs.getInt("id_deprat"),rs.getString("nom"));
                dp.add(ds);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return dp;
    }
    public void supprimerDep(int id){
        Connection con=SignletonConnexionDB.getCon();
        try{
            PreparedStatement pstm1=con.prepareStatement("select * from professeur where id_deprat=?");
            pstm1.setInt(1,id);
            ResultSet rs1=pstm1.executeQuery();
             if(rs1.next()){
                     PreparedStatement pstm2=con.prepareStatement("update professeur set  id_deprat =  NULL WHERE id_deprat = ?");
                     pstm2.setInt(1, id);
                     pstm2.executeUpdate();
             }
            PreparedStatement pstm=con.prepareStatement(" delete from departement WHERE id_deprat = ?");
            pstm.setInt(1, id);
            pstm.executeUpdate();
        }catch (SQLException e){e.printStackTrace();}
    }
    public void updateDep(Departement d){
        Connection con=SignletonConnexionDB.getCon();
        try{
            PreparedStatement pstm=con.prepareStatement("update departement set  nom = ? WHERE id_deprat = ?");
            pstm.setString(1, d.getNom());

            pstm.setInt(2, d.getIdDepart());
            pstm.executeUpdate();
        }catch (SQLException e){e.printStackTrace();}
    }
    public List<Professeur> afficheListProfByDep(int id_dep){
        Connection con=SignletonConnexionDB.getCon();
        List<Professeur> p=new ArrayList<>();
        try{
            PreparedStatement pstm=con.prepareStatement("select * from professeur where  id_deprat= ?");
            pstm.setInt(1,id_dep);
            ResultSet rs=pstm.executeQuery();
            while(rs.next()){
                PreparedStatement pstm1=con.prepareStatement("select * from departement where id_deprat=?");
                pstm1.setInt(1,rs.getInt("id_deprat"));
                ResultSet rs1=pstm1.executeQuery();
                Departement d=null;
                if(rs1.next()){d=new Departement(rs1.getInt("id_deprat"),rs1.getString("nom")) ;}

                Professeur ps=new Professeur(rs.getInt("id_prof"),rs.getString("nom"),rs.getString("prenom"),
                        rs.getString("cin"),rs.getString("adresse"),rs.getString("telephone")
                        ,rs.getString("email"),rs.getDate("date_recrutement"),d);
                p.add(ps);
            }

        }catch (SQLException e){e.printStackTrace();}
        return p;
    }
}
