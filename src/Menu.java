import java.util.Scanner;

public class Menu {
    Scanner input = new Scanner(System.in);

    public void lineDecoration() {
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
    }

    public void showWelcomeMessage() {
        this.lineDecoration();
        System.out.println("Conversor de Moedas v1");
        this.lineDecoration();
    }

    public void showOptions() {
        System.out.println(
                """
                1- Dólar Estado Unidense (USD)
                2- Real (BRL)
                3- Euro (EUR)
                4- Libra Esterlina (GBP)
                5 - Iene (JPY)
                6 - Franco Suíço (CHF)
                7 - Dolar Canadense (CAD)
                8 - Renminbi/Yuan (RMB)
                9 - Peso Argentino (ARS)
                0 - Sair"""
        );
    }

    public double getValue() {
        System.out.println("Qual o valor em $ da primeira moeda?");
        return input.nextDouble();
    }

    public int getCoinType() {
        System.out.println("De qual moeda será feita a conversão?");
        this.showOptions();
        return input.nextInt();
    }

    public void init() {
        this.showWelcomeMessage();
    }

    public static void main(String[] args) {
        var menu = new Menu();
    }
}
