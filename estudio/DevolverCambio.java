import java.util.Scanner;

public class DevolverCambio{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Cuántos euros debe pagar?");
        int eurosDebidos = scanner.nextInt();

        System.out.println("¿Con cuántos euros paga?");
        int eurosEntregados = scanner.nextInt();

        int cambioRestante = eurosEntregados - eurosDebidos;

        System.out.println(cambioRestante + "$ de cambio");

        int billetesDe100 = cambioRestante / 100;
        cambioRestante = cambioRestante % 100;
        int billetesDe50 = cambioRestante / 50;
        cambioRestante = cambioRestante % 50;
        int billetesDe20 = cambioRestante / 20;
        cambioRestante = cambioRestante % 20;
        int billetesDe10 = cambioRestante / 10;
        cambioRestante = cambioRestante % 10;
        int billetesDe5 = cambioRestante / 5;
        cambioRestante = cambioRestante % 5;
        int monedasDe2 = cambioRestante / 2;
        cambioRestante = cambioRestante % 2;
        int monedasDe1 = cambioRestante;

        System.out.println(billetesDe100 + " billetes de 100$");
        System.out.println(billetesDe50 + " billetes de 50$");
        System.out.println(billetesDe20 + " billetes de 20$");
        System.out.println(billetesDe10 + " billetes de 10$");
        System.out.println(billetesDe5 + " billetes de 5$");
        System.out.println(monedasDe2 + " monedas de 2$");
        System.out.println(monedasDe1 + " monedas de 1$");

        scanner.close();

    }
}