package br.edu.univas.si3.ed.list;

public class ProductList {

    private ProductNode head; //controle interno da lista
    private ProductNode last; //controle interno da lista

    public ProductIterator getIterator() {//é joia
        ProductIterator it = new ProductIterator(head);
        return it;
    }

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

    public Product remove(String name) {
        System.out.println("Removendo o produto: " + name);
        if(head == null) { //caso 1
            return null; //lista vazia
        }

        //passos:
        //1)Procurar o nó a ser removido (e o anteior também)
        ProductNode current = head;
        ProductNode previous = null;
        while(current != null) {
            if(current.info.name.equals(name)) {
                break; //interrompe o loop
            }
            previous = current;
            current = current.next;//faz a travessia
        }

        if(current == null) { //não achou o produto(compara as referências, e NÃO o conteúdo)
            return null; //caso 5
        }

        //2)Guardar o produto do nó a ser removido
        Product productRemoved = current.info;

        //3)Fazer o nó anterior apontar para o nó posterior do "nó removido"

        if(this.head == this.last) { //só tem 1 elemento na lista
            return productRemoved; // caso 6
        }

        if(previous == null) {
            head = current.next; //caso 2
        } else {
            previous.next = current.next; //caso 3 e 4

            if(current.next == null) {
                this.last = previous.next; //atualiza o last
            }
        }
        //free(nodeToRemove);//libera a memória do objeto (na linguagem C). O Java usa o Garbage Collector.
        return productRemoved;
    }

    //public ProductNode procurarUltimo() .....
    //salvaremos o último quando um nó for inserido

    //Exercício: criar um método para cada função abaixo:
    //1 - imprimir a lista (as informações de todos os elementos da lista)
    //2 - buscar um produto utilizando o nome do produto (retornar o produto encontrado ou null)
    //3 - buscar um produto utilizando o índice (Nnésimo elemento) (similar a um vetor). Retorna null caso não existir.
    //4 - excluir um produto da lista
    //5 - corrigir o last na exclusão
    //6 - TODO: Fazer o teste de mesa do método remover, usando 4 cenários
    //  -- cenário 1: lista vazia
    //  -- cenário 2: objeto procurado está na 1a posição
    //  -- cenário 3: objeto procurado está na última posição
    //  -- cenário 4: objeto procurado está numa posição intermediária
    //  -- cenário 5: não achou o produto
    //  -- cenário 6: a lista possui apenas um objeto, que será removido
}
