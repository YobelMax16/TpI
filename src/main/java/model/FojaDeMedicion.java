
package model;

import java.util.ArrayList;

public class FojaDeMedicion {
    private int idFoja;
    private ArrayList <DetalleFoja> detalleFoja;

    public FojaDeMedicion(int idFoja, ArrayList<DetalleFoja> detalleFoja) {
        this.idFoja = idFoja;
        this.detalleFoja = detalleFoja;
    }

    public int getIdFoja() {
        return idFoja;
    }

    public void setIdFoja(int idFoja) {
        this.idFoja = idFoja;
    }

    public ArrayList<DetalleFoja> getDetalleFoja() {
        return detalleFoja;
    }

    public void setDetalleFoja(ArrayList<DetalleFoja> detalleFoja) {
        this.detalleFoja = detalleFoja;
    }
    
    
    
}
