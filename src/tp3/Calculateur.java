package tp3;


public class Calculateur {
	public Calculateur() {}
	
	public void testRacineCarree(int y) throws RacineCarreeException {
		if(y<0) throw new RacineCarreeException(y);
	}
	public static void main(String[] args) {
		Calculateur c1=new Calculateur();
		try {
			c1.testRacineCarree(-5);
			c1.testRacineCarree(25);
			
		}catch(RacineCarreeException e) {
			  System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("fin");
		
		
		
	}
	
	
}

