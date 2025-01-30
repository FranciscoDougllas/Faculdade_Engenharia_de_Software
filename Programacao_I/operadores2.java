package Faculdade_Engenharia_de_Software.Programacao_I;

public class operadores2 {
    public static void main(String[] args) {
        double a = 10;
        double b = 5;
        double c = a + b;
        System.out.println(c);

        double media = c / 2;
        System.out.println(media);

        //Calculadora de IMC
        double peso = 70;
        double altura = 1.75;
        double imc = peso / (altura * altura);
        System.out.println("Seu Imc e de " + imc);


       
        for (int i = 0; i < 10; i ++){
            System.out.println(i);
        }
    }
}
