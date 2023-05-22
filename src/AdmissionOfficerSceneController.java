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
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author tasin
 */
public class AdmissionOfficerSceneController implements Initializable {

    @FXML
    private Label nameLabel;
    @FXML
    private TextArea textArea;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void postAdmissionNoticeButton(MouseEvent event) throws IOException {
        Parent scenetoParent = FXMLLoader.load(getClass().getResource("PostAdmissionNotice.fxml"));
        Scene scene2 = new Scene(scenetoParent);      
        Stage stg2 = (Stage)((Node)event.getSource()).getScene().getWindow(); 
        stg2.setScene(scene2);
        stg2.show();
    }

    @FXML
    private void viewApplicantList(MouseEvent event) throws IOException {
        Parent scenetoParent = FXMLLoader.load(getClass().getResource("ViewApplicantList.fxml"));
        Scene scene2 = new Scene(scenetoParent);      
        Stage stg2 = (Stage)((Node)event.getSource()).getScene().getWindow(); 
        stg2.setScene(scene2);
        stg2.show();
    }

    @FXML
    private void vivaExamButton(MouseEvent event) throws IOException {
        Parent scenetoParent = FXMLLoader.load(getClass().getResource("VivaCandidate.fxml"));
        Scene scene2 = new Scene(scenetoParent);      
        Stage stg2 = (Stage)((Node)event.getSource()).getScene().getWindow(); 
        stg2.setScene(scene2);
        stg2.show();
    }

    @FXML
    private void leaveApplicationButton(MouseEvent event) throws IOException {
        Parent scenetoParent = FXMLLoader.load(getClass().getResource("LeaveApplicationForAdmissionOfficer.fxml"));
        Scene scene2 = new Scene(scenetoParent);      
        Stage stg2 = (Stage)((Node)event.getSource()).getScene().getWindow(); 
        stg2.setScene(scene2);
        stg2.show();
    }

    @FXML
    private void editCandidateInformationButton(MouseEvent event) throws IOException {
        Parent scenetoParent = FXMLLoader.load(getClass().getResource("EditCandidate.fxml"));
        Scene scene2 = new Scene(scenetoParent);      
        Stage stg2 = (Stage)((Node)event.getSource()).getScene().getWindow(); 
        stg2.setScene(scene2);
        stg2.show();
    }

    @FXML
    private void medicalTestButton(MouseEvent event) throws IOException {
        Parent scenetoParent = FXMLLoader.load(getClass().getResource("MedicalTestCandidate.fxml"));
        Scene scene2 = new Scene(scenetoParent);      
        Stage stg2 = (Stage)((Node)event.getSource()).getScene().getWindow(); 
        stg2.setScene(scene2);
        stg2.show();
    }

    @FXML
    private void logoutButton(MouseEvent event) throws IOException {
        Parent scenetoParent = FXMLLoader.load(getClass().getResource("LoginScene.fxml"));
        Scene scene2 = new Scene(scenetoParent);      
        Stage stg2 = (Stage)((Node)event.getSource()).getScene().getWindow(); 
        stg2.setScene(scene2);
        stg2.show();
    }

    @FXML
    private void writtenExamButton(MouseEvent event) throws IOException {
        Parent scenetoParent = FXMLLoader.load(getClass().getResource("WrittenCandidate.fxml"));
        Scene scene2 = new Scene(scenetoParent);      
        Stage stg2 = (Stage)((Node)event.getSource()).getScene().getWindow(); 
        stg2.setScene(scene2);
        stg2.show();
    }

    @FXML
    private void finalCandidateButton(MouseEvent event) throws IOException {
        Parent scenetoParent = FXMLLoader.load(getClass().getResource("FinalCandidate.fxml"));
        Scene scene2 = new Scene(scenetoParent);      
        Stage stg2 = (Stage)((Node)event.getSource()).getScene().getWindow(); 
        stg2.setScene(scene2);
        stg2.show();
    }
    
}
