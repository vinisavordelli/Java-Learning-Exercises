package com.trybe.conexaodiscada;

import java.util.Random;

/**
 * Classe ConexaoDiscada.
 */
public class ConexaoDiscada {

  /**
   * Método principal.
   */
  public static void main(String[] args) {
    int tries = 0;
    boolean isConnected;

    do {
      isConnected = conectou();
      tries++;
    } while (!isConnected && tries < 3);
  }

  // Chame esta função escrevendo `conectou()`
  static boolean conectou() {
    return conexaoDiscada.verdadeiroOuFalso();
  }

  static ConexaoDiscada conexaoDiscada = new ConexaoDiscada();

  // Retorna verdadeiro ou falso
  boolean verdadeiroOuFalso() {
    return new Random().nextInt(2) == 1;
  }

}
