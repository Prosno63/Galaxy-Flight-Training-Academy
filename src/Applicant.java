
import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tasin
 */
public class Applicant extends User implements Serializable{
    boolean paidStatus;

    public boolean isPaid() {
        return paidStatus;
    }

    public void setPaidStatus(boolean paidStatus) {
        this.paidStatus = paidStatus;
    }


    public Applicant(String name, String id, String password, String gender, String type) {
        super(name, id, password, gender, type);
        paidStatus = false;
    }

    @Override
    public String toString() {
        return "Applicant{" + "paidStatus=" + paidStatus + '}';
    }

    

    

    
}
