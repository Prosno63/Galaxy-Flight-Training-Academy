/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;

/**
 * FXML Controller class
 *
 * @author tasin
 */
public class LoginSceneController implements Initializable {

    @FXML
    private ComboBox<String> comboBox;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        comboBox.getItems().addAll("Applicant","Trainee"
                ,"Flight Instructor","Aircraft engineer","Account Officer","CEO","Finance Officer","Receptonist");
        comboBox.setValue("Applicant");
    }    
    
}
