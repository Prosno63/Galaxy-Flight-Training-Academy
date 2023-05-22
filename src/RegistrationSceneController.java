/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author tasin
 */
public class RegistrationSceneController implements Initializable {

    @FXML
    private TextField idField;
    @FXML
    private TextField usernameField;
    @FXML
    private TextField passwordField;
    @FXML
    private TextField numberField;
    @FXML
    private TextField emailField;
    @FXML
    private ComboBox<String> comboBox;
    @FXML
    private RadioButton tbMale;
    @FXML
    private RadioButton tbFemale;
    @FXML
    private RadioButton tbTrans;
    private ToggleGroup tg;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        comboBox.getItems().addAll("Applicant","Trainee"
            ,"Flight Instructor","Aircraft engineer","Admission Officer","CEO","Account Officer","FrontDesk Officer");
        comboBox.setValue("Applicant");
        
        tg = new ToggleGroup();
        tbMale.setToggleGroup(tg);
        tbFemale.setToggleGroup(tg);
        tbTrans.setToggleGroup(tg);
         
    }
//    private void addUserFromScene () {
//        String gender = null;
//        if (tbMale.isSelected()) gender = "Male";
//        else if (tbFemale.isSelected()) gender = "Female";
//        else if (tbTrans.isSelected()) gender = "TransGender";
//        
//        return  usernameField.getText(), Integer.parseInt(idField.getText()),passwordField.getText(),gender, comboBox.getValue() ;  
//    }


    

    @FXML
    private void NewAccountBtnOnclick(MouseEvent event) throws IOException {
  
        FileOutputStream  fos;
        ObjectOutputStream oos;

        String gender = null;
         if (tbMale.isSelected()) gender = "Male";
          else if (tbFemale.isSelected()) gender = "Female";
           else if (tbTrans.isSelected()) gender = "TransGender";
            User x = new User( 
                    usernameField.getText(),
                    idField.getText(),
                    passwordField.getText(),gender,
                    comboBox.getValue() );  


        try {
            File f = new File("login.bin");   
            if (f.exists()){
                fos = new FileOutputStream(f,true);
                oos = new AppendableObjectOutputStream(fos);
            } else {
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);                
            }

            oos.writeObject(x);
            oos.close();
            
            System.out.println("Done registration");
            Alert a = new Alert(Alert.AlertType.CONFIRMATION); 
            a.setContentText("Registration Successful");
            a.showAndWait();
            
            System.out.println(x.toString());

            
        }catch (IOException e){
                Alert a = new Alert(Alert.AlertType.ERROR); 
                a.setContentText("Failed");
                a.showAndWait();            
        } finally {
         Parent parent = FXMLLoader.load(getClass().getResource("LoginScene.fxml"));
         Scene scene = new Scene(parent);
         Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
         window.setScene(scene);
         window.show();           
    }
        
        
    }

    @FXML
    private void backBtnOnclick(MouseEvent event) throws IOException {
         Parent parent = FXMLLoader.load(getClass().getResource("LoginScene.fxml"));
         Scene scene = new Scene(parent);
         Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        
         stage.setScene(scene);
         stage.show();
    }
    

    
}
