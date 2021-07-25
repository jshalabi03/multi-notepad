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

public class UI_4_controller extends SceneController {
    @FXML
    private TextArea ta_TL;
    @FXML 
    private TextField title_TL;
    @FXML
    private TextArea ta_TR;
    @FXML 
    private TextField title_TR;
    @FXML
    private TextArea ta_BL;
    @FXML 
    private TextField title_BL;
    @FXML
    private TextArea ta_BR;
    @FXML 
    private TextField title_BR;

    @FXML
    private void open_TL(ActionEvent e) throws IOException{
        super.open(ta_TL, title_TL);
    }

    @FXML
    private void open_TR(ActionEvent e) throws IOException{
        super.open(ta_TR, title_TR);
    }

    @FXML
    private void open_BL(ActionEvent e) throws IOException{
        super.open(ta_BL, title_BL);
    }

    @FXML
    private void open_BR(ActionEvent e) throws IOException{
        super.open(ta_BR, title_BR);
    }
}
