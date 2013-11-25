package tp.pr1.mv.command;

import tp.pr1.mv.CPU.CPU;
/**
 * CommandInterpreter: clase abstracta que representa los distintos comandos que podemos
ejecutar sobre la máquina virtual. Entre sus atributos tendrá a la CPU cpu y
dispondrá de un método abstracto public abstract boolean executeCommand() que
implementarán sus distintas subclases de acuerdo con el comando que se desee ejecutar.
Esta clase ofrece el metodo public static void congureCommandInterpreter para
inicializar el valor del atributo cpu una vez que la CPU dispone del programa a
ejecutar.
De esta clase heredarán las subclases Run, Step, Steps y Quit que implementan, respectivamente,
los comandos con el mismo nombre. Las clases Steps y Run heredan
de la clase Step.
 * @author NASAIII
 *
 */
public abstract class CommandInterpreter {

	private CPU cpu;
	
	public abstract boolean executeCommand();
	public static void configureContextCPU() {
	}
	
}
