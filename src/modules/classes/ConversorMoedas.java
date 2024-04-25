package modules.classes;

import modules.data.Moedas;

public class ConversorMoedas {

    private final double usd = 1;
    double[] currencies;

    public ConversorMoedas(Moedas moedas) {
        double brl = moedas.BRL();
        double eur = moedas.EUR();
        //Libras Esterlinas
        double gbp = moedas.GBP();
        //Iene
        double jpy = moedas.JPY();
        //Franco Suíço
        double chf = moedas.CHF();
        //Dólar Canadense
        double cad = moedas.CAD();
        //Yuan;
        double cny = moedas.CNY();
        //Peso Argentino
        double ars = moedas.ARS();
        currencies = new double[]{usd, brl, eur, gbp, jpy, chf, cad, cny, ars};
    }

    public void convertCurrency(double value, int initialCurrency, int finalCurrency) {
        initialCurrency--;
        finalCurrency--;
        System.out.println("%f %f".formatted(currencies[initialCurrency], currencies[finalCurrency]));
        double result;
        double cambioTax = (currencies[finalCurrency]/usd) / (currencies[initialCurrency]/usd);
        result = cambioTax * value;
        System.out.println("O resultado da conversão é $ %.2f".formatted((result)));
    }

}
