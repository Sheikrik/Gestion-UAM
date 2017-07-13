package operaciones;

import java.util.Iterator;
import java.util.List;
import modeloPersona.Asistente;

public class OperacionesAsistente extends Operaciones<Asistente>{
	private Asistente ejemplar;
	
	public Asistente buscarPorNumEco(List<Asistente> lista,String numEco){
		Asistente elemento = null;
		Iterator<Asistente> iterador = lista.iterator();
		
		while (iterador.hasNext()){
			ejemplar = iterador.next();
			if(ejemplar.getNumEco().equalsIgnoreCase(numEco)){
				System.out.println("Asistente " + ejemplar.getNombre() + "con Numero Economico " + ejemplar.getNumEco() + "encontrado.");
				elemento = ejemplar;
			}
		}
		return elemento;
	}
	
	public void eliminaPorNumeroEconomico(List<Asistente> lista,String numEco){
		Iterator<Asistente> iterador = lista.iterator();
		boolean estado = false;
		
		while (iterador.hasNext() || estado==true){
			ejemplar = iterador.next();
			
			if(ejemplar.getNumEco().equalsIgnoreCase(numEco)){
				lista.remove(ejemplar);
				System.out.println("El asistente con numero economico " + ejemplar.getNumEco() + " ha sido eliminado");
				estado = true;
			}
		}
	}
	
	public void imprimeLista(List<Asistente> lista){
		Iterator<Asistente> iterador = lista.iterator();

		while(iterador.hasNext()){
			ejemplar = iterador.next();
			System.out.println( "Numero economico: " + ejemplar.getNumEco() +
								"\nDe confianza?: " + ejemplar.isConfianza() +
								"\n*******************************************");
		}
	}
}