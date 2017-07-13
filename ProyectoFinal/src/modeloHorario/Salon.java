package modeloHorario;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Salon implements Serializable{
	private String grupo;
    
    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }
}

