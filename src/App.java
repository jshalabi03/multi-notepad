
import java.util.ArrayList;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class App extends Application{

    public static final int TASKBAR_HEIGHT = 40;
    public static final int MENU_HEADER_HEIGHT = 28;

    public static final int V_RES = 1920;
    public static final int H_RES = 1080;

    @Override
    public void start(Stage primaryStage) throws Exception{
        

        Parent root = FXMLLoader.load(getClass().getResource("ui_1.fxml"));

        Scene scene = new Scene(root, V_RES, H_RES - TASKBAR_HEIGHT - MENU_HEADER_HEIGHT);

        primaryStage.setMaximized(true);
        primaryStage.setTitle("Multi Notepad");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
