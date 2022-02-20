package pilayColaDinamica;

// TODO: Auto-generated Javadoc
/**
 * The Class colaDinamica.
 *
 * @param <T> the generic type
 */
public class colaDinamica<T> {
	
	/**
	 * The Class nodo.
	 */
	public class nodo{
		
		/** info. - Atrubuto generico */
		T info;
		
		/** sig. -  Atributo de nodo*/
		nodo sig;
		
		/**
		 * Constructor de nodo con parametros.
		 *
		 * @param elemento - parametro generico
		 * @param siguiente - parametro de nodo
		 */
		public nodo (T elemento, nodo siguiente) {
			info = elemento;
			sig = siguiente;
		}
	}
	
	/** frente. - Atributo de nodo "Incio de la cola" */
	private nodo frente;
	
	/**
	 * Constructor vacio 
	 */
	public colaDinamica() {
		frente = null;
	}
	
	/**
	 * Longitud. - Metodo para saber el tamaño de la cola
	 *
	 * @return cont - Atributo - para saber el tamaño de la cola
	 */
	public int longitud() {
		int cont = 0;
		nodo aux = frente;
		while (aux !=null) {
			aux = aux.sig;
			cont++;
				
		}
		return cont;
	}
	
	/**
	 * Es vacia. - Metodo para saber si esta vacia la cola
	 *
	 * @return true, if successful
	 */
	public boolean esVacia() {
		return frente == null;
	}
	
	/**
	 * Extraer. - Metodo para saber extraer elementos 
	 */
	public void extraer () {
		frente = frente.sig;
	}
	
	/**
	 * Insertar. - Metodo para insertar elementos a la cola
	 *
	 * @param elem - Atributo que se utilizara como elemento.
	 */
	public void insertar (T elem) {
		if (frente == null) {
			frente = new nodo (elem, null);
			
		}else {
			nodo aux = new nodo(elem,null);
			
			nodo ptr = frente;
			
			while (ptr.sig !=null) {
				ptr = ptr.sig;
			}
			ptr.sig = aux;
		}
		
	}

}
