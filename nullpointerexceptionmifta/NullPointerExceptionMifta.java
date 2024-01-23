package com.mycompany.nullpointerexceptionmifta;

/**
 *
 * @author MIFTA
 */
public class NullPointerExceptionMifta {
    public static void main(String[] args) {
        try {
            String text = null;

            // Mencoba memanggil metode pada objek yang bernilai null
            int length = text.length();  // Akan menghasilkan NullPointerException
            System.out.println("Length: " + length);
        } catch (NullPointerException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

