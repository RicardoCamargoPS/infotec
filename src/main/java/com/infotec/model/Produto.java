package com.infotec.model;

public class Produto {
    
    private String nome;
    private String descricao;
    private String categoria;
    private double preco;

    public Produto(String nome, String descricao, String categoria, double preco) {
        this.nome = nome;
        this.descricao = descricao;
        this.categoria = categoria;
        this.preco = preco;
    }


}
