package prog3.arbol.general;

import prog3.listagenerica.ListaGenerica;
import prog3.listagenerica.ListaGenericaEnlazada;
import prog3.util.ColaGenerica;

public class ArbolGeneral<T> {

	private NodoGeneral<T> raiz;

	public ArbolGeneral() {

		this.raiz = null;
	}

	public ArbolGeneral(T dato) {

		this.raiz = new NodoGeneral<T>(dato);

	}

	public ArbolGeneral(T dato, ListaGenerica<ArbolGeneral<T>> lista) {

		this(dato);
		ListaGenerica<NodoGeneral<T>> hijos = new ListaGenericaEnlazada<NodoGeneral<T>>();

		lista.comenzar();
		while (!lista.fin()) {
			ArbolGeneral<T> arbolTemp = lista.proximo();
			hijos.agregarFinal(arbolTemp.getRaiz());

		}

		raiz.setListaHijos(hijos);
	}

	private ArbolGeneral(NodoGeneral<T> nodo) {

		this.raiz = nodo;
	}

	private NodoGeneral<T> getRaiz() {

		return this.raiz;
	}

	public T getDatoRaiz() {

		return this.raiz.getDato();
	}

	public ListaGenerica<ArbolGeneral<T>> getHijos() {

		ListaGenerica<ArbolGeneral<T>> lista = new ListaGenericaEnlazada<ArbolGeneral<T>>();
		ListaGenerica<NodoGeneral<T>> hijos = (ListaGenerica<NodoGeneral<T>>) this.getRaiz().getHijos();
		lista.comenzar();
		hijos.comenzar();

		while (!hijos.fin()) {
			lista.agregarFinal(new ArbolGeneral<T>(hijos.proximo()));

		}

		return lista;
	}

	public void agregarHijo(ArbolGeneral<T> unHijo) {

		NodoGeneral<T> hijo = unHijo.getRaiz();
		this.raiz.getHijos().agregarFinal(hijo);
	}

	public void eliminarHijo(ArbolGeneral<T> unHijo) {

		NodoGeneral<T> hijo = unHijo.getRaiz();
		boolean ok = false;

		ListaGenerica<NodoGeneral<T>> listaHijos = (ListaGenerica<NodoGeneral<T>>) this.getRaiz().getHijos();
		listaHijos.comenzar();

		while (!listaHijos.fin() && !ok) {

			NodoGeneral<T> hijoTemp = listaHijos.proximo();
			if (hijoTemp.getDato().equals(hijo.getDato())) {
				ok = listaHijos.eliminar(hijoTemp);

			}
		}

	}
	
	public boolean esHoja (){
		return this.getHijos().esVacia();
	}
	
	public boolean esVacio(){
		return this.raiz == null;
	}

	public Integer altura() {
		if (this.esHoja())
			return 0;
		else {
			int altMax = 0, cont = 0;
			ListaGenerica<ArbolGeneral<T>> hijos = this.getHijos();
			ArbolGeneral<T> unHijo = null;
			hijos.comenzar();
			while (!hijos.esVacia()){
				unHijo = hijos.proximo();
				cont += unHijo.altura();
				if (cont > altMax)
					altMax = cont;
			
			}
			return 1 + altMax;
		}	
	}
	
	public boolean include (T dato) {
		ListaGenerica<ArbolGeneral<T>> hijos = this.getHijos();
		ArbolGeneral<T> unHijo = null;
		hijos.comenzar();
		while (!hijos.esVacia()){
			if (unHijo.getDatoRaiz() == dato)
				return true;	
			unHijo = hijos.proximo();
		}
		return false;
		
	}

	public Integer nivel(T dato) {
		int nivel = 0;
		if (this.getDatoRaiz() == dato)
			return nivel;
		else {
			ColaGenerica<ArbolGeneral<T>> cola = new ColaGenerica<ArbolGeneral<T>>();
			ListaGenerica<ArbolGeneral<T>> hijos = this.getHijos();
			ArbolGeneral<T> unHijo = null;
			ArbolGeneral<T> arbol = null;
			cola.encolar(this);
			cola.encolar(null);
			while (!cola.esVacia()){
				arbol = cola.desencolar();
				if (arbol != null){
					hijos.comenzar();
					while (!hijos.esVacia()){
						unHijo = hijos.proximo();
						cola.encolar(unHijo);
						if (unHijo.getDatoRaiz().equals(dato))
							return nivel;
					}
				}
					else
						if (!cola.esVacia()){
							nivel++;
							cola.encolar(null);
						}	
			}						
		}
		return nivel;
	}

	public Integer ancho() {
		int nodos = 0, maxNodos = -1;
		ColaGenerica<ArbolGeneral<T>> cola = new ColaGenerica<ArbolGeneral<T>>();
		ListaGenerica<ArbolGeneral<T>> hijos = this.getHijos();
		ArbolGeneral<T> unHijo = null;
		ArbolGeneral<T> arbol = null;
		cola.encolar(this);
		cola.encolar(null);
		while (!cola.esVacia()){
			arbol = cola.desencolar();
			if (arbol != null){
				hijos.comenzar();
				while (!hijos.esVacia()){
					unHijo = hijos.proximo();
					cola.encolar(unHijo);
					nodos++;
					}
				}
					else
						if (!cola.esVacia()){
							if (nodos > maxNodos)
								maxNodos = nodos;
							nodos = 0;
							cola.encolar(null);
						}	
			}						
		return maxNodos;
	}
}
