package tp.pr1.mv.Instrucciones;

public class Instruction {

	private int param;
	private TipoInstrucciones tipodeinstruccion;

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

	public Instruction(int _param, TipoInstrucciones tipo) {
		param = _param;
		tipodeinstruccion = tipo;

	}

	public int getParam() {
		return param;
	}

	public void setParam(int param) {
		this.param = param;
	}

	public TipoInstrucciones getTipodeinstruccion() {
		return tipodeinstruccion;
	}

	public void setTipodeinstruccion(TipoInstrucciones tipodeinstruccion) {
		this.tipodeinstruccion = tipodeinstruccion;
	}

}
