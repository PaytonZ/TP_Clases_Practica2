package tp.pr1.mv.Pila;

import java.util.Stack;
/**
 * Implementa la pila donde se colocan los elementos de tipo entero introducidos.
 * 
 * @param n Elemento de tipo entero introducido por el usuario.
 */
public class OperandStack {
	
	
	private Stack<Integer> pila = new Stack<Integer>();

	//PUSH -- introduce a la pila.
	public void push(int n) {
		pila.push(n);
	}

	// POP -- sacar de la pila.
	public int pop() {
		return pila.pop();
	}

	// DUP -- duplica el primero.
	public void dup() {
		int a = pop();
		push(a);
		push(a);
	}

	// FLIP -- intercambia cima y subcima.
	public void flip() {
		int cima, subcima;
		cima = pop();
		subcima = pop();

		push(cima);
		push(subcima);
	}

	// SUMA
	public void add() {
		int cima, subcima, suma;
		cima = pop();
		subcima = pop();

		suma = subcima + cima;
		push(suma);
	}

	// RESTA
	public void sub() {
		int cima, subcima, resta;
		cima = pop();
		subcima = pop();

		resta = subcima - cima;
		push(resta);
	}

	// MULTIPLICACION
	public void mul() {
		int cima, subcima, multi;
		cima = pop();
		subcima = pop();

		multi = subcima * cima;
		push(multi);
	}

	// DIVISION
	public void div() {
		int cima, subcima, div;
		cima = pop();
		subcima = pop();

		div = subcima / cima;
		push(div);
	}

	// OUT -- Mostrar cima.
	public void out() {
		int cima;
		cima = pop();
		System.out.println(Character.toChars(cima));

	}
	
	/**
	 * Esta instrucción muestra el contenido de la pila, si lo hay, si no muestra "vacia".
	 * 
	 */
	
	public void mostrar() {
		Object[] resultado = pila.toArray();
		if (resultado.length == 0) {
			System.out.print("<vacia>");

		}

		for (int i = 0; i < resultado.length; i++) {
			System.out.print(resultado[i] + " ");
		}

	}

	public Stack<Integer> getPila() {
		return pila;
	}

	public void setPila(Stack<Integer> pila) {
		this.pila = pila;
	}
}
