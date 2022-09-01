package com.trybe.acc.java.controledeacesso;

import java.util.Scanner;

/**
 * Principal class.
 */
public class Principal {
  /**
   * Método Principal.
   */
  public static void main(String[] args) {

    Principal principal = new Principal();
    Scanner scanner = new Scanner(System.in);

    short option = 1;

    while (option == 1) {
      System.out.println("Entre com o número correspondente à opção desejada:");
      System.out.println("1 - Acessar o estabelecimento");
      System.out.println("2 - Finalizar sistema e mostrar relatório");
      option = scanner.nextShort();

      if (option == 1) {
        principal.registerVisitor(scanner);
      } else if (option == 2) {
        principal.showVisitorsReport();
      } else {
        System.out.println("Entre com uma opção válida");
      }
    }

    scanner.close();
  }

  /**
   * Register client visit.
   */
  public void registerVisitor(Scanner scanner) {
    VisitorsLog visitorsLog = new VisitorsLog();

    System.out.println("Entre com sua idade:");
    short visitorAge = scanner.nextShort();

    if (visitorAge < 18) {
      System.out.println("Pessoa cliente menor de idade, catraca liberada!");
    } else if (visitorAge < 50) {
      System.out.println("Pessoa adulta, catraca liberada!");
    } else {
      System.out.println("Pessoa adulta a partir de 50, catraca liberada!");
    }
    visitorsLog.addVisitor(visitorAge);
  }

  /**
   * Show Visitors Report.
   */
  public void showVisitorsReport() {
    VisitorsLog visitorsLog = new VisitorsLog();
    visitorsLog.showReport();
  }
}
