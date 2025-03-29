package com.senai.hotelaria;

public class Quarto {
    private int numero;
    private String tipo;
    private boolean ocupado;

    public Quarto(int numero, String tipo, boolean ocupado) {
        this.numero = numero;
        this.tipo = tipo;
        this.ocupado = ocupado;
    }

    public void ocuparQuarto() {
        this.ocupado = true;
    }

    public void descuparQuarto() {
        this.ocupado = false;
    }

    public boolean isOcupado(){return ocupado;}

    //criando getters
    public int getNumero(){
        return numero;
    }
    public String getTipo(){
        return tipo;
    }

    //criando setters
    public void setNumero(int numero){
        this.numero = numero;
    }

    public void setTipo(){
        this.tipo=tipo;
    }

    public void exibirInformacoes(){
        System.out.println("#############");
        System.out.println("Informações do quarto");
        System.out.println("Número: " + this.numero);
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Ocupado: " + this.ocupado);
    }
}
