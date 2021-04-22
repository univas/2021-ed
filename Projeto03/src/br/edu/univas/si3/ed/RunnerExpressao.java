package br.edu.univas.si3.ed;

import br.edu.univas.si3.ed.exercices.data.ExpressionHelper;

public class RunnerExpressao {
    public static void main(String[] args) {
        System.out.println("Validando expressões.");

        ExpressionHelper helper = new ExpressionHelper();

        //exemplos de expressões válidas
        String exp01 = "a*(b-c)";
        String exp02 = "a*[b/(c-d+e)]";
        String exp03 = "{a+b}+(c-d)";
        String exp04 = "((([(a+b)+c])+d))";
        String exp05 = "((([()])))";
        String exp06 = "{()[()]()()}";

        System.out.println("Expressão " + exp01 + " : " + helper.validaExpressao(exp01));
        System.out.println("Expressão " + exp02 + " : " + helper.validaExpressao(exp02));
        System.out.println("Expressão " + exp03 + " : " + helper.validaExpressao(exp03));
        System.out.println("Expressão " + exp04 + " : " + helper.validaExpressao(exp04));
        System.out.println("Expressão " + exp05 + " : " + helper.validaExpressao(exp05));
        System.out.println("Expressão " + exp06 + " : " + helper.validaExpressao(exp06));

        //TODO: criar exemplos de expressões inválidas
        String expInv01 = "("; //deveria ser inválido - TODO: corrigir bug 1
        String expInv02 = ")"; //deveria ser inválido - TODO: corrigir bug 2
        String expInv03 = "())";
        
        //TODO: fazer o teste de mesa
        //TODO: testar com outras expressões inválidas

        System.out.println("Expressão " + expInv01 + " : " + helper.validaExpressao(expInv01));
        System.out.println("Expressão " + expInv02 + " : " + helper.validaExpressao(expInv02));
        System.out.println("Expressão " + expInv03 + " : " + helper.validaExpressao(expInv03));

    }
}
