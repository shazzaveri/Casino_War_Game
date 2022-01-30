package view;


import controller.VariationOne;
import controller.WarGame;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.event.ActionEvent;

public class TableController {
    @FXML
    private TextArea gameOutput;

    @FXML
    private Button playWar;
    @FXML
    private Button playWar1;
    @FXML
    private Button playWar2;


    public TableController() {
    }

    @FXML
    void playWar(ActionEvent event) {
        System.out.println("Hey, you pressed a button!");
        String getOut = "";
        // TODO: play a game of War (i.e., until someone wins or there is a tie)
        WarGame war = new WarGame();
        getOut = "Starting Variation 1" + "\n\n";
        getOut += war.initializeWar(24,2,1);
        getOut += "\n\n"+"Starting Variation 2" + "\n\n";
        getOut += war.initializeWar(24,2,1);
        getOut += "\n\n"+"Starting Variation 3" + "\n\n";
        getOut += war.initializeWar(24,2,1);
        gameOutput.setText(getOut);
    }



    @FXML
    public void initialize() {
        // TODO: if you need to do some GUI init, do it here
    }
}