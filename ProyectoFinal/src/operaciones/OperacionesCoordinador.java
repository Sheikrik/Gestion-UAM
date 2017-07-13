package operaciones;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Iterator;
import java.util.List;
import modeloPersona.Coordinador;

public class OperacionesCoordinador extends Operaciones<Coordinador>{
	private Coordinador ejemplar;
	
	public Coordinador buscarPorNumEco(List<Coordinador> lista,String numEco){
		Coordinador elemento = null;
		Iterator<Coordinador> iterador = lista.iterator();
		
		while (iterador.hasNext()){
			ejemplar = iterador.next();
			if(ejemplar.getNumEco().equalsIgnoreCase(numEco)){
				System.out.println("Coordinador " + ejemplar.getNombre() + " con Numero Economico " + ejemplar.getNumEco() + " ha sido encontrado.");
				elemento = ejemplar;
			}
		}
		return elemento;
	}
	
	public void eliminaPorNumeroEconomico(List<Coordinador> lista,String numEco){
		Iterator<Coordinador> iterador = lista.iterator();
		boolean estado = false;
		
		while (iterador.hasNext() || estado==true){
			ejemplar = iterador.next();
			
			if(ejemplar.getNumEco().equalsIgnoreCase(numEco)){
				lista.remove(ejemplar);
				System.out.println("El coordinador con numero economico " + ejemplar.getNumEco() + " ha sido eliminado");
				estado = true;
			}
		}
	}
	
	public void eliminarPorNombre(List<Coordinador> lista,String comparador){
		Iterator<Coordinador> iterador = lista.iterator();
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
	
	public Coordinador buscarPorNombre(List<Coordinador> lista,String parametro){
		Coordinador elemento = null;
		Iterator<Coordinador> iterador = lista.iterator();
		
		while (iterador.hasNext()){
			ejemplar = iterador.next();
			
			if(ejemplar.getNombre().equalsIgnoreCase(parametro)){
				System.out.println("Persona encontrada " + ejemplar.getNombre());
				elemento = ejemplar;
			}
		}
		return elemento;
	}
	
	public void imprimeLista(List<Coordinador> lista){
		Iterator<Coordinador> iterador = lista.iterator();

		while(iterador.hasNext()){
			ejemplar = iterador.next();
			System.out.println( "Nombre: " + ejemplar.getNombre() +
								"\nGenero: " + ejemplar.getGenero() +
								"\nEdad: " + ejemplar.getEdad() +
								"\nNumero economico: " + ejemplar.getNumEco() +
								"\nGrado academico: " + ejemplar.getGradAcademico() +
								"\nArea: " + ejemplar.getArea() +
								"\n*******************************************");
		}
	}
	
	public void listaSerializada(List<Coordinador> lista, String archivo){
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
	public List<Coordinador> listaDeserializada(String archivo){
		List<Coordinador> lista = null;
	 
		try{	
			FileInputStream entrada = new FileInputStream(archivo);
			@SuppressWarnings("resource")
			ObjectInputStream obEntrada = new ObjectInputStream(entrada);
		    lista = (List<Coordinador>) obEntrada.readObject();   
		   
		}catch (IOException | ClassNotFoundException error){
			System.out.println("Error de entrada/salida");
			error.printStackTrace();
		}
		return lista;
	}
}
