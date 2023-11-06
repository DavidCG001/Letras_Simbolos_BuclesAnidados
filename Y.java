/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema6;

/**
 *
 * @author david
 */
public class Y {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int height = 16;
        int width = 16;  //con esta variables hago que la figura sea cuadrada

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                if ((j == width / 2 && i > height/2 )|| (j == height - i  && i < height/2 + 1) || (i == j && i > 0 && i < height/2 + 1)) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }

    }

}
