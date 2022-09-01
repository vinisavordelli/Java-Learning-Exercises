package com.trybe.conversorcsv;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Classe Responsável por Converter os Arquivos csv.
 */
public class Conversor {

  /**
   * Função utilizada apenas para validação da solução do desafio.
   *
   * @param args Não utilizado.
   * @throws IOException Caso ocorra algum problema ao ler os arquivos de entrada ou
   *                     gravar os arquivos de saída.
   */
  public static void main(String[] args) throws IOException {
    File pastaDeEntradas = new File("./entradas/");
    File pastaDeSaidas = new File("./saidas/");
    new Conversor().converterPasta(pastaDeEntradas, pastaDeSaidas);
  }

  /**
   * Converte todos os arquivos CSV da pasta de entradas. Os resultados são gerados
   * na pasta de saídas, deixando os arquivos originais inalterados.
   *
   * @param pastaDeEntradas Pasta contendo os arquivos CSV gerados pela página web.
   * @param pastaDeSaidas   Pasta em que serão colocados os arquivos gerados no formato
   *                        requerido pelo subsistema.
   * @throws IOException Caso ocorra algum problema ao ler os arquivos de entrada ou
   *                     gravar os arquivos de saída.
   */
  public void converterPasta(File pastaDeEntradas, File pastaDeSaidas) throws IOException {
    if (pastaDeEntradas.exists() && pastaDeEntradas.isDirectory()) {
      File[] arquivos = listarArquivos(pastaDeEntradas);
      if (arquivos != null) {
        criarPasta(pastaDeSaidas);
        for (File arquivo : arquivos) {
          criarArquivo(pastaDeSaidas, arquivo);
        }
      }
    }
  }

  private File[] listarArquivos(File pastaDeEntradas) {
    return pastaDeEntradas.listFiles(
        file -> file.getName().endsWith(".csv")
    );
  }

  private void criarPasta(File pastaDeSaidas) {
    pastaDeSaidas.mkdirs();
  }

  private void criarArquivo(File pastaDeSaidas, File arquivoDeEntrada) throws IOException {
    File arquivoDeSaida = new File(pastaDeSaidas, arquivoDeEntrada.getName());
    arquivoDeSaida.createNewFile();

    BufferedReader leitor = new BufferedReader(new FileReader(arquivoDeEntrada));
    BufferedWriter escritor = new BufferedWriter(new FileWriter(arquivoDeSaida));
    String primeiraLinha = leitor.readLine();

    escritor.write(primeiraLinha);
    escritor.newLine();
    String linha = leitor.readLine();
    while (linha != null) {
      String textoFormatado = formatarTexto(linha);
      escritor.write(textoFormatado);
      escritor.newLine();
      linha = leitor.readLine();
    }

    leitor.close();
    escritor.close();
  }

  private String formatarTexto(String texto) {
    String[] input = texto.split(",");
    String nome = input[0].toUpperCase();
    String dataDeNascimento = formatarData(input[1]);
    String email = input[2];
    String cpf = formatarCpf(input[3]);

    return String.format("%s,%s,%s,%s", nome, dataDeNascimento, email, cpf);
  }

  private String formatarData(String data) {
    String[] tipoData = data.split("/");

    String dia = tipoData[0];
    String mes = tipoData[1];
    String ano = tipoData[2];

    return String.format("%s-%s-%s", ano, mes, dia);
  }

  private String formatarCpf(String cpf) {

    String parte1 = cpf.substring(0, 3);
    String parte2 = cpf.substring(3, 6);
    String parte3 = cpf.substring(6, 9);
    String parte4 = cpf.substring(9);

    return String.format(
        "%s.%s.%s-%s", parte1, parte2, parte3, parte4
    );
  }
}