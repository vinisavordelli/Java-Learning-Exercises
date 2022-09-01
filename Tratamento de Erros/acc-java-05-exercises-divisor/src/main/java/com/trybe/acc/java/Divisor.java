package com.trybe.acc.java;

/**
 * Divisor Class.
 */
public class Divisor {

  /**
   * Faz a função de dividir.
   *
   * @param a Dividendo.
   * @param b divisor.
   * @return resultado da divisão.
   */
  public int dividir(int a, int b) {
    try {
      return a / b;
    } catch (ArithmeticException e) {
      return 0;
    }
  }
}
