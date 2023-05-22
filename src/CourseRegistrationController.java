/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.input.ContextMenuEvent;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author tasin
 */
public class CourseRegistrationController implements Initializable {

    @FXML
    private ComboBox<String> comboBox;
    @FXML
    private Label label;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        comboBox.getItems().addAll("PPL","CPL","ATPL");
        comboBox.setValue("Choose a course: ");
        
        
    }    

    @FXML
    private void backBtnOnClick(MouseEvent event) throws IOException {
         Parent parent = FXMLLoader.load(getClass().getResource("TraineeScene.fxml"));
         Scene scene = new Scene(parent);
         Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
         window.setScene(scene);
         window.show();        
    }

    @FXML
    private void RegisterBtnOnClick(MouseEvent event) {
    }

    @FXML
    private void comboBoxBtnOnClick(Event event) {
        label.setText(comboBox.getValue());
    }
    
}
