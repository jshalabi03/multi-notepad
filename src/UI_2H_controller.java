import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.stage.Window;
import javafx.scene.Node;

public class UI_2H_controller extends SceneController{
    @FXML
    private TextArea ta_top;
    @FXML 
    private TextField title_top;
    @FXML
    private TextArea ta_bottom;
    @FXML 
    private TextField title_bottom;

    @FXML
    private void open_top(ActionEvent e) throws IOException{
        super.open(ta_top, title_top);
    }

    @FXML
    private void open_bottom(ActionEvent e) throws IOException{
        super.open(ta_bottom, title_bottom);
    }

}
