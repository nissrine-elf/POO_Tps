package tp3;

import java.util.Scanner;

public class Vehicule {
	public Vehicule() {}
	public void testVitesse(int x) throws TropViteException {
		if(x>90) { throw new TropViteException(x);}
		
}
	public static void main(String[] args) {
 Vehicule V1=new Vehicule();
 Scanner s= new Scanner(System.in);
 try {
	 System.out.println("entrer le 1ére x");
	 int x=s.nextInt();
	 V1.testVitesse(x);
	 
 }catch(TropViteException e){
	  System.out.println(e.getMessage());
	 e.printStackTrace(); }
 try {
	
	System.out.println("entrer le 2éme x");
	 int x2=s.nextInt();
	 
	 V1.testVitesse(x2);
	 
 }catch(TropViteException e){
	  System.out.println(e.getMessage());
	 e.printStackTrace(); }
 System.out.println("fin");	
	}	
}
