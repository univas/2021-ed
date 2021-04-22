package br.edu.univas.si3.ed.exercices.data;

public class StackChar { //pilha de caracteres
    
    private CharNode top = null;

    public void push(Character character) {
        CharNode newNode = new CharNode();
        newNode.info = character;
        newNode.next = top;
        top = newNode;
    }

    public Character pop() {
        if(top == null) {
            return null;
        }
        CharNode node = top;
        top = top.next;
        return node.info;
    }
}
