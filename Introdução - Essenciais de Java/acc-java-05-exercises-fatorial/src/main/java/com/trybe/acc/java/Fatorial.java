package com.trybe.acc.java;

/**
 * Main Class.
 */
public class Fatorial {

  /**
   * Método Principal.
   */
  public static void main(String[] args) {
    int number = 18;

    long fatorial = 1L;

    for (int i = number; i > 0; i--) {
      fatorial = fatorial * i;
      System.out.println(i);
    }

    System.out.println("O fatorial de 18 é igual a " + fatorial);
  }
}


