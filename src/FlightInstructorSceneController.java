
import java.io.FileInputStream;
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
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author tasin
 */
public class FlightInstructorSceneController implements Initializable {

    @FXML
    private Label name2;
    @FXML
    private Label ID;
     User v;
     //User f;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    } 
     void init(User x) {
         v=x;
         System.out.println(v.toString());
         name2.setText(v.name);
         ID.setText(v.id);
     }

    @FXML
    private void showNotification(MouseEvent event) {
    }

    @FXML
    private void giveAttendance(ActionEvent event) {
    }

    @FXML
    private void giveGrades(ActionEvent event) {
    }

    @FXML
    private void flightPlan(ActionEvent event) {
         ObjectInputStream is=null;
         try {
              User f;
             is = new ObjectInputStream(new FileInputStream("login.bin"));
              while(true){
                f=(User)is.readObject();
             //  if(f.id == ID.getText()){
             if(f.getId().equals(ID.getText())){
                   System.out.println(f.id);
                   FXMLLoader loader = new FXMLLoader();
                   loader.setLocation(getClass().getResource("file.fxml"));
                   Parent personViewParent = loader.load();
                   Scene personViewScene = new Scene(personViewParent);
                     FileController c = loader.getController();
                    c.receive(f);
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

    @FXML
    private void evaluteTrainees(ActionEvent event) {
    }

    @FXML
    private void filereport(ActionEvent event) {
        
         ObjectInputStream is=null;
         try {
              User f;
             is = new ObjectInputStream(new FileInputStream("login.bin"));
              while(true){
                f=(User)is.readObject();
             //  if(f.id == ID.getText()){
             if(f.getId().equals(ID.getText())){
                   System.out.println(f.id);
                   FXMLLoader loader = new FXMLLoader();
                   loader.setLocation(getClass().getResource("Report.fxml"));
                   Parent personViewParent = loader.load();
                   Scene personViewScene = new Scene(personViewParent);
                    ReportController c = loader.getController();
                    c.init(f);
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

    @FXML
    private void seeMaintenanceStatus(ActionEvent event) {
          ObjectInputStream is=null;
         try {
              User f;
             is = new ObjectInputStream(new FileInputStream("login.bin"));
              while(true){
                f=(User)is.readObject();
             //  if(f.id == ID.getText()){
             if(f.getId().equals(ID.getText())){
                   System.out.println(f.id);
                   FXMLLoader loader = new FXMLLoader();
                   loader.setLocation(getClass().getResource("MaintenanceStatus.fxml"));
                   Parent personViewParent = loader.load();
                   Scene personViewScene = new Scene(personViewParent);
                   MaintenanceStatusController  c = loader.getController();
                    c.seeMintenance(f);
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

    @FXML
    private void accessTestFlight(ActionEvent event) {
    }

    @FXML
    private void approveLeaveApplication(ActionEvent event) {
    }

    void init1(User x) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @FXML
    private void seeNoticeButtonOnClick(ActionEvent event) {
         ObjectInputStream is=null;
         try {
              User f;
             is = new ObjectInputStream(new FileInputStream("login.bin"));
              while(true){
                f=(User)is.readObject();
             //  if(f.id == ID.getText()){
             if(f.getId().equals(ID.getText())){
                   System.out.println(f.id);
                   FXMLLoader loader = new FXMLLoader();
                   loader.setLocation(getClass().getResource("NoticeFlightInstructor.fxml"));
                   Parent personViewParent = loader.load();
                   Scene personViewScene = new Scene(personViewParent);
                   NoticeFlightInstructorController c = loader.getController();
                    c.getNotice(f);
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
