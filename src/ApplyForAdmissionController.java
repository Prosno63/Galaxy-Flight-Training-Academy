/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
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
import javafx.scene.control.Label;
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
public class ApplyForAdmissionController implements Initializable {

    @FXML
    private TextField nameField;
    @FXML
    private Label idLabel;
    @FXML
    private TextField phoneField;
    @FXML
    private TextField locationField;
    @FXML
    private TextField emailField;
    
    private AdmissionStudent adStud;
    @FXML
    private RadioButton tbMale;
    @FXML
    private RadioButton tbTrans;
    @FXML
    private RadioButton tbFemale;
    
    private ToggleGroup tg;

    /**
     * Initializes the controller class.
     */

    @Override
    public void initialize(URL url, ResourceBundle rb) {
       idLabel.setText(CurrentApplicant.getCurrentApplicant().getId());
       
        tg = new ToggleGroup();
        tbMale.setToggleGroup(tg);
        tbFemale.setToggleGroup(tg);
        tbTrans.setToggleGroup(tg);
    }    

    @FXML
    private void applyBtnOnClick(MouseEvent event) {
         String gender = null;
         if (tbMale.isSelected()) gender = "Male";
          else if (tbFemale.isSelected()) gender = "Female";
           else if (tbTrans.isSelected()) gender = "TransGender";
         
        adStud = new AdmissionStudent(
                        idLabel.getText(),nameField.getText(),
                        phoneField.getText(),locationField.getText(),
                        emailField.getText(),gender
        );
        FileOutputStream  fos;
        ObjectOutputStream oos;

        try {
            File f = new File("AdmissionStudents.bin");   
            if (f.exists()){
                fos = new FileOutputStream(f,true);
                oos = new AppendableObjectOutputStream(fos);
            } else {
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);                
            }

            oos.writeObject(adStud);
            oos.close();
            
            System.out.println("Applied");
            System.out.println(adStud.toString());
            
            Alert a = new Alert(Alert.AlertType.CONFIRMATION); 
            a.setContentText("Apply Successful");
            a.showAndWait();        
    }catch (IOException e){}
        
    }

    @FXML
    private void backBtnOnClick(MouseEvent event) throws IOException {
         Parent parent = FXMLLoader.load(getClass().getResource("ApplicantScene.fxml"));
         Scene scene = new Scene(parent);
         Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
         window.setScene(scene);
         window.show();  
    }
    
}
