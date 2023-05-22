/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.sun.prism.paint.Color;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author tasin
 */
public class ViewPaymentController implements Initializable {

    @FXML
    private Label paidLabel;


    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        if (CurrentApplicant.getCurrentApplicant().isPaid()){
            paidLabel.setText("PAID");
            paidLabel.setStyle("-fx-background-color: green");
        } else {
            paidLabel.setText("NOT PAID");
            paidLabel.setStyle("-fx-background-color: red");
        }
    }    

    @FXML
    private void backBtnOnClick(MouseEvent event) throws IOException {
         Parent parent = FXMLLoader.load(getClass().getResource("ApplicantScene.fxml"));
         Scene scene = new Scene(parent);
         Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
         window.setScene(scene);
         window.show();
    }

    @FXML
    private void payNowBtnOnClick(MouseEvent event) {
        CurrentApplicant.getCurrentApplicant().setPaidStatus(true);
        
        paidLabel.setText("PAID");
        paidLabel.setStyle("-fx-background-color: green");
        
                Alert a = new Alert(Alert.AlertType.CONFIRMATION); 
                a.setContentText("Payment Successful");
                a.showAndWait();
                
                
                
                
                
    }
    
}
