package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestaListaDeAula {

	public static void main(String[] args) {

		Aula a1 = new Aula("revisitando arrayList", 21);
		Aula a2 = new Aula("Lista Objeto", 22);
		Aula a3 = new Aula("Relacionamento Lista e Objeto", 20);

		ArrayList<Aula> aulas = new ArrayList<>();
		
		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3);
		
		System.out.println(aulas);
				
		Collections.sort(aulas);
		
		System.out.println(aulas);
		
		Collections.sort(aulas , Comparator.comparing(Aula:: getTempo));

		System.out.println(aulas);
		
		aulas.sort(Comparator.comparing(Aula:: getTempo));

	}

}
