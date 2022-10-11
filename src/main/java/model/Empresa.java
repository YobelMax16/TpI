
package model;

import java.util.ArrayList;


public class Empresa {
    private int idEmpresa;
    private String razonSocial;
    private ArrayList <Obra> obras;

    public Empresa(int idEmpresa, String razonSocial, ArrayList<Obra> obras) {
        this.idEmpresa = idEmpresa;
        this.razonSocial = razonSocial;
        this.obras = obras;
    }

    public int getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public ArrayList<Obra> getObras() {
        return obras;
    }

    public void setObras(Obra obras) {
        this.obras.add(obras);
    }

    
}
