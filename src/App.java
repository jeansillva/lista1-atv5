import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        // Pedir valor
        System.out.println("Insira o valor em metros: ");
        double metros = sc.nextDouble();
        sc.close();
        // Calcular e exibir o valor em centimetros
        double valorCentimetros = metros * 100;
        System.out.println("O valor em centímetros é: " + valorCentimetros);
    }
}
