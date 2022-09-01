package com.trybe.acc.java;

/**
 * Classe NullGenerator.
 */
public class NullGenerator {
  /**
   * Metodo retorna um nome se passar um numero par.
   */
  public String getNome(int number) throws Exception {
    if (number % 2 == 0) {
      return "BOB";
    }

    throw new Exception();
  }
}
