package com.trybe.acc.java;

import java.util.List;
import java.util.stream.Stream;

/**
 * Classe conversora de itens e coleções para streams.
 */
public class CriadorStream {
  public <T> Stream<T> criarDoItem(T item) {
    return Stream.of(item);
  }

  public <T> Stream<T> criarDoArray(T[] itemArray) {
    return Stream.of(itemArray);
  }

  public <T> Stream<T> criarDaLista(List<T> itemList) {
    return itemList.stream();
  }
}
