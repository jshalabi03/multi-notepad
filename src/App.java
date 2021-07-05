import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class App extends Application{

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Multi Notepad");

        Label welcome = new Label();
        welcome.textProperty().set("Welcome!");

        StackPane root = new StackPane();
        root.getChildren().add(welcome);

        Scene scene = new Scene(root, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
