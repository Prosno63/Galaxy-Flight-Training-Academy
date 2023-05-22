import java.io.Serializable;
import java.time.LocalDate;


public class FlightInstructor extends User implements Serializable {
    
    String address;
    LocalDate dateofjoining;
     

    public FlightInstructor(String name, String id, String password, String gender, String type) {
        super(name, id, password, gender, type);
    }
  
    
 
     public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
    
 
    public String getAddress() {
        return address;
    }

    public LocalDate getDateofjoining() {
        return dateofjoining;
    }

   
    public String getId() {
        return id;
    }



    public void setAddress(String address) {
        this.address = address;
    }

    public void setDateofjoining(LocalDate dateofjoining) {
        this.dateofjoining = dateofjoining;
    }


    @Override
    public String toString() {
        return "Type: " + type + " Name is: " + name + " ID: " + id + " Password: " + password + " Gender: " + gender;
    }
    
}