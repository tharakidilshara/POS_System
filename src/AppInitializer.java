import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;

public class  AppInitializer extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws IOException {
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("view/DashBoard.fxml"))));
        //stage.setScene(new Scene(FXMLLoader.load(Objects.requireNonNull(getClass().getResource("view/DashBoard.fxml")))));
        /*URL resource = getClass().getResource("view/DashBoard.fxml");
        Parent load = FXMLLoader.load(resource);
        Scene scene = new Scene(load);
        stage.setScene(scene);*/

        stage.show();
    }
}
