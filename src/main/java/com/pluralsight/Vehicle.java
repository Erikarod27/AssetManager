package com.pluralsight;

import java.time.LocalDate;

public class Vehicle extends Asset {
    private String makeModel;
    private int year;
    private int odometer;

    public Vehicle(String description, String dateAcquired, double originalCost, String makeModel, int year, int odometer) {
        super(description, dateAcquired, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }
    public String getMakeModel() {
        return makeModel;
    }
    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getOdometer() {
        return odometer;
    }
    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    @Override
    public double getValue() {
        LocalDate currentDate = LocalDate.now();
        int currentYear = currentDate.getYear();
        int yearsOld = currentYear - year;
        switch (yearsOld) {
            case 0, 1, 2, 3:
                return zeroToThree();
            case 4, 5, 6:
               return fourToSix();
            case 7, 8, 9, 10:
                return sevenToTen();
            default:
                return overTen();
        }

    }

    public double zeroToThree() {
        LocalDate currentDate = LocalDate.now();
        int currentYear = currentDate.getYear();
        int age = currentYear - year;
        double newValue = getOriginalCost();
        int miles = getOdometer();
        double reductionValue = (0.03 * age) * newValue;
        newValue -= reductionValue;
        if((miles > 100000) && !(makeModel.contains("Honda") || makeModel.contains("Toyota"))){
            double mileReduction = 0.25 * newValue;
            newValue -= mileReduction;
            return newValue;
        }
        return newValue;
    }

    public double fourToSix() {
        LocalDate currentDate = LocalDate.now();
        int currentYear = currentDate.getYear();
        int age = currentYear - year;
        double newValue = getOriginalCost();
        int miles = getOdometer();
        double reductionValue = (0.06 * age) * newValue;
        newValue -= reductionValue;
        if((miles > 100000) && !(makeModel.contains("Honda") || makeModel.contains("Toyota"))){
            double mileReduction = 0.25 * newValue;
            newValue -= mileReduction;
            return newValue;
        }
        return newValue;
    }

    public double sevenToTen() {
        LocalDate currentDate = LocalDate.now();
        int currentYear = currentDate.getYear();
        int age = currentYear - year;
        double newValue = getOriginalCost();
        int miles = getOdometer();
        double reductionValue = (0.08 * age) * newValue;
        newValue -= reductionValue;
        if((miles > 100000) && !(makeModel.contains("Honda") || makeModel.contains("Toyota"))){
            double mileReduction = 0.25 * newValue;
            newValue -= mileReduction;
            return newValue;
        }
        return 0;
    }

    public double overTen() {
        double newValue = 1000.00;
        int miles = getOdometer();
        if((miles > 100000) && !(makeModel.contains("Honda") || makeModel.contains("Toyota"))){
            double mileReduction = 0.25 * newValue;
            newValue -= mileReduction;
            return newValue;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Vehicle" +
                "\nDescription: " + getDescription() +
                "\nDate acquired: " + getDateAcquired() +
                "\nOriginal cost: $" + getOriginalCost() +
                "\nMake/Model: " + getMakeModel() +
                "\nYear: " + getYear() +
                "\nMileage: " + getOdometer() +
                "\nCurrent Value: $" + getValue() + "\n";
    }
}
