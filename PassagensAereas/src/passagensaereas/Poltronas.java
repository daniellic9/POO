package passagensaereas;

import java.io.Serializable;

public class Poltronas implements Serializable{
    private boolean ocupado=false;
public Poltronas(){
    
}
    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }
    
    
    
}
