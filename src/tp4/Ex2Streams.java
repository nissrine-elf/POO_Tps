package tp4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;



class Employe {
    private String nom;
    private String departement;
    private double salaire;

    
    public Employe(String nom, String departement, double salaire) {
        this.nom = nom;
        this.departement = departement;
        this.salaire = salaire;
    }
    public String getNom() {
        return nom;
    }
     public String getDepartement() {
        return departement;
    }
    public double getSalaire() {
        return salaire;
    }
    public String toString() {
        return "nom=" + nom + ", département: " + departement + ", salaire: " + salaire;
    }
}
public class Ex2Streams {
	public static void main(String[] args) {
		
		List<Employe>em=new ArrayList<>();
		Scanner s=new Scanner(System.in);
		em.add(new Employe("ali","iT",50000));
		em.add(new Employe("simo","iT",70000));
		em.add(new Employe("salma","RH",40000));
		
		//1
		double salaireTo=em.stream().mapToDouble(Employe::getSalaire).sum();
		System.out.println("somme totale des salaires est :"+salaireTo);
		//2
		System.out.println("employes triée par ordre alphabétique  :");
		em.stream().sorted(Comparator.comparing(Employe::getNom)).forEach(System.out::println);
//3
		Optional<Employe> emplminsal=em.stream().min(Comparator.comparing(Employe::getSalaire));	
		emplminsal.ifPresent(emp -> System.out.println("Employé avec le salaire le plus bas : " + emp.toString()));
		
	//4	
		System.out.println("donner le salaire de employée:  :");
		double sal=s.nextDouble();
		List<Employe>em2=em.stream().filter(e->e.getSalaire()>sal).collect(Collectors.toList());
		System.out.println("Employés avec un salaire supérieur à " + sal + " :");
		em2.forEach(e->System.out.println(e.toString()));
		//5
		   Optional<Employe> empmaxSal = em.stream().reduce((e1, e2) -> e1.getSalaire() > e2.getSalaire() ? e1 : e2);
		   empmaxSal.ifPresent(emp -> System.out.println("Employé avec le salaire le plus élevé : " + emp.toString()));
		//6
		   String concatNomEmp= em.stream().map(Employe::getNom).reduce("", String::concat);
				   System.out.println("Concaténation des noms de employées  " + concatNomEmp); 
		
	}
}
