package com.betrybe.acc.java.bankaccount;

import org.apache.commons.lang3.StringUtils;

/**
 * AccountNumberFormatter.
 */
public class AccountNumberFormatter {

  /**
   * Formata o número da conta.
   *
   * @param literalAccountNumber número da conta
   */
  public String formatAccountNumber(int literalAccountNumber) {
    String accountNumber = String.valueOf(literalAccountNumber);
    if (accountNumber.length() < 6) {
      return StringUtils.leftPad(accountNumber, 6, '0');
    }
    if (accountNumber.length() > 6) {
      return StringUtils.right(accountNumber, 6);
    }
    return accountNumber;
  }

}