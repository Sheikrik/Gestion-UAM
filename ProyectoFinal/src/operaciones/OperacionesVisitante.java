package operaciones;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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
				System.out.println("Visitante " + ejemplar.getNombre() + " con ID " + ejemplar.getId() + " ha sido encontrado.");
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
	
	public void eliminarPorNombre(List<Visitante> lista,String comparador){
		Iterator<Visitante> iterador = lista.iterator();
		boolean estado = false;
		
		while (iterador.hasNext() || estado==true){
			ejemplar = iterador.next();
			
			if(ejemplar.getNombre().equalsIgnoreCase(comparador)){
				lista.remove(ejemplar);
				System.out.println("Se ha eliminado a " + ejemplar.getNombre());
				estado = true;
			}
		}
	}
	
	public Visitante buscarPorNombre(List<Visitante> lista,String parametro){
		Visitante elemento = null;
		Iterator<Visitante> iterador = lista.iterator();
		
		while (iterador.hasNext()){
			ejemplar = iterador.next();
			
			if(ejemplar.getNombre().equalsIgnoreCase(parametro)){
				System.out.println("Persona encontrada " + ejemplar.getNombre());
				elemento = ejemplar;
			}
		}
		return elemento;
	}
	
	public void imprimeLista(List<Visitante> lista){
		Iterator<Visitante> iterador = lista.iterator();

		while(iterador.hasNext()){
			ejemplar = iterador.next();
			System.out.println( "Nombre: " + ejemplar.getNombre() +
								"\nGenero: " + ejemplar.getGenero() +
								"\nEdad: " + ejemplar.getEdad() +
								"\nID: " + ejemplar.getId() +
								"\n*******************************************");
		}
	}
	
	public void listaSerializada(List<Visitante> lista, String archivo){
		try {	
			FileOutputStream salida = new FileOutputStream(archivo);
			ObjectOutputStream obSalida = new ObjectOutputStream(salida);
			obSalida.writeObject(lista);   
			obSalida.close();	
		}catch (IOException error){
			System.out.println("Error de entrada/salida");
			error.printStackTrace();
		}
	}
	
	@SuppressWarnings("unchecked")
	public List<Visitante> listaDeserializada(String archivo){
		List<Visitante> lista = null;
	 
		try{	
			FileInputStream entrada = new FileInputStream(archivo);
			@SuppressWarnings("resource")
			ObjectInputStream obEntrada = new ObjectInputStream(entrada);
		    lista = (List<Visitante>) obEntrada.readObject();   
		   
		}catch (IOException | ClassNotFoundException error){
			System.out.println("Error de entrada/salida");
			error.printStackTrace();
		}
		return lista;
	}
}