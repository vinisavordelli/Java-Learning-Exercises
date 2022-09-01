package com.trybe.acc.java;

import java.time.LocalDate;

/**
 * Classe Simuladora de Rendimentos.
 */
public class SimuladorRendimento {

  /**
   * Método Main.
   */
  public static void main(String[] args) {
    SimuladorRendimento obj = new SimuladorRendimento();
    double inicial = 500;
    double objetivo = 5000;
    System.out.println("Com " + inicial + " seu rendimento será " + objetivo
        + " no ano " + obj.simularRendimentoAnos(inicial, objetivo));
  }

  /**
   * Método para simular rendimentos.
   */
  public int simularRendimentoAnos(double valorInicial, double valorDesejado) {
    int anosPassados = 0;
    double jurosAnuais = 0.1;
    LocalDate year = LocalDate.now();

    double valorPresente = valorInicial;

    while (valorPresente < valorDesejado) {
      valorPresente += valorPresente * jurosAnuais;
      anosPassados += 1;
    }

    return year.plusYears(anosPassados).getYear();
  }
}
