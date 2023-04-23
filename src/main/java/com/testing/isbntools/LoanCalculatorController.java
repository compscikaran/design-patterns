package com.testing.isbntools;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class LoanCalculatorController {

    public void processNewLoanApplication(LoanApplication loan) {
        BigDecimal applicableRate = loan.getInterestRate().divide(new BigDecimal("100"));
        applicableRate = applicableRate.multiply(new BigDecimal(loan.getTermInMonths()/12));
        applicableRate = applicableRate.add(new BigDecimal("1"));
        BigDecimal totalRepayable = new BigDecimal(loan.getPrincipal() * Double.parseDouble(applicableRate.toString()));
        BigDecimal repayment = totalRepayable.divide(new BigDecimal("" + loan.getTermInMonths()), RoundingMode.UP);
        loan.setRepayment(repayment);
    }
}
