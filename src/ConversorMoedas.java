import java.io.IOException;

public class ConversorMoedas {
    private final double usd = 1;
    private double brl;
    private double eur;
    private double gbp; //Libras Esterlinas
    private double jpy; //Iene
    private double chf; // Franco Suíço
    private double cad; // Dólar Canadense
    private double cny; // Yuan;
    private double ars; // Peso Argentino

    public ConversorMoedas(Moedas moedas) {
        this.brl = moedas.BRL();
        this.eur = moedas.EUR();
        this.gbp = moedas.GBP();
        this.jpy = moedas.JPY();
        this.chf = moedas.CHF();
        this.cad = moedas.CAD();
        this.cny = moedas.CNY();
        this.ars = moedas.ARS();
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


    public static void main(String[] args) throws IOException, InterruptedException {
        API api = new API();
        //System.out.println(api.getResponse());
        api.getJsonResponse();
    }
}
