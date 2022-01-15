package prog3.util;

import prog3.listagenerica.ListaGenericaEnlazada;

public class Pila<T> {
	
	private ListaGenericaEnlazada<T> datos = new ListaGenericaEnlazada<T>();
	
	public void apilar (T elem) {
		datos.agregarEn(elem, 1);
	}
	
	public T desapilar () {
		T x = datos.elemento(1);
		datos.eliminarEn(1);
		return x;
	}
	
	public T tope () {
		return datos.elemento(1);
	}
	
	public boolean esVacia () {
		return datos.tamanio() == 0;
	}
	
}
