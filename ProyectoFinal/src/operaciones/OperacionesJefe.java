package operaciones;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Iterator;
import java.util.List;
import modeloPersona.Jefe;

public class OperacionesJefe extends Operaciones<Jefe>{
	private Jefe ejemplar;
	
	public Jefe buscarPorNumEco(List<Jefe> lista,String numEco){
		Jefe elemento = null;
		Iterator<Jefe> iterador = lista.iterator();
		
		while (iterador.hasNext()){
			ejemplar = iterador.next();
			if(ejemplar.getNumEco().equalsIgnoreCase(numEco)){
				System.out.println("Jefe " + ejemplar.getNombre() + " con Numero Economico " + ejemplar.getNumEco() + " ha sido encontrado.");
				elemento = ejemplar;
			}
		}
		return elemento;
	}
	
	public void eliminaPorNumeroEconomico(List<Jefe> lista,String numEco){
		Iterator<Jefe> iterador = lista.iterator();
		boolean estado = false;
		
		while (iterador.hasNext() || estado==true){
			ejemplar = iterador.next();
			
			if(ejemplar.getNumEco().equalsIgnoreCase(numEco)){
				lista.remove(ejemplar);
				System.out.println("El jefe con numero economico " + ejemplar.getNumEco() + " ha sido eliminado");
				estado = true;
			}
		}
	}
	
	public void eliminarPorNombre(List<Jefe> lista,String comparador){
		Iterator<Jefe> iterador = lista.iterator();
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
	
	public Jefe buscarPorNombre(List<Jefe> lista,String parametro){
		Jefe elemento = null;
		Iterator<Jefe> iterador = lista.iterator();
		
		while (iterador.hasNext()){
			ejemplar = iterador.next();
			
			if(ejemplar.getNombre().equalsIgnoreCase(parametro)){
				System.out.println("Persona encontrada " + ejemplar.getNombre());
				elemento = ejemplar;
			}
		}
		return elemento;
	}
	
	public void imprimeLista(List<Jefe> lista){
		Iterator<Jefe> iterador = lista.iterator();

		while(iterador.hasNext()){
			ejemplar = iterador.next();
			System.out.println( "Nombre: " + ejemplar.getNombre() +
								"\nGenero: " + ejemplar.getGenero() +
								"\nEdad: " + ejemplar.getEdad() +
								"\nNumero economico: " + ejemplar.getNumEco() +
								"\nGrado academico: " + ejemplar.getGradAcademico() +
								"\nCargo: " + ejemplar.getCargo() +
								"\n*******************************************");
		}
	}
	
	public void listaSerializada(List<Jefe> lista, String archivo){
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
	public List<Jefe> listaDeserializada(String archivo){
		List<Jefe> lista = null;
	 
		try{	
			FileInputStream entrada = new FileInputStream(archivo);
			@SuppressWarnings("resource")
			ObjectInputStream obEntrada = new ObjectInputStream(entrada);
		    lista = (List<Jefe>) obEntrada.readObject();   
		   
		}catch (IOException | ClassNotFoundException error){
			System.out.println("Error de entrada/salida");
			error.printStackTrace();
		}
		return lista;
	}
}
