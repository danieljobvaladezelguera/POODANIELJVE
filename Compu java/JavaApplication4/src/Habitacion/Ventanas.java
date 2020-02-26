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
public class Ventanas {
    private float numVentanas;
    private float areaVentanas;
    private String venAbiertas;

    public Ventanas() {
    }

    public Ventanas(float numVentanas, float areaVentanas) {
        this.numVentanas = numVentanas;
        this.areaVentanas = areaVentanas;
    }

    public float getAreaVentanas() {
        return areaVentanas;
    }

    public void setAreaVentanas(float areaVentanas) {
        this.areaVentanas = areaVentanas;
    }

    public float getNumVentanas() {
        return numVentanas;
    }

    public void setNumVentanas(float numVentanas) {
        this.numVentanas = numVentanas;
    }
    
}
