package operaciones;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Iterator;
import java.util.List;
import modeloPersona.Alumno;

public class OperacionesAlumno extends Operaciones<Alumno>{	
	private Alumno ejemplar;
	
	public Alumno buscarPorMatricula(List<Alumno> lista,String matricula){
		Alumno elemento = null;
		Iterator<Alumno> iterador = lista.iterator();
		
		while (iterador.hasNext()){
			ejemplar = iterador.next();
			if(ejemplar.getMatricula().equalsIgnoreCase(matricula)){
				System.out.println("El alumno " + ejemplar.getNombre() + " con Matricula " + ejemplar.getMatricula() + " ha sido encontrado.");
				elemento = ejemplar;
			}
		}
		return elemento;
	}
	
	public void eliminaPorMatricula(List<Alumno> lista,String matricula){
		Iterator<Alumno> iterador = lista.iterator();
		boolean estado = false;
		
		while (iterador.hasNext() || estado==true){
			ejemplar = iterador.next();
			
			if(ejemplar.getMatricula().equalsIgnoreCase(matricula)){
				lista.remove(ejemplar);
				System.out.println("El alumno con matricula " + ejemplar.getMatricula() + " ha sido eliminado");
				estado = true;
			}
		}
	}
	
	public void eliminarPorNombre(List<Alumno> lista,String comparador){
		Iterator<Alumno> iterador = lista.iterator();
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
	
	public Alumno buscarPorNombre(List<Alumno> lista,String parametro){
		Alumno elemento = null;
		Iterator<Alumno> iterador = lista.iterator();
		
		while (iterador.hasNext()){
			ejemplar = iterador.next();
			
			if(ejemplar.getNombre().equalsIgnoreCase(parametro)){
				System.out.println("Persona encontrada " + ejemplar.getNombre());
				elemento = ejemplar;
			}
		}
		return elemento;
	}
	
	public void imprimeLista(List<Alumno> lista){
		Iterator<Alumno> iterador = lista.iterator();
		
		while(iterador.hasNext()){
			ejemplar = iterador.next();
			System.out.println( "Nombre: " + ejemplar.getNombre() +
								"\nGenero: " + ejemplar.getGenero() +
								"\nEdad: " + ejemplar.getEdad() +
								"\nMatricula: " + ejemplar.getMatricula() +
								"\nCarrera: " + ejemplar.getCarrera() +
								"\n*******************************************");
		}
	}
	
	public void listaSerializada(List<Alumno> lista, String archivo){
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
	public List<Alumno> listaDeserializada(String archivo){
		List<Alumno> lista = null;
	 
		try{	
			FileInputStream entrada = new FileInputStream(archivo);
			@SuppressWarnings("resource")
			ObjectInputStream obEntrada = new ObjectInputStream(entrada);
		    lista = (List<Alumno>) obEntrada.readObject();   
		   
		}catch (IOException | ClassNotFoundException error){
			System.out.println("Error de entrada/salida");
			error.printStackTrace();
		}
		return lista;
	}
}