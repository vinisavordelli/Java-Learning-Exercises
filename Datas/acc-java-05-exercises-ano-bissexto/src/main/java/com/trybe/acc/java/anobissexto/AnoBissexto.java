package com.trybe.acc.java.anobissexto;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Classe que checa informações de ano bissexto.
 */
public class AnoBissexto {

  /**
   * Metodo Analisa se o ano atual é bisexto.
   *
   * @param ano um ano.
   * @return se o ano é bissexto.
   */
  public boolean identificarAnoBissexto(int ano) {
    return LocalDate.of(ano, 12, 31).isLeapYear();
  }

  /**
   * Metodo Identifica proximo ano bissexto.
   *
   * @param data uma data.
   * @return o próximo ano bissexto.
   */
  public int identificarProximoAnoBissexto(String data) {
    DateTimeFormatter formatadorData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    LocalDate proximoAnoBissexto = LocalDate.parse(data, formatadorData);
    while (!proximoAnoBissexto.isLeapYear()) {
      proximoAnoBissexto = proximoAnoBissexto.plusYears(1);
    }
    return proximoAnoBissexto.getYear();
  }
}