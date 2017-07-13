package modeloPersona;

import modeloHorario.Horario;

@SuppressWarnings("serial")
public class Alumno extends Persona 
{
	private String matricula;
	private String carrera;
	private Horario[] horario;

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	public Horario[] getHorario() {
		return horario;
	}

	public void setHorario(Horario[] horario) {
		this.horario = horario;
	}
}
