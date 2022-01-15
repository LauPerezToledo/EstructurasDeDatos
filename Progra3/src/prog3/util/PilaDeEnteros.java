package prog3.util;

import prog3.listaenteros.ListaDeEnterosEnlazada;

public class PilaDeEnteros {

	private ListaDeEnterosEnlazada datos = new ListaDeEnterosEnlazada();

	public PilaDeEnteros() {

	}

	public void apilar(int elem) {
		datos.agregarEn(elem, 1);
	}

	public int desapilar() {
		int x = datos.elemento(1);
		datos.eliminarEn(1);
		return x;
	}

	public int tope() {
		return datos.elemento(1);
	}

	public boolean esVacia() {
		return datos.tamanio() == 0;
	}

}
