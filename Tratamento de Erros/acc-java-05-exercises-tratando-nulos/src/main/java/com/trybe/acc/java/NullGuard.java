package com.trybe.acc.java;

/**
 * Classe NullGuard.
 */
public class NullGuard {
  /**
   * Imprime um nome ou nome nulo caso seja passado um numero impar.
   */
  public String printName(int number) {
    NullGenerator nullGenerator = new NullGenerator();

    try {
      return nullGenerator.getNome(number);
    } catch (Exception e) {
      return "Nome nulo";
    }
  }
}
