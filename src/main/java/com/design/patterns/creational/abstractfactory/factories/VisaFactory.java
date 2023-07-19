package com.design.patterns.creational.abstractfactory.factories;

import com.design.patterns.creational.abstractfactory.CardType;
import com.design.patterns.creational.abstractfactory.basicobjects.CreditCard;
import com.design.patterns.creational.abstractfactory.basicobjects.VisaGoldCreditCard;
import com.design.patterns.creational.abstractfactory.basicobjects.VisaPlatinumCreditCard;
import com.design.patterns.creational.abstractfactory.factories.CreditCardFactory;

public class VisaFactory extends CreditCardFactory {

	@Override
	public CreditCard getCreditCard(CardType cardType) {
		switch (cardType) {
			case GOLD:
				return new VisaGoldCreditCard();
			case PLATINUM:
				return new VisaPlatinumCreditCard();
			default:
				throw new IllegalStateException("Invalid cardType: " + cardType);
		}
	}
}
