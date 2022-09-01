package com.trybe.consultafilmes;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;


/**
 * Classe responsável por consultar filmes.
 */
public class Consultas {

  private final Collection<Filme> filmes;

  public Consultas(Collection<Filme> filmes) {
    this.filmes = filmes;
  }

  /**
   * Consulta 1: a partir da coleção de filmes desta classe, este método retorna o conjunto
   * de atores que interpretaram a si próprios em pelo menos um desses filmes.
   *
   * <p>Considera-se "atores que interpretaram a si próprios" aqueles que têm o seu nome como
   * uma das chaves do Map `atoresPorPersonagem` e também como um dos itens pertencentes ao
   * conjunto associado a esta mesma chave.</p>
   */
  public Set<String> atoresQueInterpretaramSiProprios() {
    return this.filmes.stream()
        .flatMap(filme -> filme.atoresPorPersonagem.entrySet().stream())
        .filter(personagemRepresentado ->
            personagemRepresentado.getValue().contains(personagemRepresentado.getKey()))
        .map(Map.Entry::getKey)
        .collect(Collectors.toSet());
  }

  /**
   * Consulta 2: a partir da coleção de filmes desta classe, este método retorna a lista de atores
   * que atuaram em pelo menos um filme de um determinado diretor. A lista retornada está disposta
   * em ordem alfabética.
   *
   * <p>Considera-se que um ator tenha atuado em um filme de um determinado diretor se ele tem o
   * seu nome como um dos itens do campo `atores`, ao mesmo tempo em que o diretor em questão
   * tem o seu nome como um dos itens do campo `diretores` do mesmo filme.</p>
   */
  public List<String> atoresQueAtuaramEmFilmesDoDiretorEmOrdemAlfabetica(String diretor) {
    return this.filmes.stream()
        .filter(filme -> filme.diretores.contains(diretor))
        .flatMap(filme -> filme.atores.stream())
        .distinct().sorted()
        .collect(Collectors.toList());
  }

  /**
   * Consulta 3: a partir da coleção de filmes desta classe, este método retorna a lista de filmes
   * em que pelo menos um dos diretores tenha atuado. A lista retornada está disposta em ordem de
   * lançamento, com os filmes mais recentes no início.
   *
   * <p>Considera-se "filmes em que pelo menos um dos diretores tenha atuado" aqueles em que
   * pelo menos um dos itens do campo `diretores` também é um item do campo `atores`.</p>
   */
  public List<Filme> filmesEmQuePeloMenosUmDiretorAtuouMaisRecentesPrimeiro() {
    return this.filmes.stream()
        .filter(filme -> filme.diretores.stream().anyMatch(filme.atores::contains))
        .distinct().sorted((filme1, filme2) -> filme2.anoDeLancamento - filme1.anoDeLancamento)
        .collect(Collectors.toList());
  }

  /**
   * Consulta 4: a partir da coleção de filmes desta classe, este método retorna um Map contendo
   * todos os filmes lançados em um determinado ano agrupados por categoria.
   *
   * <p>Cada chave do Map representa uma categoria, enquanto cada valor representa o
   * conjunto de filmes que se encaixam na categoria da chave correspondente.</p>
   */
  public Map<String, Set<Filme>> filmesLancadosNoAnoAgrupadosPorCategoria(int ano) {
    Map<String, Set<Filme>> filmesDoAnoPorCategoria = new HashMap<>();

    for (Filme filme : filmes) {
      if (filme.anoDeLancamento == ano) {
        for (String categoria : filme.categorias) {
          if (!filmesDoAnoPorCategoria.containsKey(categoria)) {
            filmesDoAnoPorCategoria.put(categoria, new HashSet<>());
          }
          Set<Filme> filmesDoAnoDaCategoria = filmesDoAnoPorCategoria.get(categoria);
          filmesDoAnoDaCategoria.add(filme);
        }
      }
    }
    return filmesDoAnoPorCategoria;
  }
}