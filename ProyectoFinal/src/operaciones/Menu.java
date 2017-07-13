package operaciones;

//import java.util.Iterator;
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
									if(subParaEmpelados==1) {//.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-Empleado que son profesores 
										registroEmpeladosQueSonJefes();											
									}else if(subParaEmpelados==2){//.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-Empleadoque son jefes  
										registroEmpeladosQueSonCoordinadores();											
									}else if(subParaEmpelados==3){//.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-Empleads que son coordinadores
										registroEmpeladosQueSonProfesores();
									}else if(subParaEmpelados==4){//.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-Empelados que son asistentes  
										registroEmpeladosQueSonAsistente();
									}
									
					}else if(subOpcion==3){//.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-Visitantes 
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
				
			 	if(subOpcion==1){//.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-Eliminar alumno 
			 				do {
			 		System.out.println("Eliminar Por . . . ");
					System.out.println("1. Nombre");
					System.out.println("2. Matricula");
					System.out.println("3. Numero Economico");
					System.out.println("4. Regresar");
			 		System.out.println("Introduce la opcion: ");
					terOpcion = teclado.lecturaEntero();
					System.out.println("Opcion seleccionada : " + terOpcion );
					
					if(terOpcion==1){//.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-Eliminar alumno por nombre
						System.out.println("Escribe el nombre del que deseas eliminar: ");
				 		String alu = teclado.lecturaPalabra();
				 		oper.eliminarNombre(listaAlumnos,alu);
					}else if(terOpcion==2) {//.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-Eliminar alumno por matricula
						System.out.println("Escribe la matricula que deseas eliminar: ");
				 		String alu = teclado.lecturaPalabra();
				 		oper.eliminaPorMatricula(listaAlumnos,alu);					
					}else if(terOpcion==3) {//.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-Eliminar alumno por numero economico
						System.out.println("Escribe El numero economico del alumno que deseas eliminar : ");
				 		String alu = teclado.lecturaPalabra();
				 		oper.eliminaPorNoEconomico(listaAlumnos,alu);
					}
			 				   }while(terOpcion!=4);
			 	}else if (subOpcion==2){//.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-Eliminar Empleado
			 		do {
				 		System.out.println("Eliminar Por . . . ");
						System.out.println("1. Nombre");
						System.out.println("2. Numero Economico");
						System.out.println("3. Regresar");
				 		System.out.println("Introduce la opcion: ");
						terOpcion = teclado.lecturaEntero();
						System.out.println("Opcion seleccionada : " + terOpcion );
						
						if(terOpcion==1){//.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-Eliminar Empleado por nombre
							System.out.println("Escribe el nombre del empelado a eliminar: ");
					 		String empl = teclado.lecturaPalabra();
					 		operE.eliminarNombre(listaEmpleados,empl);
						}else if(terOpcion==2) {//.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-Eliminar Empleado por numero economico
							System.out.println("Escribe el numero economico de empleado  liminar: ");
					 		String empl = teclado.lecturaPalabra();
					 		operE.eliminaPorNumeroEconomico(listaEmpleados,empl);
						}
				 				   }while(terOpcion!=3);
			 	}else if (subOpcion==3){//.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-Eliminar Visitante
			 		do {
				 		System.out.println("Eliminar Por . . . ");
						System.out.println("1. Nombre");
						System.out.println("2. ID");
						System.out.println("3. Regresar");
				 		System.out.println("Introduce la opcion: ");
						terOpcion = teclado.lecturaEntero();
						System.out.println("Opcion seleccionada : " + terOpcion );
						
						if(terOpcion==1){//.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-Eliminar Visitante por nombre
							System.out.println("Escribe el nombre del visintate que deseas eliminar: ");
					 		String vis = teclado.lecturaPalabra();
					 		operV.eliminarNombre(listaVisitantes,vis);
						}else if(terOpcion==2) {//.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-Eliminar Visitante por ID
							System.out.println("Escribe el numero economico de Visitante  liminar: ");
					 		String vis = teclado.lecturaPalabra();
					 		operV.eliminaPorID(listaVisitantes,vis);
						}
				 				   }while(terOpcion!=3);
			 	}
		    
		    }while(terOpcion!=3);
		    	
		    }else if (opcion==3){//.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-Busqueda
		    	do {
			    	subOpciones();
			 		System.out.println("Introduce la opcion: ");
					subOpcion = teclado.lecturaEntero();
					System.out.println("Opcion seleccionada : " + subOpcion );
					
				 	if(subOpcion==1){//.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-Buscar alumno 
				 				do {
				 		System.out.println("Buscar Por . . . ");
						System.out.println("1. Nombre");
						System.out.println("2. Matricula");
						System.out.println("3. Numero Economico");
						System.out.println("4. Regresar");
				 		System.out.println("Introduce la opcion: ");
						terOpcion = teclado.lecturaEntero();
						System.out.println("Opcion seleccionada : " + terOpcion );
						
						if(terOpcion==1){//.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-Buscar alumno por nombre
							System.out.println("Escribe el nombre del que deseas Buscar: ");
					 		String alu = teclado.lecturaPalabra();
					 		oper.busquedaNombre(listaAlumnos,alu);
						}else if(terOpcion==2) {//.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-Buscar alumno por matricula
							System.out.println("Escribe la matricula que deseas Buscar: ");
					 		String alu = teclado.lecturaPalabra();
					 		oper.buscarMatricula(listaAlumnos,alu);					
						}else if(terOpcion==3) {//.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-Buscar alumno por numero economico
							System.out.println("Escribe El numero economico del alumno que deseas Buscar : ");
					 		String alu = teclado.lecturaPalabra();
					 		oper.buscarNoEconomico(listaAlumnos,alu);
						}
				 				   }while(terOpcion!=4);
				 	}else if (subOpcion==2){//.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-Buscar Empleado
				 		do {
					 		System.out.println("Buscar Por . . . ");
							System.out.println("1. Nombre");
							System.out.println("2. Numero Economico");
							System.out.println("3. Regresar");
					 		System.out.println("Introduce la opcion: ");
							terOpcion = teclado.lecturaEntero();
							System.out.println("Opcion seleccionada : " + terOpcion );
							
							if(terOpcion==1){//.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-Buscar Empleado por nombre
								System.out.println("Escribe el nombre del empleado que deseas Buscar: ");
						 		String empl = teclado.lecturaPalabra();
						 		operE.busquedaNombre(listaEmpleados,empl);
							}else if(terOpcion==2) {//.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-Buscar Empleado por numero economico
								System.out.println("Escribe el numero economico del empleado a liminar: ");
						 		String empl = teclado.lecturaPalabra();
						 		operE.buscarNumEco(listaEmpleados,empl);
							}
					 				   }while(terOpcion!=3);
				 	}else if (subOpcion==3){//.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-Buscar Visitante
				 		do {
					 		System.out.println("Buscar Por . . . ");
							System.out.println("1. Nombre");
							System.out.println("2. ID");
							System.out.println("3. Regresar");
					 		System.out.println("Introduce la opcion: ");
							terOpcion = teclado.lecturaEntero();
							System.out.println("Opcion seleccionada : " + terOpcion );
							
							if(terOpcion==1){//.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-Buscar Visitante por nombre
								System.out.println("Escribe el nombre del visitante que deseas Buscar: ");
						 		String vis = teclado.lecturaPalabra();
						 		operV.busquedaNombre(listaVisitantes,vis);
							}else if(terOpcion==2) {//.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-Buscar Visitante por ID
								System.out.println("Escribe el numero ID del visitante a eiminar: ");
						 		String vis = teclado.lecturaPalabra();
						 		operV.buscarID(listaVisitantes,vis);
							}
					 				   }while(terOpcion!=3);
				 	}
			    
			    }while(terOpcion!=3);
		    	
		    }else if (opcion==4){//.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-Actualizar (lo voy a hacer como si fue un registro de nuevo)
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
											System.out.println("Escribe El NOMBRE DE LA PERSONA A LA QUE LE VAS A ACTUALIZAR SUS DATOS: ");
									 		String alu = teclado.lecturaPalabra();
									 		oper.eliminarNombre(listaAlumnos, alu);
									 		registroAlumnos();
									 		
										}else if(subParaAlumno==2){//.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-Ayudantes 
											System.out.println("Escribe El NOMBRE DE LA PERSONA A LA QUE LE VAS A ACTUALIZAR SUS DATOS: ");
									 		String alu = teclado.lecturaPalabra();
									 		oper.eliminarNombre(listaAlumnos, alu);
									 		registroAlumnosQueSonAyudantes();									
										}							
					
					}else if(subOpcion==2){
						subMenuEmpleado();
						System.out.println("Introduce la opcion: ");
						subParaEmpelados = teclado.lecturaEntero();
						System.out.println("Opcion seleccionada : " + subParaEmpelados );
									if(subParaEmpelados==1) {//.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-Empleado son profesores 
										System.out.println("Escribe El NOMBRE DE LA PERSONA A LA QUE LE VAS A ACTUALIZAR SUS DATOS: ");
								 		String alu = teclado.lecturaPalabra();
								 		operE.eliminarNombre(listaEmpleados, alu);
										registroEmpeladosQueSonProfesores();											
									}else if(subParaEmpelados==2){//.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-Empleadoque son jefes  
										System.out.println("Escribe El NOMBRE DE LA PERSONA A LA QUE LE VAS A ACTUALIZAR SUS DATOS: ");
								 		String alu = teclado.lecturaPalabra();
								 		operE.eliminarNombre(listaEmpleados, alu);
										registroEmpeladosQueSonJefes();										
									}else if(subParaEmpelados==3){//.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-Empleads que son coordinadores
										System.out.println("Escribe El NOMBRE DE LA PERSONA A LA QUE LE VAS A ACTUALIZAR SUS DATOS: ");
								 		String alu = teclado.lecturaPalabra();
								 		operE.eliminarNombre(listaEmpleados, alu);
										registroEmpeladosQueSonCoordinadores();	
									}else if(subParaEmpelados==4){//.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-Empelados que son asistentes   
										System.out.println("Escribe El NOMBRE DE LA PERSONA A LA QUE LE VAS A ACTUALIZAR SUS DATOS: ");
								 		String alu = teclado.lecturaPalabra();
								 		operE.eliminarNombre(listaEmpleados, alu);
										registroEmpeladosQueSonAsistente();	
									}
									
					}else if(subOpcion==3){
											
					}
		 		}while(subOpcion!=4);
		    	
		    }else if (opcion==5){//.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-Imprimir   
		    	do{
			 		queListaQUieres();
			 		System.out.println("Introduce la opcion De la lista que quieres imprimir: ");
					subOpcion = teclado.lecturaEntero();
					System.out.println("Opcion seleccionada : " + subOpcion );
					
					if(subOpcion==1){//.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-imprimir lista de alumnos
							oper.imprimeLista(listaAlumnos);
							
					}else if(subOpcion==2){
							operE.imprimeLista(listaEmpleados);
						
					}else if(subOpcion==3){
							operV.imprimeLista(listaVisitantes);
							
					}
		 		}while(subOpcion!=4);
		    }else if (opcion==6){//.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-Cargar archivos   
		    }else if (opcion==7){//.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-Guardar archivos   
		    }else if (opcion==8){//.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-Guardar y salir
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
public void queListaQUieres(){
	System.out.println("LISTAS A IMPRIMIR");
	System.out.println("1. Alumno");
	System.out.println("2. Empleado");
	System.out.println("3. Visitante");
	System.out.println("4. Regresar");
}




}