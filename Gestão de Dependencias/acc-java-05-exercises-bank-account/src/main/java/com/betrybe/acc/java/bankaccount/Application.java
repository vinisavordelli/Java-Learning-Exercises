package com.betrybe.acc.java.bankaccount;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * A class.
 */
public class Application {

  /**
   * A simple get method.
   */
  public static void main(String[] args) {
    try {
      AccountNumberFormatter accountNumberFormatter = new AccountNumberFormatter();
      Scanner scanner = new Scanner(System.in);
      System.out.println("Informe o número da conta:");
      int numberAccount = scanner.nextInt();
      String numberAccountFormatter = accountNumberFormatter.formatAccountNumber(numberAccount);
      System.out.println("Numero da conta: " + numberAccountFormatter);
      scanner.close();
    } catch (InputMismatchException e) {
      System.out.println("Número da conta inválido!");
    }
  }
}


