/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.URL;
import java.util.ResourceBundle;
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
public class BinFileShowController implements Initializable {

    @FXML
    private TextArea textArea;
    User t;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void btnOnClick(MouseEvent event) {
        System.out.println("button Pressed");
        ObjectInputStream ois=null;
         try {

            ois = new ObjectInputStream(new FileInputStream("login.bin"));
             
            textArea.setText(null);
            
            while(true){
                t = (User) ois.readObject();
                textArea.appendText(t.toString()+"\n");
            }
              
        } catch (Exception ex) {
             System.out.println("error");
            try {
                if(ois!=null)
                    ois.close();
            } catch (IOException ex1) {  }           
        }
    }

    @FXML
    private void BackbtnOnClick(MouseEvent event) throws IOException {
                Parent parent = FXMLLoader.load(getClass().getResource("LoginScene.fxml"));
                        Scene scene = new Scene(parent);
                        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
                        window.setScene(scene);
                        window.show();
    }
    }
    
