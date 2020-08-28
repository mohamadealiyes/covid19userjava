package controllers;

import com.jfoenix.controls.JFXButton;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.concurrent.Task;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import utils.Helper;

public class AdminController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private JFXButton state;

    @FXML
    private JFXButton town;

    @FXML
    private ImageView townShip;

    @FXML
    private JFXButton hospital;

    @FXML
    private JFXButton patient;

    @FXML
    private JFXButton admin;

    @FXML
    private JFXButton logout;

    @FXML
    void onAdmin(ActionEvent event) {

    }

    @FXML
    void onHospital(ActionEvent event) {

    }

    @FXML
    void onLogout(ActionEvent event) {
        Task task =new Task<Void>() {
            @Override
            protected Void call() throws Exception {
                Helper.deleteToken();
                Platform.runLater(() ->{
                    System.exit(0);
                });
            return  null;

            }
        };
        new Thread(task).start();

    }

    @FXML
    void onPatient(ActionEvent event) {

    }

    @FXML
    void onState(ActionEvent event) {

    }

    @FXML
    void onTown(ActionEvent event) {

    }

    @FXML
    void onTownShip(MouseEvent event) {

    }

    @FXML
    void initialize() {

    }
}
