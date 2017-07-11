package operaciones;

import java.util.Iterator;
import java.util.List;

import modeloPersona.Empleado;
import modeloPersona.Persona;


public class OperacionesEmpleado<E> extends Operaciones<E>{
	public Empleado buscarNumEco(List<Empleado> lista,String numeco)
	{
		Empleado elemento = null;
		
		Iterator<Empleado> iterador = lista.iterator();
		
		while (iterador.hasNext())
		{
			Empleado e = iterador.next();
			if(e.getNombre().equalsIgnoreCase(numeco))
			{
				System.out.println("Visitante " + e.getNombre() + "con Numero Economico " + e.getNumEco() + "encontrado.");
				elemento = e;
			}
		}
		return elemento;
	}
	
	public void eliminaPorNumeroEconomico(List<Empleado> lista,String numeco)
	{
		
		Iterator<Empleado> iterador = lista.iterator();
		
		while (iterador.hasNext())
		{
			Empleado e = iterador.next();
			if(e.getNumEco().equalsIgnoreCase(numeco))
			{
				System.out.println("Empleado encontrado "+ e.getNumEco());
				
				lista.remove(e);
				System.out.println("El empleado ha sido eliminado");
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
