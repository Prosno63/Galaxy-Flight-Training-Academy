
import java.io.Serializable;
import static java.time.chrono.HijrahChronology.INSTANCE;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tasin
 */
public class CurrentApplicant  {

    public CurrentApplicant() {}
    
    static Applicant ca ;

    public static Applicant getCurrentApplicant() {
        return ca;
    }

    public static void setCurrentApplicant(Applicant x) {
        ca = x;
    }

}
