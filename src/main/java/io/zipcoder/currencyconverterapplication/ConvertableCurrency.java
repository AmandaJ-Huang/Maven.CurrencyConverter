package io.zipcoder.currencyconverterapplication;

public interface ConvertableCurrency {
    default Double convert(CurrencyType currencyType) {
        return (CurrencyType.UNIVERSAL_CURRENCY.getRate()/CurrencyType.getTypeOfCurrency(this).getRate())
                * currencyType.getRate();
    }

    default CurrencyType getCurrencyType() {
        return null;
    }

}
