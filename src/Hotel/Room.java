package Hotel;

import java.math.BigDecimal;

public class Room {

    private int countBed;
    private int numberOfRoom;
    private BigDecimal pricePerNight;
    private boolean includesBalcony; //True - yes, False - not
    private boolean viewSea; //True - yes, False - not


    public Room(int numberOfBeds, int numberOfRoom, BigDecimal pricePerNight, boolean includesBalcony, boolean viewSea) {
        this.countBed = countBed;
        this.numberOfRoom = numberOfRoom;
        this.pricePerNight = pricePerNight;
        this.includesBalcony = includesBalcony;
        this.viewSea = viewSea;
    }

    //default constructor
    public Room(){

    }

    //Getters and setters methods
    public void setNumberOfBeds(int numberOfBeds){
        this.countBed = numberOfBeds;
    }

    public int getNumberOfBeds(){
        return countBed;
    }


    public void setPricePerNight(BigDecimal pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    public BigDecimal getPricePerNight() {
        return pricePerNight;
    }

    public void setIncludesBalcony(boolean includesBalcony) {
        this.includesBalcony = includesBalcony;
    }

    public boolean getIncludesBalcony() {
        return includesBalcony;
    }


    public void setViewSea(boolean viewSea) {
        this.viewSea = viewSea;
    }

    public boolean getViewSea() {
        return viewSea;
    }


    public int getNumberOfRoom() {
        return numberOfRoom;
    }

    public void setNumberOfRoom(int numberOfRoom) {
        this.numberOfRoom = numberOfRoom;
    }



    @Override
    public String toString() {
        return "(" +
                "numberOfBeds = " + countBed +
                ", pricePerNight = " + pricePerNight +
                ", includesBalcony = " + includesBalcony +
                ", viewSea = " + viewSea +
                ')';
    }
}