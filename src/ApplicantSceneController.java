/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author tasin
 */
public class ApplicantSceneController implements Initializable  {

    /**
     * Initializes the controller class.
     */

    @FXML
    private Label nameLabel;
    private Applicant a;
    private Applicant b;
    ArrayList <Applicant> AppListArr;
    @FXML
    private TextArea notificationTextArea;
    @FXML
    private Label idLabel;
    
    ObjectInputStream ois;
    FileOutputStream  fos;
    ObjectOutputStream oos;

    void data(User u) {
        a = new Applicant(u.getName(),u.getId(),u.getPassword(),u.getGender(),u.getType());
        CurrentApplicant.setCurrentApplicant(a);
        
        
        System.out.println( u.toString() + " "  +a.toString());
        nameLabel.setText("Name: " +CurrentApplicant.getCurrentApplicant().getName());
        idLabel.setText("ID: " + CurrentApplicant.getCurrentApplicant().getId());

    } 
    
    

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        AppListArr = new ArrayList<>();
       File f = new File("Applicant.bin");
       if (f.exists()){
           try {
               ois = new ObjectInputStream(new FileInputStream(f));
               while(true){
                   b = (Applicant) ois.readObject();
                   AppListArr.add(b);
               }
           } catch (Exception ex) {
             System.out.println("error");
            try {
                if(ois!=null)
                    ois.close();
            } catch (IOException ex1) {  } 
            
        for (Applicant app : AppListArr){
            if (a == app)
                System.out.println("Exists");
            else {
               try { 
                    fos = new FileOutputStream("Applicant.bin",true);
                    oos = new AppendableObjectOutputStream(fos);
                    oos.writeObject(a);
                    oos.close();

                    System.out.println("New file added");

            
        }catch (IOException e){}  
            }
        }
        }
       } else {
        try { 
                    fos = new FileOutputStream("Applicant.bin");
                    oos = new ObjectOutputStream(fos);
                    oos.writeObject(a);
                    oos.close();

                    System.out.println(a.toString());
            
        }catch (IOException e){} 
       }
       

        
        
        
        
        //nameLabel.setText("Name: " +CurrentApplicant.getCurrentApplicant().getName());
        //idLabel.setText("ID: " + CurrentApplicant.getCurrentApplicant().getId());
    }    
    
    

    @FXML
    private void viewAdmissionNoticeBtnOnClick(MouseEvent event) throws IOException {
         Parent parent = FXMLLoader.load(getClass().getResource("ViewAdmissionNotice.fxml"));
         Scene scene = new Scene(parent);
         Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
         window.setScene(scene);
         window.show();
    }

    @FXML
    private void applyForAdmissionBtnOnClick(MouseEvent event) throws IOException {
         Parent parent = FXMLLoader.load(getClass().getResource("ApplyForAdmission.fxml"));
         Scene scene = new Scene(parent);
         Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
         window.setScene(scene);
         window.show(); 
        
    }

    @FXML
    private void viewPaymentBtnOnClick(MouseEvent event) throws IOException {
         Parent parent = FXMLLoader.load(getClass().getResource("ViewPayment.fxml"));
         Scene scene = new Scene(parent);
         Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
         window.setScene(scene);
         window.show(); 
    }
    

    @FXML
    private void viewExamScheduleBtnOnClick(MouseEvent event) throws IOException {
         Parent parent = FXMLLoader.load(getClass().getResource("ViewExamSchedule.fxml"));
         Scene scene = new Scene(parent);
         Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
         window.setScene(scene);
         window.show();          
    }

    @FXML
    private void viewExamResultBtnOnClick(MouseEvent event) throws IOException {
        
    }

    @FXML
    private void ourAcademyTourBtnOnClick(MouseEvent event) throws IOException {
    }

    @FXML
    private void trackAdmissionStatusBtnOnClick(MouseEvent event) throws IOException {
         Parent parent = FXMLLoader.load(getClass().getResource("TrackAdmissionStatus.fxml"));
         Scene scene = new Scene(parent);
         Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
         window.setScene(scene);
         window.show();          
    }

    @FXML
    private void viewAdmissionRequirementBtnOnClick(MouseEvent event) throws IOException {
         Parent parent = FXMLLoader.load(getClass().getResource("ViewAdmissionRequirements.fxml"));
         Scene scene = new Scene(parent);
         Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
         window.setScene(scene);
         window.show();
    }
    
    @FXML
    private void logOutBtnOnClick(MouseEvent event) throws IOException {
         Parent parent = FXMLLoader.load(getClass().getResource("LoginScene.fxml"));
         Scene scene = new Scene(parent);
         Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
         window.setScene(scene);
         window.show(); 
    }


    
}
