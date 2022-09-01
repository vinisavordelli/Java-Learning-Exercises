package com.trybe.acc.java.sistemadevotacao;

/**
 * Classe que representa uma pessoa.
 */
public abstract class Pessoa {
  protected String nome;

  public abstract String getNome();

  public abstract void setNome(String nome);
}