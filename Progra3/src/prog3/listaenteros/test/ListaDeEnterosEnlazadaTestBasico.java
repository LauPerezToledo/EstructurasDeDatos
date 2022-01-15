package prog3.listaenteros.test;

import prog3.listaenteros.ListaDeEnterosEnlazada;

public class ListaDeEnterosEnlazadaTestBasico {
	
	public static void main(String[] args) {
       ListaDeEnterosEnlazada lis = new ListaDeEnterosEnlazada();
       lis.agregarInicio(7);
       lis.agregarInicio(5);
       lis.agregarInicio(10);
       System.out.println(lis);
       imprimirInversa(lis);
    }


	private static void imprimirInversaPrivada (ListaDeEnterosEnlazada l){
		if(!l.fin()){
			Integer p =l.proximo();
			imprimirInversaPrivada(l);
			System.out.println(p);	
		}		
	}
	
	public static void imprimirInversa (ListaDeEnterosEnlazada l){
		l.comenzar();
		imprimirInversaPrivada(l);
	}	
}

	


