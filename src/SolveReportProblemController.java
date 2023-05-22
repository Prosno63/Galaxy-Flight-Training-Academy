

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;


public class SolveReportProblemController implements Initializable {

    @FXML
    private TextArea textArea1;
    @FXML
    private TextArea textArea2;
    @FXML
    private Label username;
    @FXML
    private Label userid;
    
    User u;
    Report g;

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void seeReportButtonOnClick(ActionEvent event) {
        
         textArea1.setText(g.toString());
    }

    @FXML
    private void sentCommentButtonOnClick(ActionEvent event) {
        
        
    }

    void init3(User f, Report v) {
       u=f;
       g=v;
        userid.setText(u.id);
        username.setText(u.name);
    }
    
}
