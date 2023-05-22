
import java.time.LocalDate;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tasin
 */
public class ExamSchedule {
    private String ExamName;
    private LocalDate ExamDate;
    private String ExamTime;
    private String ExamRoom;  

    public String getExamName() {
        return ExamName;
    }

    public LocalDate getExamDate() {
        return ExamDate;
    }

    public String getExamTime() {
        return ExamTime;
    }

    public String getExamRoom() {
        return ExamRoom;
    }

    public ExamSchedule(String ExamName, LocalDate ExamDate, String ExamTime, String ExamRoom) {
        this.ExamName = ExamName;
        this.ExamDate = ExamDate;
        this.ExamTime = ExamTime;
        this.ExamRoom = ExamRoom;
    }
}
