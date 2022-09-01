package com.trybe.acc.java.jogodasfazendas;

/**
 * Rectangle Farm Class.
 */
public class Rectangle extends Polygon implements Farm {
  public Rectangle(double base, double height) {
    super(base, height);
  }

  @Override
  public double area() {
    return this.base * this.height;
  }
}
