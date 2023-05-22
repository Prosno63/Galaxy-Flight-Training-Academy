/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tasin
 */
public class Result {
    String CourseName;
    String Grade;
    String gpa;

    public Result(String CourseName, String Grade, String gpa) {
        this.CourseName = CourseName;
        this.Grade = Grade;
        this.gpa = gpa;
    }

    public String getCourseName() {
        return CourseName;
    }

    public String getGrade() {
        return Grade;
    }

    public String getGpa() {
        return gpa;
    }
    
    
}
