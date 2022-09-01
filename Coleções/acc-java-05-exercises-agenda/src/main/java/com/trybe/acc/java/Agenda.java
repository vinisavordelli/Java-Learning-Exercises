package com.trybe.acc.java;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe responsável por funcionalidades de uma agenda.
 */
public class Agenda {
  private List<String> contatos = new ArrayList<>();

  public void incluirContato(String contato) {
    contatos.add(contato);
  }

  public void excluirContato(String contato) {
    contatos.remove(contato);
  }

  public boolean verificaContato(String contato) {
    return contatos.contains(contato);
  }

  public int tamanhoAgenda() {
    return contatos.size();
  }

}
