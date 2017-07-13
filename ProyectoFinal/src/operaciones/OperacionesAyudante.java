package operaciones;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Iterator;
import java.util.List;
import modeloPersona.Ayudante;

public class OperacionesAyudante extends Operaciones<Ayudante>{
	private Ayudante ejemplar;
	
	public Ayudante buscarPorMatricula(List<Ayudante> lista,String matricula){
		Ayudante elemento = null;
		Iterator<Ayudante> iterador = lista.iterator();
		
		while (iterador.hasNext()){
			ejemplar = iterador.next();
			if(ejemplar.getMatricula().equalsIgnoreCase(matricula)){
				System.out.println("El ayudante " + ejemplar.getNombre() + " con Matricula " + ejemplar.getMatricula() + " ha sido encontrado.");
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
	
	public void eliminarPorNombre(List<Ayudante> lista,String comparador){
		Iterator<Ayudante> iterador = lista.iterator();
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
	
	public Ayudante buscarPorNombre(List<Ayudante> lista,String parametro){
		Ayudante elemento = null;
		Iterator<Ayudante> iterador = lista.iterator();
		
		while (iterador.hasNext()){
			ejemplar = iterador.next();
			
			if(ejemplar.getNombre().equalsIgnoreCase(parametro)){
				System.out.println("Persona encontrada " + ejemplar.getNombre());
				elemento = ejemplar;
			}
		}
		return elemento;
	}
	
	public void imprimeLista(List<Ayudante> lista){
		Iterator<Ayudante> iterador = lista.iterator();

		while(iterador.hasNext()){
			ejemplar = iterador.next();
			System.out.println( "Nombre: " + ejemplar.getNombre() +
								"\nGenero: " + ejemplar.getGenero() +
								"\nEdad: " + ejemplar.getEdad() +
								"\nMatricula: " + ejemplar.getMatricula() +
								"\nCarrera: " + ejemplar.getCarrera() +
								"\nNumero economico: " + ejemplar.getNumEco() +
								"\n*******************************************");
		}
	}
	
	public void listaSerializada(List<Ayudante> lista, String archivo){
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
	public List<Ayudante> listaDeserializada(String archivo){
		List<Ayudante> lista = null;
	 
		try{	
			FileInputStream entrada = new FileInputStream(archivo);
			@SuppressWarnings("resource")
			ObjectInputStream obEntrada = new ObjectInputStream(entrada);
		    lista = (List<Ayudante>) obEntrada.readObject();   
		   
		}catch (IOException | ClassNotFoundException error){
			System.out.println("Error de entrada/salida");
			error.printStackTrace();
		}
		return lista;
	}
}
