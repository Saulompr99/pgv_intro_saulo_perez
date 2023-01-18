/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication5;

/**
 *
 * @author Saulo
 */
public class JavaApplication5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(invertir(args[0]));
    }
    
    public static String invertir(String string) {
        String aux = "";
        for (int i = string.length() - 1; i >= 0; i--) {
            aux += (string.charAt(i));
        }
        return aux;
    }
}
