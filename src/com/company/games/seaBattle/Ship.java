package com.company.games.seaBattle;

public class Ship {
    private final int shipSize;
    private final char shipBody = '■';

    public Ship(int shipSize){
        this.shipSize = shipSize;
    }

    public int getShipSize() {
        return shipSize;
    }
}
