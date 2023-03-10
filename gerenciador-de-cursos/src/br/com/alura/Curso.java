package br.com.alura;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.LinkedHashSet;


public class Curso {

	private String nome;
	private String instrutor;
	private List<Aula> aulas = new LinkedList<Aula>();;
	private Set<Aluno> alunos = new LinkedHashSet<>();
	private Map<Integer, Aluno> matriculaParaAluno = new HashMap<>();

	public Curso(String nome, String instrutor) {
		this.nome = nome;
		this.instrutor = instrutor;
	}

	public List<Aula> getAulas() {
		return Collections.unmodifiableList(aulas);
	}

	public String getNome() {
		return nome;
	}

	public String getInstrutor() {
		return instrutor;
	}

	public void adiciona(Aula aula) {
		this.aulas.add(aula);
	}

	public int getTempoTotal() {
		int total = 0;

		for (Aula aula : aulas) {
			total += aula.getTempo();
		}
		return total;
	}

	@Override
	public String toString() {
		return "[ Curso: " + nome + ", tempo total: " + this.getTempoTotal() + " ]";
	}

	public void matricula(Aluno aluno) {
		this.alunos.add(aluno);
		
		this.matriculaParaAluno.put(aluno.getMatricula(), aluno);
	}
	
	public Set<Aluno> getAlunos() {
		return Collections.unmodifiableSet(alunos);
	}

	public boolean  estaMatriculado(Aluno aluno) {
		return this.alunos.contains(aluno);
	}

	public Aluno buscaMatriculado(int numero) {
		return matriculaParaAluno.get(numero);
	}

	/*
	 * public int gettoTotal() { return this.aulas.stream().mapToInt(Aula
	 * ::getTempo).sum(); }
	 */

}
