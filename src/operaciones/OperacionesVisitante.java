package operaciones;

import java.util.Iterator;
import java.util.List;
import modeloPersona.Persona;
import modeloPersona.Visitante;

public class OperacionesVisitante<E> extends Operaciones<E>{
	
	public Visitante buscarID(List<Visitante> lista,String id)
	{
		Visitante elemento = null;
		
		Iterator<Visitante> iterador = lista.iterator();
		
		while (iterador.hasNext())
		{
			Visitante e = iterador.next();
			if(e.getNombre().equalsIgnoreCase(id))
			{
				System.out.println("Visitante " + e.getNombre() + "con ID " + e.getId() + "encontrado.");
				elemento = e;
			}
		}
		return elemento;
	}
	public void eliminaPorID(List<Visitante> lista,String id)
	{
		
		Iterator<Visitante> iterador = lista.iterator();
		
		while (iterador.hasNext())
		{
			Visitante e = iterador.next();
			if(e.getId().equalsIgnoreCase(id))
			{
				System.out.println("Visitante encontrado "+ e.getId());
				
				lista.remove(e);
				System.out.println("El visitante ha sido eliminado");
				break;
			}
			
		}
	}
	@Override
	public void imprimeLista(List<E> lista) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void actualizacion(List<E> lista, String parametro) {
		// TODO Auto-generated method stub
		
	}

}
