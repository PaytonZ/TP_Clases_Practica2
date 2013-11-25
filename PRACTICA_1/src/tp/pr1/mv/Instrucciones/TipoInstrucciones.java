package tp.pr1.mv.Instrucciones;

public enum TipoInstrucciones {
//ARITMETICAS
	ADD, SUB, DIV,MUL ,
//BOOLEANAS
	AND, OR, NOT,
//SALTO
	BT, BF, JUMP,
//COMPARACION
	LT, GT, EQ, LE,
//DATOS
	PUSH, LOAD, STORE,
//SECUENCIALES - RESTO
	FLIP, POP, DUP, HALT, OUT;

}
