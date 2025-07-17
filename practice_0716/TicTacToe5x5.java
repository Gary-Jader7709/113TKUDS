package practice_0716;

import java.util.Scanner;

public class TicTacToe5x5 {
    private static final int SIZE = 5;
    private static final char EMPTY = '.';
    private static final char PLAYER_X = 'X';
    private static final char PLAYER_O = 'O';

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] board = initializeBoard();
        boolean isXTurn = true;

        System.out.println("=== 5x5 井字遊戲 ===");
        printBoard(board);

        while (true) {
            char currentPlayer = isXTurn ? PLAYER_X : PLAYER_O;
            int row, col;

            while (true) {
                System.out.print("請玩家 " + currentPlayer + " 輸入 row col（0-4）：");
                row = scanner.nextInt();
                col = scanner.nextInt();

                if (row < 0 || row >= SIZE || col < 0 || col >= SIZE) {
                    System.out.println("⚠️ 超出範圍，請重新輸入！");
                } else if (board[row][col] != EMPTY) {
                    System.out.println("⚠️ 此位置已被佔用，請重新輸入！");
                } else {
                    break; // 合法輸入
                }
            }

            board[row][col] = currentPlayer;
            System.out.println("玩家 " + currentPlayer + " 在位置 (" + row + ", " + col + ") 放置棋子");
            printBoard(board);

            if (checkWin(board, currentPlayer)) {
                System.out.println("玩家 " + currentPlayer + " 獲勝！");
                break;
            }

            if (isBoardFull(board)) {
                System.out.println("平手！");
                break;
            }

            isXTurn = !isXTurn; // 換下一位玩家
        }

        scanner.close();
    }

    private static char[][] initializeBoard() {
        char[][] board = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++)
            for (int j = 0; j < SIZE; j++)
                board[i][j] = EMPTY;
        return board;
    }

    private static void printBoard(char[][] board) {
        System.out.print("  ");
        for (int i = 0; i < SIZE; i++)
            System.out.print(i + " ");
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < SIZE; j++)
                System.out.print(board[i][j] + " ");
            System.out.println();
        }
        System.out.println();
    }

    private static boolean isBoardFull(char[][] board) {
        for (int i = 0; i < SIZE; i++)
            for (int j = 0; j < SIZE; j++)
                if (board[i][j] == EMPTY)
                    return false;
        return true;
    }

    private static boolean checkWin(char[][] board, char player) {
        // 檢查每一列
        for (int i = 0; i < SIZE; i++) {
            boolean win = true;
            for (int j = 0; j < SIZE; j++)
                if (board[i][j] != player)
                    win = false;
            if (win)
                return true;
        }

        // 檢查每一行
        for (int j = 0; j < SIZE; j++) {
            boolean win = true;
            for (int i = 0; i < SIZE; i++)
                if (board[i][j] != player)
                    win = false;
            if (win)
                return true;
        }

        // 檢查主對角線
        boolean winDiag1 = true;
        for (int i = 0; i < SIZE; i++)
            if (board[i][i] != player)
                winDiag1 = false;
        if (winDiag1)
            return true;

        // 檢查反對角線
        boolean winDiag2 = true;
        for (int i = 0; i < SIZE; i++)
            if (board[i][SIZE - 1 - i] != player)
                winDiag2 = false;
        if (winDiag2)
            return true;

        return false;
    }
}
