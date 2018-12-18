package Controllers;


import Logic.VistaNavigator;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class MainMenuVistaController {

    @FXML
    void createGameProcessVista (ActionEvent event) {
        VistaNavigator.loadVista(VistaNavigator.GAME_PROCESS_VISTA);
    }

    @FXML
    void closeApplication (ActionEvent event) {
        System.exit(0);
    }

}
