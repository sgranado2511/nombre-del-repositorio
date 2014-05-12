/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package contadornumeros;

import java.util.Scanner;

/**
 *
 * @author Sergio Granado
 */
public class ContadorNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String numero;
        int i=0,j=0;
        
         while(j!=1)
        {
        Scanner entrada = new Scanner (System.in);
        numero = entrada.nextLine();
        j=numero.length();
        
        if(numero.charAt(0)=='-')
                {
                    j--;
                }
        System.out.println(numero+"=="+j);
        }
        System.out.println("Hola hola");
        
        
        System.out.println("Hola hola1242");
        System.out.println("Hola hola12242");
    }
}