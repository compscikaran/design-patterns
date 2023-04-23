package com.testing.isbntools;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Spy;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.spy;

public class SpyTest {

    @Spy
    LoanApplication loanApplication;

    LoanCalculatorController controller;

    @BeforeEach
    public void init() {
        loanApplication = spy(new LoanApplication());
        controller = new LoanCalculatorController();
    }

    @Test
    public void test1YearLoanWholePounds() {
        loanApplication.setPrincipal(1200);
        loanApplication.setTermInMonths(12);
        doReturn(new BigDecimal(10)).when(loanApplication).getInterestRate();
        controller.processNewLoanApplication(loanApplication);
        assertEquals(new BigDecimal(110), loanApplication.getRepayment());
    }

    @Test
    public void test2YearLoanWholePounds() {
        loanApplication.setPrincipal(1200);
        loanApplication.setTermInMonths(24);
        doReturn(new BigDecimal(10)).when(loanApplication).getInterestRate();
        controller.processNewLoanApplication(loanApplication);
        assertEquals(new BigDecimal(60), loanApplication.getRepayment());
    }

    @Test
    public void test5YearLoanWholePounds() {
        loanApplication.setPrincipal(5000);
        loanApplication.setTermInMonths(60);
        doReturn(new BigDecimal(6.5)).when(loanApplication).getInterestRate();
        controller.processNewLoanApplication(loanApplication);
        assertEquals(new BigDecimal(111), loanApplication.getRepayment());
    }
}
