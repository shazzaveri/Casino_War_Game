package util;

import controller.WarGame;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.Person;
import model.PersonBuilder;
import view.TableController;

public class Main extends Application {

    public static void main(String [] args) {
        //WarGame war = new WarGame();
        //war.initializeWar(25,2, 1);

        launch(args);
    }

    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/gametable.fxml"));
        loader.setController(new TableController());
        Scene scene = new Scene((Parent) loader.load());
        stage.setScene(scene);
        stage.setTitle("CS 4773 Assignment 2: War!!1!");
        stage.show();
    }
}
