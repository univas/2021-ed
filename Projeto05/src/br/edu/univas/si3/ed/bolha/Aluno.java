package br.edu.univas.si3.ed.bolha;

public class Aluno {
	String nome;
	Integer matricula;
	String email;

	public Aluno(String nome, Integer matricula, String email) {
		this.nome = nome;
		this.matricula = matricula;
		this.email = email;
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", matricula=" + matricula + ", email=" + email + "]";
	}
}
