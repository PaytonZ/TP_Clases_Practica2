package tp.pr1.mv.command;

import tp.pr1.mv.CPU.CPU;
/**
 * CommandInterpreter: clase abstracta que representa los distintos comandos que podemos
ejecutar sobre la m�quina virtual. Entre sus atributos tendr� a la CPU cpu y
dispondr� de un m�todo abstracto public abstract boolean executeCommand() que
implementar�n sus distintas subclases de acuerdo con el comando que se desee ejecutar.
Esta clase ofrece el metodo public static void congureCommandInterpreter para
inicializar el valor del atributo cpu una vez que la CPU dispone del programa a
ejecutar.
De esta clase heredar�n las subclases Run, Step, Steps y Quit que implementan, respectivamente,
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
