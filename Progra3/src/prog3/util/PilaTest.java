package prog3.util;

public class PilaTest {
	public static void main(String[] args) {
		Pila<Character> p = new Pila<Character>();
		int i;
		p.apilar('a');
		p.apilar('b');
		p.apilar('c');
		p.apilar('d');
		p.apilar('e');
		System.out.println(p.tope());
		for (i = 0; i < 4; i++)
			p.desapilar();
		System.out.println(p.tope());
	}	
}
