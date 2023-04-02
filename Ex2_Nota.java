package br.com.dio.exerc.loops;


import java.util.Scanner;

// Exercicio de pedir uma nota entre 0 e 10
// Loop mostrando uma mensagem no qual o valor seja diferente dos valores
/// entre 0 e 10 (detalhe essa nota tem que ser inteiro)
public class Ex2_Nota {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);

        int nota;

        System.out.println("Nota ");;
        nota = scan.nextInt();

        while (nota < 0 | nota > 10) {
            System.out.println("Nota inválida: digite novamente");
            nota = scan.nextInt();
        }
    }
}
