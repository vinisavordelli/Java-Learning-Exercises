package com.trybe.contapoupanca;

/**
 * Main Class.
 */
public class ContaPoupanca {
  String titularConta;
  double saldo;

  ContaPoupanca(String titularConta, double saldo) {
    this.saldo = saldo;
    this.titularConta = titularConta;
  }

  void depositar(double quantia) {
    saldo += quantia;
  }

  void sacar(double quantia) {
    saldo -= quantia;
  }

  double mostrarSaldo() {
    return saldo;
  }

  String mostrarTitularConta() {
    return titularConta;
  }
}
