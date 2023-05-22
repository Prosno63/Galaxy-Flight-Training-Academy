
public class AircraftsAndComponents {
    
    String aircraftName;
     int numberOfAircraft;
     int numberOfcomponents;
    String componentsName;
    String aircraftID;
    String aircraftType;
     String departure;
     String TimeAndDate;
     String Level;
     String speed;
     String destination;

    public AircraftsAndComponents(String aircraftID, String aircraftType, String departure, String TimeAndDate, String Level, String speed, String destination) {
        this.aircraftID = aircraftID;
        this.aircraftType = aircraftType;
        this.departure = departure;
        this.TimeAndDate = TimeAndDate;
        this.Level = Level;
        this.speed = speed;
        this.destination = destination;
    }

    public String getAircraftName() {
        return aircraftName;
    }

    public int getNumberOfAircraft() {
        return numberOfAircraft;
    }

    public int getNumberOfcomponents() {
        return numberOfcomponents;
    }

    public String getComponentsName() {
        return componentsName;
    }

    public String getAircraftID() {
        return aircraftID;
    }

    public String getAircraftType() {
        return aircraftType;
    }

    public String getDeparture() {
        return departure;
    }

    public String getTimeAndDate() {
        return TimeAndDate;
    }

    public String getLevel() {
        return Level;
    }

    public String getSpeed() {
        return speed;
    }

    public String getDestination() {
        return destination;
    }

    public void setAircraftName(String aircraftName) {
        this.aircraftName = aircraftName;
    }

    public void setNumberOfAircraft(int numberOfAircraft) {
        this.numberOfAircraft = numberOfAircraft;
    }

    public void setNumberOfcomponents(int numberOfcomponents) {
        this.numberOfcomponents = numberOfcomponents;
    }

    public void setComponentsName(String componentsName) {
        this.componentsName = componentsName;
    }

    public void setAircraftID(String aircraftID) {
        this.aircraftID = aircraftID;
    }

    public void setAircraftType(String aircraftType) {
        this.aircraftType = aircraftType;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public void setTimeAndDate(String TimeAndDate) {
        this.TimeAndDate = TimeAndDate;
    }

    public void setLevel(String Level) {
        this.Level = Level;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    @Override
    public String toString() {
        return "AircraftsAndComponents{" + "aircraftID=" + aircraftID + ", aircraftType=" + aircraftType + ", departure=" + departure + ", TimeAndDate=" + TimeAndDate + ", Level=" + Level + ", speed=" + speed + ", destination=" + destination + '}';
    }
     
     
     
    
}
