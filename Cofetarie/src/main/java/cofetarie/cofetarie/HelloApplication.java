package cofetarie.cofetarie;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    public static final String CURRENCY="RON / kg";//moneda pretului torturilor pe kg
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("login.fxml"));//se va deschide fereastra de login
        Scene scene = new Scene(fxmlLoader.load(), 616, 416);//dimensiunea ferestrei
        stage.setResizable(false);
        stage.setTitle("Cofetarie");//numele ferestrei
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    } //se lanseaza fereastra
}