package tp.pr1.mv.Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import tp.pr1.mv.CPU.CPU;
import tp.pr1.mv.Instrucciones.Instruction;
import tp.pr1.mv.Instrucciones.InstructionParser;
import tp.pr1.mv.Pila.OperandStack;
import tp.pr1.mv.memoria.Memory;
/**
 * 
 * @author Antonio Blasco
 *
 */
public class Main {
 /**
  * Main contiene el bucle principal.
  * <p> Instancia las clases (Memory, OperandStack, InstructionParser). </p>
  * <p> Pide los datos al usuario. </p>
  * <p> Notifica al usuario sobre si ha ocurrido algun error.</p>
  * 
  * @param args 
  */
	public static void main(String[] args) {

		OperandStack pila = new OperandStack();

		Memory memoria = new Memory();

		CPU cpu = new CPU(memoria, pila);

		InstructionParser parser = new InstructionParser();

		Instruction i;

		String textoAParsear;
		
		// Bucle principal
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (cpu.isEjecucion()) {
			textoAParsear = "";
			System.out.print("Instruccion a ejecutar: ");

			try {
				textoAParsear = br.readLine();
			} catch (IOException e) {

				e.printStackTrace();
			}
			i = parser.parse(textoAParsear);

			if (i == null) {
				System.out.println("Error : Instruccion no valida");
			} else {
				System.out.println("Comienza la ejecución de " + textoAParsear.toUpperCase());
				if (cpu.execute(i)) {

					System.out.println("El estado de la maquina tras ejecutar la instrucción es: ");

					System.out.print("Memoria: ");
					cpu.getMemoria().mostrar();
					System.out.println();

					System.out.print("Pila de operandos:");
					cpu.getPila().mostrar();
					System.out.println();

				} else {
					System.out.println("Error en la ejecucion de la instruccion");
				}
			}
		}

	}

}
