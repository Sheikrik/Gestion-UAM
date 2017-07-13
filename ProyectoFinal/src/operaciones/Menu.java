package operaciones;

import java.util.LinkedList;
import java.util.List;
import modeloPersona.Alumno;
import modeloPersona.Asistente;
import modeloPersona.Ayudante;
import modeloPersona.Coordinador;
import modeloPersona.Jefe;
import modeloPersona.Visitante;

public class Menu {
	int opcion,subOpcion,terOpcion;
	
	List <Alumno> listaAlumnos = new LinkedList<Alumno>();
	List <Ayudante> listaAyudantes = new LinkedList<Ayudante>();
	List <Asistente> listaAsistentes = new LinkedList<Asistente>();
	List <Coordinador> listaCoordinadores = new LinkedList<Coordinador>();
	List <Jefe> listaJefes = new LinkedList<Jefe>();
	List <Visitante> listaVisitantes = new LinkedList<Visitante>();
	
	PersistenciaLista<Alumno> perAl = new PersistenciaLista<Alumno>();
	PersistenciaLista<Ayudante> perAy = new PersistenciaLista<Ayudante>();
	PersistenciaLista<Asistente> perAs = new PersistenciaLista<Asistente>();
	PersistenciaLista<Coordinador> perC = new PersistenciaLista<Coordinador>();
	PersistenciaLista<Jefe> perJ = new PersistenciaLista<Jefe>();
	PersistenciaLista<Visitante> perV = new PersistenciaLista<Visitante>();
	
	OperacionesAlumno operAl = new OperacionesAlumno();
	OperacionesAyudante operAy = new OperacionesAyudante();
	OperacionesAsistente operAs = new OperacionesAsistente();
	OperacionesCoordinador operC = new OperacionesCoordinador();
	OperacionesJefe operJ = new OperacionesJefe();
	OperacionesVisitante operV = new OperacionesVisitante();
	
	EntradaTeclado teclado = new EntradaTeclado();
	
	public void menu(){
		do {
			opciones();
			//REGISTRO
			if( opcion == 1 ){
		 		registrar();
		 	//ELIMINAR
		    }else if (opcion==2){
		    	eliminar();
		    //BUSCAR
		    }else if (opcion==3){
		    	buscar();
		    //ACTUALIZAR
		    }else if (opcion==4){
		 		actualizar();
		 	//IMPRIMIR
		    }else if (opcion==5){  
		    	imprimir();
		    //CARGAR ARCHIVOS
		    }else if (opcion==6){
		    	cargarArchivo();
		    //GUARDAR ARCHIVOS
		    }else if (opcion==7){
		    	guardarArchivo();
		    //GUARDAR Y SALIR
		    }else if (opcion==8){
		    	guardarArchivo();
		    }else{
		    	System.out.println("Opcion invalida!!!");
		    }
		}while(opcion!=8);
	}
	
	private void opciones(){
		System.out.println("Menu de opciones" +
							"\n1. Registro" +
							"\n2. Eliminacion" +
							"\n3. Busqueda" +
							"\n4. Actualizacion" +
							"\n5. Impresion" +
							"\n6. Cargar archivo" +
							"\n7. Guardar archivo" +
							"\n8. Guardar y salir");
		System.out.println("Introduce la opcion: ");
		opcion = teclado.lecturaEntero();
		System.out.println("Opcion seleccionada : " + opcion );
	}
	
	private void subOpciones(){
		System.out.println("Elija una opcion" +
							"\n1. Alumno" +
							"\n2. Ayudante" +
							"\n3. Asistente" +
							"\n4. Coordinador" +
							"\n5. Jefe" +
							"\n6. Visitante" +
							"\n7. Regresar");
		System.out.println("Introduce la opcion: ");
		subOpcion = teclado.lecturaEntero();
		System.out.println("Opcion seleccionada : " + subOpcion );
	}
	
