package butka.tarathep.lab4;

import java.util.Scanner;

/**
 * The program is display matrix in many form and many way.
 * 
 * @author Tarathep Butka
 * @version 1.0 10/1/2023
 */

public class DisplayMatrix {
    static int[][] matrix;// 2 dimensional array for storing a matrix.
    static int rowDim, colDim;// the number of rows and columns in the matrix.
    static Scanner myScanner = new Scanner(System.in);

    /**
     * The main method of the program.
     * </p>
     * running method are :
     * <ul>
     * </p>
     * <li>inputMatrix()
     * </ul>
     * <ul>
     * </p>
     * <li>showMatrix()
     * </ul>
     * <ul>
     * </p>
     * <li>showMatrixByRow()
     * </ul>
     * <ul>
     * </p>
     * <li>showMatrixByColumn()
     * </ul>
     * <ul>
     * </p>
     * <li>showMatrixByRowBackward()
     * </ul>
     * <ul>
     * </p>
     * <li>showMatrixByColumnBackward()
     * </ul>
     * <ul>
     * </p>
     * <li>showMatrixByDiagonalTopLeftBottomRight()
     * </ul>
     * <ul>
     * </p>
     * <li>showMatrixByDiagonalTopRightBottomLeft()
     * </ul>
     * <ul>
     * </p>
     * <li>showMatrixByRowZigzag()
     * </ul>
     * 
     * @param args Program arguments
     */

    public static void main(String[] args) {
        inputMatrix();// input matrix.
        showMatrix();// show the original matrix
        showMatrixByRow();// show the matrix by row
        showMatrixByColumn();// show the matrix by column
        showMatrixByRowBackward();// show the matrix by row BackWard
        showMatrixByColumnBackward();// show the matrix by column backward
        showMatrixByDiagonalTopLeftBottomRight();// show the diagonal elements of the matrix
        // from top left to bottom right
        showMatrixByDiagonalTopRightBottomLeft();// show the diagonal elements of the matrix
        // from top right to bottom left
        showMatrixByRowZigzag();// show the matrix by row zigzag
    }

    /**
     * This medthod is for input the size and the value of matrix.
     * 
     * @param rowDim is a number of rows of the matrix.
     * @param colDim is a number of columns of the matrix.
     * @param i      is a index of row in matrix.
     * @param j      is a index of column in matrix.
     * 
     */
    public static void inputMatrix() {
        System.out.print("Enter the size of the matrix (number of rows then number of collumns) : ");
        String rowcol = myScanner.nextLine();
        String[] size = rowcol.split(" ");
        if (size.length == 2) {
            rowDim = Integer.parseInt(size[0]);
            colDim = Integer.parseInt(size[1]);
        } else {
            System.out.println("Incorrect input. (Enter number of rows) (number of collumns)");
            System.exit(1);
        }
        int i;
        int j;
        matrix = new int[rowDim][colDim];
        for (i = 0; i < rowDim; i++) {
            for (j = 0; j < colDim; j++) {
                System.out.print("Enter element at row " + i + " column " + j + " : ");
                int element = myScanner.nextInt();
                matrix[i][j] = element;

            }
        }
    }

