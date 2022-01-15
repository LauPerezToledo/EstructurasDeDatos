package prog3.util;

import prog3.listagenerica.ListaGenericaEnlazada;

public class Cola<T> {
	
private ListaGenericaEnlazada<T> datos = new ListaGenericaEnlazada<T>();
	
	public void encolar (T elem) {
		datos.agregarEn(elem, datos.tamanio());
	}
	
	public T desencolar () {
		T x = datos.elemento(datos.tamanio());
		datos.eliminarEn(datos.tamanio());
		return x;
	}
	
	public T tope () {
		return datos.elemento(1);
	}
	
	public boolean esVacia () {
		return datos.tamanio() == 0;
	}
	
}
