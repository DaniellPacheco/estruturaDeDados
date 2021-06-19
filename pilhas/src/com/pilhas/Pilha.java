package com.pilhas;

public class Pilha {
    private String[] stack;
    private int size;

    /**
     * Construtor
     * 1 - Adiciona o elemento inteiro vindo pelo parâmetro para instanciar o objeto String. Também foi usado uma função que garante que o número é positivo.
     * 2 - Inicia a variável size com 0;
     *
      * @param capacity
     */
    public Pilha(int capacity) {
        this.stack = new String[Math.abs(capacity)];
        this.size = 0;
    }

    /**
     * Push - adicionar item no topo da pilha.
     *  1 - verifica se o elemento vindo pelo parâmetro é null, caso for, envia um erro.
     *  2 - verifica se a pilha está cheia.
     *  3 - adiciona um ao size.
     *  4 - adiciona o elemento vindo pelo parâmetro no topo da pilha.
     *  5 - retorna o valor do elemento vindo pelo parâmetro comprovando que este foi inserido com sucesso.
     *
     * @param element
     * @return element
     */

    public String push(String element) {
        if(element == null)
            throw new IllegalArgumentException("O elemento não pode ser null!");

        if(this.size == this.stack.length)
            return null;

        this.size++;
        this.stack[getTopPositon()] = element;
        return element;
    }

    /**
     * Pop - remove ultimo elemento adicionado na pilha.
     * 1 - Pega o valor do elemento no topo da pilha.
     * 2 - Se o valor for diferente de null, adiciona null ao elemento no topo da pilha e diminuiu 1 de size.
     * 3 - Caso o elemento for nulo, retorna null
     *
     * @return result
     */
    public String pop() {
        String result = peek();

        if(result != null){
            this.stack[getTopPositon()] = null;
            this.size--;
        }

        return result;
    }

    /**
     * Peek - Lista o elemento no topo da pilha sem remove-lo.
     * 1 - Verifica se a pilha está vazia, se tiver, retorna null.
     * 2 - Retornar o elemento no topo da pilha.
     *
     * @return elemento do topo da pilha
     */
    public String peek() {
        if(isEmpty())
            return null;

        return this.stack[getTopPositon()];
    }

    public boolean isEmpty() {
        return this.size <= 0;
    }

    /**
     * getTopPosition - Busca a posição do elemento que está no topo da pilha.
     * 1 - Verifica se a pilha está vazio.
     * 2 - Retorna a posição do elemento no topo da pilha.
     * @return
     */
    public int getTopPositon() {
        if(isEmpty())
            return 0;
        return this.size - 1;
    }

    public int getSize() {
        return this.size;
    }

    public int getCapacity(){
        return this.stack.length;
    }

}
