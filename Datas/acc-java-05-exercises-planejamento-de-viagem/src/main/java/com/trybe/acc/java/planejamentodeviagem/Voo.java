package com.trybe.acc.java.planejamentodeviagem;

/**
 * Classe Responsável por trabalhar com informações sobre um voo.
 */
public class Voo {
  private int tempoVoo;

  /**
   * Método para retornar tempo de Voo.
   * 
   */
  public int retornarTempoVoo(double distanciaKm) {

    double duracaoDouble = distanciaKm / 700.0;

    return (int) duracaoDouble;
  }

  /**
   * Método para retornar informaçao do Voo.
   * 
   */
  public String retornarInformacaoVoo(String embarque, String origem, String desembarque,
      String destino) {
    return String.format(
        "Partida: %s\nOrigem: %s\n\nChegada: %s\nDestino: %s",
        embarque, origem, desembarque, destino
    );
  }
}
