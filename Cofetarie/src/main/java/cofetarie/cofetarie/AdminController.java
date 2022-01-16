package cofetarie.cofetarie;


import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.scene.image.ImageView;

//import javax.swing.text.html.ImageView;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class AdminController  {

    @FXML
    private Button addProductButton;

    @FXML
    private HBox setChosenTask;

    @FXML
    private Button viewOrdersButton;

    @FXML
    void addProductButtonOnAction(ActionEvent event) throws IOException {
        switchSceneAddProduct();
    }

    @FXML
    void viewOrdersButtonOnAction(ActionEvent event) throws IOException {

    }



    public void switchSceneAddProduct() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("introducereProdus.fxml"));

        Stage window = (Stage) addProductButton.getScene().getWindow();
        window.setScene(new Scene(root,1315,810));
    }

}
