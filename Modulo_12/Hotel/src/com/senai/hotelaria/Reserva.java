package com.senai.hotelaria;
import java.time.LocalDate;

public class Reserva {
    private Cliente cliente;
    private Quarto quarto;
    private LocalDate dataInicio;
    private LocalDate dataFim;

    public void exibirInformacoes(){
        System.out.println("########");
        System.out.println("Informações da reserva");
        cliente.exibirInformacoes();
        quarto.exibirInformacoes();
        System.out.println("Data Inicio: " + this.dataInicio);
        System.out.println("Data Fim: " + this.dataFim);
    }

    public Reserva (Cliente cliente, Quarto quarto, LocalDate dataInicio, LocalDate dataFim){
        this.cliente = cliente;
        this.quarto = quarto;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    }

    //criando getters
    public Cliente getCliente(){return cliente;}

    public Quarto getQuarto(){return quarto;}

    public LocalDate getDataInicio(){return dataInicio;}

    public LocalDate getDataFim(){return dataFim;}

    //criando setters

    public void setCliente(Cliente cliente){this.cliente = cliente; }

    public void setQuarto(Quarto quarto){this.quarto = quarto;}

    public void setDataInicio(LocalDate dataInicio){this.dataInicio = dataInicio;}

    public void setDataFim(LocalDate dataFim){this.dataFim = dataFim;}

}
