package tp.pr1.mv.Instrucciones;

import tp.pr1.mv.CPU.CPU;

public class InstructionCompare extends Instruction{

	public InstructionCompare(TipoInstrucciones tipo) {
		super(tipo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean execute(CPU cpu) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String toString() {
		return tipodeinstruccion.toString();
	}

	

}
