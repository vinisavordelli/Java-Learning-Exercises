package com.trybe.acc.java.sistemarh;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PessoaColaboradoraTest {
  private static final double SALARIO_BRUTO = 1000;
  private static final int ANO = 5;

  @Test
  @DisplayName("Testa se a função obtem o salário liquido corretamente")
  public void testeCalcularSalarioLiquido() {
    PessoaColaboradora pessoaColaboradora = new PessoaColaboradora();
    pessoaColaboradora.setSalarioBruto(SALARIO_BRUTO);

    double salarioLiquido = pessoaColaboradora.calcularSalarioLiquido();
    assertEquals(800, salarioLiquido);
  }


  @Test
  @DisplayName("T")
  public void testeCalcularValorBrutoRecebidoAnual() {
    PessoaColaboradora pessoaColaboradora = new PessoaColaboradora();
    pessoaColaboradora.setSalarioBruto(SALARIO_BRUTO);

    double salarioBrutoAnual = pessoaColaboradora.calcularValorBrutoRecebidoAnual(ANO);
    assertEquals(60000, salarioBrutoAnual);
  }


  @Test
  @DisplayName("Testa o salário líquido anual ao longo de x anos")
  public void testeCalcularValorLiquidoRecebidoAnual() {
    PessoaColaboradora pessoaColaboradora = new PessoaColaboradora();
    pessoaColaboradora.setSalarioBruto(SALARIO_BRUTO);

    double salarioLiquidoAnual = pessoaColaboradora.calcularValorLiquidoRecebidoAnual(ANO);
    assertEquals(48000, salarioLiquidoAnual);
  }


  @Test
  @DisplayName("Testa o valor do imposto ao longo de x anos")
  public void testeCalcularValorImpostoAnual() {
    PessoaColaboradora pessoaColaboradora = new PessoaColaboradora();
    pessoaColaboradora.setSalarioBruto(SALARIO_BRUTO);

    double impostoAnual = pessoaColaboradora.calcularValorImpostoAnual(ANO);
    assertEquals(12000, impostoAnual);
  }

}
