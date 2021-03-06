import java.io.File;
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

public class UI_1_controller extends SceneController{
    @FXML
    private TextArea ta;
    @FXML
    private TextField title;

    @FXML
    private void open_1(ActionEvent e) throws IOException{
        super.open(this.ta, this.title);
    }

    @FXML
    private void save_as_1(ActionEvent e) throws IOException {
        super.save_as(this.ta);
    }
}
