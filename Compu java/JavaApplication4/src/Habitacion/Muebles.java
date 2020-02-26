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
public class Muebles {
    private boolean hayMuebles;
    private String tiposMuebles;

    public Muebles() {
    }

    public Muebles(boolean hayMuebles, String tiposMuebles) {
        this.hayMuebles = hayMuebles;
        this.tiposMuebles = tiposMuebles;
    }

    public String getTiposMuebles() {
        return tiposMuebles;
    }

    public void setTiposMuebles(String tiposMuebles) {
        this.tiposMuebles = tiposMuebles;
    }

    public boolean isHayMuebles() {
        return hayMuebles;
    }

    public void setHayMuebles(boolean hayMuebles) {
        this.hayMuebles = hayMuebles;
    }
    
    
}
