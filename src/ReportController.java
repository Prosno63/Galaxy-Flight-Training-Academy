/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;


public class ReportController implements Initializable {

    @FXML
    private ComboBox aircraftName;
    @FXML
    private ComboBox type;
    @FXML
    private ComboBox RunwayLength;
    @FXML
    private ComboBox wheelBase;
    @FXML
    private ComboBox id;
    @FXML
    private TextArea textArea;
    @FXML
    private Label name;
    @FXML
    private Label userid;

    
     User vp;
    
    ArrayList<User>list;
    ArrayList<Report> list1;
   
    
    public void init(User v){
        vp=v;
        name.setText(vp.name);
        userid.setText(vp.id);
        
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        list=new ArrayList<User>();
        list1=new  ArrayList<Report>();
        
      // list.add(new FlightInstructor("jui","2031251"));
       //  list.add(new FlightInstructor("zidnee","2031252"));
        
        aircraftName.getItems().addAll("Mig 21","Bf 109 fighter","B-52 Stratofortress","Tupolev Tu-95 bomber");
        type.getItems().addAll("243","77","987","345");
        RunwayLength.getItems().addAll(2316,1715,222,1234);
        wheelBase.getItems().addAll(17.1, 14.7, 25.4, 12.8);
       // for(FlightInstructor s:list){
        //   id.getItems().addAll(s.id);}
       //  name.setText(vp.name);
       
        ObjectInputStream is=null;
         try {
              User f;
             is = new ObjectInputStream(new FileInputStream("login.bin"));
              while(true){
                f=(User)is.readObject();
            if(f.getType().equals("Aircraft engineer")){
                   id.getItems().addAll(f.id);
              }
               
            }
         }
          catch (Exception ex) {
            try {
                if(is!=null){
                    
                    is.close();}
            } catch (IOException ex1) {  }         
        }
        
        
        
    }    

    @FXML
    private void addToArrayListButtonOnClick(ActionEvent event) {
        
        list1.add(new Report(aircraftName.getValue().toString(),
                type.getValue().toString(),
                RunwayLength.getValue().hashCode(),
                wheelBase.getValue().hashCode(),
                 id.getValue().hashCode(),
                  textArea.getText()));
    }

    @FXML
    private void sentReportButtonOnClick(ActionEvent event) {
        
        for(Report v:list1){
            
           ObjectInputStream is=null;
           try {
             User f;
             is = new ObjectInputStream(new FileInputStream("login.bin"));
              while(true){
               
              f=(User)is.readObject();
               if(f.getId().equals(id.getValue().toString())){
                   System.out.println(f.id);
                   FXMLLoader loader = new FXMLLoader();
                   loader.setLocation(getClass().getResource("SolveReportProblem.fxml"));
                   Parent personViewParent = loader.load();
                   Scene personViewScene = new Scene(personViewParent);
                   SolveReportProblemController c = loader.getController();
                    c.init3(f,v);
                    Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
                    window.setScene(personViewScene);
                    window.show();
                    break;
                   
                } 
              }
               
            }
          catch (Exception ex) {
            try {
                if(is!=null){
                    
                    is.close();}
            } catch (IOException ex1) {  }         
        }
        
            
            
            
        }
        
    }
    
}   
    
