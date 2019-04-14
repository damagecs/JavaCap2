package com.company;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("This program calculates the diagonal sum in a 4x4 Matrix");

        int matrixRow = 4;
        int matrixCol = 4;
        int i = 0, j = 0, sum = 0, sum2 = 0;
        //defining 2D array to hold matrix data
        int[][] matrix = new int[matrixRow][matrixCol];
        // Enter Matrix Data
        enterMatrixData(scan, matrix, matrixRow, matrixCol);

        // Print Matrix Data
        printMatrix(matrix, matrixRow, matrixCol);


        for (i = 0; i < matrixRow; i++) {
            for (j = 0; j < matrixCol; j++) {
                if (i == j) { //this condition checks for diagonal
                    sum += matrix[i][j];

                }
                if (i + j == matrixRow - 1) { //this condition check for the other diagonal
                    sum2 += matrix[i][j];
                }
                {

                }
            }
        }

        int totalsum = sum + sum2;
        System.out.println("The principal diagonal sum is : " + sum);
        System.out.println("Your secondary diagonal sum is :" + sum2);
        System.out.println(("The sum of both diagonals is: " + totalsum));
    }

    public static void enterMatrixData(Scanner scan, int[][] matrix, int matrixRow, int matrixCol) {
        System.out.println("Enter Matrix Data:");

        for (int i = 0; i < matrixRow; i++) {
            for (int j = 0; j < matrixCol; j++) {
                matrix[i][j] = scan.nextInt();
            }
        }

    }

    public static void printMatrix(int[][] matrix, int matrixRow, int matrixCol) {
        System.out.println("Your Matrix is : ");

        for (int i = 0; i < matrixRow; i++) {
            for (int j = 0; j < matrixCol; j++) {
                System.out.print(matrix[i][j] + "\t");
            }

            System.out.println();

        }
    }
}
