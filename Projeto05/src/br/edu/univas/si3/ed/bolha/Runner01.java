package br.edu.univas.si3.ed.bolha;

public class Runner01 {

	public static void main(String[] args) {
		/* executa o algoritmo de ordenacao bolha */
		
		int vetor[] = new int[] { 25, 48, 37, 12, 25, 57, 86, 33, 92 };
		
		new OrdenacaoBolha().ordenarBolhaV1(vetor);
		
		//a linha acima corresponde às 2 linha comentadas abaixo
		//OrdenacaoBolha ord = new OrdenacaoBolha();
		//ord.ordenarBolhaV1(vetor);
		
		System.out.print("Vetor ordenado: ");
		for (int valor : vetor) {
			System.out.print(" " + valor);
		}
	}

}
