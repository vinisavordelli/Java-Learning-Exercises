package com.trybe.polimorfismo;

/**
 * Classe para funcionarios CLT.
 */
public class FuncionarioPessoaFisica extends Funcionario {

  @Override
  public double calcularSalarioLiquido() {
    double imposto = 0.2;
    return this.getSalarioBruto() * (1 - imposto);
  }
}
