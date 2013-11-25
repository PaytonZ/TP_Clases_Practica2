package tp.pr1.mv.Instrucciones;

import tp.pr1.mv.CPU.CPU;

public abstract class Instruction {

	protected TipoInstrucciones tipodeinstruccion;
	protected int param;
	/**
	 * Implementa las instrucciones que puede manejar la maquina.
	 * 
	 * <p>Utiliza el tipo enumerado contenido en TipoInstrucciones. </p>
	 * 
	 * @param tipo El tipo de instruccion
	 */
	
	public Instruction(TipoInstrucciones tipo) {
		tipodeinstruccion = tipo;
	}
	public Instruction(TipoInstrucciones tipo,int _param) {
		tipodeinstruccion = tipo;
		param=_param;
	}
	abstract public boolean execute(CPU cpu);
	
	abstract public String toString();
	

	public TipoInstrucciones getTipodeinstruccion() {
		return tipodeinstruccion;
	}

	public void setTipodeinstruccion(TipoInstrucciones tipodeinstruccion) {
		this.tipodeinstruccion = tipodeinstruccion;
	}

}
