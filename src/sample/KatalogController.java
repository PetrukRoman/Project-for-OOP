package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class KatalogController {


    @FXML
    private TableView<nutrition> BCAA;

    @FXML
    private TableColumn<nutrition, String> name;

    @FXML
    private TableColumn<nutrition, Integer> weight;

    @FXML
    private TableColumn<nutrition, String> type;

    @FXML
    private TableColumn<nutrition, Integer> price;

    @FXML
    private TableView<nutrition> Protein;

    @FXML
    private TableColumn<nutrition, String> name1;

    @FXML
    private TableColumn<nutrition, Integer> weight1;

    @FXML
    private TableColumn<nutrition, String> type1;

    @FXML
    private TableColumn<nutrition, Integer> price1;

    @FXML
    private TableView<nutrition> Amino;

    @FXML
    private TableColumn<nutrition, String> name2;

    @FXML
    private TableColumn<nutrition, Integer> weight2;

    @FXML
    private TableColumn<nutrition, String> type2;
    @FXML
    private TableColumn<nutrition, Integer> price2;
    private String NAME;
    private int PRICE;
    private KorzinaController kotzinaController;

    @FXML

    private void koradd() {
        PRICE = BCAA.getSelectionModel().getSelectedItem().getPrice();
        NAME = BCAA.getSelectionModel().getSelectedItem().getName();
        kotzinaController.list.add(new Korzina(NAME, PRICE));


    }


    ObservableList<nutrition> BItem = FXCollections.observableArrayList(new nutrition("IronFlex BCAA ", "Порошок", 600, 1900),
            new nutrition("MyProtein", "Порошок", 1000, 3000),
            new nutrition("Ultimate Nutrition BCAA ", "Капсулы", 3000, 1500),
            new nutrition("Optimum Nutrition BCAA ", "Порошок", 450, 2000));
    ObservableList<nutrition> PItem = FXCollections.observableArrayList(new nutrition("protein1", "таблетки", 500, 2000));
    ObservableList<nutrition> AItem = FXCollections.observableArrayList(new nutrition("amino1", "таблетки", 400, 3000));

    @FXML
    void initialize() {
        BCAA.setItems(BItem);
        Protein.setItems(PItem);
        Amino.setItems(AItem);
        name.setCellValueFactory(new PropertyValueFactory<nutrition, String>("name"));
        weight.setCellValueFactory(new PropertyValueFactory<nutrition, Integer>("weight"));
        type.setCellValueFactory(new PropertyValueFactory<nutrition, String>("type"));
        price.setCellValueFactory(new PropertyValueFactory<nutrition, Integer>("price"));

        name1.setCellValueFactory(new PropertyValueFactory<nutrition, String>("name"));
        weight1.setCellValueFactory(new PropertyValueFactory<nutrition, Integer>("weight"));
        type1.setCellValueFactory(new PropertyValueFactory<nutrition, String>("type"));
        price1.setCellValueFactory(new PropertyValueFactory<nutrition, Integer>("price"));

        name2.setCellValueFactory(new PropertyValueFactory<nutrition, String>("name"));
        weight2.setCellValueFactory(new PropertyValueFactory<nutrition, Integer>("weight"));
        type2.setCellValueFactory(new PropertyValueFactory<nutrition, String>("type"));
        price2.setCellValueFactory(new PropertyValueFactory<nutrition, Integer>("price"));


    }


    public void setKotzinaController(KorzinaController kotzinaController) {
        this.kotzinaController = kotzinaController;
    }

    public KorzinaController getKotzinaController() {
        return kotzinaController;
    }
}

