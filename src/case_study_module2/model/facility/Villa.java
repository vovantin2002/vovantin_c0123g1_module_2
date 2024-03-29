package case_study_module2.model.facility;

public class Villa extends Facility {
    private String roomStandard;
    private String poolArea;
    private String numOfLevel;

    public Villa(String roomStandard, String poolArea, String numOfLevel) {
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.numOfLevel = numOfLevel;
    }


    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "roomStandard='" + roomStandard + '\'' +
                ", poolArea='" + poolArea + '\'' +
                ", numOfLevel='" + numOfLevel + '\'' +
                ", nameService='" + nameService + '\'' +
                ", areaAll='" + areaAll + '\'' +
                ", price='" + price + '\'' +
                ", numberHumanMax='" + numberHumanMax + '\'' +
                ", rentalType='" + rentalType + '\'' +
                '}';
    }

    public String getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(String poolArea) {
        this.poolArea = poolArea;
    }

    public String getNumOfLevel() {
        return numOfLevel;
    }

    public void setNumOfLevel(String numOfLevel) {
        this.numOfLevel = numOfLevel;
    }

    public Villa(String idService, String nameService, String areaAll, String price, String numberHumanMax, String rentalType, String roomStandard, String poolArea, String numOfLevel) {
        super(idService, nameService, areaAll, price, numberHumanMax, rentalType);
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.numOfLevel = numOfLevel;
    }

    public String getAll() {
        return idService + "," + nameService + "," + areaAll + "," + price + "," + numberHumanMax + "," + rentalType + "," + roomStandard + "," + poolArea + "," + numOfLevel;
    }
}
