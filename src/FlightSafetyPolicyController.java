/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author tasin
 */
public class FlightSafetyPolicyController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void backButton(MouseEvent event) throws IOException {
        Parent scenetoParent = FXMLLoader.load(getClass().getResource("CEOScene.fxml"));
        Scene scene2 = new Scene(scenetoParent);      
        Stage stg2 = (Stage)((Node)event.getSource()).getScene().getWindow(); 
        stg2.setScene(scene2);
        stg2.show();
        
    }

    @FXML
    private void saveButton(MouseEvent event) {
    }
    
}
