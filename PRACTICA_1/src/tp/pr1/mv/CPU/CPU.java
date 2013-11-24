package tp.pr1.mv.CPU;

import tp.pr1.mv.Instrucciones.Instruction;
import tp.pr1.mv.Pila.OperandStack;
import tp.pr1.mv.memoria.Memory;
/**
 * 
 * @author Antonio Blasco
 *
 */
public class CPU {
	private Memory memoria;
	private OperandStack pila;
	private boolean ejecucion;

	public CPU(Memory _memoria, OperandStack _pila) {

		memoria = _memoria;
		pila = _pila;
		ejecucion = true;
	}

	/**
	 * Esta operacion de CPU ejecutará la instruccion que se le introduce como parámetro.
	 * <p> Ademas se encarga del control de errores. </p>
	 * 
	 * @param instr La instruccion a ejecutar
	 * @return true si se ha ejecutado correctamente
	 *         
	 *         <p> false si ha habido un error / datos incorrectos </p>
	 */
	
	public boolean execute(Instruction instr) {

		boolean ejecucionCorrecta = true;

		switch (instr.getTipodeinstruccion()) {
		case PUSH:
			pila.push(instr.getParam());
			break;
		case POP:
			if (pila.getPila().isEmpty()) {
				ejecucionCorrecta = false;
			} else {
				pila.pop();
			}

			break;

		case DUP:
			if (pila.getPila().isEmpty()) {
				ejecucionCorrecta = false;
			} else {
				pila.dup();
			}
			break;

		case FLIP:
			if (pila.getPila().size() < 2) {
				ejecucionCorrecta = false;
			} else {
				pila.flip();
			}
			break;

		case LOAD:
			if (memoria.getMemoria().containsKey(instr.getParam())) {
				pila.push(memoria.load(instr.getParam()));
			} else {
				ejecucionCorrecta = false;
			}
			break;

		case STORE:
			memoria.store(instr.getParam(), pila.pop());
			break;

		case ADD:

			if (pila.getPila().size() < 2) {
				ejecucionCorrecta = false;
			} else {
				pila.add();
			}
			break;

		case SUB:
			if (pila.getPila().size() < 2) {
				ejecucionCorrecta = false;
			} else {
				pila.sub();
			}
			break;

		case MUL:
			if (pila.getPila().size() < 2) {
				ejecucionCorrecta = false;
			} else {
				pila.mul();
			}
			break;
		case DIV:
			if (pila.getPila().size() < 2) {
				ejecucionCorrecta = false;
			} else {
				int cima, subcima;
				cima = pila.pop();
				subcima = pila.pop();
				pila.push(subcima);
				pila.push(cima);
				if (cima == 0) {
					ejecucionCorrecta = false;

				} else {

					pila.div();
				}
			}
			break;
		case OUT:
			if (pila.getPila().isEmpty()) {
				ejecucionCorrecta = false;
			} else {
				pila.out();
			}
			break;
		case HALT:
			ejecucion = false;
			break;
		default:
			break;
		}

		return ejecucionCorrecta;
	}

	public boolean isEjecucion() {
		return ejecucion;
	}

	public Memory getMemoria() {
		return memoria;
	}

	public OperandStack getPila() {
		return pila;
	}

}
