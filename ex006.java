package repeticaoJava;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ex006 {
    //6- Escrever um programa que receba vários números inteiros no teclado. E no
    //final imprimir a média dos números múltiplos de 3. Para sair digitar
    //0(zero).(DO...WHILE)
    public static void main(String[] args) {

        int n1;
        List listaNumeros = new LinkedList();
        do {
            Scanner entrada = new Scanner(System.in);
            System.out.println("Digite um número inteiro: ");
            n1 = entrada.nextInt();

            if (n1 %3 == 0) {
                System.out.println("O número "+ n1 +" É multiplo de 3");
                listaNumeros.add(n1);
                System.out.println(listaNumeros);
                //int media = (listaNumeros / listaNumeros.size());
                System.out.println("A média dos valores digitados é: ");
            }
            System.out.println("Para sair, Digite 0");

        } while (n1 != 0);
    }
}
