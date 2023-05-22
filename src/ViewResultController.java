/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.time.Month;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author tasin
 */
public class ViewResultController implements Initializable {

    @FXML
    private TableView<Result> tableView;
    @FXML
    private TableColumn<Result, String> CourseName;
    @FXML
    private TableColumn<Result, String> Grade;
    @FXML
    private TableColumn<Result, String> gpa;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        CourseName.setCellValueFactory(new PropertyValueFactory<Result, String>("CourseName"));
        Grade.setCellValueFactory(new PropertyValueFactory<Result, String>("Grade"));
        gpa.setCellValueFactory(new PropertyValueFactory<Result, String>("gpa"));
        
        tableView.setItems(getResults());
        
                
    } 
    
        public ObservableList<Result> getResults(){
        ObservableList<Result> result = FXCollections.observableArrayList();
        
        result.add(new Result("Course Name 01" , "A","4.00"));
        result.add(new Result("Course Name 02" , "B+" ,"3.25"));
        result.add(new Result("Course Name 03" , "B" ,"3.00"));
        return result;
    }

    @FXML
    private void backBtnOnClick(MouseEvent event) throws IOException {
         Parent parent = FXMLLoader.load(getClass().getResource("TraineeScene.fxml"));
         Scene scene = new Scene(parent);
         Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
         window.setScene(scene);
         window.show();
    }
    
}
