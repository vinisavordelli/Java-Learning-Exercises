package com.trybe.acc.java.jogodasfazendas;

/**
 * Square Farm Class.
 */
public class Square implements Farm {
  private final double side;

  public Square(double side) {
    this.side = side;
  }

  @Override
  public double area() {
    return Math.pow(this.side, 2);
  }
}