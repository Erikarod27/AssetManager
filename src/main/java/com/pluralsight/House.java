package com.pluralsight;

public class House extends Asset{
    private String address;
    private int condition;
    private int squareFoot;
    private int lotSize;

    public House(String description, String dateAcquired, double originalCost, String address, int condition, int squareFoot, int lotSize) {
       super(description, dateAcquired, originalCost);
       this.address = address;
       this.condition = condition;
       this.squareFoot = squareFoot;
       this.lotSize = lotSize;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public int getCondition() {
        return condition;
    }
    public void setCondition(int condition) {
        this.condition = condition;
    }
    public int getSquareFoot() {
        return squareFoot;
    }
    public void setSquareFoot(int squareFoot) {
        this.squareFoot = squareFoot;
    }
    public int getLotSize() {
        return lotSize;
    }
    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }

    @Override
    public double getValue(){
        switch (condition){
            case 1:
                return (180.0*squareFoot) + (lotSize*0.25);
            case 2:
                return (130.0*squareFoot) + (lotSize*0.25);
            case 3:
                return (90.0*squareFoot) + (lotSize*0.25);
            case 4:
                return (80.0*squareFoot) + (lotSize*0.25);
        }
        return 0;
    }

    @Override
    public String toString() {
        return "House" +
                "\nDescription: " + getDescription() +
                "\nDate acquired: " + getDateAcquired() +
                "\nOriginal cost: $" + getOriginalCost() +
                "\nAddress: " + getAddress() +
                "\nCondition: " + getCondition() +
                "\nSquare foot: " + getSquareFoot() +
                "\nLot Size: " + getLotSize() +
                "\nCurrent Value: $" + getValue() + "\n";
    }
}
