package com.rns.yoda;

public class Produto {
    int id;
    String nome;
    double preco;
    int quantidade;

    /***
     * Construtor => inicializa os atributos da classe Produto
     * @param id
     * @param nome
     * @param preco
     * @param quantidade
     */
    Produto(int id, String nome, double preco, int quantidade){
        this.id = id;
        this.nome= nome;
        this.preco = preco;
        this.quantidade=quantidade;
    }

    /***
     * Apresenta um registro formatado de produtos
     * @return String
     */
    public String toString(){
        //return "Produto "+id+": "+nome+"; "+preco+" kz; "+quantidade+" unidades.";
        return String.format("Produto %d: %s; %.2f kz; %d unidades.", id, nome, preco, quantidade); //semelhante a linha anterior
    }
}
