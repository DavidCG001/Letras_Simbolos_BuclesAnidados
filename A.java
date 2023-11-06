/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema6;

/**
 *
 * @author david
 */
public class A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int height = 15;
        int width = 15;  //con esta variables hago que la figura sea cuadrada

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                if ((j == i && i > (height / 2)) || ((j == height - i - 1) && i > (height / 2) - 1) || (i == (height / 2) + 4) && j > 3 && j < 12) {       //columna inclinada derecha

                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }

}
