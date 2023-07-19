package com.design.patterns.creational.abstractfactory.factories;

import com.design.patterns.creational.abstractfactory.CardType;
import com.design.patterns.creational.abstractfactory.basicobjects.AmexGoldCreditCard;
import com.design.patterns.creational.abstractfactory.basicobjects.AmexPlatinumCreditCard;
import com.design.patterns.creational.abstractfactory.basicobjects.CreditCard;
import com.design.patterns.creational.abstractfactory.factories.CreditCardFactory;

public class AmexFactory extends CreditCardFactory {

	@Override
	public CreditCard getCreditCard(CardType cardType) {
		
		switch (cardType) {
			case GOLD: {
				return new AmexGoldCreditCard();
			}
			case PLATINUM: {
				return new AmexPlatinumCreditCard();
			}
			default:
				throw new IllegalStateException("Invalid cardType: " + cardType);
		}
	}
}
