
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class MaintenanceStatusController implements Initializable {

    @FXML
    private ComboBox aircraftName;
    @FXML
    private TextArea textArea;
    @FXML
    private Label name;
    @FXML
    private Label id;
    @FXML
    private TextField totalFlyingHours;

    AircraftMaintenanceEngineer v;
    User g;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       aircraftName.getItems().addAll("Mig 21","Bf 109 fighter","B-52 Stratofortress","Tupolev Tu-95 bomber");
    }    

    @FXML
    private void goToPreviousSceneButtonOnClick(ActionEvent event) throws IOException {
        Parent ApplicantScene = FXMLLoader.load(getClass().getResource("FlightInstructorScene.fxml"));
        Scene scn = new Scene(ApplicantScene);
        
        Stage stg = (Stage)((Node)event.getSource()).getScene().getWindow();
        stg.setScene(scn);
        stg.show();
        
    }

    @FXML
    private void maintenanceButtonOnClick(ActionEvent event) {
        v=new AircraftMaintenanceEngineer();
     // aircraftName.getItems().addAll("Mig 21","Bf 109 fighter","B-52 Stratofortress","Tupolev Tu-95 bomber");
       String z= v.updateMaintenanceStatus(Integer.parseInt(totalFlyingHours.getText()));
       textArea.setText(z+" "+"check is needed");
        
    }

    void seeMintenance(User f) {
        g=f;
        name.setText(g.name);
        id.setText(g.id);
    }
    
}
