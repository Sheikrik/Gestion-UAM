package operaciones;

import java.util.LinkedList;
import java.util.List;

import modeloPersona.Alumno;
import modeloPersona.Asistente;
import modeloPersona.Ayudante;
import modeloPersona.Coordinador;
import modeloPersona.Empleado;
import modeloPersona.Jefe;
import modeloPersona.Profesor;
import modeloPersona.Visitante;

public class Menu {
	int opcion,subOpcion,terOpcion,subParaAlumno,subParaEmpelados;
	
	List <Alumno> listaAlumnos = new LinkedList<Alumno>();
	List <Empleado> listaEmpleados = new LinkedList<Empleado>();
	List <Visitante> listaVisitantes = new LinkedList<Visitante>();
	
	EntradaTeclado teclado = new EntradaTeclado();
	OperacionesAlumno oper = new OperacionesAlumno();
	OperacionesEmpleado operE = new OperacionesEmpleado();
	OperacionesVisitante operV = new OperacionesVisitante();
	
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
		 	}else if( opcion == 1 ){//.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-Registrar alumnos 
		 		do{
			 		subOpciones();
			 		System.out.println("Introduce la opcion: ");
					subOpcion = teclado.lecturaEntero();
					System.out.println("Opcion seleccionada : " + subOpcion );
					
					if(subOpcion==1){//.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-Sub menu de los tipos de alumnos 
							subOpcionesAlumno();
							System.out.println("Introduce la opcion: ");
							subParaAlumno = teclado.lecturaEntero();
							System.out.println("Opcion seleccionada : " + subParaAlumno );
										if(subParaAlumno==1) {//.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-Alumnos 
											registroAlumnos();											
										}else if(subParaAlumno==2){//.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-Ayudantes 
											registroAlumnosQueSonAyudantes();											
										}
								
						
					}else if(subOpcion==2){
						subMenuEmpleado();
						System.out.println("Introduce la opcion: ");
						subParaEmpelados = teclado.lecturaEntero();
						System.out.println("Opcion seleccionada : " + subParaEmpelados );
									if(subParaEmpelados==1) {//.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-Alumnos 
										registroEmpeladosQueSonJefes();											
									}else if(subParaEmpelados==2){//.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-Ayudantes 
										registroEmpeladosQueSonCoordinadores();											
									}else if(subParaEmpelados==3){//.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-Ayudantes 
										registroEmpeladosQueSonProfesores();
									}else if(subParaEmpelados==4){//.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-Ayudantes 
										registroAlumnosQueSonAyudantes();
									}
									
					}else if(subOpcion==3){
						System.out.println("Visitante no tiene SubMenu");
						registroVisitantes();						
					}
		 		}while(subOpcion!=4);
		 		
		    }else if (opcion==2){//.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-Eliminar 
		    	do {
		    	subOpciones();
		 		System.out.println("Introduce la opcion: ");
				subOpcion = teclado.lecturaEntero();
				System.out.println("Opcion seleccionada : " + subOpcion );
				
			 	if(subOpcion==1){
			 		System.out.println("Eliminar Por . . . ");
					System.out.println("1. Nombre");
					System.out.println("2. Matricula");
					System.out.println("3. Regresar");
			 		System.out.println("Introduce la opcion: ");
					terOpcion = teclado.lecturaEntero();
					System.out.println("Opcion seleccionada : " + terOpcion );
					
					if(terOpcion==1){
						System.out.println("Escribe el nombre del que deseas eliminar: ");
				 		String alu = teclado.lecturaPalabra();
				 		oper.eliminarNombre(alu);
					}else if(terOpcion==2) {
						System.out.println("Escribe la matricula que deseas eliminar: ");
				 		String alu = teclado.lecturaPalabra();
				 		oper.eliminaPorMatricula(alu);					
								}
			 				}
		    	}while(terOpcion!=3);
		    	
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
	
	public void opciones(){//.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-
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
	
	public void subOpcionesAlumno(){
		System.out.println("TIPOS DE ALUMNOS ");
		System.out.println("1. Alumno");
		System.out.println("2. Ayudante");
		
	}
	public void subMenuEmpleado(){//.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-Sub menu del Registro Empleado
		System.out.println("TIPOS DE EMPLEADO");
		System.out.println("1. Jefe");
		System.out.println("2. Coordinador");
		System.out.println("3. Profesor");
		System.out.println("4. Asistente");
	}
public void registroAlumnos() {//.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-Registro Alumnos
		
		Alumno nuevo = new Alumno();
		
    	System.out.println("Registro de un nuevo Alumno");
    	System.out.println("Introduce la matricula");
    	nuevo.setMatricula(teclado.lecturaPalabra());
    	System.out.println("Introduce el Nombre ");
    	nuevo.setNombre(teclado.lecturaPalabra());
    	System.out.println("Introduce el genero ");
    	nuevo.setGenero(teclado.lecturaPalabra());
    	System.out.println("Introduce el Edad ");
    	nuevo.setEdad(teclado.lecturaEntero());
    	System.out.println("Introduce el Carrera ");
    	nuevo.setCarrera(teclado.lecturaPalabra());
       
       oper.registrar(listaAlumnos,nuevo);
		
	}
public void registroAlumnosQueSonAyudantes(){//.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-Registro ayudantes
	
	Ayudante nuevo = new Ayudante();//.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-Ayudante es una subclase de alumno 
	
	System.out.println("Registro de un nuevo Ayudante");
	System.out.println("Introduce la matricula");
	nuevo.setMatricula(teclado.lecturaPalabra());
	System.out.println("Introduce el Nombre ");
	nuevo.setNombre(teclado.lecturaPalabra());
	System.out.println("Introduce el genero ");
	nuevo.setGenero(teclado.lecturaPalabra());
	System.out.println("Introduce el Edad ");
	nuevo.setEdad(teclado.lecturaEntero());
	System.out.println("Introduce el Carrera ");
	nuevo.setCarrera(teclado.lecturaPalabra());
	//atributos unico de Ayudante
	System.out.println("Introduce el Numero esconomico del ayudante:");
	nuevo.setNumEco(teclado.lecturaPalabra());
      
   oper.registrar(listaAlumnos,nuevo);//lo diviertido es que lo guardamos en la misma lista de Alumnos OWO 
	
}

public void registroEmpeladosQueSonJefes() {//.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-Registro Jefe
	
	Jefe nuevo = new Jefe();
	
	System.out.println("Registro de un nuevo Jefe");
	System.out.println("Introduce El Numero Economico: ");
	nuevo.setNumEco(teclado.lecturaPalabra());
	System.out.println("Introduce el Nombre: ");
	nuevo.setNombre(teclado.lecturaPalabra());
	System.out.println("Introduce el Genero: ");
	nuevo.setGenero(teclado.lecturaPalabra());
	System.out.println("Introduce el Edad: ");
	nuevo.setEdad(teclado.lecturaEntero());
	//atributos unico de Jefe
	System.out.println("Introduce el Cargo de este Jefe: ");
	nuevo.setCargo(teclado.lecturaPalabra());
	
	operE.registrar(listaEmpleados, nuevo);
		
	}

public void registroEmpeladosQueSonCoordinadores() {//.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-Registro coordinador 
	
	Coordinador nuevo = new Coordinador();
	
	System.out.println("Registro de un nuevo Coordinador");
	System.out.println("Introduce El Numero Economico: ");
	nuevo.setNumEco(teclado.lecturaPalabra());
	System.out.println("Introduce el Nombre: ");
	nuevo.setNombre(teclado.lecturaPalabra());
	System.out.println("Introduce el Genero: ");
	nuevo.setGenero(teclado.lecturaPalabra());
	System.out.println("Introduce el Edad: ");
	nuevo.setEdad(teclado.lecturaEntero());
	//atributos unico de Coordinador
	System.out.println("Introduce el Area que coordina: ");
	nuevo.setArea(teclado.lecturaPalabra());
	
	operE.registrar(listaEmpleados, nuevo);
		
	}

public void registroEmpeladosQueSonProfesores() {//.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-Registro Profesor 
	
	Profesor nuevo = new Profesor();
	
	System.out.println("Registro de un nuevo Profesor");
	System.out.println("Introduce El Numero Economico: ");
	nuevo.setNumEco(teclado.lecturaPalabra());
	System.out.println("Introduce el Nombre: ");
	nuevo.setNombre(teclado.lecturaPalabra());
	System.out.println("Introduce el Genero: ");
	nuevo.setGenero(teclado.lecturaPalabra());
	System.out.println("Introduce el Edad: ");
	nuevo.setEdad(teclado.lecturaEntero());
	//atributos unico de Profesor
	System.out.println("Introduce Su grado academico: ");
	nuevo.setGradAcademico(teclado.lecturaPalabra());
	
	operE.registrar(listaEmpleados, nuevo);
		
	}

public void registroEmpeladosQueSonAsistente() {//.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-Registro Asistente 
	
	Asistente nuevo = new Asistente();
	
	System.out.println("Registro de un nuevo Asistente");
	System.out.println("Introduce El Numero Economico: ");
	nuevo.setNumEco(teclado.lecturaPalabra());
	System.out.println("Introduce el Nombre: ");
	nuevo.setNombre(teclado.lecturaPalabra());
	System.out.println("Introduce el Genero: ");
	nuevo.setGenero(teclado.lecturaPalabra());
	System.out.println("Introduce el Edad: ");
	nuevo.setEdad(teclado.lecturaEntero());
	//atributos unico de Asistente
	System.out.println("Tiene base True/False : ");
	nuevo.setBase(teclado.lecturaboleano());
	
	operE.registrar(listaEmpleados, nuevo);
		
	}

public void registroVisitantes() {//.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-Registro Visitante  
	
	Visitante nuevo = new Visitante();
	
	System.out.println("Registro de un nuevo Visitante");
	
	nuevo.setId(teclado.lecturaPalabra());
	System.out.println("Introduce el Nombre: ");
	nuevo.setNombre(teclado.lecturaPalabra());
	System.out.println("Introduce el Genero: ");
	nuevo.setGenero(teclado.lecturaPalabra());
	System.out.println("Introduce el Edad: ");
	nuevo.setEdad(teclado.lecturaEntero());
	//atributos unico de Visitante
	System.out.println("Introduce El ID: ");
	nuevo.setId(teclado.lecturaPalabra());
	
	operV.registrar(listaVisitantes, nuevo);
	
	}

	
}