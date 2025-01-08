/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.clase_adstractas.clases;

/**
 *
 * @author SO-LAB1-PC28
 */
public class Gato extends Felinos{
         @Override
     public String getSonido() {
        return "Maullido";
    }
     @Override
    public String getAlimentos() {
        return "Ratones";
    }
     @Override
    public String getHabitad() {
        return "Domestico";
    }
     @Override
    public String getNombreCientifico() {
        return "Felis silvestris catus";
    }
}
