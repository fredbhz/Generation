package repeticaoJava;

import java.util.Scanner;

public class ex002 {
    //2- Ler 5 números e imprimir quantos são pares e quantos são ímpares. (FOR)
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o n1: ");
        int n1 = entrada.nextInt();
        System.out.println("Digite o n2: ");
        int n2 = entrada.nextInt();
        System.out.println("Digite o n3: ");
        int n3 = entrada.nextInt();
        System.out.println("Digite o n4: ");
        int n4 = entrada.nextInt();
        System.out.println("Digite o n5: ");
        int n5 = entrada.nextInt();
        System.out.println("Digite o n5: ");
        int n6 = entrada.nextInt();
        System.out.println("Digite o n5: ");
        int n7 = entrada.nextInt();
        System.out.println("Digite o n5: ");
        int n8 = entrada.nextInt();
        System.out.println("Digite o n5: ");
        int n9 = entrada.nextInt();
        System.out.println("Digite o n5: ");
        int n10 = entrada.nextInt();

        int[] numeros = {n1,n2,n3,n4,n5,n6,n7,n8,n9,n10};

        for (int i=1;i < numeros.length;i++){
            //System.out.println(i + " " + numeros[i]);

            if (numeros[i] % 2 == 0) System.out.println("O número " + numeros[i] + " é Par");
            else System.out.println("O número " + numeros[i] + " é impar");
        }
    }
}
