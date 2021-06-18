package br.edu.univas.si3.ed.bolha;

public class Runner03 {

	public static void main(String[] args) {
		OrdenacaoBolha bolha = new OrdenacaoBolha();
		AlunoMatriculaComparator alunoMatriculaComp = new AlunoMatriculaComparator();
		AlunoNomeComparator alunoNomeComp = new AlunoNomeComparator();
		
		Aluno [] alunos = new Aluno[] {
				new Aluno("I5", 5, "a5@univas"),
				new Aluno("H9", 9, "a9@univas"),
				new Aluno("G1", 1, "a1@univas"),
				new Aluno("F2", 2, "a2@univas"),
				new Aluno("E8", 8, "a8@univas"),
				new Aluno("D3", 3, "a3@univas"),
				new Aluno("C6", 6, "a6@univas"),
				new Aluno("B4", 4, "a4@univas"),
				new Aluno("A7", 7, "a7@univas")
		};
		
		bolha.ordenarBolhaV4(alunos, alunoMatriculaComp);
		System.out.println("Alunos ordenados por matrícula: ");
		for (Aluno aluno : alunos) {
			System.out.println(aluno);
		}
		
		bolha.ordenarBolhaV4(alunos, alunoNomeComp);
		System.out.println("Alunos ordenados por nome: ");
		for (Aluno aluno : alunos) {
			System.out.println(aluno);
		}		
	}
}
