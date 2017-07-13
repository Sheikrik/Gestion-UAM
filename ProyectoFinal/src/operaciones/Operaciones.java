package operaciones;

import java.util.Iterator;
import java.util.List;
import modeloPersona.Persona;

public abstract class Operaciones<E> {
	private E ejemplar;
	private Persona ejemCast;
	
	public void registrar(List<E> lista,E elemento){
		lista.add(elemento);
		System.out.println("Elemento registrado");
	}
	
	public void eliminarPorNombre(List<E> lista,String comparador){
		Iterator<E> iterador = lista.iterator();
		boolean estado = false;
		
		while (iterador.hasNext() || estado==true){
			ejemplar = iterador.next();
			ejemCast = (Persona) ejemplar;
			
			if(ejemCast.getNombre().equalsIgnoreCase(comparador)){
				lista.remove(ejemCast);
				System.out.println("Se ha eliminado a " + ejemCast.getNombre());
				estado = true;
			}
		}
	}
	
	public Persona buscarPorNombre(List<E> lista,String parametro){
		Persona elemento = null;
		Iterator<E> iterador = lista.iterator();
		
		while (iterador.hasNext()){
			ejemplar = iterador.next();
			
			if(ejemCast.getNombre().equalsIgnoreCase(parametro)){
				System.out.println("Persona encontrada " + ejemCast.getNombre());
				elemento = ejemCast;
			}
		}
		return elemento;
	}
	
	public void imprimeLista(List<E> lista){
		Iterator<E> iterador = lista.iterator();
		System.out.println("Datos del alumno");
		
		while(iterador.hasNext()){
			ejemplar = iterador.next();
			System.out.println( "Nombre: " + ejemCast.getNombre() +
								"\nGenero: " + ejemCast.getGenero() +
								"\nEdad: " + ejemCast.getEdad());
		}
	}
}
