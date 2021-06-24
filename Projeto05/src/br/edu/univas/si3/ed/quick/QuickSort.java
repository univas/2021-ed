package br.edu.univas.si3.ed.quick;

import java.util.Comparator;

public class QuickSort<T> {

	public void quickSort(T vet[], int ini, int fim, Comparator<T> cmp) {
		System.out.println("Iniciando quick: ini: " + ini + " fim: " + fim);
	    if (ini < fim) { //condição de parada da recursividade
	        T pivo = vet[ini];
	        System.out.println("pivô: " + pivo);
	        int i = ini + 1;
	        int j = fim;
	        while (i <= j) { // aqui acrescentei o igual, para o caso do vetor com 2 posicoes
	            while (i <= fim //o i nao pode estourar o fim do vetor
	            		&& cmp.compare(vet[i],  pivo) < 0 ) { //o elemento for menor que o pivô
	                i++;
	            }
	            while (j > ini //o j nao pode estourar o início do vetor
	            		&& cmp.compare(vet[j] , pivo) >= 0) {//enquanto o elemento for maior ou igual que o pivô
	                j--;
	            }
	            if (i < j) {
	            	trocar(vet, i, j);
	                i++;
	                j--;
	            }
	        }
	        if(j > ini) { //pode e deve trocar o pivô
	        	trocar(vet, ini, j); //troca o pivô com o elemento j
	        } //else //não precisa e nem pode trocar o pivô
	        quickSort(vet,  ini , j - 1, cmp);
	        quickSort(vet, j + 1,  fim , cmp);
	    }
	}
	
	private void trocar(T vet[], int i1, int i2) {
		System.out.println("troca: i:" + i1 + " j:" + i2 + " " + vet[i1] + "<->" + vet[i2]);
		 T temp = vet[i1];
         vet[i1] = vet[i2];
         vet[i2] = temp;
 		printVetor(vet);
	}
	
	public void printVetor(T [] vetor) {
		System.out.print("Vetor: ");
		for (T valor : vetor) {
			System.out.print(" " + valor);
		}
		System.out.println();
	}
}
