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
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.scene.image.ImageView;

//import javax.swing.text.html.ImageView;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {

    @FXML
    private Button loginButton;  //declarari ale campurilor de butoane/imagine/label de text

    @FXML
    private Label loginImageLabel;

    @FXML
    private Label loginMessageLabel;

    @FXML
    private TextField usernameTextField;

    @FXML
    private PasswordField enterPasswordField;

    @FXML
    private ImageView brandingImageView;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle){
        /*
        * */
    }

    public void loginButtonOnAction(ActionEvent event) throws IOException {//crearea butonului de login
        System.out.println(usernameTextField.getText());
        System.out.println(enterPasswordField.getText());
        String user =usernameTextField.getText();
        String password =enterPasswordField.getText();

        if(user.equals("client") && password.equals("client")){ //daca parola username ul este client si parola este client, se va trece la fereastra de magazin
            System.out.println("merge");
            switchScene();
        }
        else{
            if(user.equals("admin") && password.equals("admin")){//daca parola username ul admin client si parola este admin, se va trece la fereastra de cofetar
                System.out.println("merge.....................");
                switchScene2();
            }
        }


    }
    //switchscene pt client
    public void switchScene() throws IOException {//switch scene pt client
        Parent root = FXMLLoader.load(getClass().getResource("magazinClient.fxml"));

        Stage window = (Stage) loginButton.getScene().getWindow();//la apasarea nutonului de login se va schimba fereastra
        window.setScene(new Scene(root,1315,810));
    }
   //switchscene pt admin
    public void switchScene2() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("magazinAdmin.fxml"));

        Stage window = (Stage) loginButton.getScene().getWindow();
        window.setScene(new Scene(root,1315,810));
    }


}