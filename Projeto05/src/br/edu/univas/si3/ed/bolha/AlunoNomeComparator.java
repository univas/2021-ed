package br.edu.univas.si3.ed.bolha;

import java.util.Comparator;

public class AlunoNomeComparator implements Comparator<Aluno> {

	@Override
	public int compare(Aluno a, Aluno b) {
		return a.nome.compareTo(b.nome);
	}

}
