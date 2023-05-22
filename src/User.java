
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
public class User implements Serializable {
    
    String name;
    String id;
    String password;
    String gender;
    String type;

    @Override
    public String toString() {
        return "Type: " + type + " Name is: " + name + " ID: " + id + " Password: " + password + " Gender: " + gender;
    }

    public User(String name, String id, String password, String gender, String type) {
        this.name = name;
        this.id = id;
        this.password = password;
        this.gender = gender;
        this.type = type;
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    
}
