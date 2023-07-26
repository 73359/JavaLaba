package com.qa;

public class Skateboard extends Board {
    private Integer wheels;
    private String trucks;
    private Integer wheelCondition;
    public Skateboard(double length, String colour, Integer wheels, String trucks) {
        super(length, colour);
        this.wheels = wheels;
        this.trucks = trucks;
        this.wheelCondition = 5;
    }
    public Integer getWheels() {
        return wheels;
    }
    public void setWheels(Integer wheels) {
        this.wheels = wheels;
    }
    public String getTrucks() {
        return trucks;
    }
    public void setTrucks(String trucks) {
        this.trucks = trucks;
    }

    @Override
    public void useBoard() {
        if (wheelCondition > 0) {
            System.out.println("They see me rolling!");
            wheelCondition--;
        } else {
            System.out.println("Smash! Your wheels are broken!");
            System.out.println("Please exchange your wheels!");
        }
    }

    public void exchangeWheels() {
        System.out.println("Skateboard wheels exchanged!");

        wheelCondition = 5;
    }
}
