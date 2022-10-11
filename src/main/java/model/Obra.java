
package model;
  
import java.util.ArrayList;

public class Obra {
    private int id;
    private String nombreObra;
    private double flete;
    private double gastos;
    private double utilidad;
    private FojaDeMedicion fojaDeMedicion;
    private Empresa empresa;
    private ArrayList <Item> items;
    private ArrayList <CertificadoDePago> certificado;
    private ArrayList <Tipografia> tipografia;

    public Obra(int id, String nombreObra, double flete, double gastos, double utilidad, FojaDeMedicion fojaDeMedicion, Empresa empresa, ArrayList<Item> items, ArrayList<CertificadoDePago> certificado, ArrayList<Tipografia> tipografia) {
        this.id = id;
        this.nombreObra = nombreObra;
        this.flete = flete;
        this.gastos = gastos;
        this.utilidad = utilidad;
        this.fojaDeMedicion = fojaDeMedicion;
        this.empresa = empresa;
        this.items = items;
        this.certificado = certificado;
        this.tipografia = tipografia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreObra() {
        return nombreObra;
    }

    public void setNombreObra(String nombreObra) {
        this.nombreObra = nombreObra;
    }

    public double getFlete() {
        return flete;
    }

    public void setFlete(double flete) {
        this.flete = flete;
    }

    public double getGastos() {
        return gastos;
    }

    public void setGastos(double gastos) {
        this.gastos = gastos;
    }

    public double getUtilidad() {
        return utilidad;
    }

    public void setUtilidad(double utilidad) {
        this.utilidad = utilidad;
    }

    public FojaDeMedicion getFojaDeMedicion() {
        return fojaDeMedicion;
    }

    public void setFojaDeMedicion(FojaDeMedicion fojaDeMedicion) {
        this.fojaDeMedicion = fojaDeMedicion;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(Item items) {
        this.items.add(items);
    }

    public ArrayList<CertificadoDePago> getCertificado() {
        return certificado;
    }

    public void setCertificado(CertificadoDePago certificado) {
        this.certificado.add(certificado);
    }

    public ArrayList<Tipografia> getTipografia() {
        return tipografia;
    }

    public void setTipografia(Tipografia tipografia) {
        this.tipografia.add(tipografia);
    }
    
    
}
