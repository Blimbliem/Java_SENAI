package com.senai.hotelaria;

public class Servico {
    String descricao;
    double custo;

    public Servico(String descricao, double custo) {
        this.descricao = descricao;
        this.custo = custo;
    }

    public void exibirInformacoes(){
        System.out.println("############");
        System.out.println("Informações de serviço");
        System.out.println("Descrição do serviço: " + this.descricao);
        System.out.println("Custo do serviço: " + this.custo);
    }

}

