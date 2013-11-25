package tp.pr1.mv.Instrucciones;



/**
 * 
 * @author Antonio Blasco
 * 
 */
public class InstructionParser {

	public InstructionParser() {
	}

	/**
	 * Compara la cadena introducida con las instrucciones existentes.
	 * <p>Detecta que lo introducido sea correcto para que CPU solo reciba instrucciones correctas.</p>
	 * 
	 * @param s La instruccion que se le pasa
	 * @return Si es válida devulve la instruccion.
	 * 
	 * 			<p> Si es incorrecta devuelve null. </p>
	 */
	public Instruction parse(String s) {

		// Convierto la cadena en mayusculas para tratarla
		s.toUpperCase();
		//Separo la parte escrita de la parte entera de la instruccion para comprobar la primera.
		String resultado[] = s.split(" ");

		Instruction instr = null;
		
	
			

	switch (resultado[0].toUpperCase()) {
		case "PUSH":

			if (resultado.length == 2) {
				
				instr= new InstructionData(TipoInstrucciones.PUSH,Integer.valueOf(resultado[1]));
								
			}
			break;
		case "POP":
			if (resultado.length == 1)
				instr = new InstructionRest(TipoInstrucciones.POP);
			break;
		case "DUP":
			if (resultado.length == 1)
				instr = new InstructionRest(TipoInstrucciones.DUP);
			break;
		case "FLIP":
			if (resultado.length == 1)
				instr = new InstructionRest(TipoInstrucciones.FLIP);
			break;
		case "STORE":
			if (resultado.length == 2) {
				int param = Integer.valueOf(resultado[1]);
				if (param >= 0) {
					instr = new InstructionData(TipoInstrucciones.STORE,param);
				}
			}
			break;
		case "LOAD":
			if (resultado.length == 2) {
				int param = Integer.valueOf(resultado[1]);
				if (param >= 0) {
					instr = new InstructionData(TipoInstrucciones.LOAD,param);
				}
			}
			break;
			
		case "ADD":
			if (resultado.length == 1)
				instr = new InstructionaArithmetic(TipoInstrucciones.ADD);
			break;
			
		case "SUB":
			if (resultado.length == 1)
				instr = new InstructionaArithmetic(TipoInstrucciones.SUB);
			break;
			
		case "MUL":
			if (resultado.length == 1)
				instr = new InstructionaArithmetic(TipoInstrucciones.MUL);
			break;

		case "DIV":
			if (resultado.length == 1)
				instr = new InstructionaArithmetic(TipoInstrucciones.DIV);
			break;
			
		case "OUT":
			if (resultado.length == 1)
				instr = new InstructionRest(TipoInstrucciones.OUT);
			break;
			
		case "HALT":
			if (resultado.length == 1)
				instr = new InstructionRest(TipoInstrucciones.HALT);
			break;
		}

		return instr;
	}
}
