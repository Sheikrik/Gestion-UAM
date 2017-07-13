package operaciones;

import java.util.List;

public abstract class Operaciones<E> {
	
	public void registrar(List<E> lista,E elemento){
		lista.add(elemento);
		System.out.println("Elemento registrado");
	}
}
