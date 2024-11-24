package tp3;

public class NoteInvalideException extends Exception {
	public NoteInvalideException(int x) {
	super("Exception de type NoteInvalideException. Note invalide :  "+x);
		
	}
}
