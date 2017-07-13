package operaciones;

import java.util.Iterator;
import java.util.List;
import modeloPersona.Coordinador;

public class OperacionesCoordinador extends Operaciones<Coordinador>{
	private Coordinador ejemplar;
	
	public Coordinador buscarPorNumEco(List<Coordinador> lista,String numEco){
		Coordinador elemento = null;
		Iterator<Coordinador> iterador = lista.iterator();
		
		while (iterador.hasNext()){
			ejemplar = iterador.next();
			if(ejemplar.getNumEco().equalsIgnoreCase(numEco)){
				System.out.println("Coordinador " + ejemplar.getNombre() + "con Numero Economico " + ejemplar.getNumEco() + "encontrado.");
				elemento = ejemplar;
			}
		}
		return elemento;
	}
	
	public void eliminaPorNumeroEconomico(List<Coordinador> lista,String numEco){
		Iterator<Coordinador> iterador = lista.iterator();
		boolean estado = false;
		
		while (iterador.hasNext() || estado==true){
			ejemplar = iterador.next();
			
			if(ejemplar.getNumEco().equalsIgnoreCase(numEco)){
				lista.remove(ejemplar);
				System.out.println("El coordinador con numero economico " + ejemplar.getNumEco() + " ha sido eliminado");
				estado = true;
			}
		}
	}
	
	public void imprimeLista(List<Coordinador> lista){
		Iterator<Coordinador> iterador = lista.iterator();

		while(iterador.hasNext()){
			ejemplar = iterador.next();
			System.out.println( "Numero economico: " + ejemplar.getNumEco() +
								"\nGrado academico: " + ejemplar.getGradAcademico() +
								"\nArea: " + ejemplar.getArea() +
								"\n*******************************************");
		}
	}
}
