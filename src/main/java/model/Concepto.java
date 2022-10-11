
package model;

public class Concepto {
    private int idConcepto;
    private String denominacion;
    private int orden;
    private double porcentaje;

    public Concepto(int idConcepto, String denominacion, int orden, double porcentaje) {
        this.idConcepto = idConcepto;
        this.denominacion = denominacion;
        this.orden = orden;
        this.porcentaje = porcentaje;
    }

    public int getIdConcepto() {
        return idConcepto;
    }

    public void setIdConcepto(int idConcepto) {
        this.idConcepto = idConcepto;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public int getOrden() {
        return orden;
    }

    public void setOrden(int orden) {
        this.orden = orden;
    }

    public double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }
    
    
}
