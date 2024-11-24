package tp1;

import java.util.Arrays;
import java.util.Scanner;

public class EX1 {
	public static void main(String[] args) {
	float notes[];
	Scanner s=new Scanner(System.in);
	System.out.println("Donner le nombre des étudiants ?");
	int nbr=s.nextInt();
	notes=new float[nbr];
	for(int i=0;i<notes.length;i++) {
		System.out.println("Donner la note de l'étudiant  "+(i+1));// Saisie des notes 
		notes[i]=s.nextFloat(); }
Arrays.sort(notes);//tri des notes
System.out.println("les notes triées "+Arrays.toString(notes));	//Affichage de la liste des notes
//la note moyenne
float som=0;
for(int i=0;i<notes.length;i++) {
	som+=notes [i];	
}
System.out.println("la moyenne est: "+(som/notes.length));
//Recherche de la note max et la note min 
//1ére methode 
//Initialisation de max avec la première note
float max=notes[0];
for(int i=0;i<notes.length;i++) {
if(notes[i]>=max) {max=notes[i];}	
}
System.out.println("la note maximal est "+max);
//methode2 
// La note minimale est le premier élément du tableau trié
System.out.println("la note minimale est "+notes[0]);
// le nombre d’étudiants ayant une note saisie par l’utilisateur 
System.out.println("le nombre d’étudiants est "+notes.length);
	}}  

