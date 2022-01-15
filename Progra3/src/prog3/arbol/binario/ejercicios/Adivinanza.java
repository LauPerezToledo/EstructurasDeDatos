package prog3.arbol.binario.ejercicios;

import prog3.arbol.binario.ArbolBinario;
import prog3.listagenerica.ListaGenericaEnlazada;

/*Se quiere obtener el camino de preguntas/respuestas más largo hasta llegar a una conclusión*/

public class Adivinanza {
	
	public ListaGenericaEnlazada<String> secuenciaConMasPreguntas(ArbolBinario<String> abinario){
		ListaGenericaEnlazada<String> lisFinal = new ListaGenericaEnlazada<String>();
		ListaGenericaEnlazada<String> lisTemp = new ListaGenericaEnlazada<String>();
		this.secuenciaMasLarga(abinario, lisFinal, lisTemp);
		return lisFinal;
		
	}
	
	private void secuenciaMasLarga (ArbolBinario<String> ab, ListaGenericaEnlazada<String> lisFinal, ListaGenericaEnlazada<String> lisTemp){
		lisTemp.agregarFinal(ab.getDatoRaiz());
		if (ab.esHoja())
			if (lisTemp.tamanio() > lisFinal.tamanio())
				copiarLista(lisTemp, lisFinal);
			else {
				if (!ab.getHijoIzquierdo().esVacio()){
					lisTemp.agregarFinal("SI");
					this.secuenciaMasLarga(ab.getHijoIzquierdo(), lisFinal, lisTemp);
					lisTemp.eliminarEn(lisTemp.tamanio() -1);
				}
				if (!ab.getHijoDerecho().esVacio())
					lisTemp.agregarFinal("NO");
					this.secuenciaMasLarga(ab.getHijoDerecho(), lisFinal, lisTemp );
					lisTemp.eliminarEn(lisTemp.tamanio() -1);
			}
		lisTemp.eliminarEn(lisTemp.tamanio() -1);
}

	private void copiarLista (ListaGenericaEnlazada<String> lisTemp, ListaGenericaEnlazada<String> lisFinal){
		int i, j;
		for (i = 0; i <= lisFinal.tamanio(); i++)
			lisFinal.eliminarEn(0);
		for (j = 0; j < lisTemp.tamanio(); j++)
			lisFinal.agregarFinal(lisTemp.elemento(j));
	}	
	
	public ListaGenericaEnlazada<String> secuenciaConMasPreguntas2 (ArbolBinario<String> abinario){
		ListaGenericaEnlazada<String> lisFinal = new ListaGenericaEnlazada<String>();
		ListaGenericaEnlazada<String> lisTemp = new ListaGenericaEnlazada<String>();
		this.secuenciaMasLarga2(abinario, lisFinal, lisTemp);
		return lisFinal;
		
	}
	
	private void secuenciaMasLarga2 (ArbolBinario<String> ab, ListaGenericaEnlazada<String> lisFinal, ListaGenericaEnlazada<String> lisTemp){
		lisTemp.agregarFinal(ab.getDatoRaiz());
		if (ab.esHoja())
			if (lisTemp.tamanio() > lisFinal.tamanio())
				copiarLista(lisTemp, lisFinal);
			else {
				if (!ab.getHijoIzquierdo().esVacio()){
					lisTemp.agregarFinal("SI");
					this.secuenciaMasLarga(ab.getHijoIzquierdo(), lisFinal, lisTemp);
					lisTemp.eliminarEn(lisTemp.tamanio() -1);
				}
				if (!ab.getHijoDerecho().esVacio())
					lisTemp.agregarFinal("NO");
					this.secuenciaMasLarga(ab.getHijoDerecho(), lisFinal, lisTemp );
					lisTemp.eliminarEn(lisTemp.tamanio() -1);
			}
		lisTemp.eliminarEn(lisTemp.tamanio() -1);
	}
}
