package cofetarie.cofetarie;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.ImageView;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;
import model.Cake;
import model.MyListener;

//import javax.swing.text.html.ImageView;--
import java.awt.*;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class MarketController implements Initializable {

    @FXML
    private Label cakeNameLabel;

    @FXML
    private Label cakePriceLabel;

    @FXML
    private ImageView cakeImg;

    @FXML
    private VBox chosenCakeCard;

    @FXML
    private GridPane grid;

    @FXML
    private ScrollPane scroll;

    @FXML
    private ComboBox combobox1;

    @FXML
    private ComboBox combobox2;

    private List<Cake> cakes = new ArrayList<>();
    private Image image;
    private MyListener myListener;



    private List<Cake> getData() {
        List<Cake> cakes = new ArrayList<>();
        Cake cake;

        cake = new Cake();
        cake.setName("Cheese cake");
        cake.setPrice(90);
        cake.setImgSrc("/pictures/Cheese cake.jpg");
        cakes.add(cake);

        cake = new Cake();
        cake.setName("Carrot cake");
        cake.setPrice(76);
        cake.setImgSrc("/pictures/Carrot cake.jpg");
        cakes.add(cake);

        cake = new Cake();
        cake.setName("Tort Morena");
        cake.setPrice(84);
        cake.setImgSrc("/pictures/Tort Morena.jpg");
        cakes.add(cake);

        cake = new Cake();
        cake.setName("Tort Bezea");
        cake.setPrice(78);
        cake.setImgSrc("/pictures/Tort Bezea.jpg");
        cakes.add(cake);

        cake = new Cake();
        cake.setName("Tort Caramel");
        cake.setPrice(94);
        cake.setImgSrc("/pictures/Tort Caramel.jpg");
        cakes.add(cake);

        cake = new Cake();
        cake.setName("Tort Diplomat");
        cake.setPrice(93);
        cake.setImgSrc("/pictures/Tort Diplomat.jpg");
        cakes.add(cake);

        cake = new Cake();
        cake.setName("Tort Mascota");
        cake.setPrice(76);
        cake.setImgSrc("/pictures/Tort Mascota.jpg");
        cakes.add(cake);

        cake = new Cake();
        cake.setName("Tiramisu");
        cake.setPrice(83);
        cake.setImgSrc("/pictures/Tiramisu.jpg");
        cakes.add(cake);

        cake = new Cake();
        cake.setName("Tort Trio Mousse");
        cake.setPrice(77);
        cake.setImgSrc("/pictures/Tort Trio Mousse.jpg");
        cakes.add(cake);

        cake = new Cake();
        cake.setName("Tort Joffre");
        cake.setPrice(85);
        cake.setImgSrc("/pictures/Tort Joffre.jpg");
        cakes.add(cake);

        cake = new Cake();
        cake.setName("Tort cu Biscuiti");
        cake.setPrice(95);
        cake.setImgSrc("/pictures/Tort cu Biscuiti.jpg");
        cakes.add(cake);

        return cakes;

    }

    private void setChosenCake(Cake cake){
        cakeNameLabel.setText(cake.getName());
        cakePriceLabel.setText(cake.getPrice() +HelloApplication.CURRENCY  );
        image = new Image(getClass().getResourceAsStream(cake.getImgSrc()));
        cakeImg.setImage(image);
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        cakes.addAll(getData());
        if(cakes.size()>0){
            setChosenCake(cakes.get(0));
            myListener = new MyListener() {
                @Override
                public void onClickListener(Cake cake) {
                    setChosenCake(cake);
                }
            };
        }
        int column = 0;
        int row = 1;
        try {
            for(int i=0; i<cakes.size(); i++){
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("item.fxml"));
                AnchorPane anchorPane = fxmlLoader.load();

                ItemController itemController = fxmlLoader.getController();
                itemController.setData(cakes.get(i),myListener);

                if(column == 3){
                    column = 0;
                    row++;
                }

                grid.add(anchorPane,column++,row);
                //set grid witdh
                grid.setMinWidth(Region.USE_COMPUTED_SIZE);
                grid.setPrefWidth(Region.USE_COMPUTED_SIZE);
                grid.setMaxWidth(Region.USE_PREF_SIZE);

                //set grid height
                grid.setMinHeight(Region.USE_COMPUTED_SIZE);
                grid.setPrefHeight(Region.USE_COMPUTED_SIZE);
                grid.setMaxHeight(Region.USE_PREF_SIZE);
                GridPane.setMargin(anchorPane,new Insets(10));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }




}
