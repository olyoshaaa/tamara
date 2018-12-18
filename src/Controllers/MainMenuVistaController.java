package Controllers;


import Logic.VistaNavigator;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;

public class MainMenuVistaController {

    @FXML
    void createGameProcessVista (ActionEvent event) {
        VistaNavigator.loadVista(VistaNavigator.GAME_PROCESS_VISTA);

        VistaNavigator.createNewAnimal();
    }

    @FXML
    void closeApplication (ActionEvent event) {
        System.exit(0);
    }

}
