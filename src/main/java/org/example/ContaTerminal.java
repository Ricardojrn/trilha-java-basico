package org.example;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, digite os dados solicitados!");
        System.out.println("Agência: ");
        String agencia = scanner.nextLine();

        System.out.println("Número da conta: ");
        int conta = scanner.nextInt();

        System.out.println("Nome do cliente: ");
        String nomeCliente = scanner.next();

        double saldo = 2000;

        System.out.println("Olá "+ nomeCliente + ", obrigado por criar " +
                "uma conta em nosso banco.\nSua agência é "+agencia+
                ", conta "+ conta + " e seu saldo de "+ saldo +" já está disponível " +
                "para saque.");
    }
}