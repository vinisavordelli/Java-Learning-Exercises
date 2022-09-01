package com.trybe.acc.java.sistemadevotacao;

import java.util.Scanner;

/**
 * Main Class.
 */
public class Principal {

  /**
   * Main Method.
   */
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    GerenciamentoVotacao gerenciamentoVotacao = new GerenciamentoVotacao();
    Scanner scanner = new Scanner(System.in);
    boolean continuarEleicao = true;

    System.out.println("---------- Bem-vindo ao Sistema de Votação ----------\n");
    do {
      System.out.println("Cadastrar pessoa candidata?");
      System.out.println("1 - Sim");
      System.out.println("2 - Não");
      System.out.println("Entre com o número correspondente à opção desejada:");
      short opcao = scanner.nextByte();

      if (opcao == 1) {
        System.out.println("Entre com o nome da pessoa candidata:");
        String nome = scanner.next();
        System.out.println("Entre com o número da pessoa candidata:");
        int numero = scanner.nextInt();
        gerenciamentoVotacao.cadastrarPessoaCandidata(nome, numero);
      } else if (opcao == 2) {
        continuarEleicao = false;
      }
    } while (continuarEleicao);

    System.out.println("\n---------- Cadastre as pessoas eleitoras ----------\n");

    continuarEleicao = true;
    do {
      System.out.println("Cadastrar pessoa eleitora?");
      System.out.println("1 - Sim");
      System.out.println("2 - Não");
      System.out.println("Entre com o número correspondente à opção desejada:");
      short opcao = scanner.nextShort();

      if (opcao == 1) {
        System.out.println("Entre com o nome da pessoa eleitora:");
        String nome = scanner.next();
        System.out.println("Entre com o cpf da pessoa eleitora:");
        String cpf = scanner.next();
        gerenciamentoVotacao.cadastrarPessoaEleitora(nome, cpf);
      } else if (opcao == 2) {
        continuarEleicao = false;
      }
    } while (continuarEleicao);

    System.out.println("\n---------- Votação iniciada! ----------\n");

    continuarEleicao = true;
    do {
      System.out.println("Entre com o número correspondente à opção desejada:");
      System.out.println("1 - Votar");
      System.out.println("2 - Resultado Parcial");
      System.out.println("3 - Finalizar Votação");
      short opcao = scanner.nextShort();

      if (opcao == 1) {
        System.out.println("Entre com o cpf da pessoa eleitora:");
        String cpfPessoaEleitora = scanner.next();
        System.out.println("Entre com o número da pessoa candidata:");
        int numeroPessoaCandidata = scanner.nextInt();
        gerenciamentoVotacao.votar(cpfPessoaEleitora, numeroPessoaCandidata);
      } else if (opcao == 2) {
        gerenciamentoVotacao.mostrarResultado();
      } else if (opcao == 3) {
        continuarEleicao = false;
      }
    } while (continuarEleicao);

    gerenciamentoVotacao.mostrarResultado();
    scanner.close();
  }
}
