import java.util.Scanner;

public class Main {
public static void main(String[] args) {


    double valorOriginal = 0.0;
    double descontoSet = 0.0;
    double valorFinal = 0.0;


    java.util.Scanner scanner = new java.util.Scanner(System.in);
    System.out.println("Digite o valor total da compra: ");
    valorOriginal = scanner.nextDouble();

    if(valorOriginal <= 100.00){
        descontoSet = 0.0;
    } else if (valorOriginal <= 500.00) {
        descontoSet = 10;
    } else {
    descontoSet = valorOriginal * 0.15;
    }

    valorFinal = valorOriginal - descontoSet;

    System.out.println("Valor original: R$" + valorOriginal);
    System.out.println("Desconto aplicado: R$" + descontoSet);
    System.out.println("Valor final: R$" + valorFinal);

    scanner.close();
 }
}
