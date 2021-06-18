package br.edu.univas.si3.ed.bolha;

import java.util.Comparator;

public class AlunoMatriculaComparator implements Comparator<Aluno> {

	@Override
	public int compare(Aluno a, Aluno b) {
		if (a.matricula < b.matricula) {
			return -1;
		} else if (a.matricula > b.matricula) {
			return 1;
		} else {
			return 0;
		}
	}

}
