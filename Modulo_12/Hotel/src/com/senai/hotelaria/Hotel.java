package com.senai.hotelaria;

import java.util.ArrayList;
import java.util.List;

public class Hotel {

    private String nome;
    private String endereco;
    private List<Quarto> quartos;

    //construtor
    public Hotel(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.quartos = new ArrayList<>();
    }

    //método para adicionar um quarto
    public void adicionarQuarto(Quarto quarto){
        if (quarto.isOcupado()){
            return;
        }
        quartos.add(quarto);
    }

    //criando getters
    public String getNome(){
        return nome;
    }
    public String getEndereco(){
        return endereco;
    }

    public List<Quarto> getQuartos(){return quartos;}

    //criando setters
    public void setNome(){
        this.nome = nome;
    }
    public void setEndereco(){
        this.endereco = endereco;
    }


    public void exibirInformacoes() {
        System.out.println("Informações do Hotel");
        System.out.println("Nome: " + this.nome);
        System.out.println("Endereço: " + this.endereco);

        for(Quarto quarto : quartos) {
            quarto.exibirInformacoes();
        }

    }

}
