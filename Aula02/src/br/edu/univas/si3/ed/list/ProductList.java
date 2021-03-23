package br.edu.univas.si3.ed.list;

public class ProductList {

    public ProductNode head;
    public ProductNode last;

    public void insert(Product prod) {
        //1 - alocar um node novo
        ProductNode novoNode = new ProductNode();

        if(head == null) { //lista vazia
            //2 - faz o head apontar para o node novo
            head = novoNode;
        } else { //a lista não está vazia
            //2 - faz o next do último apontar para o node novo
            last.next = novoNode; //último
        }

        //salvando o último
        last = novoNode;

        //3 - faz o info do node apontar para o produto
        novoNode.info = prod;
    }

    public String getAsString() {
        //o builder é um montador de Strings
        StringBuilder builder = new StringBuilder();
    
        //processamento para navegar na lista
        ProductNode current = head;
        while(current != null) { //existe node para ser processado
            //processa o nó
            //o append contatena
            builder.append(current.info.name);
            builder.append("(").append(current.info.amount).append(")");
            builder.append(" - ");

            //navega para o próximo nó
            current = current.next;
        }
        return builder.toString();
    }

    public Product findByName(String name) {
        ProductNode current = head;
        while(current != null) {
            //verifica se o produto é o procurado
            if(current.info.name.equals(name)) {
                return current.info;
            }
            current = current.next;
        }
        return null;
    }

    public Product getElementAt(int index) {
        if(index < 0) {
            return null;
        }
        int count = 0;
        ProductNode current = head;
        while(current != null) {
            //verifico a posição daquele nó
            if(index == count) {
                return current.info;
            }
            count++; //incrementa a posição
            current = current.next; //navega para o próximo nó
        }
        return null;
    }

    //public ProductNode procurarUltimo() .....
    //salvaremos o último quando um nó for inserido

    //TODO: Exercício: criar um método para cada função abaixo:
    //1 - imprimir a lista (as informações de todos os elementos da lista)
    //2 - buscar um produto utilizando o nome do produto (retornar o produto encontrado ou null)
    //3 - buscar um produto utilizando o índice (Nnésimo elemento) (similar a um vetor). Retorna null caso não existir.
    //4 - (extra) excluir um produto da lista
}
