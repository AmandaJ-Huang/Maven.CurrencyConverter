package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

import java.util.Currency;

public class AustralianDollar implements ConvertableCurrency {

    @Override
    public Double convert(CurrencyType currencyType) {

        return (CurrencyType.UNIVERSAL_CURRENCY.getRate()/CurrencyType.AUSTRALIAN_DOLLAR.getRate())
                * currencyType.getRate();
    }
}
