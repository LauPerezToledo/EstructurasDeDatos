package prog3.listaenteros;

/**ListaDeEnteros es una clase abstracta que define los métodos que deberán
 * implementar todas aquellas clases que quieran representar una coleccion de
 * números enteros, extendiendo esta clase. */

public abstract class ListaDeEnteros {

	public abstract void comenzar();
	/**Permite posicionarse al principio de la lista. */

	public abstract Integer proximo();
	/**Permite avanzar al proximo elemento de lista. */

	public abstract boolean fin();
	/**Devuelve true si nos encontramos en el último elemento de la lista, false
	 * en caso contrario. */

	public abstract Integer elemento(int pos);
	/**Devuelve el elemento que se encuentra en la posición pos. 
	 * Hay que recordar que la lista empieza en la posicion 0.
	 * 
	 * @param pos
	 *            Posición del elemento que se va a recuperar. */

	public abstract boolean agregarEn(Integer elem, int pos);
	/**Agrega un elemento en la posicion pos indicada. Si hubiera un elemento en
	 * dicha posición se reubicará a continuación del elemento que
	 * vamos a agregar. Si pudo eliminarlo devuelve true, false en caso contrario.
	 * 
	 * @param elem
	 *            elemento a agregar
	 * @param pos
	 *            Posición donde deberá agregarse el elemento. */

	public abstract boolean agregarInicio(Integer elem);
	/**Agrega un elemento al principio de la lista. Si pudo agregarlo devuelve true, false en caso contrario.
	 * 
	 * @param elem
	 *            Elemento a agregar.*/

	public abstract boolean agregarFinal(Integer elem);
	/**Agrega un elemento al final de la lista. Si pudo agregarlo devuelve true, false en caso contrario.
	 * 
	 * @param elem
	 *            Elemento a agregar. */
	
	public abstract boolean eliminar(Integer elem);
	/**Elimina la primer ocurrencia del elemento elem indicado. Si pudo eliminarlo devuelve true, 
	 * false en caso contrario.
	 * 
	 * @param elem
	 *            Elemento a eliminar. */

	public abstract boolean eliminarEn(int pos);
	/**Elimina el elemento ubicado en la posicion pos. Si pudo eliminarlo devuelve true, 
	 * false en caso contrario.
	 * 
	 * @param pos
	 *            Posición del elemento a eliminar. */

	public abstract boolean incluye(Integer elem);
	/**Devuleve true si la lista contiene al elemento elem, false en caso contrario.	 
	 *  
	 * @param elem
	 *            Elemento a buscar en la lista. */

	public abstract boolean esVacia();
	/**Devuelve true si la lista no contiene elemntos, false en caso contrario. */

	public abstract int tamanio();
	/**Devuelve un numero que representa la cantidad de elementos que contiene la lista. */

}
