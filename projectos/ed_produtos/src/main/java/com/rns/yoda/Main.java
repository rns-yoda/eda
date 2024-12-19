package com.rns.yoda;

import java.util.LinkedList;

public class Main {

    //Criando uma lista de Produtos
    static LinkedList<Produto> produtos = new LinkedList<>();

    public static void main(String[] args) {

        //Inserindo produtos
        produtos.add(new Produto(2, "Fralda Pampers P", 8900.00, 5));
        produtos.add(new Produto(3, "Mamadeira Avent", 4500.00, 2));
        produtos.add(new Produto(4, "Chupeta Philips", 1200.00, 10));
        produtos.add(new Produto(5, "Lenço Umedecido", 1500.00, 8));
        produtos.add(new Produto(6, "Carrinho de Bebê", 45000.00, 1));

        produtos.addFirst(new Produto(1, "Leite Nan 1", 6500.00, 3));

        produtos.add(new Produto(7, "Cadeirinha de Alimentação", 35000.00, 2));
        produtos.add(new Produto(8, "Banheira Infantil", 18000.00, 4));
        produtos.add(new Produto(9, "Talco Johnson's Baby", 1000.00, 6));
        produtos.add(new Produto(10, "Sabonete Líquido Baby Dove", 2000.00, 9));

        //Exibindo a lista de produtos
        for (Produto produto : produtos) {
            System.out.println(produto.toString());
        }

        //Removendo o primeiro registro
        System.out.printf("\n### Removido => %s\n\n", produtos.removeFirst().toString());

        //************* RECOMENDACOES *************
        //TODO: aplicar outros metodos para manipular a LinkedList
        //TODO: substituir a LinkedList por outras estruturas aprendidas
        //TODO: seja criativo(a)!

    }
}