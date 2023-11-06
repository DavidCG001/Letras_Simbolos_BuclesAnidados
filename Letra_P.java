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

public class Letra_P {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("introduce el tamaño");
        int size = s.nextInt();
        for(int i = 0 ; i < size ; i++){
             for(int col = 0 ; col < size ; col++){
                 if(i==0 || col==0||i==size/2 || ((col == size-1)&&(i<size/2))){
                     System.out.print("*"); //pinta
                 }else{
                     System.out.print(" ");
                 }
                 
               }
             System.out.println(""); //linea siguiente
             }
        
    }
    
}
