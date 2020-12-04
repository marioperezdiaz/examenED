/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cambiotemperatura_marioperez;

import java.util.Scanner;

/**
 *
 * @author DAM123
 */
public class CambioTemperatura_marioPerez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado=new Scanner (System.in);
        System.out.println("Introduzca una temperatura en grados centigrados: ");
        double grados=teclado.nextDouble();
        
        double kelvin=grados+273;
        
        
    }
    
}
