package lasalle.warehousesystem;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("login"));
        Scene scene = new Scene(fxmlLoader.load());

        primaryStage.setTitle("Warehouse System - Login");
        primaryStage.setScene(scene);
        primaryStage.show();
        // dynamic frame size:
        // width 574
        // height 320
    }
}
