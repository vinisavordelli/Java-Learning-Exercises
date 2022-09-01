package com.trybe.acc.java;

/**
 * Classe que representa uma pessoa.
 */
public class Pessoa {
  private final String nome;

  Pessoa(String nome) {
    this.nome = nome;
  }

  /**
   * Retorna o nome.
   */
  public String getNome() {
    return nome;
  }
}
