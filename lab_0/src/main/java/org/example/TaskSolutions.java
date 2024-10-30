package org.example;

import java.util.ArrayList;
import java.util.List;

public class TaskSolutions {

    // func array
    public static int[] findOddNumbers(int[] array) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                result.add(array[i]);
            }
        }
        int[] oddNumbers = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            oddNumbers[i] = result.get(i);
        }
        return oddNumbers;
    }

    // func boolean
    public static boolean areBothOdd(int A, int B) {
        return A % 2 != 0 && B % 2 != 0;
    }

    // func switch_case
    public static String previousDate(int D, int M) {
        if (D == 1) {
            if (M == 3) {
                D = 28;
                M = 2;
            } else if (M == 5 || M == 7 || M == 10 || M == 12) {
                D = 30;
                M -= 1;
            } else if (M == 1) {
                D = 31;
                M = 12;
            } else {
                D = 31;
                M -= 1;
            }
        } else {
            D -= 1;
        }
        return D + "/" + M;
    }

    // func for_cycle
    public static int productOfRange(int A, int B) {
        int product = 1;
        for (int i = A; i <= B; i++) {
            product *= i;
        }
        return product;
    }

    // func iff
    public static int[] orderNumbers(int A, int B) {
        if (A > B) {
            return new int[]{A, B};
        } else {
            return new int[]{B, A};
        }
    }

    // func integer
    public static int reverseDigits(int number) {
        int tens = number / 10;
        int units = number % 10;
        return units * 10 + tens;
    }

    // func matrix
    public static int[] getColumn(int[][] matrix, int K) {
        int[] column = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            column[i] = matrix[i][K - 1];
        }
        return column;
    }

    // func while_cycle
    public static int largestSquareRoot(int N) {
        int K = 0;
        while (K * K <= N) {
            K++;
        }
        return K - 1;
    }
}
