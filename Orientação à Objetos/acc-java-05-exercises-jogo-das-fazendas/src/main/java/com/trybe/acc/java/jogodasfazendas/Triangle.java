package com.trybe.acc.java.jogodasfazendas;

/**
 * Triangle Farm Class.
 */
public class Triangle extends Polygon implements  Farm {
  public Triangle(double base, double height) {
    super(base, height);
  }

  @Override
  public double area() {
    return this.base * this.height / 2;
  }
}