package Faculdade_Engenharia_de_Software.Programacao_I;

import java.util.Scanner;

public class tabuaba {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.println("Digite um número para ver a tabuada: ");
        num = input.nextInt();

        System.out.printf("Digite sua Opção de Calculo: [+, -, *, /] ");
        char opcao = input.next().charAt(0);

        switch (opcao) {
            case '+':
                System.out.println(num + " + " + num + " = " + (num + num));
                break;
            case '-':
                System.out.println(num + " - " + num + " = " + (num - num));
                break;
            case '*':
                System.out.println(num + " * " + num + " = " + (num * num));
                break;
            case '/':
                if (num != 0) {
                    System.out.println(num + " / " + num + " = " + (num / num));
                } else {
                    System.out.println("Erro: Divisão por zero");
                }
                break;
            default:
                System.out.println("Opção Inválida");
                break;
        }

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }

        input.close();
    }
}