	private void registroAlumnos() {
		
		Alumno nuevo = new Alumno();
		
    	System.out.println("Registro de un nuevo Alumno");
    	System.out.println("Introduce el Nombre ");
    	nuevo.setNombre(teclado.lecturaPalabra());
    	System.out.println("Introduce el genero ");
    	nuevo.setGenero(teclado.lecturaPalabra());
    	System.out.println("Introduce el Edad ");
    	nuevo.setEdad(teclado.lecturaEntero());
    	System.out.println("Introduce la matricula");
    	nuevo.setMatricula(teclado.lecturaPalabra());
    	System.out.println("Introduce el Carrera ");
    	nuevo.setCarrera(teclado.lecturaPalabra());
       
       operAl.registrar(listaAlumnos,nuevo);
		
	}
	private void registroAyudantes(){
	
		Ayudante nuevo = new Ayudante(); 
		
		System.out.println("Registro de un nuevo Ayudante");
		System.out.println("Introduce el Nombre ");
		nuevo.setNombre(teclado.lecturaPalabra());
		System.out.println("Introduce el genero ");
		nuevo.setGenero(teclado.lecturaPalabra());
		System.out.println("Introduce el Edad ");
		nuevo.setEdad(teclado.lecturaEntero());
		System.out.println("Introduce la matricula");
		nuevo.setMatricula(teclado.lecturaPalabra());
		System.out.println("Introduce el Carrera ");
		nuevo.setCarrera(teclado.lecturaPalabra());
		System.out.println("Introduce el Numero esconomico: ");
		nuevo.setNumEco(teclado.lecturaPalabra());
		
		operAy.registrar(listaAyudantes,nuevo); 
	}

	private void registroJefes(){
	
		Jefe nuevo = new Jefe();
		
		System.out.println("Registro de un nuevo Jefe");
		System.out.println("Introduce el Nombre: ");
		nuevo.setNombre(teclado.lecturaPalabra());
		System.out.println("Introduce el Genero: ");
		nuevo.setGenero(teclado.lecturaPalabra());
		System.out.println("Introduce el Edad: ");
		nuevo.setEdad(teclado.lecturaEntero());
		System.out.println("Introduce el Numero Economico: ");
		nuevo.setNumEco(teclado.lecturaPalabra());
		System.out.println("Introduce el Grado Academico: ");
		nuevo.setGradAcademico(teclado.lecturaPalabra());
		System.out.println("Introduce el Cargo: ");
		nuevo.setCargo(teclado.lecturaPalabra());
		
		operJ.registrar(listaJefes,nuevo);
	}

	private void registroCoordinadores(){ 
	
		Coordinador nuevo = new Coordinador();
		
		System.out.println("Registro de un nuevo Coordinador");
		System.out.println("Introduce el Nombre: ");
		nuevo.setNombre(teclado.lecturaPalabra());
		System.out.println("Introduce el Genero: ");
		nuevo.setGenero(teclado.lecturaPalabra());
		System.out.println("Introduce el Edad: ");
		nuevo.setEdad(teclado.lecturaEntero());
		System.out.println("Introduce el Numero Economico: ");
		nuevo.setNumEco(teclado.lecturaPalabra());
		System.out.println("Introduce el Grado Academico: ");
		nuevo.setGradAcademico(teclado.lecturaPalabra());
		System.out.println("Introduce el Area que coordina: ");
		nuevo.setArea(teclado.lecturaPalabra());
		
		operC.registrar(listaCoordinadores,nuevo);
		
	}

	private void registroAsistente(){
		
		Asistente nuevo = new Asistente();
		
		System.out.println("Registro de un nuevo Asistente");
		System.out.println("Introduce el Nombre: ");
		nuevo.setNombre(teclado.lecturaPalabra());
		System.out.println("Introduce el Genero: ");
		nuevo.setGenero(teclado.lecturaPalabra());
		System.out.println("Introduce el Edad: ");
		nuevo.setEdad(teclado.lecturaEntero());
		System.out.println("Introduce el Numero Economico: ");
		nuevo.setNumEco(teclado.lecturaPalabra());
		System.out.println("Es de confianza? true/false : ");
		nuevo.setConfianza(teclado.lecturaboleano());
		
		operAs.registrar(listaAsistentes,nuevo);
		
	}

