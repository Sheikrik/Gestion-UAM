package operaciones;

import java.util.LinkedList;
import java.util.List;

import modeloPersona.Alumno;
import modeloPersona.Empleado;
import modeloPersona.Visitante;

public class Menu {
	int opcion,subOpcion,terOpcion;
	List <Alumno> listaAlumnos = new LinkedList<Alumno>();
	List <Empleado> listaEmpleados = new LinkedList<Empleado>();
	List <Visitante> listaVisitantes = new LinkedList<Visitante>();
	EntradaTeclado teclado = new EntradaTeclado();
	OperacionesAlumno oper = new OperacionesAlumno();
	
	public void menu(){
		do {
			opciones();
			System.out.println("Introduce la opcion: ");
			opcion = teclado.lecturaEntero();
			System.out.println("Opcion seleccionada : " + opcion );

		    if (opcion==0){
			    System.out.println("Escribe el nombre de tu archivo a cargar");
			    //String archivo = op.leeCadena();
			    //listaAlumnos = op.cargaListaSerializada(archivo);
		 	}else if( opcion == 1 ){
		 		do{
			 		subOpciones();
			 		System.out.println("Introduce la opcion: ");
					subOpcion = teclado.lecturaEntero();
					System.out.println("Opcion seleccionada : " + subOpcion );
					
					if(subOpcion==1){
						Alumno nuevo = new Alumno();
						
				    	System.out.println("Registro de un nuevo alumno");
				    	System.out.println("Introduce la matricula");
				    	nuevo.setMatricula(teclado.lecturaPalabra());
				    	System.out.println("Introduce el nombre ");
				    	nuevo.setNombre(teclado.lecturaPalabra());
				    	System.out.println("Introduce el genero ");
				    	nuevo.setGenero(teclado.lecturaPalabra());
				    	System.out.println("Introduce el Edad ");
				    	nuevo.setEdad(teclado.lecturaEntero());
				    	System.out.println("Introduce el Carrera ");
				    	nuevo.setCarrera(teclado.lecturaPalabra());
				       
				       oper.registrar(listaAlumnos,nuevo);
					}else if(subOpcion==2){
						Empleado nuevo = new Empleado();
						
				    	System.out.println("Registro de un nuevo alumno");
				    	System.out.println("Introduce la matricula");
				    	//nuevo.setMatricula(teclado.lecturaPalabra());
				    	System.out.println("Introduce el nombre ");
				    	nuevo.setNombre(teclado.lecturaPalabra());
				    	System.out.println("Introduce el genero ");
				    	nuevo.setGenero(teclado.lecturaPalabra());
				    	System.out.println("Introduce el Edad ");
				    	nuevo.setEdad(teclado.lecturaEntero());
				    	System.out.println("Introduce el Carrera ");
				    	//nuevo.setCarrera(teclado.lecturaPalabra());
				       
				       oper.registrar(listaAlumnos,nuevo);
					}else if(subOpcion==3){
						Alumno nuevo = new Alumno();
						
				    	System.out.println("Registro de un nuevo alumno");
				    	System.out.println("Introduce la matricula");
				    	nuevo.setMatricula(teclado.lecturaPalabra());
				    	System.out.println("Introduce el nombre ");
				    	nuevo.setNombre(teclado.lecturaPalabra());
				    	System.out.println("Introduce el genero ");
				    	nuevo.setGenero(teclado.lecturaPalabra());
				    	System.out.println("Introduce el Edad ");
				    	nuevo.setEdad(teclado.lecturaEntero());
				    	System.out.println("Introduce el Carrera ");
				    	nuevo.setCarrera(teclado.lecturaPalabra());
				       
				       oper.registrar(listaAlumnos,nuevo);
					}
		 		}while(subOpcion!=4);
		    }else if (opcion==2){
		    	subOpciones();
		 		System.out.println("Introduce la opcion: ");
				subOpcion = teclado.lecturaEntero();
				System.out.println("Opcion seleccionada : " + subOpcion );
				
			 	if(subOpcion==1){
			 		System.out.println("Elige una opcion");
					System.out.println("1. Por nombre");
					System.out.println("2. Por matricula");
					System.out.println("3. Regresar");
			 		System.out.println("Introduce la opcion: ");
					terOpcion = teclado.lecturaEntero();
					System.out.println("Opcion seleccionada : " + terOpcion );
					
					if(terOpcion==1){
						System.out.println("Escribe el nombre del que deseas eliminar");
				 		String alu = teclado.lecturaPalabra();
				 		oper.eliminarNombre(listaAlumnos,alu);
					}
			 	}
		    }else if (opcion==3){  
		    }else if (opcion==4){   
		    }else if (opcion==5){   
		    }else if (opcion==6){   
		    }else if (opcion==7){   
		    }else if (opcion==8){
		    }else{
		    	
		    }
		}while(opcion!=8);
	}
	
	public void opciones(){
		System.out.println("Menu de opciones");
		System.out.println("1. Registro");
		System.out.println("2. Eliminacion");
		System.out.println("3. Busqueda");
		System.out.println("4. Actualizacion");
		System.out.println("5. Impresion");
		System.out.println("6. Cargar archivo");
		System.out.println("7. Guardar archivo");
		System.out.println("8. Guardar y salir");
	}
	
	public void subOpciones(){
		System.out.println("Elige una opcion");
		System.out.println("1. Alumno");
		System.out.println("2. Empleado");
		System.out.println("3. Visitante");
		System.out.println("4. Regresar");
	}
}