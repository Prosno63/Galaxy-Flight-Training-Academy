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
public class ViewExamScheduleController implements Initializable {

    @FXML
    private TableView<ExamSchedule> tableView;
    @FXML
    private TableColumn<ExamSchedule, String> ExamNameColumn;
    @FXML
    private TableColumn<ExamSchedule, String> ExamDateColumn;
    @FXML
    private TableColumn<ExamSchedule, String> ExamTimeColumn;
    @FXML
    private TableColumn<ExamSchedule, String> ExamRoomColumn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        ExamNameColumn.setCellValueFactory(new PropertyValueFactory<ExamSchedule,String>("ExamName"));
        ExamDateColumn.setCellValueFactory(new PropertyValueFactory<ExamSchedule,String>("ExamDate"));
        ExamTimeColumn.setCellValueFactory(new PropertyValueFactory<ExamSchedule,String>("ExamTime"));
        ExamRoomColumn.setCellValueFactory(new PropertyValueFactory<ExamSchedule,String>("ExamRoom"));
        
        tableView.setItems(getExams());
    }


    public ObservableList<ExamSchedule> getExams(){
        ObservableList<ExamSchedule> exam = FXCollections.observableArrayList();
        
        exam.add(new ExamSchedule("Exam 01", LocalDate.of(2022, Month.AUGUST, 25), "12:00 PM","H2008"));
        exam.add(new ExamSchedule("Exam 02", LocalDate.of(2022, Month.AUGUST, 30), "2:00 PM","H2010"));
        return exam;
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
