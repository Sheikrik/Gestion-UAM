package operaciones;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;

public class Operaciones<E> {
	
	public void registrar(List<E> lista,E elemento){
		lista.add(elemento);
		System.out.println("Elemento registrado");
	}
	
	public void eliminar(List<E> lista,String nomClase,String nomMetodo,String comparador) throws ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		Iterator<E> iterador = lista.iterator();
		Method metodo = pasoMetodo(nomClase,nomMetodo);
		boolean estado = false;
		
		while (iterador.hasNext() || estado==true){
			E e = iterador.next();
			String parametro = (String) metodo.invoke(e,null);
			
			if(parametro.equalsIgnoreCase(comparador)){
				lista.remove(e);
				System.out.println("Se ha eliminado a " + parametro);
				estado = true;
			}
		}
	}
	
	public E busqueda(List<E> lista,String nomClase,String nomMetodo,String comparador) throws ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		Iterator<E> iterador = lista.iterator();
		Method metodo = pasoMetodo(nomClase,nomMetodo);
		E elemento = null;
		
		while (iterador.hasNext()){
			E e = iterador.next();
			String parametro = (String) metodo.invoke(e,null);
			
			if(parametro.equalsIgnoreCase(comparador)){
				System.out.println("Persona encontrada " +  parametro);
				elemento = e;
			}
		}
		return elemento;
	}
	
	private Method pasoMetodo(String clase,String metodo) throws ClassNotFoundException, NoSuchMethodException, SecurityException{
		Class nomClase = Class.forName(clase);
		Method nomMetodo = nomClase.getMethod(metodo, null);
		
		return nomMetodo;
	}
}
