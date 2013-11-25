package tp.pr1.mv.CPU;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import tp.pr1.mv.Instrucciones.*;

public class ProgramMV {

	private ArrayList<Instruction> instrucciones;

	public ProgramMV() {
		
		cargarInstruccionesTeclado();
		escribirInstruccionesPantalla();
	}
		
	
	private void cargarInstruccionesTeclado()
	{
		
		instrucciones = new ArrayList<Instruction>();
		
		InstructionParser parser = new InstructionParser();
		Instruction i;
		String textoAParsear = "";

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		textoAParsear = "";
		System.out.println("Introduce el programa fuente: ");
		System.out.print("> ");
		try {
			textoAParsear = br.readLine();
		} catch (IOException e) {

			e.printStackTrace();
		}
		while (!textoAParsear.equalsIgnoreCase("END")) {

			i = parser.parse(textoAParsear);
			if (i == null) {
				System.out.println("Error: Instrucción incorrecta");
			} else {
				instrucciones.add(i);

			}
			System.out.print("> ");
			try {
				textoAParsear = br.readLine();
			} catch (IOException e) {

				e.printStackTrace();
			}
		}

}
	
	private void escribirInstruccionesPantalla()
	{
		int j=0;
		for(Instruction i : instrucciones)
		{
			System.out.println(j + ": "+ i.toString());
			j++;
		}
	}
		
	
	}
	
	


