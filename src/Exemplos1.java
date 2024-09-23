import java.util.Scanner;

public class Exemplos1 {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            //Exemplo 5 for

            for (int i = 0; i < 10; i++) {
                System.out.println(i);
            }
            //Exemplo 6
            int par = 0;
            int impar = 0, numero;
            for (int i = 1; i <= 10; i++) {
                System.out.println("Digite o " + i + "numero");
                numero = scanner.nextInt();
                if (numero % 2 == 0) {
                    par++;
                } else {
                    impar++;
                }
                System.out.println("voce digitou" + par + "pares e" + impar + "impares");


            }
            //Exemplo 7
            System.out.println("digite um numero positivo para calcular seu fatorial");
            int fatorial = scanner.nextInt();
            int valorRecebido = fatorial;
            for (int i = 0; i < fatorial ; i++) {
                fatorial = fatorial * i;


            }
            System.out.println("o fatorial de" + valorRecebido +"é" + fatorial);

            //Exemplo 8
            int contador2 = valorRecebido;
            fatorial = valorRecebido;
            while(contador2 > 0){
                fatorial *= contador2;
                contador2 --;

            }
            System.out.println("while - o fatorial de" + valorRecebido+"é" + fatorial);




        }
    }


