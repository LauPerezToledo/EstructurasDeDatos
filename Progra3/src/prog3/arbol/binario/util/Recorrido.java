package prog3.arbol.binario.util;

import prog3.arbol.binario.ArbolBinario;
import prog3.util.ColaGenerica;

public class Recorrido<T> {
	
	// 4 TIPOS DE RECORRIDOS PREORDER, INORDER, POSTORDER Y POR NIVELES
	
	/* PREORDER 
	 * Se procesa primero la raíz, luego hijo izquierdo y por último el derecho
	 * */
	public void imprimirPreOrder(ArbolBinario<T> aBinario) {
		System.out.println(aBinario.getDatoRaiz());
		if (!aBinario.getHijoIzquierdo().esVacio())
			imprimirPreOrder(aBinario.getHijoIzquierdo());
		if (!aBinario.getHijoDerecho().esVacio())
			imprimirPreOrder(aBinario.getHijoDerecho());
	}

	/* INORDER 
	 * Se procesa el hijo izquierdo, luego la raíz y último el hijo derecho.
	 * */
	public void imprimirInOrder(ArbolBinario<T> aBinario) {
		if (!aBinario.getHijoIzquierdo().esVacio())
			imprimirPreOrder(aBinario.getHijoIzquierdo());
		System.out.println(aBinario.getDatoRaiz());
		if (!aBinario.getHijoDerecho().esVacio())
			imprimirPreOrder(aBinario.getHijoDerecho());
	}

	/* POSTORDER 
	 * Se procesan primero los hijos, izquierdo y derecho, útima la raíz
	 * */
	public void imprimirPostOrder(ArbolBinario<T> aBinario) {
		if (!aBinario.getHijoIzquierdo().esVacio())
			imprimirPreOrder(aBinario.getHijoIzquierdo());
		if (!aBinario.getHijoDerecho().esVacio())
			imprimirPreOrder(aBinario.getHijoDerecho());
		System.out.println(aBinario.getDatoRaiz());
	}
	
	/* POR NIVELES 
	 * Se procesan los nodos teniendo en cuenta sus niveles, primero la raíz, luego los hijos,
	 * los hijos de éstos, etc.*/
	public void imprimirPorNiveles(ArbolBinario<T> aBinario) {
		ArbolBinario<T> arbol = null;
		ColaGenerica<ArbolBinario<T>> cola = new ColaGenerica<ArbolBinario<T>>();
		cola.encolar(aBinario);
		cola.encolar(null);
		while (!cola.esVacia()) {
			arbol = cola.desencolar();
			if (arbol != null) {
				System.out.println(arbol.getDatoRaiz());
				if (!arbol.getHijoIzquierdo().esVacio()) 
					cola.encolar(arbol.getHijoIzquierdo());
				if (!arbol.getHijoDerecho().esVacio())
					cola.encolar(arbol.getHijoDerecho());
				}
			else
				if (!cola.esVacia()) {
					cola.encolar(null);
			}
		}
	}
	
	// TEST
	public static void main(String[] args){
		ArbolBinario<Integer> arbolBinarioB=new ArbolBinario<Integer>(1);		
		ArbolBinario<Integer> hijoIzquierdoB=new ArbolBinario<Integer>(2);
		hijoIzquierdoB.agregarHijoIzquierdo(new ArbolBinario<Integer>(3));
		hijoIzquierdoB.agregarHijoDerecho(new ArbolBinario<Integer>(4));		
		ArbolBinario<Integer> hijoDerechoB=new ArbolBinario<Integer>(6);
		hijoDerechoB.agregarHijoIzquierdo(new ArbolBinario<Integer>(7));
		hijoDerechoB.agregarHijoDerecho(new ArbolBinario<Integer>(8));		
		arbolBinarioB.agregarHijoIzquierdo(hijoIzquierdoB);
		arbolBinarioB.agregarHijoDerecho(hijoDerechoB);
		
		Recorrido<Integer> recorrido= new Recorrido<Integer>();
		recorrido.imprimirPreOrder(arbolBinarioB);
		recorrido.imprimirInOrder(arbolBinarioB);
		recorrido.imprimirPostOrder(arbolBinarioB);
		recorrido.imprimirPorNiveles(arbolBinarioB);
	}
}
