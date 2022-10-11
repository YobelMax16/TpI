
package model;

import java.util.ArrayList;


public class DetalleFoja {
    private int idDetalleFoja;
    private double avanceAcumulado;
    private double avance;
    private int fecha;  //vamos a ocupar date
    private ArrayList <Item> item; 

    public DetalleFoja(int idDetalleFoja, double avanceAcumulado, double avance, int fecha, ArrayList<Item> item) {
        this.idDetalleFoja = idDetalleFoja;
        this.avanceAcumulado = avanceAcumulado;
        this.avance = avance;
        this.fecha = fecha;
        this.item = item;
    }

    public int getIdDetalleFoja() {
        return idDetalleFoja;
    }

    public void setIdDetalleFoja(int idDetalleFoja) {
        this.idDetalleFoja = idDetalleFoja;
    }

    public double getAvanceAcumulado() {
        return avanceAcumulado;
    }

    public void setAvanceAcumulado(double avanceAcumulado) {
        this.avanceAcumulado = avanceAcumulado;
    }

    public double getAvance() {
        return avance;
    }

    public void setAvance(double avance) {
        this.avance = avance;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public ArrayList<Item> getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item.add(item);
    }

   
    
    
}
