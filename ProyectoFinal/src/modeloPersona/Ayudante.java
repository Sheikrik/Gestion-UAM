package modeloPersona;

@SuppressWarnings("serial")
public class Ayudante extends Alumno implements Auxiliar{
	private String numEco;


	@Override
	public String getNumEco() {
		return numEco;
	}

	@Override
	public void setNumEco(String numEco) {
		this.numEco = numEco;
	}
}
