package tp.pr1.mv.memoria;

import java.util.Map.Entry;
import java.util.TreeMap;
/**
 * 
 * @author Antonio Blasco
 *
 */
public class Memory {

	private TreeMap<Integer, Integer> memoria = new TreeMap<Integer, Integer>();
	/**
	 * Memoria de la maquina
	 * 
	 * @param posicion Posicion de memoria donde se almacena el dato
	 * @param valor Valor del dato introducido por el usuario
	 */
	public void store(int posicion, int valor) {

		memoria.put(posicion, valor);
	}

	public int load(int posicion) {

		return memoria.get(posicion);
	}
	/**
	 * Esta instrucción muestra el contenido de la memoria, si lo hay, si no muestra "vacia".
	 * 
	 */
	public void mostrar() {
		if (memoria.isEmpty()) {
			System.out.print("<vacia>");

		}
		for (Entry<Integer, Integer> entry : memoria.entrySet()) {
			Integer posicionmemoria = entry.getKey();
			Integer valorposiciomemoria = entry.getValue();

			System.out.print("[" + posicionmemoria + "]:" + valorposiciomemoria + " ");

		}
	}

	public TreeMap<Integer, Integer> getMemoria() {
		return memoria;
	}

}
