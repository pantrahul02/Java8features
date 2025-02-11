package org.example;

public class TestGrid {
    public static void main(String[] args) {
        // Test case 1
        int[] array1 = {1, 123, 2, 3, 4, 12345, 3456, 4, 5, 1};
        int columns1 = 4;
        System.out.println("Formatted Output (Test Case 1):");
        printArrayInGrid(array1, columns1);

        // Test case 2
        int[] array2 = {5, 9, 3, 6, 121, 5};
        int columns2 = 3;
        System.out.println("\nFormatted Output (Test Case 2):");
        printArrayInGrid(array2, columns2);
    }

    public static void printArrayInGrid(int[] array, int columns) {
        // Determine the number of rows needed
        int rows = (int) Math.ceil((double) array.length / columns);

        // Create a 2D array to represent the grid
        String[][] grid = new String[rows][columns];

        // Fill the grid with values from the array
        int index = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (index < array.length) {
                    grid[i][j] = String.valueOf(array[index++]);
                } else {
                    grid[i][j] = ""; // Fill empty cells with a blank
                }
            }
        }

        // Print the grid in a table format
        for (String[] row : grid) {
            System.out.print("+");
            for (String cell : row) {
                System.out.print("-----+");
            }
            System.out.println();
            System.out.print("|");
            for (String cell : row) {
                System.out.printf("%5s|", cell);
            }
            System.out.println();
        }

        // Print the last border line
        System.out.print("+");
        for (int i = 0; i < columns; i++) {
            System.out.print("-----+");
        }
        System.out.println();
    }
}

