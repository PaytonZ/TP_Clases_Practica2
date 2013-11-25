package tp.pr1.mv.Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import tp.pr1.mv.CPU.CPU;
import tp.pr1.mv.CPU.ProgramMV;
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

		cpu.loadProgram(new ProgramMV());

		

		
		
		
		
	}
}
