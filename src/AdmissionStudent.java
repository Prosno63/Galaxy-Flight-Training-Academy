
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
public class AdmissionStudent implements Serializable {
    final String id;
    String name;
    String phone;
    String location;
    String email;
    String gender;

    public AdmissionStudent(String id, String name, String phone, String location, String email, String gender) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.location = location;
        this.email = email;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "AdmissionStudent{" + "id=" + id + ", name=" + name + ", phone=" + phone + ", location=" + location + ", email=" + email + ", gender=" + gender + '}';
    }

    public String getId() {
        return id;
    }

    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
}
