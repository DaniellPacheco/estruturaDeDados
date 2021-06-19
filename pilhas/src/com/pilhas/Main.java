package com.pilhas;

public class Main {
    public static void main(String[] args) {
        String[] nomes = {
            "Daniel", "Beatriz", "Daniella"
        };

        Pilha stack = new Pilha(3);

        System.out.println("Inserindo elementos na Pilha: ");
        for(int i = 0; i < nomes.length; i++) {
            System.out.println(stack.push(nomes[i]));
        }

        stack.pop();

        System.out.println(stack);

        stack.pop();
        stack.pop();
        System.out.println(stack.peek());
        System.out.println(stack.push("Pedro"));
        System.out.println(stack.push("Clara"));

        System.out.println(stack);

    }
}
