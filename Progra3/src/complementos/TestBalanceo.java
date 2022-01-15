package complementos;

import prog3.listagenerica.ListaGenericaEnlazada;

public class TestBalanceo {

	public static void main(String[] args) {
		ListaGenericaEnlazada<Character> lis = new ListaGenericaEnlazada<Character>();
		String cadena = "{[()]}";
		System.out.println(lis.esBalanceado(cadena));
	}
}
