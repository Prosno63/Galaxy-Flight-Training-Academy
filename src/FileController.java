
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;


public class FileController implements Initializable {

    @FXML
    private Label Departure;
    @FXML
    private TextArea textArea;
    @FXML
    private Label name;
    @FXML
    private Label id;
    @FXML
    private TextField DepartureDateandTime;
    @FXML
    private TextField speed;
    @FXML
    private TextField level;
    @FXML
    private TextField destination;
    @FXML
    private TextField departure;
    @FXML
    private TextField aircraftId;
    @FXML
    private TextField Aircrafttype;
    ArrayList<AircraftsAndComponents>list;
    User u;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        list= new ArrayList<AircraftsAndComponents>();
    }    

    @FXML
    private void addInListButtonOClick(ActionEvent event) {
        list.add(new AircraftsAndComponents(aircraftId.getText(),Aircrafttype.getText(), Departure.getText(),
                                             DepartureDateandTime.getText(),level.getText(),speed.getText(),
                                              destination.getText()));
        
    }

    @FXML
    private void showInTextAreaButtonOnClick(ActionEvent event) {
        
         try {
               
                File f = new File("flightPlan.txt");
                FileWriter fw;
                if(f.exists())
                    fw = new FileWriter(f,true);
                else 
                    fw = new FileWriter(f);
                String str="";
                for(AircraftsAndComponents s:list ){
                    str += s.aircraftType+",\n"
                            +s.aircraftID+",\n"
                            +s.departure+",\n"
                            +s.TimeAndDate+",\n"
                            +s.Level+",\n"
                            +s.speed+",\n"
                            +s.destination+",\n"+
                            "\n"+"\n";
                    
                }
                fw.write(str);
                fw.close();
            } catch (IOException ex) {
                
                //SHOW ex.toString() IN AN ALERT
            }
         
         
         
         File file = new File("flightPlan.txt");
        Scanner sc; String str=null;
        try {
            sc = new Scanner(file);
            textArea.setText(null);
            while(sc.hasNextLine()){
                str=sc.nextLine();
                textArea.appendText(str+"\n");
                //outputTxtArea.appendText("\n");               
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LoginSceneController.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }

    void receive(User f) {
      u=f;
      name.setText(u.name);
      id.setText(u.id);
    }
    
}
