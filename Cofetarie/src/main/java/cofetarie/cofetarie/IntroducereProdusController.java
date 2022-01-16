package cofetarie.cofetarie;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.io.IOException;

public class IntroducereProdusController {

    @FXML
    private Button addproduct;

    @FXML
    private HBox setChosenTask;

    @FXML
    private Button viewproduct;

    @FXML
    void addProductButtonOn(ActionEvent event) throws IOException {


    }

    @FXML
    void viewOrdersButtonOn(ActionEvent event) throws IOException {
        switchSceneView();
    }

   /* public void switchSceneOrder() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("introducereProdus.fxml"));

        Stage window = (Stage) addproduct.getScene().getWindow();
        window.setScene(new Scene(root,1315,810));
    }*/

    public void switchSceneView() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("magazinAdmin.fxml"));

        Stage window = (Stage) viewproduct.getScene().getWindow();
        window.setScene(new Scene(root,1315,810));
    }

}
