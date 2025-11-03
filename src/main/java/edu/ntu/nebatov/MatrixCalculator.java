package edu.ntu.nebatov;

import java.util.Random;
import java.util.Scanner;

public class MatrixCalculator {

    private static final int MAX_MATRIX_SIZE = 20;
    private static final int RANDOM_MIN_VALUE = -50;
    private static final int RANDOM_MAX_VALUE = 50;

    public static void main(String[] args) {
        MatrixCalculator app = new MatrixCalculator();
        app.run();
    }

    private void run() {
        try (Scanner scanner = new Scanner(System.in)) {
            int rows = requestMatrixSize(scanner, "рядків");
            int cols = requestMatrixSize(scanner, "стовпців");

            int[][] matrix = createMatrix(scanner, rows, cols);
            displayMatrix(matrix);

            displayStatistics(matrix);
        }
    }

    private int requestMatrixSize(Scanner scanner, String dimensionName) {
        System.out.printf("Уведіть кількість %s (1–%d): ", dimensionName, MAX_MATRIX_SIZE);
        int size = readValidInt(scanner, 1, MAX_MATRIX_SIZE);
        return size;
    }

    private int readValidInt(Scanner scanner, int min, int max) {
        int value;
        while (true) {
            if (scanner.hasNextInt()) {
                value = scanner.nextInt();
                if (value >= min && value <= max) {
                    return value;
                }
            } else {
                scanner.next();
            }
            System.out.printf("Некоректне значення. Уведіть число від %d до %d: ", min, max);
        }
    }

    private int[][] createMatrix(Scanner scanner, int rows, int cols) {
        System.out.print("Створити матрицю вручну (1) чи рандомно (2)? ");
        int choice = readValidInt(scanner, 1, 2);
        return choice == 1
                ? readMatrixFromUser(scanner, rows, cols)
                : generateRandomMatrix(rows, cols);
    }

    private int[][] readMatrixFromUser(Scanner scanner, int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        System.out.printf("Уведіть елементи матриці (%dx%d):%n", rows, cols);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("Елемент [%d][%d]: ", i, j);
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }

    private int[][] generateRandomMatrix(int rows, int cols) {
        Random random = new Random();
        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = getRandomValue(random);
            }
        }
        return matrix;
    }

    private int getRandomValue(Random random) {
        return RANDOM_MIN_VALUE + random.nextInt(RANDOM_MAX_VALUE - RANDOM_MIN_VALUE + 1);
    }

    private void displayMatrix(int[][] matrix) {
        System.out.println("\nМатриця:");
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.printf("%6d", value);
            }
            System.out.println();
        }
    }

    private void displayStatistics(int[][] matrix) {
        int min = findMin(matrix);
        int max = findMax(matrix);
        double arithmeticMean = calculateArithmeticMean(matrix);
        double geometricMean = calculateGeometricMean(matrix);

        System.out.println("\nРезультати:");
        System.out.printf("Мінімальний елемент: %d%n", min);
        System.out.printf("Максимальний елемент: %d%n", max);
        System.out.printf("Середнє арифметичне: %.2f%n", arithmeticMean);
        System.out.printf("Середнє геометричне: %.2f%n", geometricMean);
    }

    private int findMin(int[][] matrix) {
        int min = Integer.MAX_VALUE;
        for (int[] row : matrix) {
            for (int value : row) {
                if (value < min) {
                    min = value;
                }
            }
        }
        return min;
    }


    private int findMax(int[][] matrix) {
        int max = Integer.MIN_VALUE;
        for (int[] row : matrix) {
            for (int value : row) {
                if (value > max) {
                    max = value;
                }
            }
        }
        return max;
    }

    private double calculateArithmeticMean(int[][] matrix) {
        double sum = 0;
        int count = 0;

        for (int[] row : matrix) {
            for (int value : row) {
                sum += value;
                count++;
            }
        }

        return count == 0 ? 0 : sum / count;
    }

    private double calculateGeometricMean(int[][] matrix) {
        double logSum = 0;
        int count = 0;

        for (int[] row : matrix) {
            for (int value : row) {
                logSum += Math.log(Math.abs(value) + 1);
                count++;
            }
        }

        double meanLog = logSum / count;
        return Math.exp(meanLog) - 1;
    }
}
