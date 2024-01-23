package com.mycompany.arrayindexoutofboundsexceptionmifta;

/**
 *
 * @author USER
 */
public class ArrayIndexOutOfBoundsExceptionMifta {
    public static void main(String[] args) {
        try {
            int[] numbers = {4,5,6};

            // Mencoba mengakses indeks array yang tidak valid
            int value = numbers[5];  // Akan menghasilkan ArrayIndexOutOfBoundsException

            System.out.println("Value: " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

