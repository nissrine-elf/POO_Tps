package com.example.gest_prof;

import javafx.beans.property.SimpleStringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class ProfController {

    @FXML
    private TextField txtNom, txtPrenom, txtCin, txtAdresse, txtTelephone, txtEmail ,searchField;

@FXML
private DatePicker dateRecrutementProfField;
    @FXML
    private ComboBox<Departement> departementComboBox;
@FXML private Button btnBack;

@FXML private TableColumn<Professeur ,String> colNom, colPrenom, colCin, colAdresse, colTelephone, colEmail, colDepartement;
@FXML private TableView<Professeur> tableProfesseurs;
@FXML private TableColumn<Professeur, Date>  colDateRecrutement;
    private MetierImpl metier;
    private Professeur selectedProfesseur;

    @FXML
public void initialize(){
    metier=new MetierImpl();
    departementComboBox.getItems().addAll(metier.afficheListDep());
    colNom.setCellValueFactory(new PropertyValueFactory<>("nom"));
    colPrenom.setCellValueFactory(new PropertyValueFactory<>("prenom"));
    colCin.setCellValueFactory(new PropertyValueFactory<>("cin"));
    colAdresse.setCellValueFactory(new PropertyValueFactory<>("adresse"));
    colTelephone.setCellValueFactory(new PropertyValueFactory<>("telephone"));
    colEmail.setCellValueFactory(new PropertyValueFactory<>("email"));
    colDateRecrutement.setCellValueFactory(new PropertyValueFactory<>("date_recrutement"));
    colDepartement.setCellValueFactory(cellData ->
            new SimpleStringProperty(cellData.getValue().getDept().getNom())
    );
    List<Professeur> professeurs = metier.afficheListProf();
    tableProfesseurs.getItems().setAll(professeurs);
        tableProfesseurs.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            selectedProfesseur = newValue;
            if (newValue != null) {
                // Remplir les champs de texte avec les données du professeur sélectionné
                txtNom.setText(newValue.getNom());
                txtPrenom.setText(newValue.getPrenom());
                txtCin.setText(newValue.getCin());
                txtAdresse.setText(newValue.getAdresse());
                txtTelephone.setText(newValue.getTelephone());
                txtEmail.setText(newValue.getEmail());
                dateRecrutementProfField.setValue(
                        new java.sql.Date(newValue.getDate_recrutement().getTime()).toLocalDate()
                );

                departementComboBox.setValue(newValue.getDept());
                departementComboBox.setValue(newValue.getDept());
            }
        });
}



@FXML
private void ajouterProfesseur(ActionEvent event){
    String nom=txtNom.getText();
    String prenom = txtPrenom.getText();
    String cin = txtCin.getText();
    String adresse = txtAdresse.getText();
    String telephone = txtTelephone.getText();
    String email = txtEmail.getText();
    LocalDate localDate = dateRecrutementProfField.getValue();
    Departement departement = departementComboBox.getValue();

    if(nom.isEmpty() || prenom.isEmpty() || cin.isEmpty()  || adresse.isEmpty() || telephone.isEmpty() || email.isEmpty() || localDate==null || departement==null ){
    Alert alert=new Alert(Alert.AlertType.WARNING);
    alert.setContentText("veuillez remplir tous les champs ");
    alert.setTitle("error");
alert.showAndWait();}
else {
        java.sql.Date dateRecrutement = java.sql.Date.valueOf(localDate);
    Professeur p=new Professeur(0,nom,prenom,cin,adresse,telephone,email,dateRecrutement,departement);
        metier.ajouterProf(p);
        List<Professeur> professeurs = metier.afficheListProf();
        tableProfesseurs.getItems().setAll(professeurs);
        Alert alert=new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText("le professeur ajouter avec succé ");
        alert.setTitle("Notification ");
        alert.showAndWait();
}


    }

   @FXML
   void modifierProfesseur(ActionEvent event){
        if (selectedProfesseur!=null) {
            selectedProfesseur.setNom(txtNom.getText());
            selectedProfesseur.setPrenom(txtPrenom.getText());
            selectedProfesseur.setCin(txtCin.getText());
            selectedProfesseur.setAdresse(txtAdresse.getText());
            selectedProfesseur.setTelephone(txtTelephone.getText());
            selectedProfesseur.setEmail(txtEmail.getText());
            selectedProfesseur.setDate_recrutement(java.sql.Date.valueOf(dateRecrutementProfField.getValue()));
            selectedProfesseur.setDept(departementComboBox.getValue());
            tableProfesseurs.refresh();

            // Mise à jour dans la base de données
            metier.updateProf(selectedProfesseur);
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("Le professeur a été modifié avec succès.");
            alert.setTitle("Notification");
            alert.showAndWait();
        }else {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setContentText("Veuillez sélectionner un professeur à modifier.");
            alert.setTitle("Erreur");
            alert.showAndWait();}


   }

   @FXML
    void supprimerProfesseur(ActionEvent event){
      if (selectedProfesseur!=null){

          // Supprimer le professeur de la base de données
          metier.supprimerProf(selectedProfesseur.getId_prof());

          // Supprimer de la liste (tableview)
          tableProfesseurs.getItems().remove(selectedProfesseur);
          List<Professeur> professeurs = metier.afficheListProf();

          Alert alert = new Alert(Alert.AlertType.INFORMATION);
          alert.setContentText("Le professeur a été supprimé avec succès.");
          alert.setTitle("Notification");
          alert.showAndWait();
      } else {
          Alert alert = new Alert(Alert.AlertType.WARNING);
          alert.setContentText("Veuillez sélectionner un professeur à supprimer.");
          alert.setTitle("Erreur");
          alert.showAndWait();
      }

      }

@FXML
    void onSearchKeyReleased(){
      String rech=searchField.getText();
      List<Professeur> p=metier.findProf("%" + rech + "%");
      tableProfesseurs.getItems().setAll(p);

}
    @FXML
    void back(ActionEvent event){
        FXMLLoader fxmlLoader = new FXMLLoader(GestApplication.class.getResource("App.fxml"));
        try{
            BorderPane departPane = fxmlLoader.load();
            Scene scene = new Scene(departPane,800,600);
            Stage stage = (Stage) btnBack.getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
   }





