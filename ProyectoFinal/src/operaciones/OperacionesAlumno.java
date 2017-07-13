package operaciones;

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
				System.out.println("El alumno " + ejemplar.getNombre() + "con Matricula " + ejemplar.getMatricula() + "encontrado.");
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
	
	public void imprimeLista(List<Alumno> lista){
		Iterator<Alumno> iterador = lista.iterator();
		
		while(iterador.hasNext()){
			ejemplar = iterador.next();
			System.out.println( "Matricula: " + ejemplar.getMatricula() +
								"\nCarrera: " + ejemplar.getCarrera() +
								"\nEdad: " + ejemplar.getEdad());
		}
	}
}