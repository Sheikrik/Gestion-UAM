package gestionUAM;

import java.lang.reflect.InvocationTargetException;

import operaciones.Menu;

public class Sistema {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Menu men = new Menu();
		
		men.menu();
	}

}
