package com.senai.hotelaria;

public class Funcionario {
    private String nome;
    private String cargo;

    public Funcionario(String nome, String cargo) {
        this.nome = nome;
        this.cargo = cargo;
    }

    //criando getters
    public String getNome(){
        return nome;
    }
    public String getCargo(){
        return cargo;
    }

    //criando setters
    public void setNome(){
        this.nome = nome;
    }
    public void setCargo(){
        this.cargo = cargo;
    }

    public void exibirInformacoes(){
        System.out.println("############");
        System.out.println("Funcionários");
        System.out.println("Nome do funcionario: " + this.nome);
        System.out.println("Cargo Funcionario: " + this.cargo);
    }

}
