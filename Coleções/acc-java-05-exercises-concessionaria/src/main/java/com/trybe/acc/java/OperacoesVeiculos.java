package com.trybe.acc.java;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Classe responsável por representar as operações de uma concessionária.
 */
public class OperacoesVeiculos {
  public <T> int numVeiculosDiferentesVendidos(Stream<T> veiculosVendidos) {
    return (int) veiculosVendidos.distinct().count();
  }

  public <T> Stream<String> obterRepresentacao(Stream<T> veiculos) {
    return veiculos.map(Object::toString);
  }

  public <T> List<T> obterLista(Stream<T> veiculos) {
    return veiculos.collect(Collectors.toList());
  }
}
