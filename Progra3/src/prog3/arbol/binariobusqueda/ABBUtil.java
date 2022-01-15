package prog3.arbol.binariobusqueda;

import prog3.listagenerica.ListaGenericaEnlazada;

public class ABBUtil<T> {
	public ListaGenericaEnlazada<Integer> menoresOredenados (ArbolBinarioDeBusqueda<Integer> abb, int x){
		ListaGenericaEnlazada<Integer> lisOrdenada = new ListaGenericaEnlazada<Integer>();
		encontrarMenores(abb, lisOrdenada, x);
		return lisOrdenada;
	}
	
	private void encontrarMenores (ArbolBinarioDeBusqueda<Integer> abb, ListaGenericaEnlazada<Integer> lis, int x){
		if (abb.getDatoRaiz() <= x)
			lis.agregarFinal(abb.getDatoRaiz());
		if (!abb.getHijoIzquierdo().esVacio() && x <= abb.getDatoRaiz())
			encontrarMenores(abb.getHijoIzquierdo(), lis, x);
		if (!abb.getHijoDerecho().esVacio() && x <= abb.getDatoRaiz())
			encontrarMenores(abb.getHijoDerecho(), lis, x);
	}
	
	public ListaGenericaEnlazada<ListaGenericaEnlazada<T>> sumaCaminos (ArbolBinarioDeBusqueda<Integer> abb, int x){
		ListaGenericaEnlazada<ListaGenericaEnlazada<T>> lisCaminos = new ListaGenericaEnlazada<ListaGenericaEnlazada<T>>();
		int suma = 0;
		encontrarCaminos(abb, lisCaminos, x, suma);
		return lisCaminos;
	}
	
	private void encontrarCaminos  (ArbolBinarioDeBusqueda<Integer> abb, ListaGenericaEnlazada<ListaGenericaEnlazada<T>> lis, int x, int suma) {
		
		suma += abb.getDatoRaiz();
		if (!abb.getHijoIzquierdo().esVacio() && x <= abb.getDatoRaiz()){
			encontrarCaminos(abb.getHijoIzquierdo(), lis, x, suma);
		}
		if (!abb.getHijoDerecho().esVacio() && x <= abb.getDatoRaiz()){
			encontrarCaminos(abb.getHijoDerecho(), lis, x, suma);
		}
		
	}
}
