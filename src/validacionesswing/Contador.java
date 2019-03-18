/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validacionesswing;

import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author estuardo
 */
public class Contador {

    int contador;

    public String[] contadorPalabras(String frase) {
   
      String[] palabras = frase.split("\\W");
      return palabras;
           
    }

    public String[] contadorLetras(String Palabra) {
        

        String[] Letras = new String[Palabra.length()];

        for (int x = 0; x < Palabra.length(); x++) {
          
                Letras[x] = String.valueOf(Palabra.charAt(x));
            }
            
                return Letras;
       
    }
    
    public String[] ordenarletras(String orden){
    String[] ordenar= new String[orden.length()];
    String[] ordenado=new String[orden.length()];
        for (int i = 0; i < ordenar.length; i++) {
            ordenar[i]=String.valueOf(orden.charAt(i));
        }
        Arrays.sort(ordenar);

        for (int i = 0; i < ordenar.length; i++) {
            ordenado[i]=ordenar[i];
            
        }
    return ordenado;
    }
    
    public String[] ordenarpalabras(String ordenpalabras){
         String[] ordenado=new String[ordenpalabras.length()];

        String[] ordenar2= ordenpalabras.split("\\W");
        
        Arrays.sort(ordenar2);
        
        for (int i = 0; i < ordenar2.length; i++) {
            ordenado[i]=ordenar2[i];
            
        }
    
    return ordenado;
    }

}
