package Logic;

import Controllers.GameProcessVistaController;
import Controllers.MainController;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;

import java.io.IOException;



public class VistaNavigator {

    @FXML
    public static Label hungry;

    @FXML
    public static Label need;

    @FXML
    public static Label health;

    public static final String MAIN = "/View/main.fxml";
    public static final String MAIN_MENU_VISTA = "/View/mainMenuVista.fxml";
    public static final String GAME_PROCESS_VISTA = "/View/gameProcessVista.fxml";

    private static MainController mainController;
    public static Animal animal;

    public static void setMainController(MainController mainController) {
        VistaNavigator.mainController = mainController;
    }

    public static void loadVista (String fxml) {
        try {
            mainController.setVista(FXMLLoader.load(VistaNavigator.class.getResource(fxml)));
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    public static void createNewAnimal() {
        animal = new Animal();

        hungry.setText() =

    }
}
