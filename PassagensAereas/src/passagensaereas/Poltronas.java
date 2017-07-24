package passagensaereas;

import java.io.Serializable;

public class Poltronas implements Serializable{
    private boolean ocupado;
    
    public Poltronas(){
        this.ocupado = false;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }
    
    
    
}
