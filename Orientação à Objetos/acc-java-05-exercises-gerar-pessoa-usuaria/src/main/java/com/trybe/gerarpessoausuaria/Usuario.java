package com.trybe.gerarpessoausuaria;

public class Usuario extends Pessoa {

  public Usuario(String nome, String sobrenome) {
    super(nome, sobrenome);
  }

  /**
   * Método para pegar o nome e sobrenome do usuário.
   *
   */
  public String getUsuario() {
    if (this.nome == null || this.sobrenome == null) {
      return "Usuário inválido";
    }

    if (!this.nome.isEmpty() && !this.sobrenome.isEmpty()) {
      return nome + "." + sobrenome;
    }

    return "Usuário inválido";
  }
}
