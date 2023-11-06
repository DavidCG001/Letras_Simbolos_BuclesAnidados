/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema6;

/**
 *
 * @author david
 */
public class EstrellaDeDavid {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int size = 11;
        
        for (int i = 0; i < size; i++) {//al ser una t la primera linea siempre se escribe ya que es un valor constante
            for (int j = 0; j < size; j++) {
                if(j == i - (size/2) || j == (size - i - (size/2)-1)|| (j == size - i + (size/2)-1)|| (i == j - (size/2))){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
                }
            System.out.println("");
            }
    }
    
}
