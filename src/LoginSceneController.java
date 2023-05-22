/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author tasin
 */
public class LoginSceneController implements Initializable {

    @FXML
    private ComboBox <String> comboBox;
    @FXML
    private TextField idField;
    @FXML
    private TextField passwordField;
    
    String userType;
    User x;


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        comboBox.getItems().addAll("Applicant","Trainee"
                ,"Flight Instructor","Aircraft engineer","Admission Officer","CEO","Account Officer","FrontDesk Officer");
        comboBox.setValue("Choose user type");
    }    



    @FXML
    private void registerBtnOnClick(MouseEvent event) throws IOException {
         Parent parent = FXMLLoader.load(getClass().getResource("RegistrationScene.fxml"));
         Scene scene = new Scene(parent);
         Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
         window.setScene(scene);
         window.show(); 
    }

    @FXML
    private void loginBtnOnClick(MouseEvent event) {
        System.out.println("login Pressed");
        ObjectInputStream ois=null;
        
        
         try {
            ois = new ObjectInputStream(new FileInputStream("login.bin"));
            while(true){
                x = (User) ois.readObject();
               
                if (x.getId().equals(idField.getText())){
                    if (x.getPassword().equals(passwordField.getText())){
                        if(x.getType().equals(comboBox.getValue())){
                            userType = comboBox.getValue();
                        System.out.println("Successful");
                        System.out.println(userType);
                            goToScene(userType,event);
                            break;
                        }
                    }
                }
            }
                       
        } catch (Exception ex) {
             System.out.println(ex);
             //System.out.println("error");
                Alert a = new Alert(Alert.AlertType.ERROR); 
                a.setContentText("Login Failed");
                a.showAndWait();
            try {
                if(ois!=null)
                    ois.close();

            } catch (IOException ex1) {
                Alert e = new Alert(Alert.AlertType.ERROR); 
                e.setContentText("Login Failed");
                e.showAndWait();            
            }           
        }
    }
       
    private void goToScene(String userType, MouseEvent event) throws IOException {
            switch (userType) {
            case "Applicant":
                {
                        FXMLLoader loader = new FXMLLoader();
                        loader.setLocation(getClass().getResource("ApplicantScene.fxml"));
                        Parent parent = loader.load();
                        Scene scene = new Scene(parent);
                        ApplicantSceneController controller = loader.getController();
                        controller.data(x);
                        
                        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
                        window.setScene(scene);
                        window.show();
                    break;
                }
            case "Trainee":
                {
                        FXMLLoader loader = new FXMLLoader();
                        loader.setLocation(getClass().getResource("TraineeScene.fxml"));
                        Parent parent = loader.load();
                        Scene scene = new Scene(parent);
                        TraineeSceneController controller = loader.getController();
                        
                        controller.data(x);
                        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
                        window.setScene(scene);
                        window.show();
                    break;
                }
            case "Flight Instructor":
                {
                       FXMLLoader loader = new FXMLLoader();
                        loader.setLocation(getClass().getResource("FlightInstructorScene.fxml"));
                        Parent parent = loader.load();
                        Scene scene = new Scene(parent);
                        FlightInstructorSceneController controller = loader.getController();
                        //controller.data(idField.getText());
                        controller.init(x);
                        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
                        window.setScene(scene);
                        window.show();
                    break;
                }
            case"Aircraft engineer"  :
             {
                        FXMLLoader loader = new FXMLLoader();
                        loader.setLocation(getClass().getResource("AirCraftMaintenanceEngineerScene.fxml"));
                        Parent parent = loader.load();
                        Scene scene = new Scene(parent);
                        //AirCraftMaintenanceEngineerController controller = loader.getController();
                        //controller.data(idField.getText());
                       // controller.init1(x);
                        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
                        window.setScene(scene);
                        window.show();
                    break;
            }
            case "Admission Officer":
             {
                        Parent parent = FXMLLoader.load(getClass().getResource("AdmissionOfficerScene.fxml"));
                        Scene scene = new Scene(parent);
                        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
                        window.setScene(scene);
                        window.show();
                    break;
            }
            case "CEO":
             {
                        Parent parent = FXMLLoader.load(getClass().getResource("CEOScene.fxml"));
                        Scene scene = new Scene(parent);
                        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
                        window.setScene(scene);
                        window.show();
                    break;
            }
            case "Account Officer":
             {
                        Parent parent = FXMLLoader.load(getClass().getResource("AccountOfficer.fxml"));
                        Scene scene = new Scene(parent);
                        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
                        window.setScene(scene);
                        window.show();
                    break;
            }
            case "FrontDesk Officer":
             {
                        Parent parent = FXMLLoader.load(getClass().getResource("FrontDeskOfficer.fxml"));
                        Scene scene = new Scene(parent);
                        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
                        window.setScene(scene);
                        window.show();
                    break;
            }
                default:
                    break;
            }
            
            
    }

    @FXML
    private void exitBtnOnClick(MouseEvent event) {
        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        stage.close();
    }

    @FXML
    private void showBtnOnClick(MouseEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("BinFileShow.fxml"));
                        Scene scene = new Scene(parent);
                        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
                        window.setScene(scene);
                        window.show();
    }
    
    
    }



    
   


