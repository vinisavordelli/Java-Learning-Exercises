package com.trybe.acc.java.controledeacesso;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;

/**
 * VisitorLog Class.
 */
public class VisitorsLog {
  private static final ArrayList<Integer> visitors = new ArrayList<>();

  private static int minorVisitors;
  private static int adultVisitors;
  private static int seniorVisitors;

  private static double minorVisitorsRatio;
  private static double adultVisitorsRatio;
  private static double seniorVisitorsRatio;

  NumberFormat decimalF = new DecimalFormat("#0.00");

  /**
   * add visitor method.
   */
  public void addVisitor(int age) {
    VisitorsLog.visitors.add(age);
  }

  /**
   * get visitor by age method.
   */
  public void getVisitorsByAge() {
    for (int age : VisitorsLog.visitors) {
      if (age < 18) {
        VisitorsLog.minorVisitors++;
      } else if (age < 50) {
        VisitorsLog.adultVisitors++;
      } else {
        VisitorsLog.seniorVisitors++;
      }
    }
    int totalVisitors = VisitorsLog.visitors.size();

    VisitorsLog.minorVisitorsRatio = (double) VisitorsLog.minorVisitors * 100 / totalVisitors;
    VisitorsLog.adultVisitorsRatio = (double) VisitorsLog.adultVisitors * 100 / totalVisitors;
    VisitorsLog.seniorVisitorsRatio = (double) VisitorsLog.seniorVisitors * 100 / totalVisitors;
  }

  /**
   * Convert string to decimal method.
   */
  public String convertToDecimal(double value) {
    return decimalF.format(value);
  }

  /**
   * create and show report method.
   */
  public void showReport() {

    getVisitorsByAge();
    String qttyTitle = "----- Quantidade -----";
    String minorsQtty = String.format("menores: %d", VisitorsLog.minorVisitors);
    String adultsQtty = String.format("adultas: %d", VisitorsLog.adultVisitors);
    String seniorsQtty = String.format("a partir de 50: %d", VisitorsLog.seniorVisitors);

    System.out.println(qttyTitle);
    System.out.println(minorsQtty);
    System.out.println(adultsQtty);
    System.out.println(seniorsQtty);

    System.out.println("----- Percentual -----");
    System.out.println("menores: " + convertToDecimal(minorVisitorsRatio) + "%");
    System.out.println("adultas: " + convertToDecimal(adultVisitorsRatio) + "%");
    System.out.println("a partir de 50: " + convertToDecimal(seniorVisitorsRatio) + "%");
  }
}
