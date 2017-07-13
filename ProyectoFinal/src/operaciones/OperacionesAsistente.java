package operaciones;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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
				System.out.println("Asistente " + ejemplar.getNombre() + " con Numero Economico " + ejemplar.getNumEco() + " ha sido encontrado.");
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
	
	public void eliminarPorNombre(List<Asistente> lista,String comparador){
		Iterator<Asistente> iterador = lista.iterator();
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
	
	public Asistente buscarPorNombre(List<Asistente> lista,String parametro){
		Asistente elemento = null;
		Iterator<Asistente> iterador = lista.iterator();
		
		while (iterador.hasNext()){
			ejemplar = iterador.next();
			
			if(ejemplar.getNombre().equalsIgnoreCase(parametro)){
				System.out.println("Persona encontrada " + ejemplar.getNombre());
				elemento = ejemplar;
			}
		}
		return elemento;
	}
	
	public void imprimeLista(List<Asistente> lista){
		Iterator<Asistente> iterador = lista.iterator();

		while(iterador.hasNext()){
			ejemplar = iterador.next();
			System.out.println( "Nombre: " + ejemplar.getNombre() +
								"\nGenero: " + ejemplar.getGenero() +
								"\nEdad: " + ejemplar.getEdad() +
								"\nNumero economico: " + ejemplar.getNumEco() +
								"\nDe confianza?: " + ejemplar.isConfianza() +
								"\n*******************************************");
		}
	}
	
	public void listaSerializada(List<Asistente> lista, String archivo){
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
	public List<Asistente> listaDeserializada(String archivo){
		List<Asistente> lista = null;
	 
		try{	
			FileInputStream entrada = new FileInputStream(archivo);
			@SuppressWarnings("resource")
			ObjectInputStream obEntrada = new ObjectInputStream(entrada);
		    lista = (List<Asistente>) obEntrada.readObject();   
		   
		}catch (IOException | ClassNotFoundException error){
			System.out.println("Error de entrada/salida");
			error.printStackTrace();
		}
		return lista;
	}
}