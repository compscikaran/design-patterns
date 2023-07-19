package com.design.patterns.creational.abstractfactory.factories;

import com.design.patterns.creational.abstractfactory.CardType;
import com.design.patterns.creational.abstractfactory.basicobjects.CreditCard;

//AbstractFactory
public abstract class CreditCardFactory {

	public static CreditCardFactory getCreditCardFactory(int creditScore) {
		if(creditScore > 650) {
			return new AmexFactory();
		} else {
			return new VisaFactory();
		}
	}

	public abstract CreditCard getCreditCard(CardType cardType);
}
