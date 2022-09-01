package com.trybe.acc.java.sistemadevotacao;

import java.util.ArrayList;

/**
 * Classe que gerencia as pessoas candidatas e eleitoras cadastradas, assim como as votações.
 */
public class GerenciamentoVotacao {
  private final ArrayList<PessoaCandidata> pessoasCandidatas = new ArrayList<>();
  private final ArrayList<PessoaEleitora> pessoasEleitoras = new ArrayList<>();
  private final ArrayList<String> cpfComputado = new ArrayList<>();
  private int totalVotos = 0;

  /**
   * Método que cadastra uma pessoa candidata na eleição.
   */
  public void cadastrarPessoaCandidata(String nome, int numero) {
    boolean estaCadastrada = candidataEhCadastrada(numero);
    if (estaCadastrada) {
      System.out.println("Número da pessoa candidata já utilizado!");
    }
    PessoaCandidata pessoaCandidata = new PessoaCandidata(nome, numero);
    pessoasCandidatas.add(pessoaCandidata);
  }

  /**
   * Checa se a pessoa é cadastrada.
   */
  private boolean candidataEhCadastrada(int numero) {
    for (PessoaCandidata pessoaCandidata : pessoasCandidatas) {
      if (pessoaCandidata.getNumero() == numero) {
        return true;
      }
    }
    return false;
  }

  /**
   * Cadastra pessoa eleitora.
   */
  public void cadastrarPessoaEleitora(String nome, String cpf) {
    boolean estaCadastrada = eleitoraEhCadastrada(cpf);
    if (estaCadastrada) {
      System.out.println("Pessoa eleitora já cadastrada!");
    }
    PessoaEleitora pessoaEleitora = new PessoaEleitora(nome, cpf);
    pessoasEleitoras.add(pessoaEleitora);
  }

  /**
   * Checa se a pessoa eleitora é cadastrada.
   */
  private boolean eleitoraEhCadastrada(String cpf) {
    for (PessoaEleitora pessoaEleitora : pessoasEleitoras) {
      if (cpf.equals(pessoaEleitora.getCpf())) {
        return true;
      }
    }
    return false;
  }

  /**
   * Responsável pelo sistema de contabilização e registro de votos.
   */
  public void votar(String cpfEleitor, int candidateNumber) {
    boolean jaVotou = false;

    for (String cpfJaVotou : this.cpfComputado) {
      if (cpfJaVotou.equals(cpfEleitor)) {
        jaVotou = true;
        break;
      }
    }

    if (jaVotou) {
      System.out.println("Pessoa eleitora já votou!");
    } else {
      this.cpfComputado.add(cpfEleitor);
      this.totalVotos += 1;
    }

    for (PessoaCandidata candidate : this.pessoasCandidatas) {
      if (candidate.getNumero() == candidateNumber) {
        candidate.receberVoto();
      }
    }
  }

  /**
   * Método Responsavel por mostrar o resultado das pessoas candidatas.
   */

  public void mostrarResultado() {
    if (totalVotos == 0) {
      System.out.println("É preciso ter pelo menos um voto para mostrar o resultado");
      return;
    }
    mostrarResultadoDosCandidatos();
    System.out.println("Total de votos: " + totalVotos);
  }

  /**
   * Metodo responsavel por iterar pelos candidatos.
   */

  private void mostrarResultadoDosCandidatos() {
    for (PessoaCandidata pessoaCandidata : pessoasCandidatas) {
      mostrarResultadoDoCandidato(pessoaCandidata);
    }
  }

  /**
   * Metodo responsável por mostrar os resultados eleitorais por pessoa candidata.
   */
  private void mostrarResultadoDoCandidato(PessoaCandidata pessoaCandidata) {
    String nome = pessoaCandidata.getNome();
    int votos = pessoaCandidata.getVotos();

    String resultado = String.format(
        "Nome: %s - %s votos ( %s%% )",
        nome, votos, calcularPorcentagemVotos(votos)
    );
    System.out.println(resultado);
  }

  private float calcularPorcentagemVotos(int votos) {
    return Math.round(((float) votos / totalVotos) * 100);
  }
}