	private void registroVisitantes() {
		
		Visitante nuevo = new Visitante();
		
		System.out.println("Registro de un nuevo Visitante");
		nuevo.setId(teclado.lecturaPalabra());
		System.out.println("Introduce el Nombre: ");
		nuevo.setNombre(teclado.lecturaPalabra());
		System.out.println("Introduce el Genero: ");
		nuevo.setGenero(teclado.lecturaPalabra());
		System.out.println("Introduce el Edad: ");
		nuevo.setEdad(teclado.lecturaEntero());
		System.out.println("Introduce El ID: ");
		nuevo.setId(teclado.lecturaPalabra());
		
		operV.registrar(listaVisitantes, nuevo);
	
	}
	
	private void guardarArchivo(){
		do{
    		subOpciones();
    		if(subOpcion==1){
    			perAl.listaSerializada(listaAlumnos,"Alumnos.ser");
			}else if(subOpcion==2){
    			perAy.listaSerializada(listaAyudantes,"Ayudantes.ser");
			}else if(subOpcion==3){
    			perAs.listaSerializada(listaAsistentes,"Asistentes.ser");
			}else if(subOpcion==4){
    			perC.listaSerializada(listaCoordinadores,"Coordinadores.ser");
			}else if(subOpcion==5){
    			perJ.listaSerializada(listaJefes,"Jefes.ser");
			}else if(subOpcion==6){
    			perV.listaSerializada(listaVisitantes,"Visitantes.ser");
			}else if(subOpcion==7){
				System.out.println("Regresando...");					
			}else{
		    	System.out.println("Opcion invalida!!!");
		    }
 		}while(subOpcion!=7);
	}
	
	private void cargarArchivo(){
		do{
    		subOpciones();
    		if(subOpcion==1){
    			operAl.imprimeLista(perAl.listaDeserializada("Alumnos.ser"));
			}else if(subOpcion==2){
				operAy.imprimeLista(perAy.listaDeserializada("Ayudantes.ser"));
			}else if(subOpcion==3){
				operAs.imprimeLista(perAs.listaDeserializada("Asistentes.ser"));
			}else if(subOpcion==4){
				operC.imprimeLista(perC.listaDeserializada("Coordinadores.ser"));
			}else if(subOpcion==5){
				operJ.imprimeLista(perJ.listaDeserializada("Jefes.ser"));
			}else if(subOpcion==6){
				operV.imprimeLista(perV.listaDeserializada("Visitantes.ser"));
			}else if(subOpcion==7){
				System.out.println("Regresando...");					
			}else{
		    	System.out.println("Opcion invalida!!!");
		    }
 		}while(subOpcion!=7);
	}
	
	private void imprimir(){
		do{
    		subOpciones();
    		if(subOpcion==1){
    			operAl.imprimeLista(listaAlumnos);
			}else if(subOpcion==2){
		 		operAy.imprimeLista(listaAyudantes);
			}else if(subOpcion==3){
		 		operAs.imprimeLista(listaAsistentes);
			}else if(subOpcion==4){
		 		operC.imprimeLista(listaCoordinadores);
			}else if(subOpcion==5){
		 		operJ.imprimeLista(listaJefes);
			}else if(subOpcion==6){
		 		operV.imprimeLista(listaVisitantes);
			}else if(subOpcion==7){
				System.out.println("Regresando...");					
			}else{
		    	System.out.println("Opcion invalida!!!");
		    }
 		}while(subOpcion!=7);
	}
	
	private void actualizar(){
		do{
	 		subOpciones();
			if(subOpcion==1){
				System.out.println("Escribe el nombre del alumno que actualizaras: ");
		 		String alu = teclado.lecturaPalabra();
		 		operAl.eliminarPorNombre(listaAlumnos,alu);
		 		registroAlumnos();
			}else if(subOpcion==2){
				System.out.println("Escribe el nombre del ayudante que actualizaras: ");
		 		String ayu = teclado.lecturaPalabra();
		 		operAy.eliminarPorNombre(listaAyudantes,ayu);
				registroAyudantes();
			}else if(subOpcion==3){
				System.out.println("Escribe el nombre del asistente que actualizaras: ");
		 		String asis = teclado.lecturaPalabra();
		 		operAs.eliminarPorNombre(listaAsistentes,asis);
				registroAsistente();
			}else if(subOpcion==4){
				System.out.println("Escribe el nombre del coordinador que actualizaras: ");
		 		String coor = teclado.lecturaPalabra();
		 		operC.eliminarPorNombre(listaCoordinadores,coor);
				registroCoordinadores();
			}else if(subOpcion==5){
				System.out.println("Escribe el nombre del jefe que actualizaras: ");
		 		String jefe = teclado.lecturaPalabra();
		 		operJ.eliminarPorNombre(listaJefes,jefe);
				registroJefes();
			}else if(subOpcion==6){
				System.out.println("Escribe el nombre del visitante que actualizaras: ");
		 		String vis = teclado.lecturaPalabra();
		 		operV.eliminarPorNombre(listaVisitantes,vis);
				registroVisitantes();						
			}else if(subOpcion==7){
				System.out.println("Regresando...");					
			}else{
		    	System.out.println("Opcion invalida!!!");
		    }
 		}while(subOpcion!=7);
	}
	
