package prog3.arbol.binario;

import prog3.listagenerica.ListaGenerica;
import prog3.listagenerica.ListaGenericaEnlazada;
import prog3.util.Cola;

public class ArbolBinario<T> {

	private NodoBinario<T> raiz;
	
	
	public ArbolBinario(){		
		this.raiz = null;
	}
	
	public ArbolBinario(T dato){		
		this.raiz = new NodoBinario<T>(dato);
	}	
	
	private ArbolBinario(NodoBinario<T> nodo){		
		this.raiz = nodo;
	}
	
	private NodoBinario<T> getRaiz(){		
		return raiz;
	}
	
	public T getDatoRaiz(){
		if (this.getRaiz() != null){
			return this.getRaiz().getDato();
		}else{
			return null;
		}
	}
	
	public ArbolBinario<T> getHijoIzquierdo(){		
		return new ArbolBinario<T>(this.raiz.getHijoIzquierdo());
	}
	
	public ArbolBinario<T> getHijoDerecho(){		
		return new ArbolBinario<T>(this.raiz.getHijoDerecho());
	}	
	
	public void agregarHijoIzquierdo(ArbolBinario<T> hijo){		
		this.raiz.setHijoIzquierdo(hijo.getRaiz());
	}

	public void agregarHijoDerecho(ArbolBinario<T> hijo){		
		this.raiz.setHijoDerecho(hijo.getRaiz());
	}	
	
	public void eliminarHijoIzquierdo(){		
		this.raiz.setHijoIzquierdo(new NodoBinario<T>(null));
	}
	
	public void eliminarHijoDerecho(){		
		this.raiz.setHijoDerecho(new NodoBinario<T>(null));
	}	
	
	public boolean esVacio(){
		return this.raiz==null;
	}
	
	public boolean esHoja(){
		return this.getDatoRaiz()!=null && this.getHijoIzquierdo().esVacio() && this.getHijoDerecho().esVacio();
	}
	
	/* FRONTERA
	 * Son las hojas de un Árbol Binario recorridas de izquierda a derecha */
	
	
	public ListaGenerica<T> frontera() {
		ListaGenericaEnlazada<T> l = new ListaGenericaEnlazada<T>();
		this.preordenFrontera(l, this);
		return l;
	}
		
	private void preordenFrontera(ListaGenerica<T> l, ArbolBinario<T> ab) {
		if (ab.esHoja()) {
			l.agregarFinal(ab.getDatoRaiz());
		}
		if (!ab.getHijoIzquierdo().esVacio()) {
			ab.getHijoIzquierdo().preordenFrontera(l, ab.getHijoIzquierdo());
		}
		if (!ab.getHijoDerecho().esVacio()) {
			ab.getHijoDerecho().preordenFrontera(l, ab.getHijoDerecho());
		}
	}
	

	
	/* LLENO
	 * 1) cada nodo interno tiene grado 2
	 * 2 )todas las hojas estan el mismo nivel
	 */

	
	public boolean lleno() {
		ArbolBinario<T> arbol = null;
		Cola<ArbolBinario<T>> cola = new Cola<ArbolBinario<T>>();
		boolean lleno = true;
		cola.encolar(this);
		int cant_nodos = 0;
		cola.encolar(null);
		int nivel= 0;
		while (!cola.esVacia() && lleno) {
			arbol = cola.desencolar();
			if (arbol != null) {
				if (!arbol.getHijoIzquierdo().esVacio()) {
					cola.encolar(arbol.getHijoIzquierdo());
					cant_nodos++;
				}
				if (!(arbol.getHijoDerecho().esVacio())) {
					cola.encolar(arbol.getHijoDerecho());
					cant_nodos++;
				}
		} else 
			if (!cola.esVacia()) {
				if (cant_nodos == Math.pow(2, ++nivel)){
					cola.encolar(null);
					cant_nodos=0;
				}
				else 
					if (cola.esVacia())
					lleno=false;}
		}
		return lleno;
	}
	
	public boolean completo() {
		//Falta implementar. 
		return true;

	}
	
	
}