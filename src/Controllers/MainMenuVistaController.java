package Controllers;


import Logic.VistaNavigator;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class MainMenuVistaController {

    @FXML
    void createGameProcessVista (ActionEvent actionEvent) {
        VistaNavigator.loadVista(VistaNavigator.GAME_PROCESS_VISTA);
    }

}
