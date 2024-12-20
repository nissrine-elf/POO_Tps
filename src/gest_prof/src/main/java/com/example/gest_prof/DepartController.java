package com.example.gest_prof;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.event.ActionEvent;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.List;
public class DepartController {
    @FXML
    private TableColumn<Departement ,String> colNom;
    @FXML private TableView<Departement> tableDepart;
    private MetierImpl metier;
    @FXML
    private TextField txtNom;
    private Departement selectedDepart;
    @FXML
    private TextField searchField;
    @FXML private Button btnCloseProf;
    @FXML private TableView<Professeur> tableProf;
    @FXML private TableColumn<Professeur, String> colProfNom;
    @FXML private TableColumn<Professeur, String> colProfPrenom;
    @FXML private TableColumn<Professeur, String> colProfEmail;
    @FXML  private Button btnBack;
    @FXML
    public void initialize(){
        metier=new MetierImpl();
        colNom.setCellValueFactory(new PropertyValueFactory<>("nom"));
        tableDepart.getItems().setAll(metier.afficheListDep());
        colProfNom.setCellValueFactory(new PropertyValueFactory<>("nom"));
        colProfPrenom.setCellValueFactory(new PropertyValueFactory<>("prenom"));
        colProfEmail.setCellValueFactory(new PropertyValueFactory<>("email"));
        tableDepart.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            selectedDepart = newValue;
            if (newValue != null) {
                txtNom.setText(newValue.getNom());
            }
        });
    }
 @FXML
 void ajouterDepart(ActionEvent event){
        String nom=txtNom.getText();
        if(nom.isEmpty()){
            Alert alert=new Alert(Alert.AlertType.WARNING);
            alert.setContentText("veuillez remplir tous les champs ");
            alert.setTitle("error");
            alert.showAndWait();
        }else{
            Departement d=new Departement(0,nom);
            metier.ajouterDep(d);
            List<Departement> dp = metier.afficheListDep();
            tableDepart.getItems().setAll(dp);
            Alert alert=new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("la departement  ajouter avec succé ");
            alert.setTitle("Notification ");
            alert.showAndWait();
        }
    }
   @FXML
   void modifierDepart(ActionEvent event){
       if (selectedDepart!=null) {
           selectedDepart.setNom(txtNom.getText());
           tableDepart.refresh();
           metier.updateDep(selectedDepart);
           Alert alert = new Alert(Alert.AlertType.INFORMATION);
           alert.setContentText("La departement  a été modifié avec succès.");
           alert.setTitle("Notification");
           alert.showAndWait();
       }else {
           Alert alert = new Alert(Alert.AlertType.WARNING);
           alert.setContentText("Veuillez sélectionner une departement à modifier.");
           alert.setTitle("Erreur");
           alert.showAndWait();}
   }
@FXML
    void msupprimerDepart(ActionEvent event){
    if (selectedDepart!=null){
        metier.supprimerDep(selectedDepart.getIdDepart());
        tableDepart.getItems().remove(selectedDepart);
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText("La deparetement  a été supprimé avec succès.");
        alert.setTitle("Notification");
        alert.showAndWait();
    } else {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setContentText("Veuillez sélectionner une departement à supprimer.");
        alert.setTitle("Erreur");
        alert.showAndWait();
    }
}
@FXML
    void afficherProf(ActionEvent event){
    if (selectedDepart != null) {
        List<Professeur> professeurs = metier.afficheListProfByDep(selectedDepart.getIdDepart());
        tableProf.getItems().setAll(professeurs);
        tableProf.setVisible(true);
        tableDepart.setVisible(false);
        btnCloseProf.setVisible(true);
    } else {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setContentText("Veuillez sélectionner un département.");
        alert.setTitle("Erreur");
        alert.showAndWait();}
}
@FXML
    void fermerProf(ActionEvent event) {
        tableProf.setVisible(false);
        tableDepart.setVisible(true);
        btnCloseProf.setVisible(false);}
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
        e.printStackTrace();}}}
