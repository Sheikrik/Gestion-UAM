package modeloPersona;


public class Empleado extends Persona implements Auxiliar
{
	private String numEco;

	@Override
	public String getNumEco() {
		// TODO Auto-generated method stub
		return numEco;
	}

	@Override
	public void setNumEco(String numEco) {
		this.numEco = numEco;
	}
}
