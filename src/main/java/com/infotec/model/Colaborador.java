package com.infotec.model;

public class Colaborador {

    private String nome;
    private String endereco;
    private String email;
    private int cpf;
    private int RG;
    private int CTPS;
    private int NIS;
    private int tel;
    private int cod;

    private Funcao funcao;

    public void Colaborador(String nome, String endereco, String email, int tel, int cpf){
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
