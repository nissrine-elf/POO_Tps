package tp4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex1Streams {
	public static void main(String[] args) {
		List<String> mots = Arrays.asList("hello", "bonjour", "salam");
		//1
		List<String> motA=mots.stream().filter(s->s.contains("a")).collect(Collectors.toList());
		if(!motA.isEmpty()) {motA.forEach(s->System.out.println(s));}
		if(motA.isEmpty()){System.out.println("mots qui contien la lettre \"a\"not existe ");}
		//2
		List<String> motinv=mots.stream().filter(s->s.length()>3).map(s->new StringBuilder(s)
				.reverse().toString()).collect(Collectors.toList());
		System.out.println("les mots qui ont une longueur supérieure à 3 :");
		if(!motinv.isEmpty()) {motinv.forEach(s->System.out.println(s));}
		//3
		List<String> motE=mots.stream().filter(s->s.contains("e"))
				.flatMap(s->Arrays.stream(s.split(""))).collect(Collectors.toList());
		if(!motE.isEmpty()) {motE.forEach(s->System.out.println(s));}
		//4
		List<String> motMaj=mots.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println("les mots  en majuscules :");
		if(!motMaj.isEmpty()) {motMaj.forEach(s->System.out.println(s));}
		//5
		List<Integer> motLen=mots.stream().map(String::length).collect(Collectors.toList());
		System.out.println("les mots  en longueur :");
		if(!motLen.isEmpty()) {motLen.forEach(s->System.out.println(s));}
		//6
		List<String> motC=mots.stream().flatMap(s->Arrays.stream(s.split(""))).collect(Collectors.toList());
		if(!motC.isEmpty()) {motC.forEach(s->System.out.println(s));}
		//7
		List<String> motId=mots.stream().map(s->s+"-"+mots.indexOf(s)).collect(Collectors.toList());
		System.out.println("les mots de la forme \"Nom-Index\":");
		if(!motId.isEmpty()) {motId.forEach(s->System.out.println(s));}}
}
