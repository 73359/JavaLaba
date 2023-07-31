package com.qa;

public class TestBoards {
    public static void main(String[] args) {
        Skateboard sb1 = new Skateboard(18, "blue", 4, "high");
        sb1.useBoard();
        sb1.useBoard();
        sb1.useBoard();
        sb1.useBoard();
        sb1.useBoard();
        sb1.useBoard();

        sb1.exchangeWheels();

        sb1.useBoard();

        Surfboard surfboard = new Surfboard(7.6, "white", "black");
        surfboard.useBoard();
        surfboard.waxSurfboard();
        surfboard.useBoard();
        surfboard.useBoard();
        surfboard.useBoard();
    }
}
