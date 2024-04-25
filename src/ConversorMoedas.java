import java.util.Arrays;

public class ConversorMoedas {

    private final double usd = 1;
    private double brl;
    private double eur;
    private double gbp; //Libras Esterlinas
    private double jpy; //Iene
    private double chf; //Franco Suíço
    private double cad; //Dólar Canadense
    private double cny; //Yuan;
    private double ars; //Peso Argentino
    double[] currencies;

    public ConversorMoedas(Moedas moedas) {
        this.brl = moedas.BRL();
        this.eur = moedas.EUR();
        this.gbp = moedas.GBP();
        this.jpy = moedas.JPY();
        this.chf = moedas.CHF();
        this.cad = moedas.CAD();
        this.cny = moedas.CNY();
        this.ars = moedas.ARS();
        currencies = new double[]{usd, brl, eur, gbp, jpy, chf, cad, cny, ars};
    }



    public double getUsd() {
        return usd;
    }

    public double getBrl() {
        return brl;
    }

    public double getEur() {
        return eur;
    }

    public double getGbp() {
        return gbp;
    }

    public double getJpy() {
        return jpy;
    }

    public double getChf() {
        return chf;
    }

    public double getCad() {
        return cad;
    }

    public double getCny() {
        return cny;
    }

    public double getArs() {
        return ars;
    }

    public void convertCurrency(double value, int initialCurrency, int finalCurrency) {
        initialCurrency--;
        finalCurrency--;
        System.out.println("%f %f".formatted(currencies[initialCurrency], currencies[finalCurrency]));
        double result = 0;
        double cambioTax = (currencies[finalCurrency]/usd) / (currencies[initialCurrency]/usd);
        result = cambioTax * value;
        System.out.println("O resultado da conversão é $ %.2f".formatted((result)));
    }

    @Override
    public String toString() {
        return "ConversorMoedas{" +
                "usd=" + usd +
                ", brl=" + brl +
                ", eur=" + eur +
                ", gbp=" + gbp +
                ", jpy=" + jpy +
                ", chf=" + chf +
                ", cad=" + cad +
                ", cny=" + cny +
                ", ars=" + ars +
                ", currencies=" + Arrays.toString(currencies) +
                '}';
    }
}
