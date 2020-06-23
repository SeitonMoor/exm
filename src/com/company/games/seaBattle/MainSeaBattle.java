package com.company.games.seaBattle;

public class MainSeaBattle {

    public static void main(String[] args) {
        Ship ship1 = new Ship(1);
        Ship ship2 = new Ship(1);
        Ship ship3 = new Ship(2);
        Ship ship4 = new Ship(2);
        Ship ship5 = new Ship(3);
        Ship ship6 = new Ship(3);

        Ship shipArray[] = {ship1, ship2, ship3, ship4, ship5, ship6};
        GameMap.drawMap();

        for (int i = 0; i < shipArray.length; i++) {
            System.out.println(shipArray[i].getShipSize());
        }
    }
}