/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Habitacion;

/**
 *
 * @author Casa
 */
public class Habitacion {
    private float numHabitacion;
    private String tipoHabitacion;

    public Habitacion() {
    }

    public Habitacion(float numHabitacion, String tipoHabitacion) {
        this.numHabitacion = numHabitacion;
        this.tipoHabitacion = tipoHabitacion;
    }

    public String getTipoHabitacion() {
        return tipoHabitacion;
    }

    public void setTipoHabitacion(String tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }

    public float getNumHabitacion() {
        return numHabitacion;
    }

    public void setNumHabitacion(float numHabitacion) {
        this.numHabitacion = numHabitacion;
    }
    
}
