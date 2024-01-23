/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arithmeticexceptionmifta;

/**
 *
 * @author USER
 */
public class ArithmeticExceptionMifta {
    public static void main(String[] args) {
        try {
            int result = divide(10, 0); // Akan menghasilkan ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static int divide(int num1, int num2) {
        return num1 / num2; // Operasi pembagian yang dapat menyebabkan ArithmeticException
    }
}

