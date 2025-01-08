/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espoch.clase_adstractas;

import ec.edu.espoch.clase_adstractas.clases.Animal;
import ec.edu.espoch.clase_adstractas.clases.Gato;
import ec.edu.espoch.clase_adstractas.clases.Leon;
import ec.edu.espoch.clase_adstractas.clases.Lobo;
import ec.edu.espoch.clase_adstractas.clases.Perro;

/**
 *
 * @author SO-LAB1-PC28
 */
public class Clase_Adstractas {

    public static void main(String[] args) {
      
        
        Animal[] animales = new Animal[4];
        
        animales[0] = new Gato();
        animales[1] = new Perro();
        animales[2] = new Leon();
        animales[3] = new Lobo();
        
       for(int i = 0; i < animales.length; i++){
           System.out.println("El alimento es: "+animales[i].getAlimentos());
           System.out.println("El habitad es: "+animales[i].getHabitad());
           System.out.println("El sonido es: "+animales[i].getSonido());
           System.out.println("El nombre cientifico del animal: "+animales[i].getNombreCientifico());
           
       }
    }

}
