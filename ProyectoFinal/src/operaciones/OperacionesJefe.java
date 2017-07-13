package operaciones;

import java.util.Iterator;
import java.util.List;
import modeloPersona.Jefe;

public class OperacionesJefe extends Operaciones<Jefe>{
	private Jefe ejemplar;
	
	public Jefe buscarPorNumEco(List<Jefe> lista,String numEco){
		Jefe elemento = null;
		Iterator<Jefe> iterador = lista.iterator();
		
		while (iterador.hasNext()){
			ejemplar = iterador.next();
			if(ejemplar.getNumEco().equalsIgnoreCase(numEco)){
				System.out.println("Jefe " + ejemplar.getNombre() + "con Numero Economico " + ejemplar.getNumEco() + "encontrado.");
				elemento = ejemplar;
			}
		}
		return elemento;
	}
	
	public void eliminaPorNumeroEconomico(List<Jefe> lista,String numEco){
		Iterator<Jefe> iterador = lista.iterator();
		boolean estado = false;
		
		while (iterador.hasNext() || estado==true){
			ejemplar = iterador.next();
			
			if(ejemplar.getNumEco().equalsIgnoreCase(numEco)){
				lista.remove(ejemplar);
				System.out.println("El jefe con numero economico " + ejemplar.getNumEco() + " ha sido eliminado");
				estado = true;
			}
		}
	}
	
	public void imprimeLista(List<Jefe> lista){
		Iterator<Jefe> iterador = lista.iterator();

		while(iterador.hasNext()){
			ejemplar = iterador.next();
			System.out.println( "Numero economico: " + ejemplar.getNumEco() +
								"\nGrado academico: " + ejemplar.getGradAcademico() +
								"\nCargo: " + ejemplar.getCargo() +
								"\n*******************************************");
		}
	}
}
