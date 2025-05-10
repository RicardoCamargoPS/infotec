package com.infotec.model;

public class Cliente {

    private String nome;
    private String endereco;
    private String email;
    private int cpf;
    private int tel;
    private int cod;


    public void Cliente(String nome, String endereco, int tel){

        this.nome = nome;
        this.endereco = endereco;
        this.tel = tel;

    }
    public void Cliente(String nome, String endereco, int tel, int cpf){
        this.nome = nome;
        this.endereco = endereco;
        this.tel = tel;
        this.cpf = cpf;
        
    }
    public void Cliente(String nome, String endereco, String email, int tel, int cpf){
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
        this.tel = tel;
        this.cpf = cpf;
        
    }

    private void setCOD(){
        // TODO:  implemetar metodo para busca do ultimo ID unico na tabela de clientes, adiciobar +1 que sera o cod do cliente

    }

}
