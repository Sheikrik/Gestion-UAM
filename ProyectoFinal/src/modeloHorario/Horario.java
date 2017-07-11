package modeloHorario;

import modeloPersona.Profesor;

public class Horario {
    private String horaInicio;
    private String horaFin;
    private String dias;
    private Materia mat;
    private Salon aula;
    private Profesor prof;

    public Horario(String horaInicio, String horaFin, String dias, Materia mat, Salon aula, Profesor prof) {
		super();
		this.horaInicio = horaInicio;
		this.horaFin = horaFin;
		this.dias = dias;
		this.mat = mat;
		this.aula = aula;
		this.prof = prof;
	}

	public Profesor getProf() {
		return prof;
	}

	public void setProf(Profesor prof) {
		this.prof = prof;
	}

	public String getHoraInicio() {
        return horaInicio;
    }
    
    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }
    
    public String getHoraFin() {
        return horaFin;
    }
    
    public void setHoraFin(String horaFin) {
        this.horaFin = horaFin;
    }
    
    public String getDias() {
        return dias;
    }
    
    public void setDias(String dias) {
        this.dias = dias;
    }
    
    public Materia getMat() {
        return mat;
    }
    
    public void setMat(Materia mat) {
        this.mat = mat;
    }
    
    public Salon getAula() {
        return aula;
    }
    
    public void setAula(Salon aula) {
        this.aula = aula;
    }
}

