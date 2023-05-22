/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Hp
 */
public class AppointmentBookingwithEmployeesController implements Initializable {

    @FXML
    private TextField PersonNameTextfield;
    @FXML
    private TextField AgendaTextfield;
    @FXML
    private ComboBox<?> EmployeeNameCombobox;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void SendButton(MouseEvent event) {
    }

    @FXML
    private void BackButton(MouseEvent event) throws IOException {
        Parent scene2Parent = FXMLLoader.load(getClass().getResource("FrontDeskOfficer.fxml"));
        Scene scene2 = new Scene(scene2Parent);      
        Stage stg2 = (Stage)((Node)event.getSource()).getScene().getWindow(); 
        stg2.setScene(scene2);
        stg2.show();
    }

    @FXML
    private void AppoinmentDatepicker(ActionEvent event) {
    }

    @FXML
    private void timeTextfield(ActionEvent event) {
    }
    
}
