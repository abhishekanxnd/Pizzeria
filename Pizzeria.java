package ananabhi;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author ananabhi
 */
public class Pizzeria extends Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    /**
     * starts the FX app
     * @param stage
     * @throws Exception
     */
    @Override
    public void start(Stage stage) throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("FXMLA5.fxml"));
        Scene scene = new Scene(root);
        stage.setTitle("Pizzeria Assignment");
        stage.setScene(scene);
        scene.getStylesheets().add("fxmla5.css");
        stage.show();
    }

}
