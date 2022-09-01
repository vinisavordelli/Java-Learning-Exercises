package com.trybe.acc.java.transformatexto;

/**
 * Classe responsável por alterações no texto.
 */
public class Texto {

  /**
   * Método transforma texto.
   */
  public String transformaTexto(String frase) {
    String stringSemPositivo = frase.replace("+", " ");
    int indexDeA = frase.indexOf("a");

    if (indexEhPar(indexDeA)) {
      return stringSemPositivo.toUpperCase();
    }

    return stringSemPositivo.split(" ")[0];
  }

  /**
   * Método que checa se é par.
   */
  public boolean indexEhPar(int index) {
    return index % 2 == 0;
  }
}