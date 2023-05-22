/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author tasin
 */
public class ViewAdmissionNoticeController implements Initializable {

    @FXML
    private TextArea textField;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        File f = new File("admissionNotice.txt");
        Scanner sc;
        String str = null;
        try{
            sc = new Scanner(f);
            textField.setText(null);
            while(sc.hasNextLine()){
                str = sc.nextLine();
                textField.appendText(str + "\n");
            }
        } catch (Exception e) {};   
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
