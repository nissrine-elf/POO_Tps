package tp3;

public class RacineCarreeException extends Exception {
	public RacineCarreeException(int x) {
		super("C'est une exception de type RacineCarreeException. Nombre négatif :  "+x);
		
	}

}
