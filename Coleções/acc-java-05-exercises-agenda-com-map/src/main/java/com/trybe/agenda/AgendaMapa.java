package com.trybe.agenda;

import java.util.HashMap;
import java.util.Map;

/**
 * Classe responsável pelas funcionalidades de uma agenda.
 */
public class AgendaMapa {

  private final Map<String, String> schedule = new HashMap<>();
  /**
   * Método utilizado para adicionar um contato.
   */

  public void incluirContato(String nome, String telefone) {
    this.schedule.put(nome, telefone);
  }

  /**
   * Método utilizado para excluir um contato.
   */
  public void excluirContato(String nome) {
    this.schedule.remove(nome);
  }

  /**
   * Método utilizado para verificar se o contato existe.
   */
  public boolean verificaContato(String nome) {
    return this.schedule.containsKey(nome);
  }

  /**
   * Método utilizado para checar o tamanho da agenda.
   */
  public int tamanhoAgenda() {
    return this.schedule.size();
  }

  /**
   * Método utilizado para atualizar um telefone dado um nome e o novo telefone.
   */
  public void atualizarTelefone(String nome, String telefone) {
    this.schedule.put(nome, telefone);
  }

  /**
   * Metodo utilizado para obter um telefone atraves de um nome.
   */
  public String obterTelefone(String nome) {
    return this.schedule.get(nome);
  }
}