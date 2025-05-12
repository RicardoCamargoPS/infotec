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

    public void Colaborador(String nome, String endereco, int cpf, int rg, int ctps, int nis, Funcao funcao){
        this.nome = nome;
        this.endereco = endereco;
        this.RG = rg;
        this.CTPS = ctps;
        this.NIS = nis;
        this.cpf = cpf;
        this.funcao = funcao;        
    }

    private void setCOD(){
        // TODO:  implemetar metodo para busca do ultimo ID unico na tabela de clientes, adiciobar +1 que sera o cod do cliente

    }

    public void setEmail(String email){
        this.email = email;
    }
    public void setTel(int tel){
        this.tel = tel;
    }

}
