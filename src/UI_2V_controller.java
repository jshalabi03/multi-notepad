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
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class UI_2V_controller extends SceneController {
    @FXML
    private TextArea ta_left;
    @FXML 
    private TextField title_left;
    @FXML
    private TextArea ta_right;
    @FXML 
    private TextField title_right;

    @FXML
    private void open_left(ActionEvent e) throws IOException{
        super.open(ta_left, title_left);
    }

    @FXML
    private void open_right(ActionEvent e) throws IOException{
        super.open(ta_right, title_right);
    }
}