    /**
     * This medthod is a medthod that show you a matrix which you input.
     * <ul>
     * </p>
     * <li>
     * static int[][] matrix - matrix value in array
     * </ul>
     * <ul>
     * </p>
     * <li>
     * static int rowDim - length of rows
     * </ul>
     * <ul>
     * </p>
     * <li>
     * static int colDim - length of columns
     * </ul>
     */
    public static void showMatrix() {
        System.out.println("Show the original matrix :");
        for (int i = 0; i < rowDim; i++) {
            for (int j = 0; j < colDim; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }

    /**
     * This medthod is a medthod that show you a matrix which you input by row.
     * <ul>
     * </p>
     * <li>
     * static int[][] matrix - matrix value in array
     * </ul>
     * <ul>
     * </p>
     * <li>
     * static int rowDim - length of rows
     * </ul>
     * <ul>
     * </p>
     * <li>
     * static int colDim - length of columns
     * </ul>
     */
    public static void showMatrixByRow() {
        System.out.print("Show the matrix by row :");
        for (int i = 0; i < rowDim; i++) {
            for (int j = 0; j < colDim; j++) {
                System.out.print(matrix[i][j] + " ");
            }
        }
        System.out.println();
    }

    /**
     * This medthod is a medthod that show you a matrix which you input by column.
     * <ul>
     * </p>
     * <li>
     * static int[][] matrix - matrix value in array
     * </ul>
     * <ul>
     * </p>
     * <li>
     * static int rowDim - length of rows
     * </ul>
     * <ul>
     * </p>
     * <li>
     * static int colDim - length of columns
     * </ul>
     */
    public static void showMatrixByColumn() {
        System.out.print("Show the matrix by column :");
        for (int j = 0; j < colDim; j++) {
            for (int i = 0; i < rowDim; i++) {
                System.out.print(matrix[i][j] + " ");
            }
        }
        System.out.println();
    }

    /**
     * This medthod is a medthod that show you a matrix which you input by
     * rowbackward.
     * <ul>
     * </p>
     * <li>
     * static int[][] matrix - matrix value in array
     * </ul>
     * <ul>
     * </p>
     * <li>
     * static int rowDim - length of rows
     * </ul>
     * <ul>
     * </p>
     * <li>
     * static int colDim - length of columns
     * </ul>
     * 
     */
    public static void showMatrixByRowBackward() {
        System.out.print("Show the matrix by row backward :");
        for (int i = rowDim - 1; i > -1; i--) {
            for (int j = colDim - 1; j > -1; j--) {
                System.out.print(matrix[i][j] + " ");
            }
        }
        System.out.println();
    }

    /**
     * This medthod is a medthod that show you a matrix which you input by column
     * backward.
     * <ul>
     * </p>
     * <li>
     * static int[][] matrix - matrix value in array
     * </ul>
     * <ul>
     * </p>
     * <li>
     * static int rowDim - length of rows
     * </ul>
     * <ul>
     * </p>
     * <li>
     * static int colDim - length of columns
     * </ul>
     */
    public static void showMatrixByColumnBackward() {
        System.out.print("Show the matrix by column backward :");
        for (int j = colDim - 1; j > -1; j--) {
            for (int i = rowDim - 1; i > -1; i--) {
                System.out.print(matrix[i][j] + " ");
            }
        }
        System.out.println();

    }

    /**
     * This medthod is show the diagonal elements of the matrix from the top left to
     * the bottom right.
     * <ul>
     * </p>
     * <li>
     * static int[][] matrix - matrix value in array
     * </ul>
     * <ul>
     * </p>
     * <li>
     * static int rowDim - length of rows
     * </ul>
     * <ul>
     * </p>
     * <li>
     * static int colDim - length of columns
     * </ul>
     */
    public static void showMatrixByDiagonalTopLeftBottomRight() {
        System.out.print("Show the diagonal elements of the matrix from top-left to bottom-right :");
        for (int i = 0; i < rowDim; i++) {
            for (int j = 0; j < colDim; j++) {
                if (i == j) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
        }
        System.out.println();

    }

    /**
     * This medthod is show the diagonal elements of the matrix from the top righ to
     * the bottom left.
     * <ul>
     * </p>
     * <li>
     * static int[][] matrix - matrix value in array
     * </ul>
     * <ul>
     * </p>
     * <li>
     * static int rowDim - length of rows
     * </ul>
     * <ul>
     * </p>
     * <li>
     * static int colDim - length of columns
     * </ul>
     */
    public static void showMatrixByDiagonalTopRightBottomLeft() {
        System.out.print("Show the diagonal elements of the matrix from top-right to bottom-left :");
        int k = colDim - 1;
        for (int i = 0; i < rowDim; i++) {
            for (int j = 0; j < colDim; j++) {
                if (j == k && k > -1) {
                    k -= 1;
                    System.out.print(matrix[i][j] + " ");
                }
            }
        }
        System.out.println();
    }

    /**
     * show the matrix by row zigzag.
     * </p>
     * If the row is an equal number row
     * print matrix from left to right.
     * else print matrix from right to left.
     * <ul>
     * </p>
     * <li>
     * static int[][] matrix - matrix value in array
     * </ul>
     * <ul>
     * </p>
     * <li>
     * static int rowDim - length of rows
     * </ul>
     * <ul>
     * </p>
     * <li>
     * static int colDim - length of columns
     * </ul>
     * 
     */
    public static void showMatrixByRowZigzag() {
        System.out.print("Show the matrix by row zigzag :");
        for (int i = 0; i < rowDim; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < colDim; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
            } else {
                for (int j = colDim - 1; j > -1; j -= 1) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
        }
    }

}
