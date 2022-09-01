package com.trybe.idadeemdias;

import java.util.Scanner;

/**
 * Main Class.
 */
public class Main {
  /**
   * Main Method.
   */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Qual é o seu nome?");

    String name = scanner.next();

    System.out.println("Qual é a sua idade em anos, meses e dias?");

    System.out.println("anos:");
    int years = scanner.nextInt();

    System.out.println("meses:");
    int months = scanner.nextInt();

    System.out.println("dias:");
    int days = scanner.nextInt();

    Pessoa pessoa = new Pessoa();

    int parsedAge = pessoa.calcularIdadeEmDias(years, months, days);
    System.out.println("Olá " + name + ", sua idade em dias é " + parsedAge);

  }

}
