/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema6;

/*HAZ UN PROGRAMA QUE IMPRIMA UNA "K" CON BUCLES ANIDADOS   :P *
 *
 * @author david
 */


public class Letra_K {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int height = 8;
        
        
        for (int i = 0; i < height ; i++) {
            for (int j = 0; j < height ; j++) {
                if (j == 0 || (j == height - i - (height/2)) || (i == height + j -(height/2) - 1) ) {
                    
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(""); //salto de linea
        }

    }
}