	private void buscar(){
		do {
	    	subOpciones();
		 	if(subOpcion==1){
		 		do{
			 		menuPersona("Buscar");
					System.out.println("2. Matricula" +
										"\n3. Regresar");
					eleccion();
					
					if(terOpcion==1){
						System.out.println("Escribe el nombre del alumno a buscar: ");
				 		String alu = teclado.lecturaPalabra();
				 		operAl.buscarPorNombre(listaAlumnos,alu);
					}else if(terOpcion==2) {
						System.out.println("Escribe la matricula del alumno a buscar: ");
				 		String alu = teclado.lecturaPalabra();
				 		operAl.buscarPorMatricula(listaAlumnos,alu);					
					}else if(terOpcion==3) {
						System.out.println("Regresando...");
					}else{
				    	System.out.println("Opcion invalida!!!");
				    }
		 		}while(terOpcion!=3);
		 	}else if (subOpcion==2){
		 		do {
		 			menuPersona("Buscar");
					System.out.println("2. Numero Economico" +
										"\n3. Matricula" +
										"\n4. Regresar");
					eleccion();
					
					if(terOpcion==1){
						System.out.println("Escribe el nombre del ayudante a buscar: ");
				 		String ayu = teclado.lecturaPalabra();
				 		operAy.buscarPorNombre(listaAyudantes,ayu);
					}else if(terOpcion==2) {
						System.out.println("Escribe el numero economico del ayudante a buscar: ");
				 		String ayu = teclado.lecturaPalabra();
				 		operAy.buscarPorNumEco(listaAyudantes,ayu);
					}else if(terOpcion==3) {
						System.out.println("Escribe la matricula del ayudante a buscar: ");
				 		String ayu = teclado.lecturaPalabra();
				 		operAy.buscarPorMatricula(listaAyudantes,ayu);
					}else if(terOpcion==4) {
						System.out.println("Regresando...");
					}else{
				    	System.out.println("Opcion invalida!!!");
				    }
			 	}while(terOpcion!=4);
		 	}else if (subOpcion==3){
		 		do {
		 			menuPersona("Buscar");
					System.out.println("2. Numero Economico" +
										"\n3. Regresar");
					eleccion();
					
					if(terOpcion==1){
						System.out.println("Escribe el nombre del asistente a buscar: ");
				 		String asis = teclado.lecturaPalabra();
				 		operAs.buscarPorNombre(listaAsistentes,asis);
					}else if(terOpcion==2) {
						System.out.println("Escribe el numero economico del asistente a buscar: ");
				 		String asis = teclado.lecturaPalabra();
				 		operAs.buscarPorNumEco(listaAsistentes,asis);
					}else if(terOpcion==3) {
						System.out.println("Regresando...");
					}else{
				    	System.out.println("Opcion invalida!!!");
				    }
			 	}while(terOpcion!=3);
		 	}else if (subOpcion==4){
		 		do {
		 			menuPersona("Buscar");
					System.out.println("2. Numero Economico" +
										"\n3. Regresar");
					eleccion();
					
					if(terOpcion==1){
						System.out.println("Escribe el nombre del coordinador a buscar: ");
				 		String coor = teclado.lecturaPalabra();
				 		operC.buscarPorNombre(listaCoordinadores,coor);
					}else if(terOpcion==2) {
						System.out.println("Escribe el numero economico del coordinador a buscar: ");
				 		String coor = teclado.lecturaPalabra();
				 		operC.buscarPorNumEco(listaCoordinadores,coor);
					}else if(terOpcion==3) {
						System.out.println("Regresando...");
					}else{
				    	System.out.println("Opcion invalida!!!");
				    }
			 	}while(terOpcion!=3);
		 	}else if (subOpcion==5){
		 		do {
		 			menuPersona("Buscar");
					System.out.println("2. Numero Economico" +
										"\n3. Regresar");
					eleccion();
					
					if(terOpcion==1){
						System.out.println("Escribe el nombre del jefe a buscar: ");
				 		String jefe = teclado.lecturaPalabra();
				 		operJ.buscarPorNombre(listaJefes,jefe);
					}else if(terOpcion==2) {
						System.out.println("Escribe el numero economico del jefe a buscar: ");
				 		String jefe = teclado.lecturaPalabra();
				 		operJ.buscarPorNumEco(listaJefes,jefe);
					}else if(terOpcion==3) {
						System.out.println("Regresando...");
					}else{
				    	System.out.println("Opcion invalida!!!");
				    }
			 	}while(terOpcion!=3);
		 	}else if (subOpcion==6){
		 		do {
		 			menuPersona("Buscar");
					System.out.println("2. ID" +
										"\n3. Regresar");
					eleccion();
					
					if(terOpcion==1){
						System.out.println("Escribe el nombre del visitante a buscar: ");
				 		String vis = teclado.lecturaPalabra();
				 		operV.buscarPorNombre(listaVisitantes,vis);
					}else if(terOpcion==2) {
						System.out.println("Escribe el numero economico del visitante a buscar: ");
				 		String vis = teclado.lecturaPalabra();
				 		operV.buscarPorID(listaVisitantes,vis);
					}else if(terOpcion==3) {
						System.out.println("Regresando...");
					}else{
				    	System.out.println("Opcion invalida!!!");
				    }
			 	}while(terOpcion!=3);
		 	}else if (subOpcion==7){
		 		System.out.println("Regresando...");
		 	}else{
		    	System.out.println("Opcion invalida!!!");
		    }
    	}while(subOpcion!=7);
	}
	
