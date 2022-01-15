package prog3.listaenteros.test;

import prog3.listaenteros.ListaDeEnterosEnlazada;

public class TestOrdenamientos {
	public static void main(String[] args) {
	       ListaDeEnterosEnlazada lis = new ListaDeEnterosEnlazada();
	       ListaDeEnterosEnlazada ordenada = new ListaDeEnterosEnlazada();
	       ListaDeEnterosEnlazada ordenada2 = new ListaDeEnterosEnlazada();
	       ListaDeEnterosEnlazada combinada = new ListaDeEnterosEnlazada();
	       lis.agregarInicio(7);
	       lis.agregarInicio(5);
	       lis.agregarInicio(10);
	       lis.agregarInicio(14);
	       ordenada = lis.ordenar();
	       System.out.println(ordenada);	
	       ordenada2.agregarInicio(12);
	       ordenada2.agregarInicio(6);
	       ordenada2.agregarInicio(9);
	       combinada = ordenada.combinarOrdenado(ordenada2);
	       System.out.println(combinada);
	    }
}
