import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;
import javafx.stage.Window;
import javafx.scene.Node;

public class SceneController {

    @FXML MenuBar currentMenuBar;


    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    public void switch_ui_1(ActionEvent e) throws IOException {
        switchUI("ui_1.fxml");
    }

    @FXML
    public void switch_ui_2V(ActionEvent e) throws IOException {
        switchUI("ui_2V.fxml");
    }

    @FXML
    public void switch_ui_2H(ActionEvent e) throws IOException {
        switchUI("ui_2H.fxml");
    }
    
    @FXML
    public void switch_ui_4(ActionEvent e) throws IOException {
        switchUI("ui_4.fxml");
    }

    @FXML
    public void switch_ui_6(ActionEvent e) throws IOException {
        switchUI("ui_6.fxml");
    }

    private void switchUI(String url) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource(url));
        this.stage = (Stage)this.currentMenuBar.getScene().getWindow();
        this.scene = new Scene(root, App.V_RES, App.H_RES - App.TASKBAR_HEIGHT - App.MENU_HEADER_HEIGHT);
        this.stage.setMaximized(true);
        this.stage.setScene(this.scene);
    }

    
}
