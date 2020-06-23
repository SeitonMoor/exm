package com.company.games.seaBattle;

public class GameMap {
    private static char[][] map = new char[10][10];
    public static char mapBody = '≅';

    public static void drawMap() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                map[i][j] = mapBody;
                System.out.print(map[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
