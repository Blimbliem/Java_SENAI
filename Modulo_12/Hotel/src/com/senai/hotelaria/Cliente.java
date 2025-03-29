package com.senai.hotelaria;

public class Cliente {
    private String nome;
    private String cpf;
    private String email;

    public Cliente (String nome, String cpf, String email){
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }

    // criando getters
    public String getNome(){
        return nome;
    }

    public String getCpf(){
        return cpf;
    }
    public String getEmail(){
        return email;
    }

    // criando setters
    public void setNome(){
        this.nome = nome;
    }
    public void setCpf(){
        this.cpf = cpf;
    }

    public void setEmail(){
        this.email = email;
    }

    public void exibirInformacoes(){
        System.out.println("#########");
        System.out.println("Informações do cliente");
        System.out.println("Nome do cliente: " + this.nome);
        System.out.println("CPF do cliente: " + this.cpf);
        System.out.println("Email do cliente: " + this.email);
    }


}
