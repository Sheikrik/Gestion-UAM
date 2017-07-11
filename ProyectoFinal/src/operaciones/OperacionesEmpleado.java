package operaciones;

import java.util.Iterator;
import modeloPersona.Empleado;


public class OperacionesEmpleado extends Operaciones<Empleado>{
	
	public Empleado buscarNumEco(String numEco){
		Empleado elemento = null;
		Iterator<Empleado> iterador = lista.iterator();
		
		while (iterador.hasNext()){
			Empleado e = iterador.next();
			if(e.getNombre().equalsIgnoreCase(numEco)){
				System.out.println("Empleado " + e.getNombre() + "con Numero Economico " + e.getNumEco() + "encontrado.");
				elemento = e;
			}
		}
		return elemento;
	}
	
	public void eliminaPorNumeroEconomico(String numEco){
		Iterator<Empleado> iterador = lista.iterator();
		
		while (iterador.hasNext()){
			Empleado e = iterador.next();
			
			if(e.getNumEco().equalsIgnoreCase(numEco)){
				System.out.println("Empleado encontrado "+ e.getNumEco());
				lista.remove(e);
				System.out.println("El empleado ha sido eliminado");
				break;
			}
		}
	}

	@Override
	public void imprimeLista() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizacion(String parametro) {
		// TODO Auto-generated method stub
		
	}
}
