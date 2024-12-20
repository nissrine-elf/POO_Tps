package com.example.gest_prof;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import java.io.IOException;
public class AppController {
    @FXML
    private Button btnProf;
    @FXML
    private Button btnDepart;
    @FXML
     void handleGererProf() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Prof.fxml"));
            BorderPane profPane = loader.load();
            Scene scene = new Scene(profPane,800,600);
            Stage stage = (Stage) btnProf.getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();}}
@FXML
   void handleGererDepart(){
    FXMLLoader loader = new FXMLLoader(getClass().getResource("Depart.fxml"));
try{
    BorderPane departPane = loader.load();
    Scene scene = new Scene(departPane,800,600);
    Stage stage = (Stage) btnDepart.getScene().getWindow();
    stage.setScene(scene);
    stage.show();
} catch (IOException e) {
        e.printStackTrace();
    }}}
