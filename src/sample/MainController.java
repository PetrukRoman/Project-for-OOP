package sample;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;

public class MainController {
    KorzinaController korzinaController;
    KatalogController katalogController;
    Parent katalog;
    private Parent korzina;


    @FXML
    private BorderPane borderpane;

    @FXML
    private Button exit;

    @FXML
    private void clear(MouseEvent event) {
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("view/main.view.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        borderpane.setCenter(root);
    }

    @FXML
    private void um1(MouseEvent event) {

        borderpane.setCenter(katalog);
    }

    @FXML
    private void um2(MouseEvent event) {
        borderpane.setCenter(korzina);
    }

    @FXML
    void initialize() {
        try {

            FXMLLoader loader = new FXMLLoader(getClass().getResource("view/korzina.fxml"));
            if (korzinaController == null) {
                korzina = loader.load();
                korzinaController = loader.getController();
            }
            loader = new FXMLLoader(getClass().getResource("view/katalog.fxml"));
            if (katalogController == null) {
                katalog = loader.load();
                katalogController = loader.getController();
                katalogController.setKotzinaController(korzinaController);

            }


        } catch (IOException e) {

        }
        exit.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.exit(0);
            }
        });
    }


}