	private void eliminar(){
		do {
	    	subOpciones();
		 	if(subOpcion==1){
		 		do{
			 		menuPersona("Eliminar");
					System.out.println("2. Matricula" +
										"\n3. Regresar");
					eleccion();
					
					if(terOpcion==1){
						System.out.println("Escribe el nombre del alumno a eliminar: ");
				 		String alu = teclado.lecturaPalabra();
				 		operAl.eliminarPorNombre(listaAlumnos,alu);
					}else if(terOpcion==2) {
						System.out.println("Escribe la matricula del alumno a eliminar: ");
				 		String alu = teclado.lecturaPalabra();
				 		operAl.eliminaPorMatricula(listaAlumnos,alu);					
					}else if(terOpcion==3) {
						System.out.println("Regresando...");
					}else{
				    	System.out.println("Opcion invalida!!!");
				    }
		 		}while(terOpcion!=3);
		 	}else if (subOpcion==2){
		 		do {
		 			menuPersona("Eliminar");
					System.out.println("2. Numero Economico" +
										"\n3. Matricula" +
										"\n4. Regresar");
					eleccion();
					
					if(terOpcion==1){
						System.out.println("Escribe el nombre del ayudante a eliminar: ");
				 		String ayu = teclado.lecturaPalabra();
				 		operAy.eliminarPorNombre(listaAyudantes,ayu);
					}else if(terOpcion==2) {
						System.out.println("Escribe el numero economico del ayudante a eliminar: ");
				 		String ayu = teclado.lecturaPalabra();
				 		operAy.eliminaPorNumeroEconomico(listaAyudantes,ayu);
					}else if(terOpcion==3) {
						System.out.println("Escribe la matricula del ayudante a eliminar: ");
				 		String ayu = teclado.lecturaPalabra();
				 		operAy.eliminaPorMatricula(listaAyudantes,ayu);
					}else if(terOpcion==4) {
						System.out.println("Regresando...");
					}else{
				    	System.out.println("Opcion invalida!!!");
				    }
			 	}while(terOpcion!=4);
		 	}else if (subOpcion==3){
		 		do {
		 			menuPersona("Eliminar");
					System.out.println("2. Numero Economico" +
										"\n3. Regresar");
					eleccion();
					
					if(terOpcion==1){
						System.out.println("Escribe el nombre del asistente a eliminar: ");
				 		String asis = teclado.lecturaPalabra();
				 		operAs.eliminarPorNombre(listaAsistentes,asis);
					}else if(terOpcion==2) {
						System.out.println("Escribe el numero economico del asistente a eliminar: ");
				 		String asis = teclado.lecturaPalabra();
				 		operAs.eliminaPorNumeroEconomico(listaAsistentes,asis);
					}else if(terOpcion==3) {
						System.out.println("Regresando...");
					}else{
				    	System.out.println("Opcion invalida!!!");
				    }
			 	}while(terOpcion!=3);
		 	}else if (subOpcion==4){
		 		do {
		 			menuPersona("Eliminar");
					System.out.println("2. Numero Economico" +
										"\n3. Regresar");
					eleccion();
					
					if(terOpcion==1){
						System.out.println("Escribe el nombre del coordinador a eliminar: ");
				 		String coor = teclado.lecturaPalabra();
				 		operC.eliminarPorNombre(listaCoordinadores,coor);
					}else if(terOpcion==2) {
						System.out.println("Escribe el numero economico del coordinador a eliminar: ");
				 		String coor = teclado.lecturaPalabra();
				 		operC.eliminaPorNumeroEconomico(listaCoordinadores,coor);
					}else if(terOpcion==3) {
						System.out.println("Regresando...");
					}else{
				    	System.out.println("Opcion invalida!!!");
				    }
			 	}while(terOpcion!=3);
		 	}else if (subOpcion==5){
		 		do {
		 			menuPersona("Eliminar");
					System.out.println("2. Numero Economico" +
										"\n3. Regresar");
					eleccion();
					
					if(terOpcion==1){
						System.out.println("Escribe el nombre del jefe a eliminar: ");
				 		String jefe = teclado.lecturaPalabra();
				 		operJ.eliminarPorNombre(listaJefes,jefe);
					}else if(terOpcion==2) {
						System.out.println("Escribe el numero economico del jefe a eliminar: ");
				 		String jefe = teclado.lecturaPalabra();
				 		operJ.eliminaPorNumeroEconomico(listaJefes,jefe);
					}else if(terOpcion==3) {
						System.out.println("Regresando...");
					}else{
				    	System.out.println("Opcion invalida!!!");
				    }
			 	}while(terOpcion!=3);
		 	}else if (subOpcion==6){
		 		do {
		 			menuPersona("Eliminar");
					System.out.println("2. ID" +
										"\n3. Regresar");
					eleccion();
					
					if(terOpcion==1){
						System.out.println("Escribe el nombre del visitante a eliminar: ");
				 		String vis = teclado.lecturaPalabra();
				 		operV.eliminarPorNombre(listaVisitantes,vis);
					}else if(terOpcion==2) {
						System.out.println("Escribe el numero economico del visitante a eliminar: ");
				 		String vis = teclado.lecturaPalabra();
				 		operV.eliminaPorID(listaVisitantes,vis);
					}else if(terOpcion==3) {
						System.out.println("Regresando...");
					}
			 	}while(terOpcion!=3);
		 	}else if (subOpcion==7){
		 		System.out.println("Regresando...");
		 	}else{
		    	System.out.println("Opcion invalida!!!");
		    }
    	}while(subOpcion!=7);
	}
	
	private void registrar(){
		do{
	 		subOpciones();
			if(subOpcion==1){
				registroAlumnos();
			}else if(subOpcion==2){
				registroAyudantes();
			}else if(subOpcion==3){
				registroAsistente();
			}else if(subOpcion==4){
				registroCoordinadores();
			}else if(subOpcion==5){
				registroJefes();
			}else if(subOpcion==6){
				registroVisitantes();						
			}else if(subOpcion==7){
				System.out.println("Regresando...");					
			}else{
		    	System.out.println("Opcion invalida!!!");
		    }
 		}while(subOpcion!=7);
	}
	
	private void menuPersona(String mensaje){
		System.out.println(mensaje + " por . . . " +
							"\n1. Nombre");
	}
	
	private void eleccion(){
		System.out.println("Introduce la opcion: ");
		terOpcion = teclado.lecturaEntero();
		System.out.println("Opcion seleccionada : " + terOpcion );
	}
}