package com.trybe.acc.java.numerospares;

/**
 * Classe NumerosPares.
 */
public class NumerosPares {

  /**
   * Método para implementar o for que vai gerar os números de 4 a 20.
   */
  public static void main(String[] args) {
    for (int number = 4; number <= 20; number += 2) {
      imprime(number);
    }
  }

  /**
   * Método para imprimir no console os números de 4 a 20.
   */
  public static void imprime(int numero) {
    System.out.println(numero);
  }

}
