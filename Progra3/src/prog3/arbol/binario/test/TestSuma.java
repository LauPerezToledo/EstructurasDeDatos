package prog3.arbol.binario.test;

import prog3.arbol.binario.ArbolBinario;
import prog3.arbol.binario.util.*;
import prog3.arbol.binario.ejercicios.*;

public class TestSuma {

	public static void main(String[] args) {
		Recorrido<Integer> reco = new Recorrido<Integer>();
		Sumas s = new Sumas();
		ArbolBinario<Integer> ab = new ArbolBinario<Integer>(7);
		ArbolBinario<Integer> hi = new ArbolBinario<Integer>(1);
		ArbolBinario<Integer> hd = new ArbolBinario<Integer>(3);
		hi.agregarHijoIzquierdo(new ArbolBinario<Integer>(4));
		hd.agregarHijoIzquierdo(new ArbolBinario<Integer>(2));
		hd.agregarHijoDerecho(new ArbolBinario<Integer>(1));
		ab.agregarHijoIzquierdo(hi);
		ab.agregarHijoDerecho(hd);
		reco.imprimirPreOrder(ab);
		System.out.println(s.sumaMaximaVertical(ab));
	}

}
