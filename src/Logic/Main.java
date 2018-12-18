package Logic;

import Controllers.MainController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    public final String GENERAL_CSS = "/Styles/general.css";


    @Override
    public void start(Stage stage) throws IOException {

        stage.setTitle("App");
        stage.setScene(createScene(loadVistaHolder()));
        stage.show();
    }



    private Scene createScene (StackPane vistaHolder) {
        Scene scene = new Scene(vistaHolder);

        scene.getStylesheets().setAll(getClass().getResource(GENERAL_CSS).toExternalForm());

        return scene;
    }



    private StackPane loadVistaHolder () throws IOException {
        FXMLLoader loader = new FXMLLoader();

        StackPane vistaHolder = loader.load(getClass().getResourceAsStream(VistaNavigator.MAIN));

        MainController mainController = loader.getController();

        VistaNavigator.setMainController(mainController);
        VistaNavigator.loadVista(VistaNavigator.MAIN_MENU_VISTA);

        return vistaHolder;
    }
}
