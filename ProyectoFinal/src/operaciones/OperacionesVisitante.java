package operaciones;

import java.util.Iterator;
import java.util.List;
import modeloPersona.Visitante;

public class OperacionesVisitante extends Operaciones<Visitante>{
	private Visitante ejemplar;
	
	public Visitante buscarPorID(List<Visitante> lista,String id){
		Visitante elemento = null;
		Iterator<Visitante> iterador = lista.iterator();
		
		while (iterador.hasNext()){
			ejemplar = iterador.next();
			
			if(ejemplar.getId().equalsIgnoreCase(id)){
				System.out.println("Visitante " + ejemplar.getNombre() + " con ID " + ejemplar.getId() + "encontrado.");
				elemento = ejemplar;
			}
		}
		return elemento;
	}
	
	public void eliminaPorID(List<Visitante> lista,String id){
		Iterator<Visitante> iterador = lista.iterator();
		boolean estado = false;
		
		while (iterador.hasNext() || estado==true){
			ejemplar = iterador.next();
			
			if(ejemplar.getId().equalsIgnoreCase(id)){
				lista.remove(ejemplar);
				System.out.println("El visitante con ID " + ejemplar.getId() + " ha sido eliminado");
				estado = true;
			}
		}
	}
	
	public void imprimeLista(List<Visitante> lista){
		Iterator<Visitante> iterador = lista.iterator();

		while(iterador.hasNext()){
			ejemplar = iterador.next();
			System.out.println( "ID: " + ejemplar.getId() +
								"\n*******************************************");
		}
	}
}