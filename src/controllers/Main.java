package controllers;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;

import javafx.scene.Scene;

import javafx.scene.layout.Pane;

import javafx.stage.Stage;
import javafx.stage.Window;
import models.DB;
import models.UserModel;

import java.awt.*;
import java.io.IOException;
import java.util.HashMap;

public class Main extends Application {
    public static HashMap<String, Pane> screenMap = new HashMap<>();
    public static Scene sc = null;

    public static void main(String[] args) {
        launch(args);
    }

    static Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    static double width = screenSize.getWidth();
    static double height = screenSize.getHeight();

    @Override
    public void init() throws Exception {
        //  DB.createConnection();
        addScreen("login", FXMLLoader.load(getClass().getResource("../views/page1.fxml")));
        addScreen("map", FXMLLoader.load(getClass().getResource("../views/map.fxml")));
        addScreen("dashboard", FXMLLoader.load(getClass().getResource("../views/dashboard.fxml")));
        addScreen("drawerTest", FXMLLoader.load(getClass().getResource("../views/drawerTest.fxml")));
        super.init();
    }


    @Override
    public void start(Stage primaryStage) throws IOException {
        sc = new Scene(FXMLLoader.load(getClass().getResource("../views/page1.fxml")));
        activate("dashboard");

        primaryStage.setScene(sc);
        primaryStage.setFullScreen(false);

        primaryStage.show();
    }


    public static void addScreen(String name, Pane pane) {
        screenMap.put(name, pane);
    }

    public static void removeScreen(String name) {
        screenMap.remove(name);
    }

    public static void activate(String name) {
        screenMap.get(name).setPrefSize(width - 200, height - 200);

        sc.setRoot(screenMap.get(name));
    }
}
