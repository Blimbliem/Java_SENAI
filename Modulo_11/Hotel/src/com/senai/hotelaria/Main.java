package com.senai.hotelaria;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        /*
           CRIANDO HOTEL
         */
        System.out.println("Digite o nome do hotel:");
        String nomeHotel = teclado.nextLine();

        System.out.println("Digite o endereço do hotel:");
        String enderecoHotel = teclado.nextLine();

        Hotel hotel = new Hotel(nomeHotel, enderecoHotel);

        /*
           CRIANDO QUARTO
         */
        System.out.println("Digite o número do quarto: ");
        int numero = teclado.nextInt();
        teclado.nextLine();

        System.out.println("Digite o tipo do quarto: ");
        String tipo = teclado.nextLine();

        Quarto quartos = new Quarto(numero, tipo, false);

        /*
        CRIANDO CLIENTE
         */
        System.out.println("Digite seu nome:");
        String nome = teclado.nextLine();
        System.out.println("Digite seu CPF:");
        String cpf = teclado.nextLine();
        System.out.println("Digite seu email:");
        String email = teclado.nextLine();
        Cliente c1 = new Cliente(nome, cpf,email);

        /*CRIANDO A RESERVA*/
        System.out.println("Qual a data de inicio da reserva: ");
        LocalDate dataInicio = LocalDate.parse(teclado.nextLine());
        System.out.println("A reserva será de quantos dias?");
        int dias = teclado.nextInt();
        Reserva r1 = new Reserva(c1,quartos, dataInicio,dataInicio.plusDays(dias));


        /*CRIANDO FUNCIONARIO*/
        Funcionario f1 = new Funcionario("José Carlos", "Concierge");

        /*CRIANDO SERVIÇO*/
        Servico s1 = new Servico("Limpeza", 50.0);


        /*
          ASSOCIAÇÕES DO HOTEL
         */
        hotel.adicionarQuarto(quartos);
        hotel.exibirInformacoes();
        /*EXIBINDO INFORMAÇÕES*/
        r1.exibirInformacoes();
        f1.exibirInformacoes();
        s1.exibirInformacoes();
    }
}