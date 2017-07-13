package operaciones;

import java.util.Iterator;
import java.util.List;
import modeloPersona.Ayudante;

public class OperacionesAyudante extends Operaciones<Ayudante>{
	private Ayudante ejemplar;
	
	public Ayudante buscarPoMatricula(List<Ayudante> lista,String matricula){
		Ayudante elemento = null;
		Iterator<Ayudante> iterador = lista.iterator();
		
		while (iterador.hasNext()){
			ejemplar = iterador.next();
			if(ejemplar.getMatricula().equalsIgnoreCase(matricula)){
				System.out.println("El ayudante " + ejemplar.getNombre() + "con Matricula " + ejemplar.getMatricula() + "encontrado.");
				elemento = ejemplar;
			}
		}
		return elemento;
	}
	
	public void eliminaPorMatricula(List<Ayudante> lista,String matricula){
		Iterator<Ayudante> iterador = lista.iterator();
		boolean estado = false;
		
		while (iterador.hasNext() || estado==true){
			ejemplar = iterador.next();
			
			if(ejemplar.getMatricula().equalsIgnoreCase(matricula)){
				lista.remove(ejemplar);
				System.out.println("El ayudante con matricula " + ejemplar.getMatricula() + " ha sido eliminado");
				estado = true;
			}
		}
	}
	
	public Ayudante buscarPorNumEco(List<Ayudante> lista,String numEco){
		Ayudante elemento = null;
		Iterator<Ayudante> iterador = lista.iterator();
		
		while (iterador.hasNext()){
			ejemplar = iterador.next();
			if(ejemplar.getNumEco().equalsIgnoreCase(numEco)){
				System.out.println("Ayudante " + ejemplar.getNombre() + "con numero economico " + ejemplar.getNumEco() + "encontrado.");
				elemento = ejemplar;
			}
		}
		return elemento;
	}
	
	public void eliminaPorNumeroEconomico(List<Ayudante> lista,String numEco){
		Iterator<Ayudante> iterador = lista.iterator();
		boolean estado = false;
		
		while (iterador.hasNext() || estado==true){
			ejemplar = iterador.next();
			
			if(ejemplar.getNumEco().equalsIgnoreCase(numEco)){
				lista.remove(ejemplar);
				System.out.println("El ayudante con numero economico " + ejemplar.getNumEco() + " ha sido eliminado");
				estado = true;
			}
		}
	}
	
	public void imprimeListaAyudante(List<Ayudante> lista){
		Iterator<Ayudante> iterador = lista.iterator();

		while(iterador.hasNext()){
			ejemplar = iterador.next();
			System.out.println( "Matricula: " + ejemplar.getMatricula() +
								"\nCarrera: " + ejemplar.getCarrera() +
								"Numero economico: " + ejemplar.getNumEco() +
								"\n*******************************************");
		}
	}

	@Override
	public void actualizacion(String parametro) {
		// TODO Auto-generated method stub
		
	}
}
