package vetores;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);


        int[] vetor = new int[10];


        int x;


        for(int i = 0; i < vetor.length; i++){
            System.out.println("Digite um valor para a posição " + i);
            vetor[i] = in.nextInt();
        }


        System.out.println("Digite um índice X (entre 0 e 4)");
        x = in.nextInt();



        System.out.println("A soma dos valores dentro dos índices X e Y é = " + (vetor[x]));
    }
}