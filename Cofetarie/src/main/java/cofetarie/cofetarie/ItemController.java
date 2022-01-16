package cofetarie.cofetarie;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import model.Cake;
import model.MyListener;
import cofetarie.cofetarie.HelloApplication;

//import javax.swing.text.html.ImageView;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;

public class ItemController {

    @FXML
    private ImageView img;

    @FXML
    private Label nameLabel;

    @FXML
    private Label priceLabel;

    @FXML
    private void click(javafx.scene.input.MouseEvent mouseEvent){
        myListener.onClickListener(cake);
    }

    private Cake cake;
    private MyListener myListener;
    private MarketController Main;

    public void setData(Cake cake,MyListener myListener){
        this.myListener = myListener;
        this.cake = cake;
        nameLabel.setText(cake.getName());
        priceLabel.setText(cake.getPrice()+ HelloApplication.CURRENCY);
        Image image = new Image(getClass().getResourceAsStream(cake.getImgSrc()));
        img.setImage(image);


    }


}
