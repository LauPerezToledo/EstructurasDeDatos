package prog3.arbol.binario.ejercicios;

import prog3.arbol.binario.ArbolBinario;
import prog3.util.Cola;

public class Sumas {
	
	private int suma = 0;
	public int sumaMaximaVertical (ArbolBinario<Integer> ab){
		suma += ab.getDatoRaiz();
		if (ab.getHijoIzquierdo().getDatoRaiz() > ab.getHijoDerecho().getDatoRaiz()){
			if (!ab.getHijoIzquierdo().esVacio()){
				sumaMaximaVertical(ab.getHijoIzquierdo());
			}
		}
		else
			if (!ab.getHijoDerecho().esVacio()){
				sumaMaximaVertical(ab.getHijoDerecho());
		}
		return suma;
	}
	
	public int sumaMaximHorizontal (ArbolBinario<Integer> ab){
		ArbolBinario<Integer> arbol = null;
		Cola<ArbolBinario<Integer>> cola = new Cola<ArbolBinario<Integer>>();
		int max = -1;
		cola.encolar(ab);
		cola.encolar(null);
		while (!cola.esVacia()) {
			arbol = cola.desencolar();
			if (arbol != null) {
				if (!arbol.getHijoIzquierdo().esVacio()) {
					cola.encolar(arbol.getHijoIzquierdo());
					suma += arbol.getDatoRaiz();
				}
				if (!(arbol.getHijoDerecho().esVacio())) {
					cola.encolar(arbol.getHijoDerecho());
					suma += arbol.getDatoRaiz();
				}
		} else 
			if (!cola.esVacia()) {
				if (suma > max)
					max = suma;
				cola.encolar(null);
				suma=0;
				}
		}
		return max;
	}

}
