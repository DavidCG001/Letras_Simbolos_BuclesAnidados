/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema6;

/**
 *
 * @author david
 */
public class BetisEscudo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String rojo = "\033[31m";
        String verde = "\033[32m";
        String naranja = "\033[33m";
        String azul = "\033[34m";
        String blanco = "\033[37m";

        int height = 20;
        int width = 11;  //con esta variables hago que la figura sea cuadrada

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                if (i == 0 && j == 7 || i == 0 && j == 9 || i == 0 && j == 11 || i == 1 || j == i - 1 || (j == height - i - 1 && i > 1) || (j == 3 && i < 4 && i > 1) || (j == 6 && i > 1 && i < 7) || (j == 9 && i > 1) || (j == 12 && i > 1 && i < 7) || (j == 15 && i > 1 && i < 4)) {

                    System.out.print(verde+"*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        
        
        
    }

}
