package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class SingaporeDollar implements ConvertableCurrency {

    @Override
    public Double convert(CurrencyType currencyType) {

        return (CurrencyType.UNIVERSAL_CURRENCY.getRate()/CurrencyType.SINGAPORE_DOLLAR.getRate())
                * currencyType.getRate();
    }
}
