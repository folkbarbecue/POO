package br.com.aulaheranca;

public class Produto {
    String nome;
    int codigo;
    double preco;
    int quantidade;

    public Produto(String nome, int codigo, double preco, int quantidade) {
       this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
        this.quantidade = quantidade;
    }
}
