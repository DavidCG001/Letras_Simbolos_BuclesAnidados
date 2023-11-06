/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema6;

/**
 *
 * @author david
 */
public class Letra_N {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        

        for (int fila = 0; fila < 10; fila++) {
            for (int col = 0; col < 10; col++) {
                if (col == 0 || fila == col || col == 9) {
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
                
            }
            System.out.println(""); //salto de linea
        }
    }
    
}
