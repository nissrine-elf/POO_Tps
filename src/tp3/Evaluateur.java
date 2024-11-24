package tp3;


public class Evaluateur {
	public Evaluateur() {}
	public void verifierNote(int y) throws NoteInvalideException {
		if(y < 0 || y > 20) throw new NoteInvalideException(y);
	}
	public static void main(String[] args) {
		Evaluateur E1=new Evaluateur();
		try {
			E1.verifierNote(15);
			E1.verifierNote(25);
			
		}catch(NoteInvalideException e) {
			  System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("fin");
		
		
		
	}

	
	
	
}
