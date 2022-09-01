package com.trybe.acc.java.excecaomaioridade;

/**
 * Exceção lançada ao verificar pessoas menores de idade.
 */
public class PessoaMenorDeIdadeException extends Exception {
  public PessoaMenorDeIdadeException(String message) {
    super(message);
  }
}