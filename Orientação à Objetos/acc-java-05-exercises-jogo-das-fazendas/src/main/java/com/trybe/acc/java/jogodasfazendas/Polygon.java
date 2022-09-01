package com.trybe.acc.java.jogodasfazendas;

/**
 * Polygon Class.
 */
public abstract class Polygon {
  protected double base;
  protected double height;

  public Polygon(double base, double height) {
    this.base = base;
    this.height = height;
  }
}