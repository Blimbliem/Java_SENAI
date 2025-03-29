package com.senai.hotelaria;

public class Servico {
    private String descricao;
    private double custo;

    public Servico(String descricao, double custo) {
        this.descricao = descricao;
        this.custo = custo;
    }

    //criando getters
    public String getDescricao(){
        return descricao;
    }

    public double getCusto(){
        return custo;
    }

    //criando setters
    public void setDescricao(String descricao){ this.descricao = descricao;}

    public void setCusto(double custo){
        if(custo > 100 && custo < 250 ){
            this.custo = custo;
        }
    }

    public void exibirInformacoes(){
        System.out.println("############");
        System.out.println("Informações de serviço");
        System.out.println("Descrição do serviço: " + this.descricao);
        System.out.println("Custo do serviço: " + this.custo);
    }

}

