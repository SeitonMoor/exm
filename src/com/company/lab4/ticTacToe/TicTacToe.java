package com.company.lab4.ticTacToe;

import java.util.Scanner;

public class TicTacToe {
    private static int isStarted = 0;
    private static int turn = 0;
    private static char[][] gameField = new char[3][3];
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        initializeField();
        turnPriority();
    }

    private static void restartGame() {
        System.out.println("---------");
        System.out.println("Хочешь сыграть еще раз? Да(Y) / Нет(N)");
        String rGame = scanner.nextLine();

        if (rGame.equals("Y") || rGame.equals("y")) {
            isStarted = 0;
            turn = 0;
            initializeField();
            turnPriority();
        } else if (rGame.equals("N") || rGame.equals("n")) {
            int i = 0;
            System.exit(i);
        } else {
            System.out.println("---------");
            System.out.println("Запрос не ясен!");
            restartGame();
        }
    }

    private static void initializeField() {
        if (isStarted == 0) {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    gameField[i][j] = '*';
                    System.out.print(gameField[i][j] + "\t");
                }
                System.out.println();
            }
            isStarted++;
        }
    }

    private static void updateField() {
        if (isStarted == 1) {
            System.out.println("---------");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(gameField[i][j] + "\t");
                }
                System.out.println();
            }
            checkWin();
        }
    }

  /*  private  static boolean CheckWin2(char Symb){
        gameField[1][0] == Symb && gameField[1][1] == 'X' && gameField[1][2] == 'X' ||
                gameField[2][0] == 'X' && gameField[2][1] == 'X' && gameField[2][2] == 'X' ||
                gameField[0][0] == 'X' && gameField[1][0] == 'X' && gameField[2][0] == 'X' ||
                gameField[0][1] == 'X' && gameField[1][1] == 'X' && gameField[2][1] == 'X' ||
                gameField[0][2] == 'X' && gameField[1][2] == 'X' && gameField[2][2] == 'X' ||
                gameField[0][0] == 'X' && gameField[1][1] == 'X' && gameField[2][2] == 'X' ||
                gameField[2][0] == 'X' && gameField[1][1] == 'X' && gameField[0][2] == 'X');
    }*/

    private static void checkWin() {
        if (gameField[0][0] == 'X' && gameField[0][1] == 'X' && gameField[0][2] == 'X' ||
                gameField[1][0] == 'X' && gameField[1][1] == 'X' && gameField[1][2] == 'X' ||
                gameField[2][0] == 'X' && gameField[2][1] == 'X' && gameField[2][2] == 'X' ||
                gameField[0][0] == 'X' && gameField[1][0] == 'X' && gameField[2][0] == 'X' ||
                gameField[0][1] == 'X' && gameField[1][1] == 'X' && gameField[2][1] == 'X' ||
                gameField[0][2] == 'X' && gameField[1][2] == 'X' && gameField[2][2] == 'X' ||
                gameField[0][0] == 'X' && gameField[1][1] == 'X' && gameField[2][2] == 'X' ||
                gameField[2][0] == 'X' && gameField[1][1] == 'X' && gameField[0][2] == 'X') {
            System.out.println("---------");
            System.out.println("Ты одержал победу! Поздавляем!");
            restartGame();
        } else if (gameField[0][0] == 'O' && gameField[0][1] == 'O' && gameField[0][2] == 'O' ||
                gameField[1][0] == 'O' && gameField[1][1] == 'O' && gameField[1][2] == 'O' ||
                gameField[2][0] == 'O' && gameField[2][1] == 'O' && gameField[2][2] == 'O' ||
                gameField[0][0] == 'O' && gameField[1][0] == 'O' && gameField[2][0] == 'O' ||
                gameField[0][1] == 'O' && gameField[1][1] == 'O' && gameField[2][1] == 'O' ||
                gameField[0][2] == 'O' && gameField[1][2] == 'O' && gameField[2][2] == 'O' ||
                gameField[0][0] == 'O' && gameField[1][1] == 'O' && gameField[2][2] == 'O' ||
                gameField[2][0] == 'O' && gameField[1][1] == 'O' && gameField[0][2] == 'O') {
            System.out.println("---------");
            System.out.println("О нет, ты проиграл.. Повезет в следующий раз!");
            restartGame();
        } else {
            int draw = 0;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (gameField[i][j] != '*') {
                        draw++;
                    }
                }
            }
            if (draw == 9) {
                System.out.println("Ничья!");
                restartGame();
            }
        }
    }

    private static void turnPlayer() {
        System.out.println("---------");
        System.out.println("Выбери координаты, куда хочешь поставить свой X:");
        System.out.print("По вертикали: ");
        int x = scanner.nextInt();
        System.out.print("По горизонтали: ");
        int y = scanner.nextInt();

        if (x < 0 || x > 2 || y < 0 || y > 2) {
            System.out.println("---------");
            System.out.println("Неккоректное значение!");
            turnPlayer();
        }

        if (gameField[x][y] == '*') {
            gameField[x][y] = 'X';
            updateField();
            turnPriority();
        } else {
            System.out.println("Эта клетка уже занята!");
            turnPlayer();
        }
    }

    private static void turnAI() {
        int randomX = (int) (Math.random() * 3);
        int randomY = (int) (Math.random() * 3);

        if (gameField[randomX][randomY] == '*') {
            gameField[randomX][randomY] = 'O';
            System.out.println("---------");
            System.out.println("Ход компьютера:");
            updateField();
            turnPriority();
        } else {
            turnAI();
        }
    }

    private static void turnPriority() {
        if (turn == 0) {
            turn++;
            turnPlayer();
        } else {
            turn--;
            turnAI();
        }
    }
}
