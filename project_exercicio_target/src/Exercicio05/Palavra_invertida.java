package Exercicio05;

import java.util.Scanner;

public class Palavra_invertida {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite uma palavra: ");
        String str = scan.next();

        System.out.println(str);
        char[] ch = str.toCharArray();
        int begin = 0;
        int end = ch.length-1;
        char temp;
        while(end>begin){
            temp = ch[begin];
            ch[begin] = ch[end];
            ch[end] = temp;
            end--;
            begin++;
        }
        str = new String(ch);
        System.out.println( "A palavra que voce escreveu invertida é :" + str);
    }
}

