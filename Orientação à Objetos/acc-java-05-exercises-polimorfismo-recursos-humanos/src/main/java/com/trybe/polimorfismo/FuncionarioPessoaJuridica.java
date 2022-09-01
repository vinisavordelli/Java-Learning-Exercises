package com.trybe.polimorfismo;

/**
 * Classe para funcionarios PJ.
 */
public class FuncionarioPessoaJuridica extends Funcionario {
  @Override
  public double calcularSalarioLiquido() {
    return this.getSalarioBruto() * 0.9;
  }
}
