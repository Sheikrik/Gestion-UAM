package operaciones;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import modeloPersona.Persona;

public abstract class Operaciones<E> {
	protected List<E> lista = new LinkedList<E>();
	
	public void registrar(E elemento){
		lista.add(elemento);
		System.out.println("Elemento registrado");
	}
	
	public void eliminarNombre(String nombre){
		Iterator<E> iterador = lista.iterator();
		
		while (iterador.hasNext()){
			E e = iterador.next();
			if(((Persona) e).getNombre().equalsIgnoreCase(nombre)){
				lista.remove(e);
				System.out.println("Se ha eliminado a " + ((Persona) e).getNombre());
				break;
			}
		}
	}
	
	public Persona busquedaNombre(String parametro){
		Persona elemento = null;
		Iterator<E> iterador = lista.iterator();
		
		while (iterador.hasNext())
		{
			E e = iterador.next();
			if(((Persona) e).getNombre().equalsIgnoreCase(parametro))
			{
				System.out.println("Persona encontrada " + ((Persona) e).getNombre());
				elemento = (Persona) e;
			}
		}
		return elemento;
	}
	
	public abstract void imprimeLista();	
	public abstract void actualizacion(String parametro);
}
