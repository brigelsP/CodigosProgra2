/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validacionesswing;

/**
 *
 * @author estuardo
 */
public class Contador {

    int contador;

    public String[] contadorPalabras(String frase) {
   
      String[] palabras = frase.split("\\W");
      return palabras;
      
       /*   int finalCadena = frase.length() - 1;
       boolean palabra = false;
        
        for (int x = 0; x < frase.length(); x++) {
            if (Character.isLetter(frase.charAt(x)) && x != finalCadena) {
                palabra = true;
            } else if (!Character.isLetter(frase.charAt(x)) && palabra) {
                contador++;
            }else if(Character.isLetter(frase.charAt(x)) && x == finalCadena){
                contador++;
            }
        }*/
      
      
    }

    public void contadorLetras() {

    }

}
