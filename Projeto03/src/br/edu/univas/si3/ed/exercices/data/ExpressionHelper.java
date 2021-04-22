package br.edu.univas.si3.ed.exercices.data;

public class ExpressionHelper {

    private StackChar pilha = new StackChar();
    
    public int validaExpressao(String exp) {

        //identificar os caracteres (, [ ou {
        //empilhar os caracteres que abrem
        //quando achar um caracter que fecha ), ] ou }: tem que verificar se o topo corresponde ao caracter atual
        //interrompe caso o caracter que fecha é incompatível com o topo da pilha

        for(int i = 0; i < exp.length(); i++) { //navega na String
            char ch = exp.charAt(i);

            //analisar o caracter
            if(ch == '(' || ch == '[' || ch == '{') {
                pilha.push(ch);
            } else {
                Character correspondenteQueAbre = null;

                if(ch == ')') { correspondenteQueAbre = '('; }
                if(ch == ']') { correspondenteQueAbre = '['; }
                if(ch == '}') { correspondenteQueAbre = '{'; }

                if(correspondenteQueAbre != null) { //achou um caracter que fecha
                    Character top = pilha.pop();
                    if(top == null || top != correspondenteQueAbre) { //achou um problema
                        System.out.println("A expressão " + exp + " é inválida.");
                        return i;
                    }
                }
            }
        }
        return -1;
    }
}
