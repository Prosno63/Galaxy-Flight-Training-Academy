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
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author tasin
 */
public class CEOSceneController implements Initializable {

    @FXML
    private Label nameLabel;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void flightSafetyGuidelineButton(MouseEvent event) throws IOException {
       Parent scenetoParent = FXMLLoader.load(getClass().getResource("FlightSafetyPolicy.fxml"));
        Scene scene2 = new Scene(scenetoParent);      
        Stage stg2 = (Stage)((Node)event.getSource()).getScene().getWindow(); 
        stg2.setScene(scene2);
        stg2.show(); 
        
    }

    @FXML
    private void budgetApprovalListButton(MouseEvent event) throws IOException {
        Parent scenetoParent = FXMLLoader.load(getClass().getResource("BudgetApprovalList.fxml"));
        Scene scene2 = new Scene(scenetoParent);      
        Stage stg2 = (Stage)((Node)event.getSource()).getScene().getWindow(); 
        stg2.setScene(scene2);
        stg2.show();
    }

    @FXML
    private void finalizeAgreementWithSupplierButton(MouseEvent event) throws IOException {
        Parent scenetoParent = FXMLLoader.load(getClass().getResource("FinalizeAgreementSuppiler.fxml"));
        Scene scene2 = new Scene(scenetoParent);      
        Stage stg2 = (Stage)((Node)event.getSource()).getScene().getWindow(); 
        stg2.setScene(scene2);
        stg2.show();
    }

    @FXML
    private void viewMonthlyRevenueButton(MouseEvent event) throws IOException {
        Parent scenetoParent = FXMLLoader.load(getClass().getResource("ViewMonthlyRevenue.fxml"));
        Scene scene2 = new Scene(scenetoParent);      
        Stage stg2 = (Stage)((Node)event.getSource()).getScene().getWindow(); 
        stg2.setScene(scene2);
        stg2.show();
    }

    @FXML
    private void componentsListCheckAndApprovalButton(MouseEvent event) throws IOException {
        Parent scenetoParent = FXMLLoader.load(getClass().getResource("RequiredComponentListCheckAndApproval.fxml"));
        Scene scene2 = new Scene(scenetoParent);      
        Stage stg2 = (Stage)((Node)event.getSource()).getScene().getWindow(); 
        stg2.setScene(scene2);
        stg2.show();
    }

    @FXML
    private void viewTaxReportButton(MouseEvent event) throws IOException {
        Parent scenetoParent = FXMLLoader.load(getClass().getResource("ViewTextReport.fxml"));
        Scene scene2 = new Scene(scenetoParent);      
        Stage stg2 = (Stage)((Node)event.getSource()).getScene().getWindow(); 
        stg2.setScene(scene2);
        stg2.show();
    }

    @FXML
    private void disciplinaryActionPolicyButton(MouseEvent event) throws IOException {
        Parent scenetoParent = FXMLLoader.load(getClass().getResource("DisciplinaryActionPolicy.fxml"));
        Scene scene2 = new Scene(scenetoParent);      
        Stage stg2 = (Stage)((Node)event.getSource()).getScene().getWindow(); 
        stg2.setScene(scene2);
        stg2.show();
    }

    @FXML
    private void approvalLeaveApplicationButton(MouseEvent event) throws IOException {
        Parent scenetoParent = FXMLLoader.load(getClass().getResource("CeoLeaveApplicationApproval.fxml"));
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
    
}
