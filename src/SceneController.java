

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

    @FXML MenuBar menuBar_1;
    @FXML MenuBar menuBar_2V;
    @FXML MenuBar menuBar_2H;
    @FXML MenuBar menuBar_4;
    @FXML MenuBar menuBar_6;


    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    public void switch_ui_1(ActionEvent e) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("ui_1.fxml"));
        this.stage = (Stage)this.menuBar_1.getScene().getWindow();
        this.scene = new Scene(root, App.V_RES, App.H_RES - App.TASKBAR_HEIGHT - App.MENU_HEADER_HEIGHT);
        this.stage.setMaximized(true);
        this.stage.setScene(this.scene);
    }

    @FXML
    public void switch_ui_2V(ActionEvent e) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("ui_2V.fxml")); 
        this.stage = (Stage) menuBar_1.getScene().getWindow();
        this.scene = new Scene(root, App.V_RES, App.H_RES - App.TASKBAR_HEIGHT - App.MENU_HEADER_HEIGHT);
        this.stage.setMaximized(true);
        this.stage.setScene(this.scene);
    }

    @FXML
    public void switch_ui_2H(ActionEvent e) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("ui_2H.fxml"));
        this.stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        this.scene = new Scene(root, App.V_RES, App.H_RES - App.TASKBAR_HEIGHT - App.MENU_HEADER_HEIGHT);
        this.stage.setMaximized(true);
        this.stage.setScene(this.scene);
    }
    
    @FXML
    public void switch_ui_4(ActionEvent e) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("ui_4.fxml"));
        this.stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        this.scene = new Scene(root, App.V_RES, App.H_RES - App.TASKBAR_HEIGHT - App.MENU_HEADER_HEIGHT);
        this.stage.setMaximized(true);
        this.stage.setScene(this.scene);
    }

    @FXML
    public void switch_ui_6(ActionEvent e) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("ui_6.fxml"));
        this.stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        this.scene = new Scene(root, App.V_RES, App.H_RES - App.TASKBAR_HEIGHT - App.MENU_HEADER_HEIGHT);
        this.stage.setMaximized(true);
        this.stage.setScene(this.scene);
    }

    
}
