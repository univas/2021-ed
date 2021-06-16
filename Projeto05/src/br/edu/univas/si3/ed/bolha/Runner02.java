package br.edu.univas.si3.ed.bolha;

public class Runner02 {

	public static void main(String[] args) {
		InteiroCrescenteComparator crescenteCommp = new InteiroCrescenteComparator();
		InteiroDecrescenteComparator decrescenteComp = new InteiroDecrescenteComparator();
		OrdenacaoBolha bolha = new OrdenacaoBolha();
		
		int vetor[] = new int[] { 25, 48, 37, 12, 25, 57, 86, 33, 92 };
		
		bolha.ordenarBolhaV3(vetor, crescenteCommp);
		
		System.out.print("Vetor ordenado crescente: ");
		for (int valor : vetor) {
			System.out.print(" " + valor);
		}
		
		bolha.ordenarBolhaV3(vetor, decrescenteComp);
		System.out.print("\nVetor ordenado decrescente: ");
		for (int valor : vetor) {
			System.out.print(" " + valor);
		}
	}

}
