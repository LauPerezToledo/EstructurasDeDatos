package prog3.listagenerica;

/**ListaGenerica es una clase abstracta que define los m�todos que deber�n
 * implementar todas aquellas clases que quieran representar una colecci�n de elementos T, 
 * extendiendo esta clase */

public abstract class ListaGenerica<T> {

	public abstract void comenzar();
	/**Permite posicionarse al principio de la lista. */

	public abstract T proximo();
	/**Permite avanzar al proximo elemento de lista. */

	public abstract boolean fin();
	/**Devuelve true si nos encontramos en el �ltimo elemento de la lista, false en caso contrario */

	public abstract T elemento(int pos);
	/**Devuelve el elemento que se encuentra en la posici�n pos. 
	 * Hay que recordar que la lista empieza en la posicion 0.
	 *
	 * @param pos
	 *            Posicion del elemento que se va a recuperar. */

	public abstract boolean agregarEn(T elem, int pos);
	/**Agrega un elemento en la posici�n pos indicada. Si hubiera un elemento en
	 * dicha posicion, el mismo se reubicar� a continuaci�n del elemento que
	 * vamos a agregar. Si pudo eliminarlo devuelve true, false en caso contrario.
	 * 
	 * @param elem
	 *            Elemento a agregar.
	 * @param pos
	 *            Posici�n donde deber� agregarse el elemento. */

	public abstract boolean agregarInicio(T elem);
	/**Agrega un elemento al principio de la lista. Si pudo agregarlo devuelve true, false en caso contrario.
	 * 
	 * @param elem
	 *            Elemento a agregar. */

	public abstract boolean agregarFinal(T elem);
	/**Agrega un elemento al final de la lista. Si pudo agregarlo devuelve true, false en caso contrario.
	 * 
	 * @param elem
	 *            Elemento a agregar. */

	public abstract boolean eliminar(T elem);
	/**Elimina la primer ocurrencia del elemento elem indicado. Si pudo eliminarlo devuelve true, 
	 * false en caso contrario.
	 * 
	 * @param elem
	 *            Elemento a eliminar. */

	public abstract boolean eliminarEn(int pos);
	/**Elimina el elemento ubicado en la posicion pos. Si pudo eliminarlo devuelve true,
	 *  false en caso contrario.
	 * 
	 * @param pos
	 *            Posici�n del elemento a eliminar. */

	public abstract boolean incluye(T elem);
	/**Devuleve true si la lista contiene al elemento elem, false en caso contrario
	 * 
	 * @param elem
	 *            elemento a buscar en la lista */

	public abstract boolean esVacia();
	/**Devuelve true si la lista no contiene elemntos, false en caso contrario. */

	public abstract int tamanio();
	/**Devuelve un n�mero que representa la cantidad de elementos que contiene la lista. */

}
