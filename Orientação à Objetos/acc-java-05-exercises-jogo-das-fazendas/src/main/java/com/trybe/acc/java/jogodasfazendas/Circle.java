package com.trybe.acc.java.jogodasfazendas;

/**
 * Circle Farm Class.
 */
public class Circle implements Farm {
  protected double radius;
  private static final double PI = 3.14159;

  public Circle(double radius) {
    this.radius = radius;
  }

  @Override
  public double area() {
    return Math.round(Circle.PI * Math.pow(this.radius, 2));
  }
}