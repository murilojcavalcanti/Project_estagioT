package Exercicio02;

import java.util.Scanner;

public class Exeercicio_Fibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = 1;
        int b = 0;
        int aux;


        for(int i = 0; i < 40; i++){
            System.out.println(a);
            aux = a;
            a = a + b;
            b = aux;
        }
        System.out.println(" Digite o numero que você deseja saber se pertence a sequencia:");
        int F = scan.nextInt();
        if(F == a){
            System.out.println("pertence a sequencia");
        } else {
            System.out.println("não pertence");
        }


}
}