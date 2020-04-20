package monumentswebpage;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Tab;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;

/**
 *
 * @author Hippolyte
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Tab ETower;
    @FXML
    private TreeView<String> treeView;
    @FXML
    private Tab SCoeurTab;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        TreeItem<String> root = new TreeItem<>("Eiffel Tower");
        
        TreeItem<String> infoTree = new TreeItem<>("Some informations");
        TreeItem<String> creatorTree = new TreeItem<>("Creator");
        TreeItem<String> historyTree  = new TreeItem<>("History");
        
        root.getChildren().addAll(infoTree, creatorTree, historyTree);
        
        treeView.setRoot(root);
    }

    @FXML
    private void ETowerTabClicked(Event event) {
    }

    @FXML
    private void SCoeurTabClicked(Event event) {
    }

}
