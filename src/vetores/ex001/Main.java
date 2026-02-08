package vetores.ex001;

import java.util.Scanner;

public class Main {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("Quantos números você deseja digitar: ");
        n = sc.nextInt();

        int[] vect = new int[n];
        int cont = 0;

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um número: ");
            vect[i] = sc.nextInt();

        }for (int i = 0; i < vect.length; i++){
            if (vect[i] < 0) {
                System.out.println(vect[i]);
                cont ++;
            }

        }if(cont == 0){
            System.out.println("Nenhum número negativo encontrado");

        } else if (cont > 0) {
            System.out.printf("Você digitou %d números negativos" ,cont);

        }
        sc.close();
    }
}
