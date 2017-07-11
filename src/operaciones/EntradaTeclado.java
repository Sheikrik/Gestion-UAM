package operaciones;

import java.util.Scanner;

public class EntradaTeclado {
	private Scanner scanner;

	public int lecturaEntero(){
		scanner = new Scanner(System.in);
		int numero = scanner.nextInt();
        
        return numero;
	}
	
	public String lecturaPalabra(){
		scanner = new Scanner(System.in);
        String numero = scanner.nextLine();
        
        return numero;
	}
}
