package br.edu.univas.si3.ed.exercices.data;

public class ExpressionHelper {

    private StackChar pilha = new StackChar();
    
    public int validarExpressao(String exp) {

        pilha.clear();

        //identificar os caracteres (, [ ou {
        //empilhar os caracteres que abrem
        //quando achar um caracter que fecha ), ] ou }: tem que verificar se o topo corresponde ao caracter atual
        //interrompe caso o caracter que fecha é incompatível com o topo da pilha

        //System.out.println("Pilha no início: " + pilha.getAsString());

        for(int i = 0; i < exp.length(); i++) { //navega na String
            char ch = exp.charAt(i);

            //analisar o caracter
            if(ch == '(' || ch == '[' || ch == '{') {
                //System.out.println("Processando abertura char: " + ch);
                pilha.push(ch);
                //System.out.println("Pilha após push: " + pilha.getAsString());
            } else {
                //System.out.println("Processando fechamento char: " + ch);
                Character correspondenteQueAbre = null;

                if(ch == ')') { correspondenteQueAbre = '('; }
                if(ch == ']') { correspondenteQueAbre = '['; }
                if(ch == '}') { correspondenteQueAbre = '{'; }

                if(correspondenteQueAbre != null) { //achou um caracter que fecha
                    Character top = pilha.pop();
                    //System.out.println("Pilha após pop: " + pilha.getAsString());
                    if(top == null || top != correspondenteQueAbre) { //achou um problema
                        //System.out.println("A expressão " + exp + " é inválida.");
                        return i;
                    }
                }
            }
        }
        //System.out.println("Pilha no final: " + pilha.getAsString());
        if(!pilha.isEmpty()) { //se a pilha conter algum elemento -->>> tem mais char de aberturas do que fechamento
            //System.out.println("Finalizando com erro: a pilha não está vazia.");
            return exp.length();
        }
        //System.out.println("Finalizando corretamente");
        return -1;
    }
}
