
import java.awt.Desktop;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import javafx.application.Application;
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
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.stage.Window;
import javafx.scene.Node;

public class SceneController {

    @FXML MenuBar currentMenuBar;

    private Stage stage;

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
        Scene sc = new Scene(root, App.V_RES, App.H_RES - App.TASKBAR_HEIGHT - App.MENU_HEADER_HEIGHT);
        this.stage = (Stage)this.currentMenuBar.getScene().getWindow();
        this.stage.setMaximized(true);
        this.stage.setScene(sc);
    }

    @FXML
    public void close(ActionEvent e) {
        updateStage();
        this.stage.close();
    }

    protected void updateStage() {
        if(this.stage == null) this.stage = (Stage)this.currentMenuBar.getScene().getWindow();
    }

    protected void open(TextArea ta, TextField title) throws IOException{
        updateStage();
        FileChooser fc = new FileChooser();
        fc.setTitle("Select file");
        File file = fc.showOpenDialog(this.stage);
        if(file != null && file.exists()) {
            //  Writes the file to input stream
            FileInputStream in = new FileInputStream(file);
            byte[] chars = new byte[(int)file.length()];
            in.read(chars);
            // Sets text area and text field to corresponding values
            ta.setText(new String(chars));
            title.setText(file.getName());
            in.close();
        }
    }

    @FXML
    protected void onHelp(ActionEvent e) throws IOException, URISyntaxException{
        final String link = "https://github.com/jshalabi03/multi-notepad";
        Desktop dp = Desktop.getDesktop();
        if(!dp.isSupported(Desktop.Action.BROWSE)) return;
        dp.browse(new URI(link));
    }
    
}
