package com.trybe.simuladordepix;

import java.io.IOException;

/**
 * Classe Controlador Pix.
 */
public class ControladorDePix {

  private final ProcessadorDePix processadorDePix;

  public ControladorDePix(ProcessadorDePix processadorDePix) {
    this.processadorDePix = processadorDePix;
  }

  /**
   * Método a ser executado no momento em que a pessoa usuária confirmar
   * a operação de Pix.
   *
   * @param valor Valor em centavos a ser transferido.
   * @param chave Chave Pix do beneficiário da transação.
   *
   * @return Mensagem a ser exibida à pessoa usuária, informando-a sobre
   *         o resultado da operação.
   */
  public String aoConfirmarPix(int valor, String chave) {
    try {
      processadorDePix.executarPix(valor, chave);
    } catch (ErroValorNaoPositivo e) {
      return Mensagens.VALOR_NAO_POSITIVO;
    } catch (ErroChaveEmBranco e) {
      return Mensagens.CHAVE_EM_BRANCO;
    } catch (ErroSaldoInsuficiente e) {
      return Mensagens.SALDO_INSUFICIENTE;
    } catch (ErroChaveNaoEncontrada e) {
      return Mensagens.CHAVE_NAO_ENCONTRADA;
    } catch (ErroDePix e) {
      return Mensagens.ERRO_INTERNO;
    } catch (IOException e) {
      return Mensagens.ERRO_DE_CONEXAO;
    }
    return Mensagens.SUCESSO;
  }
}
