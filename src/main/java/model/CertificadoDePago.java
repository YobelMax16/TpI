
package model;

import java.util.ArrayList;


public class CertificadoDePago {
   private int idCertificado;
   private int fechaEmicion; //ver si usamos date
   private FojaDeMedicion foja;
   private ArrayList <Detalle> detalle;
   private ArrayList <Concepto> concepto;

    public CertificadoDePago(int idCertificado, int fechaEmicion, FojaDeMedicion foja, ArrayList<Detalle> detalle, ArrayList<Concepto> concepto) {
        this.idCertificado = idCertificado;
        this.fechaEmicion = fechaEmicion;
        this.foja = foja;
        this.detalle = detalle;
        this.concepto = concepto;
    }

    public int getIdCertificado() {
        return idCertificado;
    }

    public void setIdCertificado(int idCertificado) {
        this.idCertificado = idCertificado;
    }

    public int getFechaEmicion() {
        return fechaEmicion;
    }

    public void setFechaEmicion(int fechaEmicion) {
        this.fechaEmicion = fechaEmicion;
    }

    public FojaDeMedicion getFoja() {
        return foja;
    }

    public void setFoja(FojaDeMedicion foja) {
        this.foja = foja;
    }

    public ArrayList<Detalle> getDetalle() {
        return detalle;
    }

    public void setDetalle(Detalle detalle) {
        this.detalle.add(detalle);
    }

    public ArrayList<Concepto> getConcepto() {
        return concepto;
    }

    public void setConcepto(Concepto concepto) {
        this.concepto.add(concepto);
    }

   
    
   
}
