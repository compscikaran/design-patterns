package com.design.patterns.behavioral.strategy;

public class AmexStrategy implements ValidationStrategy {


    @Override
    public boolean isValid(CreditCard card) {
        boolean isValid = card.getNumber().startsWith("37") || card.getNumber().startsWith("34");
        if(isValid) {
            System.out.println("Passed check 1");
            isValid = card.getNumber().length() == 15;
        }
        if(isValid) {
            System.out.println("Passed check 2");
            isValid = this.passesLuhn(card.getNumber());
        }
        if(isValid) {
            System.out.println("Passed check 3");
        }
        return isValid;
    }
}
