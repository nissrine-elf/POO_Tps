package tp3;

public class TropViteException  extends Exception{
	public TropViteException(int x) {
		super("C'est une exception de type TropViteException. Vitesse en cause : "+x);
		
	}

}
