
package model;

import java.util.ArrayList;

public class Item {
    private int idItem;
    private String denominacion;
    private double costoAcumulado;
    private double costoBase;

    public Item(int idItem, String denominacion, double costoAcumulado, double costoBase) {
        this.idItem = idItem;
        this.denominacion = denominacion;
        this.costoAcumulado = costoAcumulado;
        this.costoBase = costoBase;
    }

    public int getIdItem() {
        return idItem;
    }

    public void setIdItem(int idItem) {
        this.idItem = idItem;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public double getCostoAcumulado() {
        return costoAcumulado;
    }

    public void setCostoAcumulado(double costoAcumulado) {
        this.costoAcumulado = costoAcumulado;
    }

    public double getCostoBase() {
        return costoBase;
    }

    public void setCostoBase(double costoBase) {
        this.costoBase = costoBase;
    }

    

    
    
}
