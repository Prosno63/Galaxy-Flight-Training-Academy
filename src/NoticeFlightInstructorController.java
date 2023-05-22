/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;


public class NoticeFlightInstructorController implements Initializable {

    @FXML
    private TextArea textArea;
    @FXML
    private Label name;
    @FXML
    private Label id;
    User g;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
         File f = new File("noticeBoard.txt");
        Scanner sc;
        String str = null;
        try{
            sc = new Scanner(f);
            textArea.setText(null);
            while(sc.hasNextLine()){
                str = sc.nextLine();
                textArea.appendText(str + "\n");
            }
        } catch (Exception e) {};   
    }    

    @FXML
    private void goToPreviousScene(ActionEvent event) throws IOException {
         Parent ApplicantScene = FXMLLoader.load(getClass().getResource("FlightInstructorScene.fxml"));
        Scene scn = new Scene(ApplicantScene);
        
        Stage stg = (Stage)((Node)event.getSource()).getScene().getWindow();
        stg.setScene(scn);
        stg.show();
    }

    void getNotice(User f) {
       g=f;
       name.setText(g.name);
       id.setText(g.id);
    }
    
}
