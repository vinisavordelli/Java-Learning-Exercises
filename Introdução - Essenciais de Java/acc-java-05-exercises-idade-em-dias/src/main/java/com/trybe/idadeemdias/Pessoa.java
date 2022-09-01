package com.trybe.idadeemdias;

/**
 * Pessoa Class.
 */
public class Pessoa {
  public int calcularIdadeEmDias(int years, int months, int days) {
    return years * 365 + months * 30 + days;
  }
}
