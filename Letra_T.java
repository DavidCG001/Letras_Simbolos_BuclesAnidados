/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema6;

/**
 *
 * @author david
 */
import java.util.Scanner;

public class Letra_T {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner s = new Scanner(System.in);
         
         
         System.out.println("Introduzca el tamaño de la T");
         
         double size = s.nextInt();
         
         for(double i = 0 ; i < size ; i++){
             for(double col = 0 ; col < size ; col++){
                 if( i == 0 || col == 2){
                 System.out.print("-");  //pinta}
                 }else if(col == 0 || col == 1){
                     System.out.print(" ");
             }
                 
             }
             System.out.println("");  //linea siguiente
         }
    }
    
}
