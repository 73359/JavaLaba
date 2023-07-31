package com.qa;

public class Surfboard extends Board {
    private String sleave;
    private boolean waxed;
    private Integer useCounter;

    public Surfboard(double length, String colour, String sleave) {
        super(length, colour);
        this.sleave = sleave;
        this.waxed = false;
        this.useCounter = 0;
    }

    @Override
    public void useBoard() {
        if (waxed) {
            System.out.println("They see me surfing!");
            useCounter--;
            if (useCounter < 1) {
                waxed = false;
            }
        } else {
            System.out.println("Splash! You slipped of!");
            System.out.println("You should wax your surfboard!");
        }
    }

    public void waxSurfboard() {
        System.out.println("Surfboard waxed!");
        waxed = true;
        useCounter = 2;
    }
}
