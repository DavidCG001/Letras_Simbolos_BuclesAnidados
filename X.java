/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema6;

/*DIBUJA UNA "X"*
 *
 * @author david
 */
public class X {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int altura = 8;
        int ancho = altura;

        
        if(altura%2 == 0){
            altura ++;
            ancho ++;
        
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < ancho; j++) {
                if (i == j || j == (ancho - i - 1)) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
            
        }System.out.println("Se le ha añadido una altura y anchura mas para que la equis sea cuadrada");
        }else{
         for (int i = 0; i < altura; i++) {
            for (int j = 0; j < ancho; j++) {
                if (i == j || j == (ancho - i - 1)) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }   
        }
    }
}
