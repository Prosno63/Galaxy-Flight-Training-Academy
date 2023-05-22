
public class AircraftMaintenanceEngineer {
    String Address;
    
    public String updateMaintenanceStatus(int x){
        
        if(x>=1000){
            
             return "1A";
        }
        else if(x<1000){
          return "No Check";
        }
        else{
            return "o";
        }
     
        
   
}
}