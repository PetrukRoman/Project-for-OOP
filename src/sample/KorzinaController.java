package sample;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;


public class KorzinaController {


    @FXML
    public TableView<Korzina> ptr;

    @FXML
    private TableColumn<Korzina, String> namek;

    @FXML
    private TableColumn<Korzina, Integer> pricek;

    public ObservableList<Korzina> list = FXCollections.observableArrayList();

    public void DeleteButton() {
        list.removeAll(ptr.getSelectionModel().getSelectedItem());

    }

    @FXML
    void initialize() {

        ptr.setItems(list);

        namek.setCellValueFactory(new PropertyValueFactory<Korzina, String>("name"));
        pricek.setCellValueFactory(new PropertyValueFactory<Korzina, Integer>("price"));
    }
}