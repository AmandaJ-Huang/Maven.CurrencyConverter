package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class CanadianDollar implements ConvertableCurrency {

    @Override
    public Double convert(CurrencyType currencyType) {

        return (CurrencyType.UNIVERSAL_CURRENCY.getRate()/CurrencyType.CANADIAN_DOLLAR.getRate())
                * currencyType.getRate();
    }
}
