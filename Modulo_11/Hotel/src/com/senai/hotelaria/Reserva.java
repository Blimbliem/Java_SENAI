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

}
