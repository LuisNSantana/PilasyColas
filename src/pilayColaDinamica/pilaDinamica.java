package pilayColaDinamica;


// TODO: Auto-generated Javadoc
/**
 * The Class pilaDinamica.
 *
 * @param <T> the generic type
 */
public class pilaDinamica<T> {

	/**
	 *  nodo. - Clase 
	 */
	public class nodo{
		
		/**  info. - Atributo generico */
		T info;
		
		/**  sig. - Atributo tipo nodo */
		nodo sig;
		
		/**
		 * Constructor con parametros.
		 *
		 * @param elemento - parametro generico.
		 * @param siguiente - parametro de nodo
		 */
		public nodo (T elemento, nodo siguiente) {
			
			info = elemento;
			sig = siguiente;
		}
	}
	
	/** inicio. - Atributo de nodo */
	/* declarando el inicio de la fila */
	private nodo inicio;
	
	/**
	 * Constructor Vacio
	 */
	public pilaDinamica() {
		inicio = null;
		
	}
	
	/**
	 * Es vacia - Metodo que comprueba si esta vacia la lista
	 *
	 * @return true, if successful
	 */
	public boolean esVacia() {
		return inicio == null;
	}
	
	/**
	 * Longitud - Metdo para saber el tamaño del nodo
	 *
	 * @return the int
	 */
	public int longitud () {
		int cont = 0;
		nodo aux = inicio;
		while (aux != null) {
			aux = aux.sig;
			cont++;
		}
		return cont;	
	}
	
	/**
	 * Inicio - Metodo donde inicia el nodo
	 *
	 * @return the t
	 */
	public T inicio() {
		return inicio.info;
	}
	
	/**
	 * Insertar. - Metodo para insertal elementos
	 *
	 * @param elem - Atributo generico para que se utilizara en el metodo
	 */
	public void insertar (T elem) {
		nodo aux1 = new nodo (elem, inicio); 
		inicio= aux1;
		
	}
	
	/**
	 * Extraer. - Metodo para extraer elementos
	 */
	public void extraer () {
		inicio = inicio.sig;
	}
	
	/**
	 * Vaciar. - Metodo para vaciar la pila
	 */
	public void vaciar() {
		inicio = null;
	}
}
