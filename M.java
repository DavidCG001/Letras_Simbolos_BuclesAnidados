/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema6;

/**
 *
 * @author david
 */import java.util.Scanner;
public class M {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Escriba el tamaño para la letra");
        int size = s.nextInt();
        for (int i = 0; i < size; i++) {//al ser una t la primera linea siempre se escribe ya que es un valor constante
            for (int j = 0; j < size; j++) {
                if (j == 0 || (i-2 == j-2 && i<(size/2))|| (i+j == size - 1 && i< (size/2)+1)||j==size-1) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }

}
