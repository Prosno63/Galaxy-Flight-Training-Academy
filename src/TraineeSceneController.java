/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author tasin
 */
public class TraineeSceneController implements Initializable {

    /**
     * Initializes the controller class.
     */

    @FXML
    private Label nameLabel;
    
    
    private String id;
    private User t;
    private Trainee x;
    @FXML
    private Label idLabel;
    void data(User  t) {
        x = new Trainee(t.getName(),t.getId(),t.getPassword(),t.getGender(),t.getType());
        System.out.println(t.toString());
        nameLabel.setText(t.getName()); 
    }         
           
    @Override
     public void initialize(URL url, ResourceBundle rb) {
  
    }    

    @FXML
    private void logOutBtnOnClick(MouseEvent event) throws IOException {
         Parent parent = FXMLLoader.load(getClass().getResource("LoginScene.fxml"));
         Scene scene = new Scene(parent);
         Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
         window.setScene(scene);
         window.show();  
    }

    @FXML
    private void viewNoticeBtnOnClick(MouseEvent event) throws IOException {
         Parent parent = FXMLLoader.load(getClass().getResource("ViewNotice.fxml"));
         Scene scene = new Scene(parent);
         Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
         window.setScene(scene);
         window.show();         
    }

    @FXML
    private void viewResultBtnOnClick(MouseEvent event) throws IOException {
         Parent parent = FXMLLoader.load(getClass().getResource("ViewResult.fxml"));
         Scene scene = new Scene(parent);
         Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
         window.setScene(scene);
         window.show();        
    }

    @FXML
    private void courseRegistrationBtnOnclick(MouseEvent event) throws IOException {
         Parent parent = FXMLLoader.load(getClass().getResource("CourseRegistration.fxml"));
         Scene scene = new Scene(parent);
         Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
         window.setScene(scene);
         window.show(); 
         
    }

    @FXML
    private void requestFlightBtnOnClick(MouseEvent event) throws IOException {
    }

    @FXML
    private void showEvaluatonReportBtnOnClick(MouseEvent event) throws IOException {
    }

    @FXML
    private void leaveApplicationBtnOnClick(MouseEvent event) throws IOException {
         Parent parent = FXMLLoader.load(getClass().getResource("LeaveApplicationForTrainee.fxml"));
         Scene scene = new Scene(parent);
         Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
         window.setScene(scene);
         window.show();
    }

    @FXML
    private void attenadnceBtnOnClick(MouseEvent event) throws IOException {
    }

    @FXML
    private void showClassesBtnOnClick(MouseEvent event) throws IOException {
    }
    
}
