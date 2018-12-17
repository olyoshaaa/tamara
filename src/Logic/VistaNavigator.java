package Logic;

import Controllers.MainController;
import javafx.fxml.FXMLLoader;

import java.io.IOException;

public class VistaNavigator {

    public static final String MAIN = "/View/main.fxml";
    public static final String MAIN_MENU_VISTA = "/View/mainMenuVista.fxml";
    public static final String GAME_PROCESS_VISTA = "/View/gameProcessVista.fxml";

    private static MainController mainController;

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
}
