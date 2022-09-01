package com.trybe.acc.java.jogodasfazendas;

import java.util.ArrayList;

/**
 * Class responsible for providin the player results.
 */
public class PlayerResult {
  private final String playerName;
  private final Farm[] farms;

  public PlayerResult(String name, Farm[] farms) {
    this.playerName = name;
    this.farms = farms;
  }

  /**
   * Computes the player score.
   */
  public double score() {
    double score = 0;
    for (Farm farm : farms) {
      score += farm.area();
    }
    return score;
  }

  /**
   * Creates The Player result output.
   */
  public String toString() {
    double score = this.score();
    ArrayList<Double> farmAreas = new ArrayList<>();
    for (Farm farm : farms) {
      farmAreas.add(farm.area());
    }
    return String.format("Jogador: %s\nÁrea das fazendas: %s\nPontuação: %f",
            playerName, farmAreas, score);
  }
}