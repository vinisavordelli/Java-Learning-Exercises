package com.trybe.simuladordepix;

/**
 * Classe ErroDePix.
 */
public abstract class ErroDePix extends Exception {

  public ErroDePix(String mensagem) {
    super(mensagem);
  }
}
