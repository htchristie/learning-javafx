package com.example.application;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.util.Callback;
import model.entities.Person;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class PersonListController implements Initializable {

    public Button btnAll;
    @FXML
    private ComboBox<Person> personComboBox;

    @FXML
    public void onComboBoxClick() {
        Person person = personComboBox.getSelectionModel().getSelectedItem();
        System.out.println(person);
    }

    @FXML
    public void onBtnAllClick() {
        for (Person person : personComboBox.getItems()) {
            System.out.println(person);
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        List<Person> people = new ArrayList<>();

        people.add(new Person(1, "Maria", "maria@gmail.com"));
        people.add(new Person(2, "Joao", "joao@gmail.com"));
        people.add(new Person(1, "Pedro", "pedro@gmail.com"));
        people.add(new Person(1, "Larissa", "larissa@gmail.com"));

        ObservableList<Person> observableList = FXCollections.observableArrayList(people);
        personComboBox.setItems(observableList);

        Callback<ListView<Person>, ListCell<Person>> factory = lv -> new ListCell<Person>() {
            @Override
            protected void updateItem(Person item, boolean empty) {
                super.updateItem(item, empty);
                setText(empty ? "" : item.getName());
            }
        };
        personComboBox.setCellFactory(factory);
        personComboBox.setButtonCell(factory.call(null));
    }
}
