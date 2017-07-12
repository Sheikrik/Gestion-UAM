package operaciones;

import java.util.Iterator;
//import java.util.LinkedList;
import java.util.List;

import modeloPersona.Alumno;
import modeloPersona.Ayudante;
import modeloPersona.Persona;

public class OperacionesAlumno extends Operaciones<Alumno>{
	
	
	
	public Alumno buscarMatricula(String matricula){
		Alumno elemento = null;
		Iterator<Alumno> iterador = lista.iterator();
		
		while (iterador.hasNext()){
			Alumno e = iterador.next();
			if(((Persona) e).getNombre().equalsIgnoreCase(matricula)){
				System.out.println("El alumno " + ((Persona) e).getNombre() + "con Matricula " + ((modeloPersona.Alumno) e).getMatricula() + "encontrado.");
				elemento = e;
			}
		}
		return elemento;
	}
	
	public void eliminaPorMatricula(String matricula){
		Iterator<Alumno> iterador = lista.iterator();
		
		while (iterador.hasNext()){
			Alumno e = iterador.next();
			
			if(((modeloPersona.Alumno) e).getMatricula().equalsIgnoreCase(matricula)){
				System.out.println("Alumno encontrado "+ ((modeloPersona.Alumno) e).getMatricula());
				lista.remove(e);
				System.out.println("El alumno ha sido eliminado");
				break;
			}
		}
	}
	
	public void eliminaPorNoEconomico(String noEco){//metodo para eliminar alumno por numero economico 
		Iterator<Alumno> iterador = lista.iterator();
		
		while (iterador.hasNext()){
			Alumno e = iterador.next();
			
			if(((modeloPersona.Ayudante) e).getNumEco().equalsIgnoreCase(noEco)){
				System.out.println("Alumno encontrado "+ ((modeloPersona.Ayudante) e).getNumEco());
				lista.remove(e);
				System.out.println("El alumno ha sido eliminado");
				break;
			}
		}
	}
	
	
	public Alumno buscarNoEconomico(String noEco){
		Alumno elemento = null;
		Iterator<Alumno> iterador = lista.iterator();
		
		while (iterador.hasNext()){
			Alumno e = iterador.next();
			if(((Ayudante) e).getNumEco().equalsIgnoreCase(noEco)){
				System.out.println("El Ayudante " + ((Ayudante) e).getNombre() + "con Numero Economico " + ((modeloPersona.Ayudante) e).getNumEco() + "encontrado.");
				elemento = e;
			}
		}
		return elemento;
	}
	
	public void imprimeLista(List<Alumno> lista){

		Iterator<Alumno> iterador = lista.iterator();
		System.out.println("--LinkedList---");
	 	//recorremos y mostramos la lista
		while(iterador.hasNext())
		{
			Alumno e = iterador.next();
			System.out.println( "Nombre    :  " + e.getNombre());
			System.out.println( "Genero    :  " + e.getGenero());
			System.out.println( "Matricula :  " + e.getMatricula());
			System.out.println( "Edad      :  " + e.getEdad());
			if(((Ayudante) e).getNumEco() !=" ") {/////// aquí es donde esta el depapaye 
			System.out.println( "No. Eco   :  " + ((Ayudante) e).getNumEco());
			System.out.println( "**********************************" );
			}else {
			System.out.println( "**********************************" );
		}
	}
	}
	@Override
	public void imprimeLista() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizacion(String parametro) {
		// TODO Auto-generated method stub
		
	}
}
