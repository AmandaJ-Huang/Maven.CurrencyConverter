package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class ChineseYR implements ConvertableCurrency {

    @Override
    public Double convert(CurrencyType currencyType) {

        return (CurrencyType.UNIVERSAL_CURRENCY.getRate()/CurrencyType.CHINESE_YR.getRate())
                * currencyType.getRate();
    }
}
