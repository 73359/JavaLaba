package com.qa;

public abstract class Board {
    private double length;
    private String colour;

    public Board(double length, String colour) {
        this.length = length;
        this.colour = colour;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void useBoard() {
        System.out.println("Only specific boards are able to be used!");
    }
}
