
public class Report {
    String aircraftName,type;
    int wheelBase,runwayLength;
    int maintenanceEngineerId;
    String text;

    public Report(String aircraftName, String type, int wheelBase, int runwayLength, int maintenanceEngineerId,String text) {
        this.aircraftName = aircraftName;
        this.type = type;
        this.wheelBase = wheelBase;
        this.runwayLength = runwayLength;
        this.maintenanceEngineerId = maintenanceEngineerId;
        this.text=text;
    }

   

    public String getAircraftName() {
        return aircraftName;
    }

    public String getType() {
        return type;
    }

    public int getWheelBase() {
        return wheelBase;
    }

    public int getRunwayLength() {
        return runwayLength;
    }

    public int getMaintenanceEngineerId() {
        return maintenanceEngineerId;
    }

    public void setAircraftName(String aircraftName) {
        this.aircraftName = aircraftName;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setWheelBase(int wheelBase) {
        this.wheelBase = wheelBase;
    }

    public void setRunwayLength(int runwayLength) {
        this.runwayLength = runwayLength;
    }

    public void setMaintenanceEngineerId(int maintenanceEngineerId) {
        this.maintenanceEngineerId = maintenanceEngineerId;
    }

    @Override
    public String toString() {
        return "Report{" + "aircraftName=" + aircraftName + ", type=" + type + ", wheelBase=" + wheelBase + ", runwayLength=" + runwayLength + ", maintenanceEngineerId=" + maintenanceEngineerId + text+ '}';
    }
    
}